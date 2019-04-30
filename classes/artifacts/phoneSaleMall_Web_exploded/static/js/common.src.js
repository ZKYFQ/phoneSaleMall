//提交给后台的Action
function postAtion(actionName,param,isFlag){
	var data=null;
	 $.ajax({
	  		url:"/phoneSaleMall/"+actionName,
	  		  type:"POST",
	  		  async:isFlag,     //同步为false,异步为true
	  	    //将json数据返回到后台，解决乱码
	  		  contentType:"application/json;charset=utf-8",  
	  		  data:param,
	  		  success:function(result){
				    data= result;
	  		  }
	 });
   return data;
}

