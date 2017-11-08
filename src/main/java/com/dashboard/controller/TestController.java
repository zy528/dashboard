package com.dashboard.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSONObject;
import com.dashboard.service.GetDataService;


@Controller
public class TestController {
	
	@Autowired
	private GetDataService getdataservice;
	
	@RequestMapping(value = "/hellow",method = RequestMethod.GET)
    public String findOneCity(Model model) {
		
		List<Map<String, String>> list = getdataservice.getTestData();
		JSONObject json = new JSONObject();
		List<String> tjtime = new ArrayList<String>();
		
		if(list != null && list.size()>0){
			for(int i=0;i<list.size();i++){
				tjtime.add(list.get(i).get("tjtime"));
			}
		}
		
		json.put("tjtime",tjtime);
		model.addAttribute("list",json.toJSONString());
        return "Hellow";
    }

}
