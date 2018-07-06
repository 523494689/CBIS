package com.cbis.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbis.entity.Passenger;
import com.cbis.entity.Schedule;
import com.cbis.entity.Train;
import com.cbis.entity.User;
import com.cbis.service.OrderService;
import com.cbis.service.TrainSearchService;

@Controller
@RequestMapping("/search-api")
public class TrainSearchController {
	
	@Resource(name = "trainSearchService")
	private TrainSearchService trainSearchService;
	//实例化orderService
	@Resource
	private OrderService orderService;
    
	/**
	 * 搜索车次的方法,返回json对象(暂时不能放在tbody里面)
	 * @param start
	 * @param stop
	 * @return
	 */
	@RequestMapping(value = "/trains", method = RequestMethod.GET)
	@ResponseBody
	public List<Train> search(@RequestParam(name = "start") String start, @RequestParam(name = "stop") String stop) {
		
		List<Train> list = trainSearchService.getTrains(start, stop);
		
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
	public String search2(String start, String stop ,Model model) {
		
		List<Train> list = trainSearchService.getTrains(start, stop);
		
		model.addAttribute("list", list);
		model.addAttribute("start", start);
		model.addAttribute("stop", stop);
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
		System.out.println(trainAll);
		String []array = trainAll.split("@");
		int trainId = Integer.parseInt(array[0]);
		int start = Integer.parseInt(array[1]);
		int stop = Integer.parseInt(array[2]);
		//传递该车次的信息
		List<Schedule> list = trainSearchService.querySchByTrainId(trainId);
		
		model.addAttribute("list2", list);
		model.addAttribute("start", start);
		model.addAttribute("stop", stop);
		
		//传递乘客表的信息
		//获取登录乘客的id
		User u = (User)session.getAttribute("user");
		//获得各个信息
		int userId = u.getUserId();
		//查询乘客表的信息
		List<Passenger> pasList = orderService.queryPassengers(userId);
		model.addAttribute("pasList",pasList);
		
		return "info";

	}
	
	
	/**
	 * 添加乘客
	 * @param trainAll
	 * @param model
	 * @return
	 */

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
	
}
