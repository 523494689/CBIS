package com.cbis.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.config.AlipayConfig;
import com.cbis.entity.OrderFlow;
import com.cbis.entity.Orders;
import com.cbis.entity.Passenger;
import com.cbis.entity.Schedule;
import com.cbis.entity.SearchInfo;
import com.cbis.entity.Train;
import com.cbis.entity.User;
import com.cbis.service.OrderService;
import com.cbis.service.TrainSearchService;
import com.cbis.service.UserService;

@Controller
@RequestMapping("/search-api")
public class TrainSearchController {

	@Resource(name = "trainSearchService")
	private TrainSearchService trainSearchService;
	@Resource(name = "userService")
	private UserService userService;
	// 实例化orderService
	@Resource
	private OrderService orderService;

	@RequestMapping(value = "/trains", method = RequestMethod.GET)
	@ResponseBody
	public List<Train> search(@RequestBody() SearchInfo searchInfo) {
		List<Train> list = trainSearchService.getTrains(searchInfo);
		return list;
	}

	/**
	 * 搜索车次的方法,常规返回list
	 * 
	 * @param start
	 * @param stop
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/trains2", method = RequestMethod.GET)
	public String search2(SearchInfo searchInfo, Model model, HttpSession session) {

		// // XXX
		// System.out.println(searchInfo);

		List<Train> list = trainSearchService.getTrains(searchInfo);

		model.addAttribute("list", list);
		// model.addAttribute("start", start);
		// model.addAttribute("stop", stop);
		session.setAttribute("start", searchInfo.getStart());
		session.setAttribute("stop", searchInfo.getStop());
		return "index";

	}

	/**
	 * 搜索车次后,点击详情后显示的订单详情页
	 * 
	 * @param trainAll
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/trainList", method = RequestMethod.GET)
	public String search2(String trainAll, Model model, HttpSession session) {
		String[] array = trainAll.split("@");
		int trainId = Integer.parseInt(array[0]);
		String trainNo = array[1];
		int start = Integer.parseInt(array[2]);
		int stop = Integer.parseInt(array[3]);
		// 传递该车次的信息
		List<Schedule> list = trainSearchService.querySchByTrainId(trainId);
		session.setAttribute("list2", list);
		session.setAttribute("startNo", start);
		session.setAttribute("stopNo", stop);
		session.setAttribute("trainId", trainId);
		session.setAttribute("trainNo", trainNo);
		// model.addAttribute("list2", list);
		// model.addAttribute("start", start);
		// model.addAttribute("stop", stop);
		// model.addAttribute("trainId", trainId);
		// 传递乘客表的信息
		// 获取登录乘客的id
		User u = (User) session.getAttribute("user");
		// 获得各个信息
		int userId = u.getUserId();
		// 查询乘客表的信息
		List<Passenger> pasList = orderService.queryPassengers(userId);
		// model.addAttribute("pasList",pasList);
		session.setAttribute("pasList", pasList);
		return "info";

	}

	@RequestMapping(value = "/addPassenger", method = RequestMethod.POST)
	@ResponseBody
	public String[] addPassenger(String pName, String pIDCard, HttpSession session) {

		Passenger passenger = new Passenger();
		// 获取登录用户的id
		User u = (User) session.getAttribute("user");
		int userId = u.getUserId();
		// 新增乘客的信息
		passenger.setUserId(userId);
		passenger.setpName(pName);
		passenger.setpIDCard(pIDCard);
		// 添加数据到表中
		boolean flag = orderService.addPassenger(passenger);
		// 获取乘客的信息
		List<Passenger> pasList = orderService.queryPassengers(userId);
		String name[] = new String[8];
		// 定义list接收乘客的名字
		for (int i = 0; i < pasList.size(); i++) {
			name[i] = pasList.get(i).getpName();
		}

		return name;

	}

	/**
	 * 生成订单表
	 */
	@RequestMapping(value = "/handleProduct")
	public String handleProduct(String[] cb1, String zuowei, HttpSession session, Model model) {
		List<Passenger> list = new ArrayList<Passenger>();
		// 分隔二等座与价格字段
		String[] zuofee = zuowei.split("￥");
		int fee = Integer.parseInt(zuofee[1]);
		int fees = 0;
		int passId = 0;
		for (String string : cb1) {
			System.out.println(string);
			Passenger passenger = trainSearchService.queryPassengerBypName(string);
			passId = passenger.getId();
			list.add(passenger);
			fees += fee;
		}

		// 当前时间作为订单编号
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String orderNum = formatter.format(date);
		String oTime = formatter1.format(date);
		// 创建订单对象并赋值
		Orders order = new Orders();
		order.setOrderNum(orderNum);
		User u = (User) session.getAttribute("user");
		order.setUserId(u.getUserId());
		session.getAttribute("trainId");
		String trainNo = (String) session.getAttribute("trainNo");
		order.setTrainNo(trainNo);
		order.setStart((String) session.getAttribute("start"));
		order.setStop((String) session.getAttribute("stop"));
		order.setSeatType(zuofee[0]);
		System.out.println(passId);
		order.setPassId(passId);
		order.setPrice(fees);
		order.setoTime(oTime);
		order.setState(1);
		orderService.addOrder(order);

		model.addAttribute("order", order);

		model.addAttribute("handle1", list);
		// 添加座位字段到zuowei
		model.addAttribute("zuowei", zuofee[0]);
		// 添加价格字段到fee
		model.addAttribute("fee", "￥" + zuofee[1]);
		// 添加总价格到fees
		model.addAttribute("fees", "￥" + fees);
		return "info";
	}

	@RequestMapping(value = "/alipayReturnNotice")
	public ModelAndView alipayReturnNotice(HttpServletRequest request, HttpServletRequest response, HttpSession session)
			throws Exception {

		// 获取支付宝GET过来反馈信息
		Map<String, String> params = new HashMap<String, String>();
		Map<String, String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用
			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}

		boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset,
				AlipayConfig.sign_type); // 调用SDK验证签名

		ModelAndView mv = new ModelAndView("index");
		// ——请在这里编写您的程序（以下代码仅作参考）——
		if (signVerified) {
			// 商户订单号
			String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

			// 支付宝交易号
			String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

			// 付款金额
			String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

			// 修改叮当状态，改为 支付成功，已付款; 同时新增支付流水
			String orderNum = out_trade_no;
			boolean flag1 = orderService.updateOrderByOrderNum(orderNum);

			// 实例化一个orderFlow
			OrderFlow orderFlow = new OrderFlow();
			orderFlow.setOrderNum(out_trade_no);
			orderFlow.setOp("付款成功");

			User u = (User) session.getAttribute("user");
			int userId = u.getUserId();
			orderFlow.setOperId(userId);

			// 创建orderFlow记录
			boolean flag2 = orderService.addOrderFlow(orderFlow);

			// Orders order = orderService.getOrderById(out_trade_no);
			// Product product = productService.getProductById(order.getProductId());
			mv.addObject("out_trade_no", out_trade_no);
			mv.addObject("trade_no", trade_no);
			mv.addObject("total_amount", total_amount);

		} else {
			System.out.println("支付, 验签失败...");
		}

		return mv;

	}
}
