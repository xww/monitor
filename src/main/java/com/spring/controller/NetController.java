package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.Net;
import com.spring.service.NetService;

@Controller
public class NetController {
	
	@Resource
    private NetService netService;
	
	@RequestMapping("/net/{id}")
    @ResponseBody
    public Net getNet(@PathVariable int id){    	
    	Net net = netService.getNetSampleById(id);
    	return net;
    }
	
	@RequestMapping("/net")
    @ResponseBody
    public List<Net> getNet(@RequestParam String start ,@RequestParam  String end){    	
    	List<Net> netList = netService.getNetSampleByTimeScope(start, end);
    	return netList;
    }

}
