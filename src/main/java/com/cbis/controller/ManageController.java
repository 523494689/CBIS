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
import com.cbis.service.BackTrainService;

/**
 * 后台的控制器
 * 2018年7月6日13:51:15
 * @author zwj
 *
 */
@Controller
@RequestMapping("/back")
public class ManageController {
	//实例化
	@Resource
	private BackTrainService backTrainService;
	
	/**
	 * 后台显示车次的方法
	 */
	@RequestMapping(value = "/showTrain")
	public String showTrain(Model model) {
		
		List<BackTrain> trainList = backTrainService.showTrain();
		
		model.addAttribute("trainList", trainList);
		
		return "Back/train";
	}
	
	/**
	 * 后台显示车站信息
	 */
	@RequestMapping(value = "/showStation")
	public String showStation(Model model) {
		
		List<BackStation> stationList = backTrainService.showStation();
		
		model.addAttribute("stationList", stationList);
		
		return "Back/station";
	}
	
	/**
	 * 后台显示用户信息
	 */
	@RequestMapping(value = "/showUser")
	public String showUser(Model model) {
		
		List<BackUser> userList = backTrainService.showUser();
		
		model.addAttribute("userList", userList);
		
		return "Back/userinfo";
	}
	
	/**
	 * 后台加载用户绑定乘客的方法
	 */
	@RequestMapping(value = "/showPas", method = RequestMethod.GET)
    @ResponseBody
	public List<BackPas> showPas(int userId,HttpSession session) {
		
		List<BackPas> userPasList = backTrainService.showPas(userId);
		
		

		return userPasList;
	}


}
