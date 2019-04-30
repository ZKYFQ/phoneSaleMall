<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
       <title>登录</title>
    
<%--       <%
	    //获取项目路径
	      pageContext.setAttribute("APP_PATH",request.getContextPath());
	     %> --%>
	     <!-- web路径，不以/开始的相对路径，找资源，以当前的资源路径为基准(容易出错)
	       以/开始的相对路径，找资源，以服务器的路径为标准（http://loaclhost:3306）;需要加上
	       项目名
	      -->
		<!-- 引入样式 -->
	   <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	    <script src="/phoneSaleMall/static/js/jquery-1.9.min.js"  type="text/javascript"></script>
	    <link href="/phoneSaleMall/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	    <script src="/phoneSaleMall/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	   	<script src="/phoneSaleMall/static/js/checkInfo.js"  type="text/javascript"></script>
	   	<script src="/phoneSaleMall/static/js/common.src.js"  type="text/javascript"></script>
	   	<script src="/phoneSaleMall/static/js/init.js"  type="text/javascript"></script>
 <!-- ================自定义样式======================================-->
   <style type="text/css">
         .a_hover:hover{color: #f00;text-decoration: none;}
         .text{background-color: transparent;
            color:#FFFAFB;
      }
   </style>

  </head>
  
  <body>
         <!-- 登录页面的头信息 -->
      
         <div class="container">    
<!--              <div class="row" >
              &nbsp;
            </div> -->
               <div class="row" >
                   <div class="col-md-9" >
                   <ul class="list-inline">
                     <li style="list-style-type:none"><img src=""  height="50" width="150"  id="leftTopPic"/></li>
                     <li style="list-style-type:none"><h3>欢迎登录</h3></li>
                 </ul>
                 </div>
                </div>
   
                                                                        <!-- 隐私责任书 -->
                 <div class="row"  style="background-color:#FDF5E6">
                      
                       <div class=" col-sm-offset-2 col-md-8"> 
                                <!--  网络安全法-->
							    <div class="input-group" >
                                      <h5>依据《网络安全法》，为了保障您的账户安全和正常使用，请尽快完成手机号验证！新版的<a href="#" class="a_hover">《商城隐私政策》</a>已上线</h5>
							    </div>
					  </div>
				 </div>
					   
					                              <!-- 主体登录部分 -->
				
					     <div  class="row "   id="logionBg">
					            <div class="row ">&nbsp;</div>
					            <div class="row ">&nbsp;</div>
					            <div class="row ">&nbsp;</div>
					                 <!-- 登录设置 #FFFFFF白色 -->
					         <div class=" col-sm-offset-7 col-md-4"  style="background-color:">
					        
<!--                                 <div class="row" style="background-color:#FDF5E6">
                                   
                                   <div  class="col-sm-offset-1 col-sm-11">商城不会以任何理由要求您转账汇款，谨防受骗</div>
                                </div> -->
                                <div class="row">
                                     <div  class=" col-sm-offset-4 col-sm-4"><h3>账号登录</h3></div>
                                </div>
                                <div class="row">&nbsp;</div>
       <!-- ============================================================================ -->   
								<form class="form-horizontal user_form" method="post" id="login_form" >
									  <div class="form-group">			
									    <div class="col-sm-offset-2  col-sm-9 input-group">
										    <span class="input-group-addon glyphicon glyphicon-user" id="basic-addon1"></span>
										    <input type="text" class="form-control text" placeholder="邮箱/手机号/QQ号" aria-describedby="basic-addon1" name="name" id="username">
									    </div>
									     <div class="col-sm-offset-3 col-sm-9" >
									       <span class="help-block" id="msg" style="height:5px;display:block"></span>
									    </div>
									  </div> 
									  <!-- 提示密码账号错误信息 -->
									  <div class=" row form-group">
									     <div class=" col-sm-offset-2 col-sm-9 input-group">
										     <span class="input-group-addon glyphicon glyphicon-lock" id="basic-addon1"></span>
										     <input type="password" class="form-control text"  aria-describedby="basic-addon1" name="password" id="pwd">
									    </div>
									  </div>
								
									  <div class="form-group">
									    <div class="col-sm-offset-9 col-sm-4">
									          <a href="/phoneSaleMall/shopping/passwordChange.action">忘记密码</a>
									    </div>
									  </div>
									  <div class="form-group">
									    <div class="col-sm-offset-2 col-sm-9">
									      <button type="button" class="btn btn-warning btn-block " id="btn_login" data-loading-text="登录中..."  autocomplete="off">登录</button>
									    </div>
									  </div>
									</form>
							    </div>
                               	<div class="row">&nbsp;</div>
                                 <div class="row">&nbsp;</div>
                                 <div class="row">&nbsp;</div>
                                 <div class="row ">&nbsp;</div>
                                 <div class="row ">&nbsp;</div>
					   </div>
					  </div>
<!-- ==============================页面底部布局============================== -->
					    <div class="row">
					     <div class="row">&nbsp;</div>
                          <div class=" col-sm-offset-3 col-md-9 " >
		                    <ul class="list-inline">
		                     <li style="list-style-type:none"><a href="#" class='a_hover'>关于我们</a></li>
		                     <li style="list-style-type:none">|</li>
		                     <li style="list-style-type:none"><a href="#" class='a_hover'>联系我们</a></li>
		                     <li style="list-style-type:none">|</li>
		                     <li style="list-style-type:none"><a href="#" class='a_hover'>人才招聘</a></li>
		                     <li style="list-style-type:none">|</li>
		                     <li style="list-style-type:none"><a href="#" class='a_hover'>商家入驻</a></li>
		                     <li style="list-style-type:none">|</li>
		                     <li style="list-style-type:none"><a href="#" class='a_hover'>广告服务</a></li>
		                     <li style="list-style-type:none">|</li>
		                     <li style="list-style-type:none"><a href="#" class='a_hover'>友情链接</a></li>
		                     <li style="list-style-type:none">|</li>
		                     <li style="list-style-type:none"><a href="#" class='a_hover'>爱机社区</a></li>
		                   </ul>
                         </div>
                             <div class="col-sm-offset-4 col-md-9" >
                               Copyright © 2018-2019  东华理工大学长江学院ecit.com 版权所有
                             </div>
					    </div>
    
 <!-- ========================业务逻辑代码，事件=========================== -->
           <script type="text/javascript">
           	//页面初始化
                $(function(){
              	  initPage("login");
               }); 
           /*================用户名检验======================*/
                $("#btn_login").click(function(){
                    var username=$("#username").val();
                	var password=$("#pwd").val();
                    checkLogionInfo(username,password);
                }); 
           
                //跳转到首页
                function login(id){
                	var brand = '<%= session.getAttribute("brand")%>';
                	if((brand!=null&&brand!="")&&id!=-1){
                	    document.getElementById("login_form").action="/phoneSaleMall/product_mess.action?id="+id+"&brand="+brand;
                	}else{
                		 document.getElementById("login_form").action="/phoneSaleMall/shopping/main.action";
                	}
                	    document.getElementById("login_form").submit();  
                }
           </script>
           
  </body>
</html>
