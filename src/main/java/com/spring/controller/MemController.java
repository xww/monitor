package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.Cpu;
import com.spring.entity.Mem;
import com.spring.service.CpuService;
import com.spring.service.MemService;

@Controller
public class MemController {
	
	@Resource
    private MemService memService;
	
	@RequestMapping("/mem/{id}")
    @ResponseBody
    public Mem getMem(@PathVariable int id){
    	
    	Mem mem = memService.getMemSampleById(id);
    	return mem;
    }
	
	@RequestMapping("/mem")
    @ResponseBody
    public List<Mem> getMem(@RequestParam String start ,@RequestParam  String end){    	
    	List<Mem> memList = memService.getMemSampleByTimeScope(start, end);
    	return memList;
    }

}
