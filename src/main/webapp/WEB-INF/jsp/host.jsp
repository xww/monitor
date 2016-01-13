<%@page import="java.util.ArrayList"%>
<%@page import="com.mysql.fabric.xmlrpc.base.Array"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="com.spring.entity.*"%>
<%@page import="java.text.SimpleDateFormat"%>

<%
	String user_name = (String) session.getAttribute("user_name");
%>

<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">

<title>畅游监控平台</title>
<meta name="keywords" content="bootstrap 监控平台">
<meta name="description" content="bootstrap 监控平台">

<link href="css/bootstrap.min.css?v=3.4.0" rel="stylesheet">
<link href="font-awesome/css/font-awesome.css?v=4.3.0" rel="stylesheet">

<link href="css/animate.css" rel="stylesheet">
<link href="css/style.css?v=2.2.0" rel="stylesheet">

<style type="text/css">
</style>

</head>

<body>
	<div id="wrapper">
		<nav class="navbar-default navbar-static-side" role="navigation">
			<div class="sidebar-collapse">
				<ul class="nav" id="side-menu">
					<li class="nav-header">

						<div class="dropdown profile-element">
							<span> <img alt="image" class="img-circle"
								src="img/p5.jpg" />
							</span> <a data-toggle="dropdown" class="dropdown-toggle"
								href="hosts.do"> <span class="clear"> <span
									class="block m-t-xs"> <strong class="font-bold">xiongwenwu</strong><b
										class="caret"></b></span>
							</span>
							</a>
							<ul class="dropdown-menu animated fadeInRight m-t-xs">
								<li><a href="#">修改头像</a></li>
								<li><a href="#">提出建议</a></li>
								<li><a href="#">联系我们</a></li>
								<li class="divider"></li>
								<li><a href="logout.do">安全退出</a></li>
							</ul>
						</div>
						<div class="logo-element">H+</div>

					</li>
					<li class="active"><a href="hosts.do"><i
							class="fa fa-computing_networks"></i> <span class="nav-label">主机</span>
					</a></li>
					<li><a href="index.html#"><i class="fa fa-sitemap"></i> <span
							class="nav-label">告警</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">							
							<li><a href="alarm_list.do">告警列表</a></li>
							<li><a href="alarm_rules.do">告警规则</a></li>							
						</ul></li>
					<li><a href="layouts.html"><i class="fa fa-columns"></i> <span
							class="nav-label">布局</span><span
							class="label label-danger pull-right">2.0</span></a></li>
					<li><a href="index.html#"><i class="fa fa fa-globe"></i> <span
							class="nav-label">v2.0新增</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="toastr_notifications.html">Toastr通知</a></li>
							<li><a href="nestable_list.html">嵌套列表</a></li>
							<li><a href="timeline_v2.html">时间轴</a></li>
							<li><a href="forum_main.html">论坛</a></li>
							<li><a href="code_editor.html">代码编辑器</a></li>
							<li><a href="modal_window.html">模态窗口</a></li>
							<li><a href="validation.html">表单验证</a></li>
							<li><a href="tree_view_v2.html">树形视图</a></li>
							<li><a href="chat_view.html">聊天窗口</a></li>
						</ul></li>

					<li><a href="index.html#"><i class="fa fa-bar-chart-o"></i>
							<span class="nav-label">图表</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="graph_echarts.html">百度ECharts</a></li>
							<li><a href="graph_flot.html">Flot</a></li>
							<li><a href="graph_morris.html">Morris.js</a></li>
							<li><a href="graph_rickshaw.html">Rickshaw</a></li>
							<li><a href="graph_peity.html">Peity</a></li>
							<li><a href="graph_sparkline.html">Sparkline</a></li>
						</ul></li>
					<li><a href="mailbox.html"><i class="fa fa-envelope"></i>
							<span class="nav-label">信箱 </span><span
							class="label label-warning pull-right">16</span></a>
						<ul class="nav nav-second-level">
							<li><a href="mailbox.html">收件箱</a></li>
							<li><a href="mail_detail.html">查看邮件</a></li>
							<li><a href="mail_compose.html">写信</a></li>
						</ul></li>
					<li><a href="widgets.html"><i class="fa fa-flask"></i> <span
							class="nav-label">小工具</span></a></li>
					<li><a href="index.html#"><i class="fa fa-edit"></i> <span
							class="nav-label">表单</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="form_basic.html">基本表单</a></li>
							<li><a href="form_validate.html">表单验证</a></li>
							<li><a href="form_advanced.html">高级插件</a></li>
							<li><a href="form_wizard.html">步骤条</a></li>
							<li><a href="form_webuploader.html">百度WebUploader</a></li>
							<li><a href="form_file_upload.html">文件上传</a></li>
							<li><a href="form_editors.html">富文本编辑器</a></li>
							<li><a href="form_simditor.html">simditor</a></li>
							<li><a href="form_avatar.html">头像裁剪上传</a></li>
							<li><a href="layerdate.html">日期选择器layerDate</a></li>
						</ul></li>
					<li><a href="index.html#"><i class="fa fa-desktop"></i> <span
							class="nav-label">页面</span></a>
						<ul class="nav nav-second-level">
							<li><a href="contacts.html">联系人</a></li>
							<li><a href="profile.html">个人资料</a></li>
							<li><a href="projects.html">项目</a></li>
							<li><a href="project_detail.html">项目详情</a></li>
							<li><a href="file_manager.html">文件管理器</a></li>
							<li><a href="calendar.html">日历</a></li>
							<li><a href="faq.html">帮助中心</a></li>
							<li><a href="timeline.html">时间轴</a></li>
							<li><a href="pin_board.html">标签墙</a></li>
							<li><a href="invoice.html">单据</a></li>
							<li><a href="login.html">登录</a></li>
							<li><a href="register.html">注册</a></li>
						</ul></li>
					<li><a href="index.html#"><i class="fa fa-files-o"></i> <span
							class="nav-label">其他页面</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="search_results.html">搜索结果</a></li>
							<li><a href="lockscreen.html">登录超时</a></li>
							<li><a href="404.html">404页面</a></li>
							<li><a href="500.html">500页面</a></li>
							<li><a href="empty_page.html">空白页</a></li>
						</ul></li>

					<li><a href="index.html#"><i class="fa fa-flask"></i> <span
							class="nav-label">UI元素</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="typography.html">排版</a></li>
							<li><a href="icons.html">字体图标</a></li>
							<li><a href="iconfont.html">阿里巴巴矢量图标库</a></li>
							<li><a href="draggable_panels.html">拖动面板</a></li>
							<li><a href="buttons.html">按钮</a></li>
							<li><a href="tabs_panels.html">选项卡 & 面板</a></li>
							<li><a href="notifications.html">通知 & 提示</a></li>
							<li><a href="badges_labels.html">徽章，标签，进度条</a></li>
							<li><a href="layer.html">Web弹层组件layer</a></li>
							<li><a href="tree_view.html">树形视图</a></li>
						</ul></li>
					<li><a href="grid_options.html"><i class="fa fa-laptop"></i>
							<span class="nav-label">栅格</span></a></li>
					<li><a href="index.html#"><i class="fa fa-table"></i> <span
							class="nav-label">表格</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="table_basic.html">基本表格</a></li>
							<li><a href="table_data_tables.html">数据表格(DataTables)</a></li>
							<li><a href="table_jqgrid.html">jqGrid</a></li>
						</ul></li>
					<li><a href="index.html#"><i class="fa fa-picture-o"></i>
							<span class="nav-label">图库</span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="basic_gallery.html">基本图库</a></li>
							<li><a href="carousel.html">图片切换</a></li>

						</ul></li>
					<li><a href="index.html#"><i class="fa fa-sitemap"></i> <span
							class="nav-label">菜单 </span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="index.html#">三级菜单 <span class="fa arrow"></span></a>
								<ul class="nav nav-third-level">
									<li><a href="index.html#">三级菜单 01</a></li>
									<li><a href="index.html#">三级菜单 01</a></li>
									<li><a href="index.html#">三级菜单 01</a></li>

								</ul></li>
							<li><a href="index.html#">二级菜单</a></li>
							<li><a href="index.html#">二级菜单</a></li>
							<li><a href="index.html#">二级菜单</a></li>
						</ul></li>
					<li><a href="webim.html"><i class="fa fa-comments"></i> <span
							class="nav-label">即时通讯</span><span
							class="label label-danger pull-right">New</span></a></li>
					<li><a href="css_animation.html"><i class="fa fa-magic"></i>
							<span class="nav-label">CSS动画</span></a></li>
					<li><a href="index.html#"><i class="fa fa-cutlery"></i> <span
							class="nav-label">工具 </span><span class="fa arrow"></span></a>
						<ul class="nav nav-second-level">
							<li><a href="form_builder.html">表单构建器</a></li>
						</ul></li>
				</ul>

			</div>
		</nav>

		<div id="page-wrapper" class="gray-bg dashbard-1">
			<div class="row border-bottom">
				<nav class="navbar navbar-static-top" role="navigation"
					style="margin-bottom: 0">
					<div class="navbar-header">
						<a class="navbar-minimalize minimalize-styl-2 btn btn-primary "
							href="index_2.html#"><i class="fa fa-bars"></i> </a>

					</div>
					<ul class="nav navbar-top-links navbar-right">
						<li><span class="m-r-sm text-muted welcome-message"><a
								href="hosts.do" title="返回首页"><i class="fa fa-home"></i></a>欢迎使用畅游监控平台</span>
						</li>

						<li><a href="login.html"> <i class="fa fa-sign-out"></i>
								注销
						</a></li>
					</ul>

				</nav>
			</div>
			<div class="wrapper wrapper-content animated fadeInRight">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>CPU利用率 %</h5>
                                <div class="ibox-tools">
                                    <a class="collapse-link">
                                        <i class="fa fa-chevron-up"></i>
                                    </a>
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="graph_flot.html#">
                                        <i class="fa fa-wrench"></i>
                                    </a>
                                    <ul class="dropdown-menu dropdown-user">
                                        <li><a href="graph_flot.html#">选项1</a>
                                        </li>
                                        <li><a href="graph_flot.html#">选项2</a>
                                        </li>
                                    </ul>
                                    <a class="close-link">
                                        <i class="fa fa-times"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="ibox-content">

                                <div class="flot-chart">
                                    <div class="flot-chart-content" id="flot-line-chart-cpu"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>内存利用率 %</h5>
                                <div class="ibox-tools">
                                    <a class="collapse-link">
                                        <i class="fa fa-chevron-up"></i>
                                    </a>
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="graph_flot.html#">
                                        <i class="fa fa-wrench"></i>
                                    </a>
                                    <ul class="dropdown-menu dropdown-user">
                                        <li><a href="graph_flot.html#">选项1</a>
                                        </li>
                                        <li><a href="graph_flot.html#">选项2</a>
                                        </li>
                                    </ul>
                                    <a class="close-link">
                                        <i class="fa fa-times"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="ibox-content">

                                <div class="flot-chart">
                                    <div class="flot-chart-content" id="flot-line-chart-mem"></div>
                                </div>
                            </div>
                        </div>
                    </div> 
                </div>
                <div class="row">
                    <div class="col-lg-6">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>磁盘读：MB/S</h5>
                                <div class="ibox-tools">
                                    <a class="collapse-link">
                                        <i class="fa fa-chevron-up"></i>
                                    </a>
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="graph_flot.html#">
                                        <i class="fa fa-wrench"></i>
                                    </a>
                                    <ul class="dropdown-menu dropdown-user">
                                        <li><a href="graph_flot.html#">选项1</a>
                                        </li>
                                        <li><a href="graph_flot.html#">选项2</a>
                                        </li>
                                    </ul>
                                    <a class="close-link">
                                        <i class="fa fa-times"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="ibox-content">

                                <div class="flot-chart">
                                    <div class="flot-chart-content" id="flot-line-chart-disk-read-mbs"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>磁盘写：MB/S</h5>
                                <div class="ibox-tools">
                                    <a class="collapse-link">
                                        <i class="fa fa-chevron-up"></i>
                                    </a>
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="graph_flot.html#">
                                        <i class="fa fa-wrench"></i>
                                    </a>
                                    <ul class="dropdown-menu dropdown-user">
                                        <li><a href="graph_flot.html#">选项1</a>
                                        </li>
                                        <li><a href="graph_flot.html#">选项2</a>
                                        </li>
                                    </ul>
                                    <a class="close-link">
                                        <i class="fa fa-times"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="ibox-content">

                                <div class="flot-chart">
                                    <div class="flot-chart-content" id="flot-line-chart-disk-write-mbs"></div>
                                </div>
                            </div>
                        </div>
                    </div>  
                </div>
                <div class="row">
                    <div class="col-lg-6">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>网络入流量： KB/S</h5>
                                <div class="ibox-tools">
                                    <a class="collapse-link">
                                        <i class="fa fa-chevron-up"></i>
                                    </a>
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="graph_flot.html#">
                                        <i class="fa fa-wrench"></i>
                                    </a>
                                    <ul class="dropdown-menu dropdown-user">
                                        <li><a href="graph_flot.html#">选项1</a>
                                        </li>
                                        <li><a href="graph_flot.html#">选项2</a>
                                        </li>
                                    </ul>
                                    <a class="close-link">
                                        <i class="fa fa-times"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="ibox-content">

                                <div class="flot-chart">
                                    <div class="flot-chart-content" id="flot-line-chart-net-in"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <div class="ibox float-e-margins">
                            <div class="ibox-title">
                                <h5>网络出流量： KB/S</h5>
                                <div class="ibox-tools">
                                    <a class="collapse-link">
                                        <i class="fa fa-chevron-up"></i>
                                    </a>
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="graph_flot.html#">
                                        <i class="fa fa-wrench"></i>
                                    </a>
                                    <ul class="dropdown-menu dropdown-user">
                                        <li><a href="graph_flot.html#">选项1</a>
                                        </li>
                                        <li><a href="graph_flot.html#">选项2</a>
                                        </li>
                                    </ul>
                                    <a class="close-link">
                                        <i class="fa fa-times"></i>
                                    </a>
                                </div>
                            </div>
                            <div class="ibox-content">

                                <div class="flot-chart">
                                    <div class="flot-chart-content" id="flot-line-chart-net-out"></div>
                                </div>
                            </div>
                        </div>
                    </div> 
                </div>
                

                
                
                
            </div>
			<div class="footer">
				<div class="pull-right">
					By：<a href="http://www.zi-han.net" target="_blank">搜狐畅游</a>
				</div>
				<div>
					<strong>Copyright</strong> H+ &copy; 2016
				</div>
			</div>
		</div>
	</div>

	<!-- Mainly scripts -->
    <script src="js/jquery-2.1.1.min.js"></script>
    <script src="js/bootstrap.min.js?v=3.4.0"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

    <!-- Flot -->
    <script src="js/plugins/flot/jquery.flot.js"></script>
    <script src="js/plugins/flot/jquery.flot.tooltip.min.js"></script>
    <script src="js/plugins/flot/jquery.flot.resize.js"></script>
    <script src="js/plugins/flot/jquery.flot.pie.js"></script>

    <!-- Custom and plugin javascript -->
    <script src="js/hplus.js?v=2.2.0"></script>
    <script src="js/plugins/pace/pace.min.js"></script>

    <!-- Flot demo data -->
    <script src="js/demo/flot-demo.js"></script>

    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script><!--统计代码，可删除-->

</body>

</html>