<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <%
	    //获取项目路径
	      pageContext.setAttribute("APP_PATH",request.getContextPath());
	     %>

  </head>
  
  <body>
     <jsp:forward page="shopping/main.action"></jsp:forward>

  </body>
</html>
