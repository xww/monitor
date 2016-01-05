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
    @SuppressWarnings("deprecation")
	@RequestMapping("/index")
    public  String Add(HttpServletRequest request, HttpServletResponse response, 
    		@RequestHeader(value="User-Agent", defaultValue="") String userAgent,ModelMap model){
    		//@CookieValue(value="JSESSIONID", defaultValue="") String jsessionId) {     
    	System.out.println(request.getAttribute("xww"));//拦截器塞进去的属性
    	//测试cookie
    	Cookie[] cookies = request.getCookies();
    	if (cookies !=null){
    		System.out.println(cookies.length);
    	}
    	Cookie cookie1 = new Cookie("key1", "value1");
    	cookie1.setMaxAge(60*60*24*1);//1day
		response.addCookie(cookie1);
		
		Cookie cookie2 = new Cookie("aaaaJSESSIONID", "JSESSIONID-value");
    	cookie2.setMaxAge(60*60*24*1);//1day
		response.addCookie(cookie2);
		//cookie测试结束
		
		System.out.println(userAgent);
		//System.out.println(jsessionId);
    	
    	//System.out.println(bb);
    	/*log4j测试
    	logger1.debug("module1 debug");
		logger1.info("module1 info");
		logger1.error("module1 error");
		
		logger2.debug("module2 debug");
		logger2.info("module2 info");
		logger2.error("module2 error");
		
		loggermain.debug("main debug");
		loggermain.info("main info");
		loggermain.error("main error");*/
        
        //List<User> users = userService.getUserList();
		User user = new User();
		user.setPassword("passwordxww2");
		user.setUserName("aaauserName");
		
		request.setAttribute("user", user);
		
		ServletContext ctx = request.getSession().getServletContext();
		System.out.println("sessionCounts is : "+ctx.getAttribute("sessionCounts"));
		
		/*System.out.println("log4jRefreshInterval: " + request.getServletContext().getInitParameter("log4jRefreshInterval"));
		System.out.println("log4jRefreshInterval2: " + request.getSession().getServletContext().getInitParameter("log4jRefreshInterval"));
		System.out.println("contextPath is: " + request.getContextPath());
		System.out.println("pathInfo is: " + request.getPathInfo());
		System.out.println("servletPath is: " + request.getServletPath());
		System.out.println("requestUrl is: " + request.getRequestURL());
		System.out.println("realPath is: " + request.getSession().getServletContext().getRealPath("index")); 
		System.out.println("realPath2 is: " + request.getRealPath("index"));*/ 
		
		
		
        //返回方式1
		//return new ModelAndView("index", "useraa", user);
		
		//返回方式2
		//map必须在函数参数内部声明,如:Map< String, User> map
		//map.put("usermap", user);
		//return "index";
		
		//返回方式3
		model.addAttribute("usermodel", user);
		return "index";
		
		//返回方式4
		//返回方式5
		//返回方式6
		//返回方式7
		
		
    }
    
    @RequestMapping("/index2")
    //public String Addaa(HttpServletRequest request,HttpServletResponse response, Model model2, myUser myuser){
    //public String Addaa(HttpServletRequest request,HttpServletResponse response, Model model2, User user){
    public String Addaa(HttpServletRequest request,HttpServletResponse response, Model model2, @ModelAttribute User user){
    	//函数参数里面，用没用ModelAttribute都一样
    	//这个方法给前端传递参数和上面/index请求给前端传递参数的方式不一样最终结果是一样的
    	//http://localhost:8080/springmvc-demo/home/index2.do?name=xww&age=22
    	//http://localhost:8080/springmvc-demo/home/index2.do?name=xww&age=22&adress.street=aaa
    	List<User> users = userService.getUserList();
    	model2.addAttribute("users", users);
    	
    	//System.out.println(myuser.name);
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
    public User hello2(HttpServletRequest request, @CookieValue(value="JSESSIONID", defaultValue="") String jsessionId){//getParameter()的方式  
        //return "redirect:/index.jsp";
        //return "hello2";
    	request.getSession().removeAttribute("JSESSIONID");
    	HttpSession session = request.getSession(true);
    	System.out.println(jsessionId);
        User user = new User();
        user.setUserName("name");
        user.setId(1);
        user.setPassword("password");
        return user;
    }
    
    @RequestMapping("/session1")
    @ResponseBody
    public void testSession1(HttpServletRequest request,HttpServletResponse response) throws IOException{
    	//模拟网站的业务页面，需要登录才可以访问  
    	String SESSIONID = null;
    	if(request.getParameter("userName")!=null){
    		Cookie[] cookies = request.getCookies();
    		for (int i = 0; i < cookies.length; i++) {
				if(cookies[i].getName().equals("SESSIONID")){
					SESSIONID = cookies[i].getValue();
					break;
				}
			}
    	}
    	HttpSession session = request.getSession(false);
    	
    	if (session != null && session.getAttribute("123") != null) {    		
			User user = (User) session.getAttribute(SESSIONID);
			System.out.println(user.getUserName());
		}else{
			String path = request.getContextPath();
			response.sendRedirect(path + "/session2.do");
		}
    }
    
    @RequestMapping("/session2")
    @ResponseBody
    public String testSession2(HttpServletRequest request,HttpSession session){
    	/*//模拟网站的login页面
    	Cookie cookie = new Cookie("SESSIONID", "123");
    	cookie.setMaxAge(60*60*24*1);//1day
		response.addCookie(cookie);
    	
    	HttpSession session = request.getSession(true);//没有Session就新建一个
    	User user = new User();
    	user.setId(1);
    	user.setUserName("nameaaa");
    	user.setPassword("password");
    	session.setAttribute("123", user);*/
    	User u = (User) session.getAttribute("user");
    	System.out.println(u.toString());
    	
    	return "session2";
    }
    
    @RequestMapping("/session3")
    @ResponseBody
    public ModelAndView testSession3(HttpServletRequest request,HttpSession session){
    	/*//模拟logout页面
    	request.getSession().removeAttribute("123");
    	//String aa =  (String) request.getAttribute("user");
    	//System.out.println(aa.toString());
    	User a = (User) session.getAttribute("user");
    	System.out.println(a.toString());
    	return "test session success";*/
    	String username = (String) request.getSession().getAttribute("userName");
    	System.out.println(username);
    	return new ModelAndView("index", "user", "user");
    	
    }
    
    @RequestMapping(value="/login",method = RequestMethod.POST)
    @ResponseBody
    public void login(HttpServletRequest request,HttpServletResponse response,  String userName, String password) throws IOException{    	
		request.getSession(true);//tomcat会自动创建jsessionid
    	System.out.println("login success!");    	
    	response.sendRedirect(request.getContextPath() + "/hosts.do");
    	
    }
    
    @RequestMapping(value="/home",method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView listHost(HttpServletRequest request,HttpSession session){
    	/*//模拟logout页面
    	request.getSession().removeAttribute("123");
    	//String aa =  (String) request.getAttribute("user");
    	//System.out.println(aa.toString());
    	User a = (User) session.getAttribute("user");
    	System.out.println(a.toString());
    	return "test session success";*/
    	System.out.println("in home!");    	
    	
    	return new ModelAndView("home2", "user", "user");
    	
    }
    
    
    
      
}