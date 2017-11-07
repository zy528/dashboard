package com.dashboard.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.dashboard.domain.City;
import com.dashboard.service.GetDataService;

@Controller
public class TestController {
	
	@Autowired
	private GetDataService getdataservice;
	
	@RequestMapping(value = "/hellow",method = RequestMethod.GET)
    public String findOneCity(Model model) {
		
		List<Map<String, String>> list = getdataservice.getTestData();
		for(int i=0; i<list.size(); i++) {
			list.get(i);
		}
		model.addAttribute("list",list);
        return "Hellow";
    }

}
