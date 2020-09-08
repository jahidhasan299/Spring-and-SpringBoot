function getUserByCardid(){
	$("table").show();
	var cardid = $("#cardid").val();
	$.getJSON("getUserByCardid",{"cardid":cardid},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.uid+"</td><td>"+o.uname+"</td><td>"+o.unumber+
					"</td><td>"+o.cardid+"</td><td>"+o.usex+
					"</td><td>"+o.salary+"</td><td>"+o.ustate+"</td><td>"+o.ulevel+"</td><td><a href='javascript:delUserById("+o.uid+")'>删除</a>"+"</td><td><a href='javascript:update("+o.unumber+")'>修改信息</a>"+"</td></tr>");
		})
	})
}
function getUserByNumber1(){
	$("table").show();
	var unumber = $("#unumber").val();
	$.getJSON("getUserByNumber1",{"unumber":unumber},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.uid+"</td><td>"+o.uname+"</td><td>"+o.unumber+
					"</td><td>"+o.cardid+"</td><td>"+o.usex+
					"</td><td>"+o.salary+"</td><td>"+o.ustate+"</td><td>"+o.ulevel+"</td><td><a href='javascript:delUserById("+o.uid+")'>删除</a>"+"</td><td><a href='javascript:update("+o.unumber+")'>修改信息</a>"+"</td></tr>");
		})
	})
}
function getAll(){
	$("table").show();
	$.getJSON("getAll",{},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.uid+"</td><td>"+o.uname+"</td><td>"+o.unumber+
					"</td><td>"+o.cardid+"</td><td>"+o.usex+
					"</td><td>"+o.salary+"</td><td>"+o.ustate+"</td><td>"+o.ulevel+"</td><td><a href='javascript:delUserById("+o.uid+")'>删除</a>"+"</td><td><a href='javascript:update("+o.unumber+")'>修改信息</a>"+"</td></tr>");
		})
	})
}
function update(unumber){
	sessionStorage.setItem("unumber",unumber);
	window.location.href="updateuser.html"
}
function delUserById(uid){
	$.getJSON("deleteUser",{"uid":uid},function(data){
		if(data){
			alert("删除成功！");
			window.location.href="user.html"
		}else{
			alert("删除失败！")
		}
	})
}
function updateManager(){
	var mnumber = sessionStorage.getItem("mnumber");
	var password = $("[name='password']").val();
	 var password1 = $("[name='password1']").val();
	var msex = $("[name='sex']:checked").val();
	var mname = $("[name='mname']").val();
	var mphone = $("[name='mphone']").val();
	if(password == password1){
	$.getJSON("updateManager",{"mnumber":mnumber,"password":password,"mphone":mphone,"msex":msex,"mname":mname},function(data){
		if(data){
			alert("修改信息成功！");
			window.location.href = "managerlogin.html";
		}else{
			alert("修改信息失败！");
		}
	})
}
	else{
		alert("密码不一致");
	}	
}
function getAllFree(){
	$("table").show();
	$.getJSON("getAllFree",{},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.uid+"</td><td>"+o.uname+"</td><td>"+o.unumber+"</td><td>"+o.usex+
					"</td><td>"+o.ustate+"</td><td>"+o.ulevel+"</td><td><a href='javascript:updateUstate1(\""+o.unumber+"\",\""+o.uname+"\")'>确认</a>"+"</td></tr>");
		})
	})
}
function b(pid){
	var uname=sessionStorage.getItem("name");
	var unumber=sessionStorage.getItem("number");
	$.getJSON("updateProblem",{"uname":uname,"unumber":unumber,"pid":pid},function(data){
		
	})
}
function updateUstate1(unumber,uname){
	sessionStorage.setItem("name",uname);
	sessionStorage.setItem("number",unumber);
	$("table").show();
	$.getJSON("updateUstate1",{"unumber":unumber},function(data){
		if(data){
			b(sessionStorage.getItem("pid"));
			alert("工作安排成功！");
			window.location.href="getproblem.html";
		}else{
			alert("工作安排失败！");
		}
		
	})
}
function updateUser(){
	var unumber=sessionStorage.getItem("unumber");
	var uname = $("[name='uname']").val();
	var uphone= $("[name='uphone']").val();
	var password = $("[name='password']").val();
	 var password1 = $("[name='password1']").val();
	var usex = $("[name='sex']:checked").val();
	if(password == password1){
	$.getJSON("updateUser",{"unumber":unumber,"uphone":uphone,"password":password,"usex":usex,"uname":uname},function(data){
		if(data){
			alert("修改信息成功！");
			window.location.href = "user.html";
		}else{
			alert("修改信息失败！");
		}
	})
}
	else{
		alert("密码不一致");
	}}