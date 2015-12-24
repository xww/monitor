package com.spring.service;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.*;
import com.spring.entity.*; 


@Service
public class MemService {
	
	@Resource
	private MemDao memDao;
	
	public Mem getMemSampleById(int id) {
		return this.memDao.getMemSampleById(id);
	}
	
	public List<Mem> getMemSampleByTimeScope(String start, String end){		
		return this.memDao.getMemSampleByTimeScope(start, end);	
	}
	
}
