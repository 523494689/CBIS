package com.cbis.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbis.entity.BackStation;
import com.cbis.entity.BackTrain;
import com.cbis.service.BackTrainService;

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

}
