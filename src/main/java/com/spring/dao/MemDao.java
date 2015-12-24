package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.entity.Disk;
import com.spring.entity.Mem;


@Repository
public class MemDao extends BaseDao {
	
    public Mem getMemSampleById(int id){		
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("id", 12);
    	Mem mem = getSqlSession().selectOne("getMemSampleById", map);
    	return mem;    	
    }
    
    public List<Mem> getMemSampleByTimeScope(String start, String end){	    	
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("start", "2015-12-23 20:43:00");
    	map.put("end", "2015-12-23 21:12:16");
    	List<Mem> memList = getSqlSession().selectList("getMemSampleByTimeScope", map);
    	return memList;    	
    }

}


