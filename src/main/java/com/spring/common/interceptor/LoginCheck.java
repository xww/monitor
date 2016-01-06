package com.spring.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginCheck implements HandlerInterceptor{

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse res, Object arg2) throws Exception {		
		/*if(request.getServletPath().startsWith("/login.do")) {
			String userName = request.getParameter("userName");
			if(userName != null){
				request.getSession(true).setAttribute("userName", userName);				
				return true;
			}else{
				res.sendRedirect(request.getContextPath());
				return false;
			}
	        
	    }else{			
	    	if (request.getSession().getAttribute("userName") != null) {
				return true;
			}else{
				res.sendRedirect(request.getContextPath());
				return false;
			}	    	
		}*/
		
		if(request.getServletPath().startsWith("/login.do")){
			return true;
		}
		if(request.getServletPath().startsWith("/logout.do")){
			return true;
		}
		
		//if(request.getSession().getAttribute("userName") != null){
		HttpSession session = request.getSession(false);
		if(session != null){ 
			return true;
		}else{
			//String userName = request.getParameter("userName");
			//request.getSession(true).setAttribute("userName", userName);
			res.sendRedirect(request.getContextPath());
			return false;
		}
		
	}

}
