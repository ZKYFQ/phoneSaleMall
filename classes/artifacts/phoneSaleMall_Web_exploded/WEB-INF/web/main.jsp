<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
		<title>小凯商城</title>
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
	    <link href="/phoneSaleMall/static/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
	    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	    <script src="/phoneSaleMall/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
		<script src="/phoneSaleMall/static/js/init.js" type="text/javascript"></script>
		<script src="/phoneSaleMall/static/js/common.src.js" type="text/javascript"></script>
		<script src="/phoneSaleMall/static/js/product.js" type="text/javascript"></script>
 <!-- =======================自定义样式==============================-->
    <style type="text/css">
      .a_hover:hover{color: #f00;text-decoration: none;}
      
		    .dow1{display:block;
		   line-height:28px;
		   width:35px; 
		   text-align:center; 
		   font-family:arial,verdana,sans-serif, '新宋体'; 
		   font-weight:bold; 
		   font-size:12px;
	        outline:none;
	       	border:none;
		    color:#303030; 
		    text-decoration:none; 
		    cursor:pointer;
		    background:transparent;
		    }
		  .dow1:hover{background:#F8F8FF;}
		  .dow1:active{background:#F8F8FF;}
  </style>
  </head>
      
  <body>
 <!-- ================================1、页面显示信息========================================= -->

       <!-- 搭建显示页面 -->
     
         <div class="container">
                                                                               <!-- =======标题====== -->
             <div class="row" style="background-color:#EDEDED">
              &nbsp;
            </div>

            <div class="row" style="background-color:#EDEDED">
                 <div class="col-md-9" >
                 <ul class="list-inline">

                  <li style="list-style-type:none"><a href="/phoneSaleMall/shopping/register.action" class="a_hover" id="detailInfo">${username}</a><span id="msg" value="is">欢迎来到，东华手机商城</span></li>
                  <li style="list-style-type:none" id="lgout"></li>
                 </ul>
                </div>
                
                 <div class="col-md-3">
                  <ul class="list-inline">
                 <li style="list-style-type:none">
                    <a href="/phoneSaleMall/ShowCat.action" id="cat"  class="a_hover">
                     <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true" ></span>&nbsp;购物车
                    </a>
                  </li>
                 <li style="list-style-type:none">
                  <a href="/phoneSaleMall/shopping/login.action" id="lg" class="a_hover">登录</a>
                   </li>
                   <li>|</li>
                    <li style="list-style-type:none">
                   <a href="/phoneSaleMall/shopping/register.action" class="a_hover">注册</a></li>
                 </ul>
                </div>  
            </div>
            
                                                                     <!-- 搜索框 -->
              <div class="row"  style="background-color:">
              
                       <div class=" col-md-3 ">
                            <div class="row"> &nbsp;</div>
				          <img src=""  height="80" width="180" id="leftTopPic"/>
				         </div>
                      <div class=" col-md-7"> 
                               &nbsp;
                              <div class="row"> &nbsp;</div>
                                <!--  搜索框-->
                              <form id="select_p"  method="post">
							    <div class="input-group" >
							      <input type="text" class="form-control" placeholder="搜索 商品/品牌/店铺" name="productname" id="seachProduct">
							      <span class="input-group-btn">
							        <button class="btn btn-default" type="button" id="select_product">搜索</button>
							      </span>
							    </div>
							    </form> 
					     </div>
					       <!--  搜索框下的导航-->			  
			               <div class="col-md-6" >
			                 <ul class="list-inline">
			                 <li style="list-style-type:none"><a href="javascript:seachKeyWord('小米');" class="a_hover" id="topFast1">小米</a></li>
			                 <li style="list-style-type:none"><a href="javascript:seachKeyWord('华为');" class="a_hover" id="topFast2">华为</a></li>
			                 <li style="list-style-type:none"><a href="javascript:seachKeyWord('荣耀');" class="a_hover" id="topFast3">荣耀</a></li>
			                 <li style="list-style-type:none"><a href="javascript:seachKeyWord('Oppo');" class="a_hover" id="topFast4">OPPO</a></li>
			                 <li style="list-style-type:none"><a href="javascript:seachKeyWord('vivo');" class="a_hover" id="topFast5">VIVO</a></li>
			                 </ul>
			              </div>
					   
				  </div>
					  <!--  控制间距-->
<!--                      <div style="background-color:#F0FFF0" class="row" >&nbsp;</div>
 -->              
                     
                                             <!--  侧边导航栏-->
    <div class="row" id="home">
    <div class="row">&nbsp;</div>
    <div class="row">&nbsp;</div>
     <div class="col-md-1">&nbsp;</div>
               <div class=" col-md-2" style="background-color:#E6E6FA;">
			  <!-- Nav tabs -->
				      <ul class="nav nav-tabs nav-stacked " role="tablist" id="myTab"> 
				      	<li role="presentation" class="active"><a  href="#main"  aria-controls="main" role="tab" data-toggle="tab"><font color:>分类导航</font></a></li>
				        <li role="presentation" ><pan></pan></li>
					    <li role="presentation" ><a href="#phone" aria-controls="phone" role="tab" data-toggle="tab">手机/电子产品</a></li>
					    <li role="presentation"><a href="#pad" aria-controls="pad" role="tab" data-toggle="tab">笔记本/平板</a></li>
					    <li role="presentation"><a href="#AIWear" aria-controls="AIWear" role="tab" data-toggle="tab">智能穿戴</a></li>
					    <li role="presentation"><a href="#phoneConfig" aria-controls="phoneConfig" role="tab" data-toggle="tab">热销配置</a></li>	    
					    <li role="presentation" ><a href="#home" aria-controls="car" role="tab" data-toggle="tab">增值服务</a></li>		    
		              </ul>
            </div>  
             <!-- Tab panes -->
				   <div class="tab-content col-md-7" >
				            <div role="tabpanel"  class="tab-pane active" id="main">
				           </div>
						   <div role="tabpanel" class="tab-pane" id="phone" style="background-color:#FFFFFF;height:68%;width:80%">
						      <ul class="list-inline">
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:90px;width:250px;" id ="selectXiaoMiPhone" value="小米"><img src="/phoneSaleMall/static/productImg/phone/XIAOMI/xiaomi6x.jpg"  height="85" width="80" id="DhphoneXiaoMi1"/>小米手机</button></li>
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:90px;width:250px;" id ="selectHuaWeiPhone" value="华为"><img src="/phoneSaleMall/static/productImg/phone/HUAWEI/huawei9e.png"  height="85" width="80" id="DhphoneHuaWei"/>&nbsp;华为手机</button></li>
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:90px;width:250px;" id ="selectOppoPhone" value="OPPO"><img src="/phoneSaleMall/static/productImg/phone/OPPO/oppoR17.png"  height="85" width="80" id="DhphoneOppo"/>&nbsp;OPPO手机</button></li>
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:90px;width:250px;"  id ="selectVivoPhone" value="VIVO"><img src="/phoneSaleMall/static/productImg/phone/VIVO/vivoNex.png"  height="85" width="80" id="DhphoneVivo"/>&nbsp;VIVO手机</button></li>
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:90px;width:250px;" id ="selectMeizuPhone" value="魅族"><img src="/phoneSaleMall/static/productImg/phone/MEIZU/meizuX8.jpg"  height="85" width="80" id="DhphoneMeizu"/>&nbsp;魅族手机</button></li>
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:90px;width:250px;" id ="selectHonorPhone" value="荣耀"><img src="/phoneSaleMall/static/productImg/phone/HONR/Honor10.jpg"  height="85" width="80" id="DhphoneHonor"/>&nbsp;荣耀手机</button></li>
				                  <li style="list-style-type:none"><button type="button" class="dow1" style="height:90px;width:250px;" id ="selectApplePhone" value="Apple"><img src="/phoneSaleMall/static/productImg/phone/APPLE/AppleX.jpg"  height="85" width="80" id="DhphoneApple"/>&nbsp;Apple手机</button></li>
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:90px;width:250px;" id ="selectHongMiPhone" value="红米"><img src="/phoneSaleMall/static/productImg/phone/HONGMI/hongMi6pro.jpg"  height="85" width="80" id="DhphoneHongMi"/>&nbsp;红米手机</button></li>
			                 </ul>
						  </div>
							<div role="tabpanel" class="tab-pane" id="pad" style="background-color:#FFFFFF;height:68%;width:45%;'">
						     <ul class="list-inline">
							      <li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/pad/XIAOMI/xiaoMiPad4Plus.jpg"  height="90" width="90" id="DhphoneXiaoMi"/>小米平板</button></li>
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/pad/HUAWEI/HuaWeiPadM5.jpg"  height="90" width="90" id="DhphoneHuaWei"/>华为平板</button></li>
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/pad/HONOR/Honor5.jpg"  height="90" width="90" id="DhphoneOppo"/>&nbsp;荣耀平板</button></li>
								<li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/pad/IPAD/Ipad2018.jpg"  height="90" width="90" id="DhphoneIPad"/>&nbsp;IPad</button></li>							
							 </ul>
						    </div>
						    <div role="tabpanel" class="tab-pane" id="AIWear" style="background-color:#FFFFFF;height:68%;width:45%;">
						      <ul class="list-inline">
							      <li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/watch/XIAOMI/xiaomiWatch3.jpg"  height="90" width="90" id="DhphoneXiaoMi"/>小米手环</button></li>
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/watch/HUAWEI/HuaWeiWatchB3L.jpg"  height="90" width="90" id="DhphoneHuaWei"/>华为手环</button></li>
				                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/watch/HONOR/HonorWatch4.jpg"  height="90" width="90" id="DhphoneOppo"/>&nbsp;荣耀手环</button></li>
								<li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/watch/APPLE/AppleWatchSerice4.jpg"  height="90" width="90" id="DhphoneIPad"/>&nbsp;Apple Watch</button></li>							
							 </ul>
							</div>
						    <div role="tabpanel" class="tab-pane" id="phoneConfig" style="background-color:#FFFFFF;height:68%;width:80%;">
							    <ul class="list-inline">
								     <li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/phoneConfig/phoneT/phoneShell.jpg"  height="90" width="90" id="DhphoneXiaoMi"/>手机壳</button></li>
					                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/phoneConfig/ganghuamo/ganghua.jpg"  height="90" width="90" id="DhphoneHuaWei"/>手机钢化膜</button></li>
					                 <li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/phoneConfig/POWER/power.jpg"  height="90" width="90" id="DhphoneOppo"/>&nbsp;移动电源</button></li>
									  <li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/phoneConfig/HEADSET/headset.jpg"  height="90" width="90" id="DhphoneIPad"/>&nbsp;耳机</button></li>							
								 	<li style="list-style-type:none"><button type="button" class="dow1" style="height:95px;width:250px;"><img src="/phoneSaleMall/static/productImg/phoneConfig/CHARGER/charger.jpg"  height="90" width="90" id="DhphoneIPad"/>&nbsp;充电器</button></li>							
								 </ul>
						    </div>
				  </div>
			                             <!--              1-1、右边的图片   -->
                  <div class="col-md-1"> 
                  <ul>
                     <li style="list-style-type:none">   
                       <img src=""  height="160" width="180" id="RightPic_1"/>
                     </li>
                     <li style="list-style-type:none">
                      <img src="" height="160" width="180" id="RightPic_2"/>
                    </li>
                     <li style="list-style-type:none">
                      <img src="" height="160" width="180" id="RightPic_3"/>
                     </li>
                    
                   </ul>
                  </div>   
                  
               </div>
             </div>

 <!-- ===================================script事件=========================== --> 
  <script type="text/javascript">
     //判断是否已经登录
      $(function(){
    	  initPage("home");
    	  initlogin();
    	  //鼠标滑过显示
    	  $("#myTab a").hover(function () {
              $(this).tab("show");
            });
     }); 
     //搜索的关键字
         var keyword;
      $("#selectXiaoMiPhone").click(function(){
    	  keyword=$("#selectXiaoMiPhone").val();
          seachKeyWord(keyword);
      });
      $("#selectHuaWeiPhone").click(function(){
    	  keyword=$("#selectHuaWeiPhone").val();
    	  seachKeyWord(keyword);
      });
      
    	 //搜索商品
      $("#select_product").click(function(){
    	  //获取要搜索的商品
    	  document.getElementById("select_p").action="/phoneSaleMall/Selectproduct.action";
          document.getElementById("select_p").submit();  
      });
  </script>
<!-- ================================底部信息================================= --> 
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
					

	    
  </body>
</html>
