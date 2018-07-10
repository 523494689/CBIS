package com.cbis.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbis.entity.BackPas;
import com.cbis.entity.BackStation;
import com.cbis.entity.BackTrain;
import com.cbis.entity.BackUser;
import com.cbis.entity.Orders;
import com.cbis.service.BackTrainService;
import com.cbis.service.OrderService;

/**
 * ��̨�Ŀ�����
 * 2018��7��6��13:51:15
 * @author zwj
 *
 */
@Controller
@RequestMapping("/back")
public class ManageController {
	//ʵ����
	@Resource
	private BackTrainService backTrainService;
	
	/**
	 * ��̨��ʾ���εķ���
	 */
	@RequestMapping(value = "/showTrain")
	public String showTrain(Model model) {
		
		List<BackTrain> trainList = backTrainService.showTrain();
		
		model.addAttribute("trainList", trainList);
		
		return "Back/train";
	}
	
	/**
	 * ��̨��ʾ��վ��Ϣ
	 */
	@RequestMapping(value = "/showStation")
	public String showStation(Model model) {
		
		List<BackStation> stationList = backTrainService.showStation();
		
		model.addAttribute("stationList", stationList);
		
		return "Back/station";
	}
	
	/**
	 * ��̨��ʾ�û���Ϣ
	 */
	@RequestMapping(value = "/showUser")
	public String showUser(Model model) {
		
		List<BackUser> userList = backTrainService.showUser();
		
		model.addAttribute("userList", userList);
		
		return "Back/userinfo";
	}
	
	/**
	 * ��̨�����û��󶨳˿͵ķ���
	 */
	@RequestMapping(value = "/showPas", method = RequestMethod.GET)
    @ResponseBody
	public List<BackPas> showPas(int userId,HttpSession session) {
		
		List<BackPas> userPasList = backTrainService.showPas(userId);
		
		

		return userPasList;
	}

	/**
	 * ��̨��ʾ������Ϣ
	 */
	@RequestMapping(value = "/showOrders")
	public String showOrders(Model model) {
		
		List<Orders> orderList = backTrainService.queryAllOrders();
		
		model.addAttribute("orderList", orderList);
		
		return "Back/order";
	}
}
