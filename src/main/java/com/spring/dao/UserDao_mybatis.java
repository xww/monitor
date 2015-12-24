package com.spring.dao;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.spring.entity.User;

@Repository
public class UserDao_mybatis extends BaseDao {
	
    public User selectByPrimaryKey(Integer id){
		
    	Map<String,Object> map = new HashMap<String,Object>();
    	map.put("id", 123);
    	User user = getSqlSession().selectOne("selectByPrimaryKey", map); 
    	//User user = new User();
    	//user.setPassword("pass");
    	return user;    	
    }

    public int updateByPrimaryKeySelective(User record){
		return 0;
    	
    }

    public int updateByPrimaryKey(User record){
		return 0;
    	
    }
    
    public int deleteByPrimaryKey(Integer id){
		return id;
		
	}

	public int insert(User record){
		return 0;
    	
    }

    public int insertSelective(User record){
		return 0;
    	
    }

}


