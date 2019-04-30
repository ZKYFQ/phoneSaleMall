 function initlogin(){
	 var isLogin=postAtion("Check.action",null,false);
	 if("success"==isLogin){
		   $("#lg").text("已登录");
		   $("#lg").removeAttr("href");
    	   var logoutId=$("<a href='/phoneSaleMall/logout.action' class='a_hover'>注销</a>");
    	   $("#lgout").append(logoutId);
	 }else{
			//用户未登入购物车不可用
  	   $("#cat").removeAttr("href");
	 }

 }
 
 function initPage(pageName){
		var commonJson= postAtion("loadPic.action","common",false);
		var loadPic1=JSON.parse(commonJson);
		 $("#leftTopPic").attr("src",loadPic1.topLeft);
	 //加载中间图片
	var picJson= postAtion("loadPic.action",pageName,false);
	var loadPic=JSON.parse(picJson);
	// $("#homebg").attr("src",loadPic.center);
	 $("#leftTopPic").attr("src",loadPic.topLeft);
	 $("#RightPic_1").attr("src",loadPic.Rigth1);
	 $("#RightPic_2").attr("src",loadPic.Rigth2);
	 $("#RightPic_3").attr("src",loadPic.Rigth3);
	 $("#home").attr("style","background-image:url("+loadPic.center+")");
	 //登录界面初始化
	 $("#logionBg").attr("style","background-image:url("+loadPic.center+")");
	 //注册
	 $("#mainPg").attr("style","background-image:url("+loadPic.center+")");



	 //注册成功页面跳转到主页
	 $("#home").attr("href","/phoneSaleMall/shopping/main.action");
	 //注册成功界面的初始化
	 $("#reg_success1").attr("src",loadPic.center);
 }
 //商品对应的基本信息，内存，品牌
 function productBaseInfo(productType){
	    //代表手机
	    $("#change").text("内存");
	    $("#c1").val("16G");
	    $("#c2").val("32G");
	    $("#c3").val("64G");
	    $("#c4").val("128G");
 }
 
 //3秒后自动跳转
 function autoToPage(){
     var delay = $("#autoToHome").text();
     var t = setTimeout("autoToPage()", 1000);
     if (delay > 0) {
         delay--;
         $("#autoToHome").text(delay);
     } else {
         clearTimeout(t);
         window.location.href = "/phoneSaleMall/shopping/main.action";
     }
 }