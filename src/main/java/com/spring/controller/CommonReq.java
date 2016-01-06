package com.spring.controller;

import java.io.IOException;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.slf4j.Logger;  
//import org.slf4j.LoggerFactory;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.User;
import com.spring.service.*;

import org.apache.log4j.Logger;


  
 
@Controller
public class CommonReq { 
    
    
    @RequestMapping(value="/login2",method = RequestMethod.POST)
    @ResponseBody
    public void login(HttpServletRequest request,HttpServletResponse response,  String userName, String password) throws IOException{    	
		request.getSession(true);//tomcat会自动创建jsessionid
    	System.out.println("login success!");    	
    	response.sendRedirect(request.getContextPath() + "/hosts.do");    	
    }
}