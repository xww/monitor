package com.spring.service;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.*;
import com.spring.entity.*; 


@Service
public class HostService {	
	
	
	@Resource
	private HostDao hostDao;
	
	
	public Host getHostSampleById(int id) {
		return this.hostDao.getHostSampleById(id);
	}
	
	public List<Host> getHostSampleByTimeScope(String start, String end){		
		return this.hostDao.getHostSampleByTimeScope(start, end);		
	}
	
}
