<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="hello1.do?id=22" method="get">  
        ID号: <input type="text" name="userId" id="userId"><br>  
         密码: <input type="password" name="userPassword" id="userPassword"><br>  
         <input type="submit" value="Login">  
     </form>  <br>  
     <form action="${pageContext.request.contextPath}/user.do?method=add2" method="post">  
        ID号: <input type="text" name="userId" id="userId"><br>  
         密码: <input type="password" name="userPassword" id="userPassword"><br>  
         <input type="submit" value="Login2">  
     </form>    
      <br>  
     <form action="${pageContext.request.contextPath}/user.do?method=add3" method="post">  
        ID号: <input type="text" name="userId" id="userId"><br>  
         密码: <input type="password" name="userPassword" id="userPassword"><br>          
         <input type="submit" value="Login3">  
     </form>
</body>
</html>