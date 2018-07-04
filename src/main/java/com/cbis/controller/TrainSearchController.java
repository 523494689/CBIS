package com.cbis.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cbis.entity.Train;
import com.cbis.service.TrainSearchService;

@Controller
@RequestMapping("/search-api")
public class TrainSearchController {
	@Resource(name = "trainSearchService")
	private TrainSearchService trainSearchService;

	@RequestMapping(value = "/trains", method = RequestMethod.GET)
	@ResponseBody
	public List<Train> search(@RequestParam(name = "start") String start, @RequestParam(name = "stop") String stop) {
		
		List<Train> list = trainSearchService.getTrains(start, stop);
		
		return list;
	}
	
	@RequestMapping(value = "/trains2", method = RequestMethod.GET)
	public String search2(String start, String stop ,Model model) {
		
		List<Train> list = trainSearchService.getTrains(start, stop);
		
		model.addAttribute("list", list);
		model.addAttribute("start", start);
		model.addAttribute("stop", stop);
		return "index";
	}
}
