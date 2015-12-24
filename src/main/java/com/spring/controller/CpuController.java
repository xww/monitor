package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.Cpu;
import com.spring.service.CpuService;

@Controller
public class CpuController {
	
	@Resource
    private CpuService cpuService;
	
	@RequestMapping("/cpu/{id}")
    @ResponseBody
    public Cpu getCpu(@PathVariable int id){
    	//Cpu cpu = cpuService.getCpuSampleById(12);
    	Cpu cpu = cpuService.getCpuSampleById(id);
    	return cpu;
    }
	
	@RequestMapping("/cpu")
    @ResponseBody
    public List<Cpu> getCpu(@RequestParam String start ,@RequestParam  String end){    	
    	List<Cpu> cpuList = cpuService.getCpuSampleByTimeScope(start, end);
    	return cpuList;
    }

}
