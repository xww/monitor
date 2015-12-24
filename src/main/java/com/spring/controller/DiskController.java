package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.Cpu;
import com.spring.entity.Disk;
import com.spring.service.CpuService;
import com.spring.service.DiskService;

@Controller
public class DiskController {
	
	@Resource
    private DiskService diskService;
	
	@RequestMapping("/disk/{id}")
    @ResponseBody
    public Disk getDisk(@PathVariable int id){
    	//Cpu cpu = cpuService.getCpuSampleById(12);
    	Disk disk = diskService.getDiskSampleById(id);
    	return disk;
    }
	
	@RequestMapping("/disk")
    @ResponseBody
    public List<Disk> getDisk(@RequestParam String start ,@RequestParam  String end){    	
		List<Disk> diskList = diskService.getDiskSampleByTimeScope(start, end);
    	return diskList;
    }

}
