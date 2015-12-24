package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.entity.Cpu;


@Repository
public class CpuDao extends BaseDao {
	
    public Cpu getCpuSampleById(int id){		
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("id", 12);
    	Cpu cpu = getSqlSession().selectOne("getCpuSampleById", map);
    	return cpu;    	
    }
    
    public List<Cpu> getCpuSampleByTimeScope(String start, String end){	    	
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("start", "2015-12-23 20:43:00");
    	map.put("end", "2015-12-23 21:12:16");
    	List<Cpu> cpuList = getSqlSession().selectList("getCpuSampleByTimeScope", map);
    	return cpuList;    	
    }
    
    

}


