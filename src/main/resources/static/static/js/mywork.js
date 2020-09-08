function see(){
	var unumber=sessionStorage.getItem("unumber");
	$.getJSON("getWork",{"unumber":unumber},function(data){
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.pid+"</td><td>"+o.username+"</td><td>"+o.phone+
					"</td><td>"+o.location+"</td><td>"+o.statement+
					"</td><td>"+o.state+"</td><td>"+o.urgence+"</td><td>"+o.uname+"</td><td>"+o.etime+"</td><td><a href='javascript:c("+o.pid+")'>确认完成</a>"+"</td></tr>");
		})
	})
}
function Finish(){
	var unumber=sessionStorage.getItem("unumber");
	$.getJSON("getWork1",{"unumber":unumber},function(data){
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.pid+"</td><td>"+o.username+"</td><td>"+o.phone+
					"</td><td>"+o.location+"</td><td>"+o.statement+
					"</td><td>"+o.state+"</td><td>"+o.urgence+"</td><td>"+o.uname+"</td><td>"+o.etime+"</td><td><a href='javascript:d("+o.pid+")'>删除</a>"+"</td></tr>");
		})
	})
}
function d(pid){
	$.getJSON("updateProblem2",{"pid":pid},function(data){
		$("tr:gt(0)").remove();
		if(data){
			alert("删除成功");
		}
		else{
			alert("删除失败！")
			}
		
	})
}
function c(pid){
	$.getJSON("updateProblem1",{"pid":pid},function(data){
		if(data){
			alert("感谢你的维修");
			window.location.href="usercontroll.html";
			m()
		}
		
	})
}
function m(){
	var unumber=sessionStorage.getItem("unumber");
	$.getJSON("updateUstate2",{"unumber":unumber},function(data){
		
		})
}