package com.cbis.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
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
		return trainSearchService.getTrains(start, stop);
	}
}
