package com.spring.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.entity.Cpu;


@Repository
public class CpuDao extends BaseDao {
	
    public Cpu getCpuSampleById(int id){		
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("id", 12);
    	Cpu cpu = getSqlSession().selectOne("getCpuSampleById", map);
    	return cpu;    	
    }

    

}


