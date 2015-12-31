<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat"  %>
<%@ page import="com.spring.entity.*"  %>
<%@page import="java.text.SimpleDateFormat"%>
    
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新闻发布系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
    <link href="css/bootstrap.css" rel="stylesheet" media="screen">
    <script src="js/jquery-2.0.3.js"></script>
    <script src="js/bootstrap.js"></script>
    
    <script type="text/javascript"> 
$(function(){ 
   $("#btn4").click(function(){ 
   $("#btn3").click(); 
    }); 
    }); 
function change(){ 
alert("onclick"); 
} 
</script>

  </head>
  
  <body>
  <%
  Date date = new Date();
  SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  String today = sf.format(date);
  %>
  当前时间是： <%=today %>
  
  <%User u = new User();
  //u.setId(111);u.setPassword("mypass");u.setUserName("xww");
  
  request.setAttribute("user", u);
  session.setAttribute("user", u);
  //response.sendRedirect("/monitor/session3.do");url会跟着变，forward url不会变
  String log4jRefreshInterval = application.getInitParameter("log4jRefreshInterval");
  User aa = (User)request.getAttribute("usermodel");
  %>  
  log4jRefreshInterval： <%=log4jRefreshInterval %>
  
  
<button id="btn3" onclick="change()">dd</button> 
<button id="btn4">ee</button>

pass: ${usermodel.password}
useraa: ${aa.password}

<form action="login.do" method="post">  
          用户名:<input type="text" name="userName">  
    <br/>  
    password:<input type="text" name="password">  
    <br/>  
    <input type="submit" value="登录">  
</form> 

<c:out value="aaaaaaaaaaajstl--jstl--jstl"></c:out>
  
  
  <div class="container">
  //------------------------------------ 导航开始 ------------------------------------%>
  
  <nav class="navbar" role="navigation">
  <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="#">ContentManageSystem</a>
  </div>
  <div class="col-xs-4"></div>
  <!-- Collect the nav links, forms, and other content for toggling -->
  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
    <ul class="nav nav-pills navbar-right">
      <li class="active"><a href="index.jsp">主页</a></li>
      <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown">新闻分类 <b class="caret"></b></a>
        <ul class="dropdown-menu">
          <li><a href="getnewslist?type_id=1">时政</a></li>
          <li class="divider"></li>
          <li><a href="getnewslist?type_id=2">科技</a></li>
          <li class="divider"></li>
          <li><a href="getnewslist?type_id=3">娱乐</a></li>
          <li class="divider"></li>
          <li><a href="getnewslist?type_id=4">体育</a></li>
          <li class="divider"></li>
          <li><a href="getnewslist?type_id=5">游戏</a></li>
          <li class="divider"></li>
          <li><a href="getnewslist?type_id=6">财经</a></li>
        </ul>
      </li>
      <li><a href="login.jsp">
      <%if(request.getAttribute("nickname")!=null){
    	  out.print(request.getAttribute("nickname"));
      }else{
    	  out.print("登陆");
      }
      %>
      </a></li>
      <li><a href="register.jsp">注册</a></li>
      <li><a href="#">联系我们</a></li>
    </ul>
  </div><!-- /.navbar-collapse -->
  <div class="page-header"></div>
</nav>
  <!------------------------------------ 导航结束 ------------------------------------>
  <!------------------------------------ 图片滚动开始 ------------------------------------>
  <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
  <!-- Indicators -->
  <ol class="carousel-indicators">
    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
  </ol>

  <!-- Wrapper for slides -->
  <div class="carousel-inner">
	<div class="item active">
	  <img src="img/slide-1.png" alt="0">
	  <div class="carousel-caption">
	    <h3>...</h3>
	    <p>当地时间2013年12月16日，乌克兰基辅，亲欧盟示威者在独立广场下棋。据悉，民众抗议政府暂停与欧盟签署联系国协定的示威活动已经进入第四周。AP Photo/Dmitry Lovetsky</p>
	  </div>
	</div>
		<div class="item">
	  <img src="img/slide-2.png" alt="1">
	  <div class="carousel-caption">
	    <h3>...</h3>
	    <p>2013年12月16日消息，意大利，当地警察工会表示他们已向法院提出申诉，指责20岁的女学生希弗勒在一个月前亲吻警察的面罩是性骚扰。AFP PHOTO/MARCO BERTORELLO</p>
	  </div>
	</div>
		<div class="item">
	  <img src="img/slide-3.png" alt="1">
	  <div class="carousel-caption">
	    <h3>...</h3>
	    <p>2013年12月15日，广州越秀区，建业大厦发生火灾。该大厦已经烂尾十几年，以前有物业公司进行管理，部分楼层被业主作为仓库出租，仓库内主要堆放的是鞋子。12月16日，经过连续消防人员连续作业，大火在燃烧20小时后已被基本扑灭。CFP</p>
	  </div>
	</div>
  </div>

  <!-- Controls -->
  <a class="left carousel-control" href="#carousel-example-generic" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left"></span>
  </a>
  <a class="right carousel-control" href="#carousel-example-generic" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right"></span>
  </a>
</div>
	<script type="text/javascript">
	$('.carousel').carousel({
	  interval: 2000
	});
	</script>
  <!------------------------------------ 图片滚动结束 ------------------------------------>
  <!------------------------------------ 新闻分类开始 ------------------------------------>
  <!-- 1 -->
  <div class="row">
  <div class="col-xs-4">
     <h2 class="page-header">时政</h2>
     <div class="thumbnail">
     <img src="img/type-1.png">
     <p>据英国《每日邮报》报道，当地时间12月26日是英国圣诞节后第一个工作日，商场举行节礼日大促销。节日购物是英国旅游中的一大亮点，在节礼日促销中，中国游客或将再次成为最大的消费人群。</p>
     <form action="getnewslist?type_id=1" method="post"><button type="submit" class="btn btn-primary btn-xs">更多</button></form>
	</div>
  </div>
  <div class="col-xs-4">
     <h2 class="page-header">科技</h2>
     <div class="thumbnail">
     <img src="img/type-2.png">
     <p>荷兰人研制能够自行避让障碍物的微型飞行器,DelFly Explore这种微型飞行器由于体型小而难以被应用到军事领域，但能够实现自主飞行的功能让其具备一定的民用意义，未来可能会被用在航拍和投送快递等方面。</p>
		<form action="getnewslist?type_id=2" method="post"><button type="submit" class="btn btn-primary btn-xs">更多</button></form>
     </div>
  </div>
  <div class="col-xs-4">
     <h2 class="page-header">娱乐</h2>
     <div class="thumbnail">
     <img src="img/type-3.png">
     <p>刘德华在《风暴》中饰演了一个亦正亦邪的香港警察，搏命演出获得大家的好评，也因为“打不死、摔不死、撞不死”，处处维持偶像气质被影迷诟病。刘德华表示“偶像派当一辈子也不错。</p>
		<form action="getnewslist?type_id=3" method="post"><button type="submit" class="btn btn-primary btn-xs">更多</button></form>
	</div>
  </div>
  </div>
  <!-- 1 -->
  <!-- 2 -->
  <div class="row">
  <div class="col-xs-4">
     <h2 class="page-header">体育</h2>
     <div class="thumbnail">
     <img src="img/type-4.png">
     <p>2013年12月26日，上海，刘翔一身黑装戴着口罩出现在上海虹桥机场，没有随身行李的刘翔从快速通道走出，一路上大步流星的走向停车场上车离开，全程都没人能认出刘翔来。</p>
<form action="getnewslist?type_id=4" method="post"><button type="submit" class="btn btn-primary btn-xs">更多</button></form>
     </div>
  </div>
  <div class="col-xs-4">
     <h2 class="page-header">游戏</h2>
     <div class="thumbnail">
     <img src="img/type-5.png">
     <p><br/>外媒专访若风：WCG是遗憾期待未来复出再夺冠军.在这次外媒进行的采访中，若风提到他尽管退役了但是还是期望有一天可以复出并再次夺得冠军。</p>
<form action="getnewslist?type_id=5" method="post"><button type="submit" class="btn btn-primary btn-xs">更多</button></form>
	</div>
  </div>
  <div class="col-xs-4">
     <h2 class="page-header">财经</h2>
     <div class="thumbnail">
     <img src="img/type-6.png">
     <p>12月26日，消费者在北京菜百商场内选购黄金饰品。当日上午，北京菜百、工美、国华和中国黄金旗舰店等商场宣布下调金价，其中菜百商场千足金价每克下调8元，降至302元。</p>
<form action="getnewslist?type_id=6" method="post"><button type="submit" class="btn btn-primary btn-xs">更多</button></form>
     </div>
  </div>
  </div>
  <!-- 2 -->
  <!------------------------------------ 新闻分类结束 ------------------------------------>
  <!------------------------------------ 底部开始 ------------------------------------>
  <footer>
  <div class="page-header"></div>
  <div class="row">
  <div class="col-xs-2">CUG.Software Engineer</div>
  <div class="col-xs-9"></div>2013.12
  </div>
  </footer>
  <!------------------------------------ 底部结束 ------------------------------------>
  </div>
  </body>
</html>
