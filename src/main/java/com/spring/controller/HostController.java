package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.Cpu;
import com.spring.entity.Host;
import com.spring.service.CpuService;
import com.spring.service.HostService;

@Controller
public class HostController {
	
	@Resource
    private HostService hostService;
	
	@RequestMapping("/host/{id}")
    @ResponseBody
    public Host getHost(@PathVariable int id){
    	
    	Host host = hostService.getHostSampleById(id);
    	return host;
    }
	
	

}
