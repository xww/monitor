package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.stereotype.Service;

import com.spring.dao.*;
import com.spring.entity.*; 


@Service
public class UserService {
	
	@Resource
    private UserDao userDao;
	
	@Resource
	private UserDao_mybatis  userDao_mybatis;
	
	
  
    public List<User> getUserList(){  
        return userDao.findAllUser();  
    }      
    
	
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao_mybatis.selectByPrimaryKey(userId);
	}
}
