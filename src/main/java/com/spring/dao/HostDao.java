package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.entity.Disk;
import com.spring.entity.Host;


@Repository
public class HostDao extends BaseDao {
	
    public Host getHostSampleById(int id){		
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("id", 12);
    	Host host = getSqlSession().selectOne("getHostSampleById", map);
    	return host;    	
    }
    
    public List<Host> getHostSampleByTimeScope(String start, String end){	    	
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("start", "2015-12-23 20:43:00");
    	map.put("end", "2015-12-23 21:12:16");
    	List<Host> hostList = getSqlSession().selectList("getHostSampleByTimeScope", map);
    	return hostList;    	
    }

}


