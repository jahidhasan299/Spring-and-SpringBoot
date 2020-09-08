function addProblem(){
	var username = $("[name='username']").val();
	var phone= $("[name='phone']").val();
	var location= $("[name='location']").val();
	var statement= $("[name='statement']").val();
	var urgence = $("#urgence:checked").val();
	$.getJSON("addProblem",{"username":username,"phone":phone,"location":location,"statement":statement,"urgence":urgence},
			function(data){
		if(data){
			alert("提交成功");
		}
		else{alert("提交失败");}
	})
}
function getAllProblem(){
	$.getJSON("getAllProblem",{},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.pid+"</td><td>"+o.username+"</td><td>"+o.phone+
					"</td><td>"+o.location+"</td><td>"+o.statement+
					"</td><td>"+o.state+"</td><td>"+o.urgence+"</td><td>"+o.uname+"</td><td>"+o.etime+"</td><td><a href='javascript:a("+o.pid+")'>安排人员</a>"+"</td></tr>");
		})
		
	})
}
function getAllProblem1(){
	$.getJSON("getAllProblem1",{},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.pid+"</td><td>"+o.username+"</td><td>"+o.phone+
					"</td><td>"+o.location+"</td><td>"+o.statement+
					"</td><td>"+o.state+"</td><td>"+o.urgence+"</td><td>"+o.uname+"</td><td>"+o.etime+"</td></tr>");
		})
		
	})
}
function getAllProblem2(){
	$.getJSON("getAllProblem2",{},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.pid+"</td><td>"+o.username+"</td><td>"+o.phone+
					"</td><td>"+o.location+"</td><td>"+o.statement+
					"</td><td>"+o.state+"</td><td>"+o.urgence+"</td><td>"+o.uname+"</td><td>"+o.etime+"</td><td><a href='javascript:del("+o.pid+")'>删除</a>"+"</td></tr>");
		})	
	})
}
function del(pid){
	$.getJSON("del",{"pid":pid},function(data){
		$("tr:gt(0)").remove();
		if(data){
			alert("删除成功");
			getAllProblem2();
		}
		else{
			alert("删除失败")
		}
	})
}
function getProblemByTime(){
	var YYYY= $("[name='YYYY']").val();
	var MM= $("[name='MM']").val();
	var DD= $("[name='DD']").val();
	var etime=YYYY+"-"+MM+"-"+DD;
	$.getJSON("getProblemByTime",{"etime":etime},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.pid+"</td><td>"+o.username+"</td><td>"+o.phone+
					"</td><td>"+o.location+"</td><td>"+o.statement+
					"</td><td>"+o.state+"</td><td>"+o.urgence+"</td><td>"+o.uname+"</td><td>"+o.etime+"</td><td><a href='javascript:a("+o.pid+")'>安排人员</a>"+"</td></tr>");
		})
		
	})
}
function getProblemByTime1(){
	var YYYY= $("[name='YYYY']").val();
	var MM= $("[name='MM']").val();
	var DD= $("[name='DD']").val();
	var etime=YYYY+"-"+MM+"-"+DD;
	$.getJSON("getProblemByTime1",{"etime":etime},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.pid+"</td><td>"+o.username+"</td><td>"+o.phone+
					"</td><td>"+o.location+"</td><td>"+o.statement+
					"</td><td>"+o.state+"</td><td>"+o.urgence+"</td><td>"+o.uname+"</td><td>"+o.etime+"</td></tr>");
		})
		
	})
}
function getProblemByTime2(){
	var YYYY= $("[name='YYYY']").val();
	var MM= $("[name='MM']").val();
	var DD= $("[name='DD']").val();
	var etime=YYYY+"-"+MM+"-"+DD;
	$.getJSON("getProblemByTime2",{"etime":etime},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.pid+"</td><td>"+o.username+"</td><td>"+o.phone+
					"</td><td>"+o.location+"</td><td>"+o.statement+
					"</td><td>"+o.state+"</td><td>"+o.urgence+"</td><td>"+o.uname+"</td><td>"+o.etime+"</td><td><a href='javascript:del("+o.pid+")'>删除</a>"+"</td></tr>");
		})
		
	})
}
function a(pid){
	sessionStorage.setItem("pid",pid);
	window.location.href="userfree.html";
}