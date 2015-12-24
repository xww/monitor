package com.spring.service;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.*;
import com.spring.entity.*; 


@Service
public class DiskService {	
	
	
	@Resource
	private DiskDao diskDao;
	
	
	public Disk getDiskSampleById(int id) {
		return this.diskDao.getDiskSampleById(id);
	}
	
	public List<Disk> getDiskSampleByTimeScope(String start, String end){		
		return this.diskDao.getDiskSampleByTimeScope(start, end);		
	}
	
}
