package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.entity.Disk;
import com.spring.entity.Host;


@Repository
public class HostDao extends BaseDao {
	
    public Host getHostById(int id){		
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("id", 1);
    	Host host = getSqlSession().selectOne("getHostById", map);
    	return host;    	
    }
    
    

}


