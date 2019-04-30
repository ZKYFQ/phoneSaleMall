//校验登录信息
function checkLogionInfo(username,password){
	if(username==null||password==null||""==username||""==password){
    	$("#msg").text("账号或密码不能为空");
	       //输入框变红，提示密码输入错误
 	$("#username").parent().addClass("has-error");
	       //当第二次输入时，清除数据和
	   		document.getElementById("username").addEventListener("click",function () {  
	   		//清除提示信息
		   $("#msg").text("");
		   //输入框变绿，代表输入正确,去掉错误的框的颜色		  
		   $("#username").parent().removeClass("has-error");
		   $("#username").val("");
		   $("#pwd").val("");
		  }); 
	   	return;
	  }
	var loginInfo={
			accountNumber:username,
			password:password
	}
	var loginJson=JSON.stringify(loginInfo);
	var isPass=postAtion("LoginCheck.action",loginJson,false);
	if(isPass=="error"){
	    	$("#msg").text("账号或密码错误");
		       //输入框变红，提示密码输入错误
	    	$("#username").parent().addClass("has-error");
		       //当第二次输入时，清除数据和
		   	document.getElementById("username").addEventListener("click",function () {  
			  //清除提示信息
			   $("#msg").text("");
			   //输入框变绿，代表输入正确,去掉错误的框的颜色		  
			   $("#username").parent().removeClass("has-error");
			   $("#username").val("");
			   $("#pwd").val("");
		  });  
		   	return;
	}else{
		var loginInfo=JSON.parse(isPass);
		var id=loginInfo.id;
    	//清除提示信息
		   //$("#msg").text("");
		   //输入框变绿，代表输入正确,去掉错误的框的颜色
		//   $("#username").parent().removeClass("has-error");	
	     //按钮显示 登录中....... 
		   var $btn = $("#btn_login").button('loading');	    		     
		   //延迟加载，显示登录，关闭模态框
		     setTimeout("lg_success("+id+")", 1000);
	}		
}
//显示登录成功
function lg_success(id){
	   setTimeout("login("+id+")", 500);
	   $("#btn_login").text("登录成功");
}
/**
 * 校验账号信息
 * @param accountNumber
 * @param password
 * @param repassword
 */
function checkAccountInfo(accountNumber,password,repassword){
	if(accountNumber==null||password==null||repassword==null){
		alert("请将信息填写完整！");
		return "error";
	}
	
	if(password!=repassword){//两次输入的密码不一致
		   passwordInconf();
		   return "error";
	}
/*	   var regx="/^([0-9A-Za-z\-_\.]+)@([0-9a-z]+\.[a-z]{2,3}(\.[a-z]{2})?)$/g"; //邮箱
    if(!accountNumber.split(regx)||accountNumber.length!=11){
    	 $("#check_accountNumber").text("用户名不合法");
	       //当第二次输入时
		  document.getElementById("check_accountNumber").addEventListener("click",function () {  
			  //清除提示信息
		   $("#check_accountNumber").text("");
		  });  
		  return "error";
	}*/
    return "success";
}
//两次输入的密码不一致提示
function  passwordInconf(){
	$("#check").text("输入密码不一致");
	   //输入框变红，提示密码输入不一致
	   $("#re_password").parent().addClass("has-error");
    //当第二次输入时，清除数据和
	  document.getElementById("re_password").addEventListener("click",function () {  
		  //清除提示信息
	   $("#check").text("");
	   //输入框变绿，代表输入正确,去掉错误的框的颜色
	   $("#re_password").parent().removeClass("has-error");
	   $("#re_password").val(""); 
});  
	  return;
}
/**
 * 校验用户信息
 * @param username
 * @param certCode
 * @param adderss
 * @param phone
 */
function checkUserInfo(accountNumber,password,username,certCode,adderss,phone){
	if(username==null||certCode==null||adderss==null||phone==null){
		alert("请将信息填写完整！");
		return;
	}
	if(username.length<=1){  //姓名不合法
		$("#check_user").text("姓名不合法");
		   //输入框变红
		   $("#username").parent().addClass("has-error");
	       //当第二次输入时
		  document.getElementById("username").addEventListener("click",function () {  
			  $("#username").parent().removeClass("has-error");
			  //清除提示信息
		   $("#check_user").text("");
		  });  
		  return ;
	}
	//身份证号码校验
	var ispass=checkCertCode(certCode);
	if(!ispass){
		$("#checkCertCode").text("证件号不合法");
		   //输入框变红
		   $("#certCode").parent().addClass("has-error");
	       //当第二次输入时
		  document.getElementById("certCode").addEventListener("click",function () {  
			  $("#certCode").parent().removeClass("has-error");
			  //清除提示信息
		   $("#checkCertCode").text("");
		  });  
		  return ;
	}
	//手机号的第一个数字
	var startNumber = phone.charCodeAt(0);
	//判断手机号码是否规范
	if(phone.length!=11&&startNumber!=1){ //手机号十一位，开头为1
		$("#check_phone").text("手机号码不正确");
		   //输入框变红
		   $("#phone").parent().addClass("has-error");
	       //当第二次输入时
		  document.getElementById("phone").addEventListener("click",function () {  
			  $("#phone").parent().removeClass("has-error");
			  //清除提示信息
		   $("#check_phone").text("");
	  });  
		   return;
	}
  	//使用json向后台发送信息
	var userInfo={
			username:username,
			certCode:certCode,
			adderss:adderss,
			billId:phone,
			accountNumber:accountNumber,
			password:password
	};
	var userInfoJson=JSON.stringify(userInfo);
	var result=postAtion("Register.action",userInfoJson,false);
	if("error"==result){
		 $("#check_phone").text("该手机号已经注册");
		  //输入框变红
		   $("#phone").parent().addClass("has-error");
		       //当第二次输入时
			  document.getElementById("phone").addEventListener("click",function () {  
				  $("#phone").parent().removeClass("has-error");
				  //清除提示信息
			   $("#check_phone").text("");
		  });  
	}else{
		  //按钮显示 登录中....... 
		 var $btn = $("#btn_register").button('loading');
	     setTimeout("suc()", 1000);
	}
	
}
function checkCertCode(certCode){
	if(certCode.length!=18){   //身份证号不是18位
		return false;
	}
}
//显示注册成功
function suc(){
        $("#btn_register").text("注册成功");
        setTimeout("login()", 500);
}   
//跳转到注册成功的页面
function login(){  
	    document.getElementById("register_form").action="/Shopp-Web/shopping/re_success.action";
	    document.getElementById("register_form").submit();  
}
//未登录情况下不能进入购物车页面
function getIsLogion(){
	//获取是否登录
	var username=postAtion("getSession.action",null,false);
	if(username==null||""==username||undefined==username){
		window.location.href="/Shopp-Web/shopping/Login.action";
	}
	$("#user").append(username);
}

/**
 * 用户是否存在
 * @param accountNumber
 * @param username
 * @param certCode
 * @param billId
 */
function isExistUserInfo(username,certCode,billId){
 	//使用json向后台发送信息
	var userInfo={
			username:username,
			certCode:certCode,
			billId:billId
	};
	var userInfoJson=JSON.stringify(userInfo);
	var result=postAtion("isExistUserInfo.action",userInfoJson,false);
	if("success"==result){
		return true;
	}else{
		 $("#checkInfo").text("不存在该用户信息");
		       //当第二次输入时
			  document.getElementById("phone").addEventListener("click",function () {  
				  //清除提示信息
			   $("#checkInfo").text("");
		  });  
			  document.getElementById("certCode").addEventListener("click",function () {  
				  //清除提示信息
			   $("#checkInfo").text("");
			  });  
			  document.getElementById("username").addEventListener("click",function () {  
				  //清除提示信息
			   $("#checkInfo").text("");
			  });  
		 return ;
	}
}
/**
 * 修改密码
 * @param accountNumber
 * @param password
 * @param repassword
 */
function changePassword(accountNumber,password,repassword){
	if(password!=repassword){//两次输入的密码不一致
		   passwordInconf();
		   return ;
	}
	//使用json向后台发送信息
	var accountInfo={
			accountNumber:accountNumber,
			password:password,
	};
	var accountInfoJson=JSON.stringify(accountInfo);
	var result=postAtion("changePassword.action",accountInfoJson,false);
	if("success"==result){
		//按钮显示 
		 var $btn = $("#changePassword").button('loading');
	     setTimeout("changeSuccesss()", 1000);
	}

}
//显示修改成功
function changeSuccesss(){
        $("#changePassword").text("修改成功");
        setTimeout("forLogin()", 500);
}   

//显示跳转
function forLogin(){
        $("#changePassword").text("跳转到登录页面....");
        setTimeout("login()", 1000);
}   
/**
 * 校验支付密码是否正确
 * @param accountBuyNumber
 * @param password
 */
function payPassword(accountPayNumber,password){
	$("#checkInfo").text('密码错误');
	//按钮显示 
	 var $btn = $("#ready").button('loading');
    setTimeout("paySuccesssDis()", 1000);	 
}

//显示修改成功
function paySuccesssDis(){
        $("#ready").text("支付成功");
        setTimeout("paySuccess()", 500);
}  
//显示跳转
function paySuccess(){
    document.getElementById("back").action="/phoneSaleMall/shopping/paySuccess.action";
    document.getElementById("back").submit(); 
}   