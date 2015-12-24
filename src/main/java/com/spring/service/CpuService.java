package com.spring.service;



import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Service;

import com.spring.dao.*;
import com.spring.entity.*; 


@Service
public class CpuService {
	
	
	
	@Resource
	private CpuDao cpuDao;
	
	
	public Cpu getCpuSampleById(int id) {
		// TODO Auto-generated method stub
		return this.cpuDao.getCpuSampleById(id);
	}
	
	public List<Cpu> getCpuSampleByTimeScope(String start, String end){
		
		return this.cpuDao.getCpuSampleByTimeScope(start, end);
		
	}
	
	
}
