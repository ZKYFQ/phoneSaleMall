<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>

    <title>商品详情</title>
    
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
	   	<script src="/phoneSaleMall/static/js/checkInfo.js"  type="text/javascript"></script>
	   	<script src="/phoneSaleMall/static/js/common.src.js"  type="text/javascript"></script>
	   	<script src="/phoneSaleMall/static/js/init.js"  type="text/javascript"></script>
	   	<script src="/phoneSaleMall/static/js/product.js"  type="text/javascript"></script>
	   	
  <!-- ================== 自定义样式==============================-->
	      <style type="text/css">
           .a_hover:hover{color: #f00;text-decoration: none;}
          .divsize{
           height:85px; 
           font-size:0px;
           background-color:#080808;
          }
         .div1{
           height:30px; 
           font-size:0px;
           background-color:#FFFFFF;
          }
          

		  .dow{display:block;
		   line-height:20px;
		   width:26px; 
		   text-align:center; 
		   font-family:arial,verdana,sans-serif, '新宋体'; 
		   font-weight:bold; 
		   font-size:15px;
	   
		    color:#303030; 
		    text-decoration:none; 
		    border: 1px solid #357ebd; 
		    cursor:pointer;
		    background:transparent;
		    }
		  .dow:hover{background:#1165ae;}
		  .dow:active{background:#0d79d5;}
	
		    .dow1{display:block;
		   line-height:28px;
		   width:35px; 
		   text-align:center; 
		   font-family:arial,verdana,sans-serif, '新宋体'; 
		   font-weight:bold; 
		   font-size:12px;
	   
		    color:#303030; 
		    text-decoration:none; 
		    border: 1px solid #357ebd; 
		    cursor:pointer;
		    background:transparent;
		    }
		  .dow1:hover{background:#1165ae;}
		  .dow1:active{background:#0d79d5;}
		  
		      .div3{
		    text-align:center; 
           width:105px; 
           font-size:15px;
          }
     .a_hover:hover{color: #f00;text-decoration: none;}
     
      .div4{width:130px; height:30px;float:left}
      .input
           {
              width:31px;
              height:33px;
              float:left;
              text-align:center;
           }
      .button1
        {
             width:30px;
             height:33px;
             float:left;
             color:#303030; 
		    text-decoration:none; 
		    border: 1px solid #357ebd; 
		    cursor:pointer;
		    background:transparent;
      }
          </style>

  </head>
  
		  <body>
		              <div class="container">
<!-- ====================商品详情页面的头部布局==================================-->
                           <div class="row" style="background-color:#EDEDED">
                                   <div class="row">&nbsp;</div>
				                 <div class="col-md-9" >
					                 <ul class="list-inline">
					                  <li style="list-style-type:none"><a href="/phoneSaleMall/shopping/register.action" class="a_hover" id="detailInfo">${username}</a><span id="msg" value="is">欢迎来到，东华手机商城</span></li>
					                  <li style="list-style-type:none" id="lgout"></li>
					                 </ul>
					                 </div>
					                <div class="col-md-3" >
					                 <ul class="list-inline">
					                  	<li style="list-style-type:none"><a href="/phoneSaleMall/shopping/main.action " class="a_hover">商城首页</a></li>
					                   	<li style="list-style-type:none"><a href="/phoneSaleMall/ShowCat.action"  class="a_hover" id="cat">前往购物车</a></li>
					                   	<li>|</li>
					                    <li style="list-style-type:none"><a href="/phoneSaleMall/loginProductInfo.action?id=${product.productId}&brand=${product.brand}" class="a_hover" id="lg">登录</a></li>
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
				              <h3>商品详情</h3>
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
<!-- =====================商品详细页面的主体部分======================= -->
                   <div class="row divsize">
                  <div class=" col-md-4" id="product">
                    <h2><font size="6"   style="font-weight:bold;color:#FFFFFF">享受极致的购物体验</font></h2>
                    </div>
                   </div>
                   <div class="row div1"></div>
<!-- =============================================================== -->
                       <div class="row">
                         <div class=" col-md-4" id="product">
                            <img src="${product.picFilePath}${product.picNameType}" height='430' width='430'/>
                        </div>
                        <!-- 信息显示 -->
                       <div class=" col-md-offset-1 col-md-5">
                           <div class="row">
                             <div class="col-md-12" >
                               <h4>${product.productName}${product.productDesc}</h4>
                             </div>
                        </div>
                        <!-- 主体部分 -->
                          <div class="row" >
                             <div class="col-md-12" >
                             <div class="col-md-2" >
                               <h4>价格</h4>
                             </div>
                              <div class="col-md-10">
                              	<font size="6" color="red" style="font-weight:bold;"  id="price">￥${product.price}</font>
                              </div>
                              </div>
                        </div>
                                  <div class="col-md-12" >&nbsp;</div>
                           <div class="row" >
                             <div class="col-md-12" >
                                      <div class="col-md-2" id="size">                   
											 <h4>运费</h4>
									   </div>  
									   <div class="col-md-3" id="size">                   
										 <h4>杭州至</h4>
									   </div>  
									      <div class="col-md-3" id="size">                   
										 	<select class="form-control">
											  <option>抚州</option>
											  <option>上海</option>
											</select>
									     </div>  
                             </div>
                        </div>
                         
                                <div class="col-md-12" >&nbsp;</div>
                           <div class="row" >
                             <div class="col-md-12" >
                                  		<div class="col-md-3" id="size">                   
											月销量 852
									   </div>  
									   <div class="col-md-3" id="size">                   
											累计评价 582
									  </div>  
									  <div class="col-md-4" id="size">                   
										    送天猫积分 528
									 	</div>  		    
                             </div>
                          </div>
                          
                                <div class="col-md-12" >&nbsp;</div>
                             <div class="row" >
                             <div class="col-md-12" >
                                    <div class="col-md-2" id="size">                   
											<h4 id="change">内存</h4>
									   </div>  
                                     <div class="col-md-1" id="size">                   
									    <input id="ram16" name="" type="button" value="16G"   class="dow1" />      
									    </div>  
									     <div class="col-md-1" id="size">                   
											<input id="ram32" name="" type="button" value="32G"   class="dow1" />      
									    </div>  
									     <div class="col-md-1" id="size">                   
											<input id="ram64" name="" type="button" value="64G"   class="dow1" />      
									    </div>  
									     <div class="col-md-1" id="size">                   
											<input id="ram128" name="" type="button" value="128G"   class="dow1" />      
									    </div>  

                             </div>
                             </div>
                          
                                <div class="col-md-12" >&nbsp;</div>
                              <div class="row" >
                             <div class="col-md-12" >
                                       <div class="col-md-2" id="size">                   
										        <h4>颜色</h4>
									    </div>  
                                        <div class="col-sm-1" id="size">                   
										       <img src="${product.picFilePath}${product.picNameType}"  height="40" width="40"/>
									    </div>  
                             </div>
                             </div>
                             
                                   <div class="col-md-12" >&nbsp;</div>
                             <div class="row" >
                             <div class="col-md-12" >
                                <div class="col" >&nbsp;</div>
                                <div class="col-md-2" id="size">     
                                    <div class="col" >
                                         <h4> 数量</h4>
                                    </div>                  		 
								</div>  
									 <div class="col-md-1 div3" >
									    <div class="div4">                    
											<input id="add" name="" type="button" value="+"   class="button1" />  
									        <input id="text_box" name="goodnum" type="text" value="1"  class="input"/>     
									        <input id="min" name="" type="button" value="-"  class="button1" >
									    </div>
									</div>  
                               
                             </div>
                             </div>
                        
                         <div class="col-md-12" >&nbsp;</div>
                             <div class="row" >
                             <div class="col-md-12" >
                                        <div class="col-md-12" id="size">                   
										      <form class="form-horizontal user_form" method="post" id="login_form" >
									    <div class="col-sm-6">
									      <button type="button" class="btn btn-warning  btn-block " id="btn_buy"  >立即购买</button>  
									    </div>
									  	 <div class="col-sm-6">
									  	    
									         <button type="button" class="btn btn-danger  btn-block " id="btn_cat"  >
									         <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true" ></span> 加入购物车
									         </button>
									    </div>
									
									</form>
							  </div>  
                             </div>
                             </div>
                             
                        </div>
                        
                         <div class=" col-md-2">
                             <div class="col-sm-offset-2 col-md-8" ><h6>---看了又看---</h6></div>
                                <a href="javascript:toProductInfo('9')" id="productInfoRL1"><img src=""  height="150" width="160" id="RightPic_1"/></a>
                             <div class="col-md-12" >&nbsp;</div>
                                <a href="javascript:toProductInfo('7')" id="productInfoRL2"><img src=""  height="150" width="160" id="RightPic_2"/></a>
                             <div class="col-md-12" >&nbsp;</div>
                                <a href="javascript:toProductInfo('8')" id="productInfoRL3"><img src=""  height="150" width="160" id="RightPic_3"/></a>
                         </div>
                        
                     </div>
 
 <!-- =============================================================== -->
                     </div>
		    
<!-- ======================业务逻辑层代码，主要进行数据处理============================== -->
<script type="text/javascript">             
                 $(function(){  	 
                	 //初始化界面
                	 initPage("productMess");
                	 initlogin();
                	//数量的加减
            	    var number = $("#text_box");
            	    $("#add").click(function(){       
            	    	number.val(parseInt(number.val())+1);
            	        setTotal();
            	    });
            	    $("#min").click(function(){
            	    	number.val(parseInt(number.val())-1);
            	        setTotal();
            	    });
            	       function setTotal(){
            	     var tt = $("#text_box").val();
            	     var  pbinfoid=$("#pbinfoid").val();
            	        if(tt<=0){
            	        alert("输入的值错误！");
            	        handNumber.val(parseInt(handNumber.val())+1);
            	        }else{
            	       // window.location.href = "shopping!updateMyCart.action?pbinfoid="+pbinfoid+"&number="+tt;
            	        }
            	    }
            	    //获取商品的类型
            	    var type=${product.productId};
            	    productBaseInfo(type);
              });
                 //商品标识
            	  var productId=${product.productId};
            	  //品牌
            	  var brand="${product.brand}";
            	  //16g内存的价格
            	  var price="${product.price}";
            	 //内存大小
            	 var ram="16G";
           	     //标识
             	 var flagBuy="1";
            	  $("#ram16").click(function(){
            		  ram="16G";
            		  $("#price").text("");
            		  $("#price").append("￥${product.price}");
            	  });
            	  $("#ram32").click(function(){
               		  ram="32G";
            		  $("#price").text("");
            		  priceRam(brand,price,32);
            	  });
            	  $("#ram64").click(function(){
               		  ram="64G";
            		  $("#price").text("");
            		  priceRam(brand,price,64);
            	  });
            	  $("#ram128").click(function(){
               		  ram="128G";
            		  $("#price").text("");
            		  priceRam(brand,price,128);
            	  });
            	  $("#btn_cat").click(function(){
            		 var ramPrice=$("#price").text();
            		  checkLogin(productId,brand,ramPrice,ram); 	
            	  });
            		 //搜索商品
                  $("#select_product").click(function(){
                	  //获取要搜索的商品
                	  document.getElementById("select_p").action="/phoneSaleMall/Selectproduct.action";
                      document.getElementById("select_p").submit();  
                  });
         		 //立即购买
                  $("#btn_buy").click(function(){
                	  var productName="${product.productName}";
                	  var ramPrice=$("#price").text();
                	  payment(ramPrice,productName,ram,null,1);
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
