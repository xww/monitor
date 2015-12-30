<%@ page language="java" pageEncoding="UTF-8"%>
 2 <!DOCTYPE HTML>
 3 <html>
 4   <head>
 5     <title>Servlet3.0实现文件上传</title>
 6   </head>
 7   
 8   <body>
 9         <fieldset>
10             <legend>
11                 上传单个文件
12             </legend>
13             <!-- 文件上传时必须要设置表单的enctype="multipart/form-data"-->
14             <form action="${pageContext.request.contextPath}/UploadServlet"
15                 method="post" enctype="multipart/form-data">
16                 上传文件：
17                 <input type="file" name="file">
18                 <br>
19                 <input type="submit" value="上传">
20             </form>
21         </fieldset>
22         <hr />
23         <fieldset>
24             <legend>
25                 上传多个文件
26             </legend>
27             <!-- 文件上传时必须要设置表单的enctype="multipart/form-data"-->
28             <form action="${pageContext.request.contextPath}/UploadServlet"
29                 method="post" enctype="multipart/form-data">
30                 上传文件：
31                 <input type="file" name="file1">
32                 <br>
33                 上传文件：
34                 <input type="file" name="file2">
35                 <br>
36                 <input type="submit" value="上传">
37             </form>
38         </fieldset>
39     </body>
40 </html>