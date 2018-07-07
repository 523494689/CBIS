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
	//ʵ����orderService
	@Resource
	private OrderService orderService;
    
	@RequestMapping(value = "/trains", method = RequestMethod.GET)
	@ResponseBody
	public List<Train> search(@RequestBody()SearchInfo searchInfo) {
		List<Train> list = trainSearchService.getTrains(searchInfo);
		return list;
	}
	
	/**
	 * �������εķ���,���淵��list
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
	 * �������κ�,����������ʾ�Ķ�������ҳ
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
		//���ݸó��ε���Ϣ
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
		//���ݳ˿ͱ����Ϣ
		//��ȡ��¼�˿͵�id
		User u = (User)session.getAttribute("user");
		//��ø�����Ϣ
		int userId = u.getUserId();
		//��ѯ�˿ͱ����Ϣ
		List<Passenger> pasList = orderService.queryPassengers(userId);
		//model.addAttribute("pasList",pasList);
		session.setAttribute("pasList",pasList);
		return "info";

	}
	
	
	@RequestMapping(value = "/addPassenger", method = RequestMethod.POST)
	@ResponseBody
	public String[] addPassenger(String pName,String pIDCard,HttpSession session) {
		
		Passenger passenger = new Passenger();
		//��ȡ��¼�û���id
		User u = (User)session.getAttribute("user");
		int userId = u.getUserId();
		//�����˿͵���Ϣ
		passenger.setUserId(userId);
		passenger.setpName(pName);
		passenger.setpIDCard(pIDCard);
		//������ݵ�����
		boolean flag = orderService.addPassenger(passenger);
		//��ȡ�˿͵���Ϣ
		List<Passenger> pasList = orderService.queryPassengers(userId);
		String name[] = new String[8] ;
		//����list���ճ˿͵�����
		for (int i = 0; i < pasList.size(); i++) {
			name[i]=pasList.get(i).getpName();			
		}
		
		return name;
		
		

	}
	/**
	 * ���ɶ�����
	 */
	@RequestMapping(value="/handleProduct")
	public String handleProduct(String []cb1,String zuowei,Model model) {
		List<Passenger> list = new ArrayList<Passenger>();
		//�ָ���������۸��ֶ�
		String []zuofee = zuowei.split("��");
		int fee = Integer.parseInt(zuofee[1]);
		int fees=0;
		for (String string : cb1) {
			Passenger passenger = trainSearchService.queryPassengerBypName(string);
			list.add(passenger);
			fees+=fee;
		}
		model.addAttribute("handle1", list);
		
		//�����λ�ֶε�zuowei
		model.addAttribute("zuowei", zuofee[0]);
		//��Ӽ۸��ֶε�fee
		model.addAttribute("fee", "��"+zuofee[1]);
		//����ܼ۸�fees
		model.addAttribute("fees", "��"+fees);
		return "info";
	}
	
}
