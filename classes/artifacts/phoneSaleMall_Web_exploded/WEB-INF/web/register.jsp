<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
       <title>个人注册</title>
       <%
	    //获取项目路径
	      pageContext.setAttribute("APP_PATH",request.getContextPath());
	     %>
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
		<script src="/phoneSaleMall/static/js/init.js" type="text/javascript"></script>
		<script src="/phoneSaleMall/static/js/common.src.js" type="text/javascript"></script>
		<script src="/phoneSaleMall/static/js/checkInfo.js"  type="text/javascript"></script>
  <!-- ================== 自定义样式==============================-->
	      <style type="text/css">
      .a_hover:hover{color: #f00;text-decoration: none;}
      .text{background-color: transparent;
            color:#2F4F4F;
      }
       .reg{border:3px；}
    </style>
  </head>
  
  <body> 
<!-- ===============================头部信息===================================== -->
                   <div class="container"  >
<!-- 	                    <div class="row" >
			              &nbsp;
			            </div> -->
			            <div class="row" >
			                 <div class="col-md-9" >
			                   <ul class="list-inline">
			                     <li style="list-style-type:none"><img src="" height="50" width="150" id="leftTopPic"/></li>
			                     <li style="list-style-type:none"><h3>欢迎注册</h3></li>
			                 </ul>
			                 </div>
			            </div>
			            <div class="row" >&nbsp;</div>
		            </div>
<!-- ==============================注册主体布局========================================== -->     
             <div class="container"  id="mainPg" style="height:1080px;">
             	  <div class="row" >&nbsp;</div>
             	  <div class="row" >&nbsp;</div>
                      <div class="row col-sm-offset-5 col-md-4 reg">
                         <div class="row" style="background-color:">
                             <div class="col-sm-offset-4  col-md-5" >
                             <h3>账号注册</h3>
                            <!--  <hr style="background-color:#EEE5DE" />  -->
                           </div>
                         </div>
                        <!-- 主体部分 -->
                        <div class="row" style="background-color:" id="accountInfo">
                              <form class="form-horizontal reg_form" id="register_form" method="post">
									  <div class="form-group">
									    <div class="col-sm-offset-2  col-sm-8 input-group">
										    <span class="input-group-addon glyphicon glyphicon-user" id="basic-addon"></span>
										    <input type="text" class="form-control text" placeholder="手机号/QQ邮箱" aria-describedby="basic-addon" id="accountNumber">
									    </div>
									    <!-- 提示用户名是否输入规范 -->
									     <div class="col-sm-offset-2 col-sm-9" >
									       <span class="help-block" id="check_accountNumber" style="height:3px;display:block"></span>
									    </div>
									  </div>
									  <div class="form-group">
									     <div class=" col-sm-offset-2 col-sm-8 input-group">
										     <span class="input-group-addon glyphicon glyphicon-lock" id="basic-addon1"></span>
										     <input type="password" class="form-control text"  placeholder="设置密码"  aria-describedby="basic-addon1" id="password">
									    </div>
									    <!-- 提示两次输入的密码是否一致 -->
									      <div class="col-sm-offset-2 col-sm-9" >
									       <span class="help-block" id="check" style="height:3px;display:block"></span>
									    </div>
									  </div>
									   <!-- 校验两次密码是否一致 -->
									    <div class="form-group">
									      <div class=" col-sm-offset-2 col-sm-8 input-group">
										     <span class="input-group-addon glyphicon glyphicon-lock" id="basic-addon2"></span>
										     <input type="password" class="form-control text" placeholder="重新输入密码"  aria-describedby="basic-addon2" id="re_password">
									       </div>
									    </div>
									</form>		
									<div class="row" >&nbsp;</div>
			 			            <div class="row" >&nbsp;</div>
			 			            <div class="row" >&nbsp;</div>
                        </div>
                        
                            <!-- 用户信息主体部分 -->
                        <div class="row" style="background-color:" id="userInfo">
                              <form class="form-horizontal reg_form" id="register_form" method="post">
									  <div class="form-group">
									    <div class="col-sm-offset-2  col-sm-8 input-group">
										    <span class="input-group-addon glyphicon glyphicon-user" id="basic-addon"></span>
										    <input type="text" class="form-control text" placeholder="用户姓名" aria-describedby="basic-addon" id="username">
									    </div>
									    <!-- 提示用户姓名是否正确 -->
									     <div class="col-sm-offset-2 col-sm-9" >
									       <span class="help-block" id="check_user" style="height:3px;display:block"></span>
									    </div>
									  </div>
									  <div class="form-group">
									     <div class=" col-sm-offset-2 col-sm-8 input-group">
										     <span class="input-group-addon glyphicon glyphicon-user" id="basic-addon1"></span>
										     <input type="text" class="form-control text" placeholder="身份证号"  aria-describedby="basic-addon1" id="certCode">
									    </div>
									    <!-- 证件号是否合规 -->
									      <div class="col-sm-offset-2 col-sm-9" >
									       <span class="help-block" id="checkCertCode" style="height:3px;display:block"></span>
									    </div>
									  </div>
									   <!-- 家庭地址 -->
									    <div class="form-group">
									      <div class=" col-sm-offset-2 col-sm-8 input-group">
										     <span class="input-group-addon glyphicon glyphicon-home" id="basic-addon2"></span>
										     <input type="text" class="form-control text" placeholder="家庭地址"  aria-describedby="basic-addon2" id="adderss">
									       </div>
										 <!-- 提示手机号是否规范 -->
									      <div class="col-sm-offset-2 col-sm-9" >
									      	 <span class="help-block" id="check_phone" style="height:3px;display:block"></span>
									  	  </div>
									    </div>
									    <!-- 手机号码 -->
									  <div class="form-group">
									      <div class=" col-sm-offset-2 col-sm-8 input-group">
									           <span class="input-group-addon glyphicon glyphicon-phone-alt" id="basic-addon2"></span>
										     <input type="text" class="form-control text" placeholder="输入手机号"  aria-describedby="basic-addon1" id="phone">
									       </div>
									    </div>

 									  <div class="form-group">
									    <div class="col-sm-offset-2 col-sm-8">
									      <button type="button" class="btn btn-warning btn-block " id="btn_register" data-loading-text="检验中..."  autocomplete="off">注册</button>
									    </div>
									  </div> 
									</form>
                        </div>
                            <div class="row" >
									    <div class="col-sm-offset-2 col-md-8">
									   <button type="button"  class="btn btn-warning btn-block "  id="nextBtn">下一步</button>
									    </div>
							</div>
                     </div>
 			            <div class="row" >&nbsp;</div>
 			            <div class="row" >&nbsp;</div>
 			            <div class="row" >&nbsp;</div>
 			            <div class="row" >&nbsp;</div>
             </div>
  <!-- ===========================业务逻辑代码================================== -->、
 <script type="text/javascript">
  				//页面初始化
				  $(function(){
					  initPage("register");
					  $("#userInfo").hide();
				 }); 
				  var accountNumber;    //账号
				  var password;              //密码
				  var repassword;          //第二次密码
				  $("#btn_register").click(function(){
					  var phone=$("#phone").val();
					  var username=$("#username").val();
					  var certCode=$("#certCode").val();
					  var adderss=$("#adderss").val();
					  checkUserInfo(accountNumber,password,username,certCode,adderss,phone);
				  });
				//跳转到注册成功的页面
				  function login(){  
				  	    document.getElementById("register_form").action="/phoneSaleMall/shopping/re_success.action";
				  	    document.getElementById("register_form").submit();  
				  }
				//下一步
				  $("#nextBtn").click(function(){
					   accountNumber=$("#accountNumber").val();
					   password=$("#password").val();
					   repassword=$("#re_password").val();
					  var isPass=checkAccountInfo(accountNumber,password,repassword);
					  if(isPass=="success"){
						  $("#accountInfo").hide();
						  $("#userInfo").show();
						  $("#nextBtn").hide();
					  }
				  });
 </script>      
             
<!-- ================================底部信息================================= --> 
                      <div class="row">
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
					
             
  </body>
</html>
