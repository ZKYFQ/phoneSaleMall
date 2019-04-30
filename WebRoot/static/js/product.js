//商品页面展示
function getphoneInfo(){
	var phoneInfos= postAtion("showmess.action",null,false);
	 //  alert(result);
     var show=eval(phoneInfos);
   //  alert(result);
     var brand=eval(show[0]);
     var remack1=eval(show[1]);
     var remack2=eval(show[2]);
     var remack3=eval(show[3]);
     var row=eval(show[show.length-1]);
     //动态创建表,显示检索信息
   	 var logoutId=$("<td>"+row[0]+"</td>");
	       $("#brand").append(logoutId);
   	  var logoutId=$("<td>"+row[1]+"</td>");
	       $("#remack1").append(logoutId);
   	  var logoutId=$("<td>"+row[2]+"</td>");
	       $("#remack2").append(logoutId);
   	  var logoutId=$("<td>"+row[3]+"</td>");
	       $("#remack3").append(logoutId);
     for(var i=0;i<5;i++){
      var logoutId=$("<td><a href='#'  class='a_hover'>"+brand[i]+"</a></td>");
       $("#brand").append(logoutId);
      var logoutId=$("<td><a href='#'  class='a_hover'>"+remack1[i]+"</a></td>");
       $("#remack1").append(logoutId);
      var logoutId=$("<td><a href='#'  class='a_hover'>"+remack2[i]+"</a></td>");
       $("#remack2").append(logoutId);
      var logoutId=$("<td><a href='#'  class='a_hover'>"+remack3[i]+"</a></td>");
       $("#remack3").append(logoutId);
     }
}

//点击加入购物车验证是否已经登入
function checkLogin(productId,brand,ramPrice,ram){
	var username=postAtion("getSession.action",null,false);
	if(username==null||""==username||undefined==username){
		alert("请先登录");
	}else{
     	   //商品的数量
     	   var number= $("#text_box").val();
     		var shoppingCatInfo={
     				productId:productId,
     				brand:brand,
     				number:number,
     				username:username,
     				ramPrice:ramPrice,
     				ram:ram
     		};
     		var shoppingCatJson=JSON.stringify(shoppingCatInfo);
     		var addInfo=postAtion("AddCat.action",shoppingCatJson,false);
            if(addInfo=="success"){
            	alert("添加成功");
            }
	}
}


function priceRam(brand,price,ram){
	var priceram={
				brand:brand,
				price:price,
				ram:ram
		};
	var priceRamJson=JSON.stringify(priceram);
	var ramPice=postAtion("priceRam.action",priceRamJson,false);
	  $("#price").append("￥"+ramPice+"0");
}

//立即支付
function payment(ramPrice,productName,ram,number,flag){
	if(number==null){
		//商品的数量
		number= $("#text_box").val();
	}
	var paymentInfo={
			productName:productName,
			ramPrice:ramPrice,
			ram:ram,
			number:number
	};
	var paymentJson=JSON.stringify(paymentInfo);
	var result=postAtion("paymentInfo.action",paymentJson,false);
	if("true"==result){
		if(flag==1){   //立即支付
				window.location.href="/phoneSaleMall/shopping/payment.action";
			}else{   
		      	   //购物车结算
			 	document.getElementById("shoppingcat").action="/phoneSaleMall/shopping/payment.action";
	    	    document.getElementById("shoppingcat").submit();  
			}
	}
}

//支付界面回显信息
function callBackPayInfo(){
	var payInfo=postAtion("payment.action",null,false);
	var payJson=JSON.parse(payInfo);
	if(payJson!=null){
		$("#payInfo_tables").append("<tr><td style='width:130px' align='center'>商品信息</td><td align='center'>" +payJson.productName+
				"</td></tr>")
				.append("<tr><td style='width:130px' align='center'>内存大小</td><td align='center'>" +payJson.ram+
				"</td></tr>")
				.append("<tr><td style='width:130px' align='center'>数量</td><td align='center'>" +payJson.number+
				"</td></tr>")
				.append("<tr><td style='width:130px' align='center'>用户姓名</td><td align='center'>" +payJson.userName+
				"</td></tr>")
				.append("<tr><td style='width:130px' align='center'>支付账户</td><td align='center'>" +payJson.accountPay+
				"</td></tr>")
				.append("<tr><td style='width:130px' align='center'>支付金额</td><td align='center'>" +payJson.price+
				"</td></tr>");
	}
	 $("#username").val(payJson.accountPay);
	//跳转到支付成功界面
	function toPaySuccess(){
		window.location.href="/phoneSaleMall/shopping/paySuccess.action";
	}
}

//根据关键字搜索
function seachKeyWord(keyword){
	window.location.href="/phoneSaleMall/seachProduct.action?keyword="+keyword;
}