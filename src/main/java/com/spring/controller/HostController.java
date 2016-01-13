package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.Cpu;
import com.spring.entity.Host;
import com.spring.service.CpuService;
import com.spring.service.HostService;

@Controller
public class HostController {
	
	@Resource
    private HostService hostService;
	
	
	
	@RequestMapping("/hosts")
	public ModelAndView getAllHosts(){
		List<Host> hosts = hostService.getAllHosts();
		return new ModelAndView("hosts", "hosts", hosts);
		
	}
	
	@RequestMapping("/host")
	public ModelAndView getHost(@RequestParam String sn){
		//TODO：获取该sn的机器的信息
		return new ModelAndView("host");
	}
}
