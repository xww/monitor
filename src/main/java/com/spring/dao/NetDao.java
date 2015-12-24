package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.entity.Disk;
import com.spring.entity.Net;


@Repository
public class NetDao extends BaseDao {
	
    public Net getNetSampleById(int id){		
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("id", 12);
    	Net net = getSqlSession().selectOne("getNetSampleById", map);
    	return net;    	
    }
    
    public List<Net> getNetSampleByTimeScope(String start, String end){	    	
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("start", "2015-12-23 20:43:00");
    	map.put("end", "2015-12-23 21:12:16");
    	List<Net> netList = getSqlSession().selectList("getNetSampleByTimeScope", map);
    	return netList;    	
    }

}


