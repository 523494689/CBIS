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
	// ʵ����orderService
	@Resource
	private OrderService orderService;

	@RequestMapping(value = "/trains", method = RequestMethod.GET)
	@ResponseBody
	public List<Train> search(@RequestBody() SearchInfo searchInfo) {
		List<Train> list = trainSearchService.getTrains(searchInfo);
		return list;
	}

	/**
	 * �������εķ���,���淵��list
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
	 * �������κ�,����������ʾ�Ķ�������ҳ
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
		// ���ݸó��ε���Ϣ
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
		// ���ݳ˿ͱ����Ϣ
		// ��ȡ��¼�˿͵�id
		User u = (User) session.getAttribute("user");
		// ��ø�����Ϣ
		int userId = u.getUserId();
		// ��ѯ�˿ͱ����Ϣ
		List<Passenger> pasList = orderService.queryPassengers(userId);
		// model.addAttribute("pasList",pasList);
		session.setAttribute("pasList", pasList);
		return "info";

	}

	@RequestMapping(value = "/addPassenger", method = RequestMethod.POST)
	@ResponseBody
	public String[] addPassenger(String pName, String pIDCard, HttpSession session) {

		Passenger passenger = new Passenger();
		// ��ȡ��¼�û���id
		User u = (User) session.getAttribute("user");
		int userId = u.getUserId();
		// �����˿͵���Ϣ
		passenger.setUserId(userId);
		passenger.setpName(pName);
		passenger.setpIDCard(pIDCard);
		// ������ݵ�����
		boolean flag = orderService.addPassenger(passenger);
		// ��ȡ�˿͵���Ϣ
		List<Passenger> pasList = orderService.queryPassengers(userId);
		String name[] = new String[8];
		// ����list���ճ˿͵�����
		for (int i = 0; i < pasList.size(); i++) {
			name[i] = pasList.get(i).getpName();
		}

		return name;

	}

	/**
	 * ���ɶ�����
	 */
	@RequestMapping(value = "/handleProduct")
	public String handleProduct(String[] cb1, String zuowei, HttpSession session, Model model) {
		List<Passenger> list = new ArrayList<Passenger>();
		// �ָ���������۸��ֶ�
		String[] zuofee = zuowei.split("��");
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

		// ��ǰʱ����Ϊ�������
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
		SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String orderNum = formatter.format(date);
		String oTime = formatter1.format(date);
		// �����������󲢸�ֵ
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
		// �����λ�ֶε�zuowei
		model.addAttribute("zuowei", zuofee[0]);
		// ��Ӽ۸��ֶε�fee
		model.addAttribute("fee", "��" + zuofee[1]);
		// ����ܼ۸�fees
		model.addAttribute("fees", "��" + fees);
		return "info";
	}

	@RequestMapping(value = "/alipayReturnNotice")
	public ModelAndView alipayReturnNotice(HttpServletRequest request, HttpServletRequest response, HttpSession session)
			throws Exception {

		// ��ȡ֧����GET����������Ϣ
		Map<String, String> params = new HashMap<String, String>();
		Map<String, String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			// ����������δ����ڳ�������ʱʹ��
			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}

		boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset,
				AlipayConfig.sign_type); // ����SDK��֤ǩ��

		ModelAndView mv = new ModelAndView("index");
		// �������������д���ĳ������´�������ο�������
		if (signVerified) {
			// �̻�������
			String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

			// ֧�������׺�
			String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

			// ������
			String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

			// �޸Ķ���״̬����Ϊ ֧���ɹ����Ѹ���; ͬʱ����֧����ˮ
			String orderNum = out_trade_no;
			boolean flag1 = orderService.updateOrderByOrderNum(orderNum);

			// ʵ����һ��orderFlow
			OrderFlow orderFlow = new OrderFlow();
			orderFlow.setOrderNum(out_trade_no);
			orderFlow.setOp("����ɹ�");

			User u = (User) session.getAttribute("user");
			int userId = u.getUserId();
			orderFlow.setOperId(userId);

			// ����orderFlow��¼
			boolean flag2 = orderService.addOrderFlow(orderFlow);

			// Orders order = orderService.getOrderById(out_trade_no);
			// Product product = productService.getProductById(order.getProductId());
			mv.addObject("out_trade_no", out_trade_no);
			mv.addObject("trade_no", trade_no);
			mv.addObject("total_amount", total_amount);

		} else {
			System.out.println("֧��, ��ǩʧ��...");
		}

		return mv;

	}
}
