function getUser(){
	var unumber = $("[name='unumber']").val();
	var password = $("[name='password']").val();
	$.getJSON("getUser",{"unumber":unumber,"password":password},function(data){
		if(data){
			sessionStorage.setItem("unumber",unumber);
			window.location.href = "usercontroll.html";
		}else{
			alert("用户名或密码错误！")
		}
	})
}
function Name(){
	var unumber=sessionStorage.getItem("unumber");
	$.getJSON("getUserByNumber2",{"unumber":unumber},function(data){	
		$("#aaa").text("用户："+data.uname);
	})
}
function Manager(){
	var mnumber=sessionStorage.getItem("mnumber");
	$.getJSON("getManager1",{"mnumber":mnumber},function(data){	
		$("#a").text("管理员："+data.mname);
	})
}
function tc(){
	sessionStorage.removeItem("mnumber");
	window.location.href="managerlogin.html";
}
function t(){
	sessionStorage.removeItem("unumber");
	window.location.href="login.html";
}
function getManager(){
	var mnumber = $("[name='mnumber']").val();
	var password = $("[name='password']").val();
	$.getJSON("getManager",{"mnumber":mnumber,"password":password},function(data){
		if(data){
			sessionStorage.setItem("mnumber",mnumber);
			window.location.href = "managercontroll.html";
		}else{
			alert("用户名或密码错误！")
		}
	})
}
function getPassword(){
	$("table").show();
	var unumber = $("[name='unumber']").val();
	var uphone = $("[name='uphone']").val();
	sessionStorage.setItem("unumber",unumber)
	$.getJSON("getPassword",{"unumber":unumber,"uphone":uphone},function(data){
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.password+"</td><td><a href='updateuser.html'>修改密码</a>"+"</td></tr>");
		})
	})
}
function getPasswordM(){
	$("table").show();
	var mnumber = $("[name='mnumber']").val();
	var mphone = $("[name='mphone']").val();
	sessionStorage.setItem("mnumber",mnumber)
	$.getJSON("getPasswordM",{"mnumber":mnumber,"mphone":mphone},function(data){
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.password+"</td><td><a href='updatem.html'>修改信息</a>"+"</td></tr>");
		})
	})
}