package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.slf4j.Logger;  
//import org.slf4j.LoggerFactory;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.*;
import com.spring.service.*;
import org.apache.log4j.Logger;

  
 
@Controller  
public class UserController {  
      
    
    static Logger logger1 = Logger.getLogger("module1");
	static Logger logger2 = Logger.getLogger("module2");
	static Logger loggermain = Logger.getLogger(UserController.class.getName());
  
    @Resource
    private UserService userService;  
      
    //@RequestMapping(value = "/", method = RequestMethod.GET) 
    @RequestMapping("/home/index")
    public ModelAndView Add(HttpServletRequest request, HttpServletResponse response) {
    //public ModelAndView home(Model model) { 
    	logger1.debug("module1 debug");
		logger1.info("module1 info");
		logger1.error("module1 error");
		
		logger2.debug("module2 debug");
		logger2.info("module2 info");
		logger2.error("module2 error");
		
		loggermain.debug("main debug");
		loggermain.info("main info");
		loggermain.error("main error");
		
        //logger.info("get all user info ---->/n");  
        List<User> users = userService.getUserList();  
        //logger.info(users.toString());  
        //model.addAttribute("users", users);
        return new ModelAndView("index", "users", users);
          
        //return "showUsers";  
    } 
    
      
}