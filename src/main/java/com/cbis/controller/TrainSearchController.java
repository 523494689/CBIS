package com.cbis.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import com.cbis.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
	//实例化orderService
	@Resource
	private OrderService orderService;
    
	@RequestMapping(value = "/trains", method = RequestMethod.GET)
	@ResponseBody
	public List<Train> search(@RequestBody()SearchInfo searchInfo) {
		List<Train> list = trainSearchService.getTrains(searchInfo);
		return list;
	}
	
	/**
	 * 搜索车次的方法,常规返回list
	 * @param start
	 * @param stop
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/trains2", method = RequestMethod.GET)
	public String search2(String start, String stop ,Model model,HttpSession session) {
		
		List<Train> list = trainSearchService.getTrains(start, stop);
		
		model.addAttribute("list", list);
		//model.addAttribute("start", start);
		//model.addAttribute("stop", stop);
		session.setAttribute("start", start);
		session.setAttribute("stop", stop);
		return "index";

	}
	
	/**
	 * 搜索车次后,点击详情后显示的订单详情页
	 * @param trainAll
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/trainList", method = RequestMethod.GET)
	public String search2(String trainAll ,Model model,HttpSession session) {
		String []array = trainAll.split("@");
		int trainId = Integer.parseInt(array[0]);
		String trainNo = array[1];
		int start = Integer.parseInt(array[2]);
		int stop = Integer.parseInt(array[3]);
		//传递该车次的信息
		List<Schedule> list = trainSearchService.querySchByTrainId(trainId);
		session.setAttribute("list2", list);
		session.setAttribute("startNo", start);
		session.setAttribute("stopNo", stop);
		session.setAttribute("trainId", trainId);
		session.setAttribute("trainNo", trainNo);
//		model.addAttribute("list2", list);
//		model.addAttribute("start", start);
//		model.addAttribute("stop", stop);
//		model.addAttribute("trainId", trainId);
		//传递乘客表的信息
		//获取登录乘客的id
		User u = (User)session.getAttribute("user");
		//获得各个信息
		int userId = u.getUserId();
		//查询乘客表的信息
		List<Passenger> pasList = orderService.queryPassengers(userId);
		//model.addAttribute("pasList",pasList);
		session.setAttribute("pasList",pasList);
		return "info";

	}
	
	
	@RequestMapping(value = "/addPassenger", method = RequestMethod.POST)
	@ResponseBody
	public String[] addPassenger(String pName,String pIDCard,HttpSession session) {
		
		Passenger passenger = new Passenger();
		//获取登录用户的id
		User u = (User)session.getAttribute("user");
		int userId = u.getUserId();
		//新增乘客的信息
		passenger.setUserId(userId);
		passenger.setpName(pName);
		passenger.setpIDCard(pIDCard);
		//添加数据到表中
		boolean flag = orderService.addPassenger(passenger);
		//获取乘客的信息
		List<Passenger> pasList = orderService.queryPassengers(userId);
		String name[] = new String[8] ;
		//定义list接收乘客的名字
		for (int i = 0; i < pasList.size(); i++) {
			name[i]=pasList.get(i).getpName();			
		}
		
		return name;
		
		

	}
	/**
	 * 生成订单表
	 */
	@RequestMapping(value="/handleProduct")
	public String handleProduct(String []cb1,String zuowei,Model model) {
		List<Passenger> list = new ArrayList<Passenger>();
		//分隔二等座与价格字段
		String []zuofee = zuowei.split("￥");
		int fee = Integer.parseInt(zuofee[1]);
		int fees=0;
		for (String string : cb1) {
			Passenger passenger = trainSearchService.queryPassengerBypName(string);
			list.add(passenger);
			fees+=fee;
		}
		model.addAttribute("handle1", list);
		
		//添加座位字段到zuowei
		model.addAttribute("zuowei", zuofee[0]);
		//添加价格字段到fee
		model.addAttribute("fee", "￥"+zuofee[1]);
		//添加总价格到fees
		model.addAttribute("fees", "￥"+fees);
		return "info";
	}
	
}
