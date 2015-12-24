package com.spring.service;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.*;
import com.spring.entity.*; 


@Service
public class NetService {	
	
	
	@Resource
	private NetDao netDao;	
	
	public Net getNetSampleById(int id) {
		return this.netDao.getNetSampleById(id);
	}
	
	public List<Net> getNetSampleByTimeScope(String start, String end){		
		return this.netDao.getNetSampleByTimeScope(start, end);	
	}
	
}
