package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.entity.Disk;


@Repository
public class DiskDao extends BaseDao {
	
    public Disk getDiskSampleById(int id){		
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("id", 12);
    	Disk disk = getSqlSession().selectOne("getDiskSampleById", map);
    	return disk;    	
    }
    
    public List<Disk> getDiskSampleByTimeScope(String start, String end){	    	
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("start", "2015-12-23 20:43:00");
    	map.put("end", "2015-12-23 21:12:16");
    	List<Disk> diskList = getSqlSession().selectList("getDiskSampleByTimeScope", map);
    	return diskList;    	
    }

}


