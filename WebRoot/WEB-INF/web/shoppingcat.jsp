<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>我的购物车</title>
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
		<script src="/phoneSaleMall/static/js/product.js"  type="text/javascript"></script>
 <!-- ================== 自定义样式==============================-->
	     <style type="text/css">
            .a_hover:hover{color: #f00;text-decoration: none;}
         </style>
  </head>
  
    <body>
         <div class="container">
<!-- ====================购物车的头部布局==================================-->
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
					                  <li style="list-style-type:none"><a href="/phoneSaleMall/shopping/main.action ">商城首页</a></li>
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
				              <h3>购物车</h3>
				         </div>
                      <div class="col-md-6 ">           
                                <!--  搜索框-->
                                &nbsp;
                                 <div class="row"> &nbsp;</div>
							    <div class="input-group" >
							      <input type="text" class="form-control" placeholder="搜索 商品/品牌/店铺">
							      <span class="input-group-btn">
							        <button class="btn btn-default" type="button">搜索</button>
							      </span>
							    </div>
					     </div>
					  </div>
                         <div class="row">&nbsp;</div>
<!-- =============================购物车的主体部分======================================== -->
                  <div>
						  <!-- Nav tabs -->
						  <ul class="nav nav-tabs"  role="tablist">
						    <li role="presentation" class="active"><a href="#home" aria-controls="home" role="tab" data-toggle="tab"><h4>全部商品</h4></a></li>
						    <li role="presentation"><a href="#profile" aria-controls="profile" role="tab" data-toggle="tab"><h4>降价商品</h4></a></li>
						    <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab"><h4>库存紧张</h4></a></li>			    
						  </ul>
						   
						  <!-- Tab panes -->
						  <div class="tab-content">
						    <div role="tabpanel" class="tab-pane active" id="home">
<!-- ===================================显示加入购物车的商品================================ -->
                    
			                                      <!-- 显示表格 -->
            <div class="row">
               <div class="col-md-12">
                     <form name="customerForm" id="shoppingcat" method="post">
                <table class="table  table-hover"  id="emp_tables">
                                             <!-- =====表格头 ========-->
                 <thead>
	              
			         <tr>
	                     <th><input type="checkbox"   value="${shoppingCat.productId}" id="check_all" >全选</th> 
	                     <th>商品信息</th>
	                     <th>内存</th>
	                     <th>单价</th>
	                     <th>数量</th>
	                     <th>金额</th>
	                     <th >￥<lable id="sum">0</lable>&nbsp;&nbsp;<button class="btn " id="clear_batch" >操作结算</button></th>
	                  </tr>	
                </thead>
                                                    <!--===== 表格体====== -->  
             
					      <tbody>
					       <c:forEach items="${shoppingList }"  var="shoppingCat" varStatus="status">
					         <tr>
					        <td><input type="checkbox"  name="cusId" class="check_items" id="${status.count}" onclick="check('${status.count}')" value="${shoppingCat.total},${shoppingCat.productName},${shoppingCat.ram},${shoppingCat.price},${shoppingCat.number}"></td>
					            <td ><img src="${shoppingCat.phonePic}" width="80" heigth="80"/>${shoppingCat.productName }</td>
					            <td ><h5>RAM:${shoppingCat.ram}</h5></td>
					         	<td><h5>￥${shoppingCat.price}</h5></td>
					            <td><h5>${shoppingCat.number}</h5></td>
					            <td><h5 id="price"  value="${shoppingCat.total}">￥${shoppingCat.total}</h5></td>
					             <td><button class="btn btn-link btn_edit" id="user_edit" value="${shoppingCat.productId}" name="edit_id">
					             <span class="glyphicon glyphicon-heart-empty" aria-hidden="true"></span> 收藏
					            </button>
					           <button class="btn btn-link btn_delete" id="user_delete" value="${shoppingCat.productId},${shoppingCat.brand},${shoppingCat.ram}" name="btn_id">
					           <span class="glyphicon  glyphicon-trash" aria-hidden="true"></span> 删除
					          </button>
					             </td>
					             </tr>
					        </c:forEach>
					    
                     </tbody>
                   </table>
                 </form>
             </div>
            </div>
          
						    
<!-- ================================================================================= -->
						    </div>
						    <div role="tabpanel" class="tab-pane" id="profile">待开发</div>
						    <div role="tabpanel" class="tab-pane" id="messages">待开发</div>
						  </div>
						</div>

         </div>
<!--=========================业务逻辑层，处理数据==========================================  -->
        <script type="text/javascript">
      
        //判断是否已经登录
        $(function(){
      	  initPage("shoppingcat");
          getIsLogion();
       }); 
        //完成全选、全不选
        $("#check_all").click(function(){
       	 //attr获取checked的值是undefined(未选中)
       	 //我们这些dom原生属性，attr获取的是自定义属性
       	 //使用prop来修改和兑取dom的原生属性值
       	// alert($(this).prop("checked"));
       	  //实现全选和全不选
       	$(".check_items").prop("checked",$(this).prop("checked"));
       	  if($("#check_all").prop("checked")==true){
          $("#clear_batch").removeAttr("disabled");
       	    $("#clear_batch").addClass("btn-danger"); 
       	    $("#sum").text(${sum});
           }else{
        	      $("#clear_batch").attr("disabled","disabled");
        		  $("#clear_batch").removeClass("btn-danger"); 
        		  $("#sum").text("0");
           }
        });
        
        //给check_items绑定单击事件
      /*   $(document).on("click",".check_items",function(){
     	   //判断当前选中的元素是否是5个（也就是全 选中）
     	  var flag=$(".check_items:checked").length==$(".check_items").length;
           $("#check_all").prop("checked",flag);
           
     	  if($(".check_items").prop("checked")==true){
        	     $("#clear_batch").removeAttr("disabled");
        	    $("#clear_batch").addClass("btn-danger");
        	    $("#sum").text(${sum});
            }else
         	 {
         	       $("#clear_batch").attr("disabled","disabled");
         		  $("#clear_batch").removeClass("btn-danger");
         		  $("#sum").text("0");
            }
            
        }); */
        /*============================单个删除记录==============================*/      
        $(document).on("click",".btn_delete",function(){
        	//获取主键信息，根据主键删除数据
        	document.customerForm.action="/phoneSaleMall/delectCat.action";
            document.customerForm.submit(); 
        });
   	  var productName;
  	  var ramPrice;
  	  var ram;
  	  var number;
  	  var flag=2;
        //选中单个就可单个结算
        function check(obj){
        	   //判断当前选中的元素是否是5个（也就是全 选中）
       	      var flag=$(".check_items:checked").length==$(".check_items").length;
             $("#check_all").prop("checked",flag);
        	  var test = document.getElementById(obj).checked;
                if(test){
	                    $("#clear_batch").removeAttr("disabled");
	            	    $("#clear_batch").addClass("btn-danger");
	            	    var col=document.getElementById(obj).value;
	            	    var array=col.split(",");
	            	    ramPrice="￥"+array[3];
	            	    ram=array[2];
	            	    productName=array[1];
	            	    number=array[4];
	            	    $("#sum").text(array[0]);
                	}else{
            	       $("#clear_batch").attr("disabled","disabled");
            		  $("#clear_batch").removeClass("btn-danger");
            		  $("#sum").text("0");
                }
        }
	   	 //结算
	        $("#clear_batch").click(function(){
	      	  payment(ramPrice,productName,ram,number,2);
	        }); 
        </script>
  


<!-- ========================购物车底部布局=========================================== -->
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
