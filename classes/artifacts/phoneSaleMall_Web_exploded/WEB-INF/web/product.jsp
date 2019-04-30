<%@page import="cn.com.phone.pojo.Product"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
           <title>商品列表</title>
              <%
	    //获取项目路径
	      pageContext.setAttribute("APP_PATH",request.getContextPath());
	     %>
	     
	    
	 <%@ page isELIgnored ="false" %>
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
	   	<script src="/phoneSaleMall/static/js/product.js"  type="text/javascript"></script>
 <!-- =======================================================-->
     <style type="text/css">
        .card{
	        cursor:pointer;
	        margin-top:10px;
	         box-shadow: 5px 8px 5px #EEE8CD;
	     
	        width: 215px;
	    
	        transition: all 0.25s;
        }
        .card:hover{margin-top:10px; 
          box-shadow: 0 4px 8px 0 rgba(0,0,0,0.19),0 6px 20px 0 rgba(0,0,0,0.19);
        }
        .header{
           background-color: #FFFFFF;
           margin:0 auto;
        
        }
        .body{
           padding: 10px;
        }
        .card img{width: 100%;}
        .a_hover:hover{color: #f00;text-decoration: none;}
    </style>
  </head>
  
	  <body>

	        <div class="container">
<!-- =======================商品页面的头部布局====================== -->     
	                    <div class="row" style="background-color:#EDEDED">
                                   <div class="row">&nbsp;</div>
				                 <div class="col-md-9" >
					                 <ul class="list-inline">
					                  <li style="list-style-type:none"><a href="/phoneSaleMall/shopping/register.action" class="a_hover" id="detailInfo">${username}</a><span id="msg" value="is">欢迎来到，东华手机商城</span></li>
					                  <li style="list-style-type:none" id="lgout"></li>
					                 </ul>
					                 </div>
					                <div class="col-md-2" >
					                 <ul class="list-inline">
					                  <li style="list-style-type:none"><a href="/phoneSaleMall/shopping/main.action "  class="a_hover">商城首页</a></li>
					                 </ul>
					              </div>
				           </div>
                                                                              <!-- 搜索框 -->
              <div class="row" >
                       <div class=" col-md-2 ">
                            <div class="row"> &nbsp;</div>
				           <img src=""  height="80" width="180" id="leftTopPic"/>
				         </div>
				         <div class="col-sm-offset-0 col-md-4 ">
				         &nbsp;
                            <div class="row"> &nbsp;</div>
				              <h3>商品</h3>
				         </div>
                      <div class="col-md-6 ">           
                                &nbsp;
                                 <div class="row"> &nbsp;</div>
							  <!--  搜索框-->
                              <form id="select_p"  method="post">
							    <div class="input-group" >
							      <input type="text" class="form-control" placeholder="搜索 商品/品牌/店铺" name="productname">
							      <span class="input-group-btn">
							        <button class="btn btn-default" type="button" id="select_product">搜索</button>
							      </span>
							    </div>
							   </form>
					     </div>
					  </div>
                     <div class="row">&nbsp;</div>

<!-- =========================商品页面的主体布局======================= -->
         <!-- 显示表格 -->
            <div class="row">
               <div class="col-md-12">
                          <div class="row">
                             <lable>已选条件：所有和xx相关的宝贝</lable>
                          </div>
                   <table class="table table-bordered" id="showmess">
                       <tr id="brand"></tr>
                       <tr id="remack1"></td></tr>
                       <tr id="remack2"></tr>
                       <tr id="remack3"></tr>
                                         
                   </table>
                  
                  
               <table class="table  "  id="emp_tables">
                                             <!-- =====表格头 ========-->
                                                    <!--===== 表格体====== -->  
                  <tbody>
                 <tr> 
		       
		      <c:forEach items="${productList }"  var="product" varStatus="status">
		        
		         <td>		
				     <div class="card" onclick="tzlinks()">
				      <div class="header">
				      <a href="/phoneSaleMall/product_mess.action?id=${product.productId}&brand=${product.brand}" id="productmess" ><img src="${product.picFilePath}${product.picNameType}" style="width:100%;height:215px;"></img>
				      </a>
				        </div>
				        <div class="body">
				          <p> ${product.productName}${product.productDesc}</p>
				          <p><lable style="color:red;font-weight:bold;">￥${product.price}</lable>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			          <lable style="color:#D9D9D9">浙江 杭州
				          </lable> 
				          </p>	      
				        </div>
				    </div>
				    </td>
				    <!-- 每行排五个 -->
				    <c:if test="${status.count%5==0}">
				    <tr>
				    </tr>
		           </c:if>
              </c:forEach>      
				
                    </tr>
                     </tbody>  
                   </table>  
       			  </div>              
 
	     </div>
	    
		    </div>
            
      
          
<!-- =============================业务逻辑层，处理数据=================================== -->
		 <script type="text/javascript">
		     $(function(){
		    	 initPage();
		    	 getphoneInfo();
		     });
    		 //搜索商品
             $("#select_product").click(function(){
           	  //获取要搜索的商品
           	  document.getElementById("select_p").action="/phoneSaleMall/Selectproduct.action";
                 document.getElementById("select_p").submit();  
             });
/*=================================================================================*/ 
		     
		     
		</script>

<!-- ==============================商品页面的底部布局======================================= -->	     
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
