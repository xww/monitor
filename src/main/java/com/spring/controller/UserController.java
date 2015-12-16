package com.spring.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.slf4j.Logger;  
//import org.slf4j.LoggerFactory;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.entity.*;
import com.spring.service.*;
import org.apache.log4j.Logger;

  
 
@Controller
@RequestMapping("/home")
public class UserController {  
      
    
    static Logger logger1 = Logger.getLogger("module1");
	static Logger logger2 = Logger.getLogger("module2");
	static Logger loggermain = Logger.getLogger(UserController.class.getName());
  
    @Resource
    private UserService userService; 
    
    @ModelAttribute
    public void preRun() {
    	//如果把@ModelAttribute放在方法的注解上时，代表的是：该Controller的所有方法在调用前，先执行此@ModelAttribute方法
        System.out.println("Test Pre-Run");
    }
      
    //@RequestMapping(value = "/", method = RequestMethod.GET) 
    @RequestMapping("/index")
    public ModelAndView Add(HttpServletRequest request, HttpServletResponse response) {     
    	
    	//测试cookie
    	Cookie[] cookies = request.getCookies();
    	if (cookies !=null){
    		System.out.println(cookies.length);
    	}
    	Cookie cookie = new Cookie("hitCounter", "11111111");
    	cookie.setMaxAge(3601000);
		response.addCookie(cookie);
		//cookie测试结束
    	
    	//System.out.println(bb);
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
    
    @RequestMapping("/index2")
    public String Addaa(HttpServletRequest request,HttpServletResponse response, Model model2){
    	//这个方法给前端传递参数和上面/index请求给前端传递参数的方式不一样最终结果是一样的
    	List<User> users = userService.getUserList();
    	model2.addAttribute("users", users);
    	return "index";
    }
    
    @RequestMapping(value = "/hello1")
    @ResponseBody
    public String hello1(int id){//getParameter()的方式  
        System.out.println("hello action:"+id);  

        //return "redirect:/index.jsp";//不能重定向web-info里面的文件,而且需要写上绝对路径 
        return "hello1";
    }
    
    @RequestMapping(value = "/hello2")
    @ResponseBody
    public String hello2(int iid, @ModelAttribute("user") User user){//getParameter()的方式  
        System.out.println("hello action:"+iid);  

        //return "redirect:/index.jsp";//不能重定向web-info里面的文件,而且需要写上绝对路径 
        return "hello2";
    }
    
      
}