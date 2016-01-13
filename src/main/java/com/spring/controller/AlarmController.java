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
import com.spring.service.CpuService;

@Controller
public class AlarmController {
	
	@Resource
    private CpuService cpuService;
	
	
	
	@RequestMapping("/alarm_list")
	public ModelAndView getAlarmList(){
		return new ModelAndView("alarm_list");
		
	}
	
	@RequestMapping("/alarm_rules")
	public ModelAndView getAlarmRule(){
		return new ModelAndView("alarm_rules");
		
	}
	
	

}
