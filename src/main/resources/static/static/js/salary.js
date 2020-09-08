function getUserByNumber1(){
	$("table").show();
	var unumber = $("#unumber").val();
	$.getJSON("getUserByNumber1",{"unumber":unumber},function(data){
		$("tr:gt(0)").remove();
		$(data).each(function(i,o){
			$("table").append("<tr><td>"+o.uid+"</td><td>"+o.uname+"</td><td>"+o.unumber+
					"</td><td>"+o.cardid+"</td><td>"+o.usex+
					"</td><td>"+o.salary+"</td><td>"+o.ulevel+"</td><td><a href='javascript:salaryupdate("+o.unumber+")'>工资更改</a>"+"</td></tr>");
		})
	})
}
function salaryupdate(unumber){
	sessionStorage.setItem("unumber",unumber);
	window.location.href="updatesalary.html"
}
function updateSalary(){
	var unumber=sessionStorage.getItem("unumber");
	var salary = $("#salary").val();
	$.getJSON("updateSalary",{"unumber":unumber,"salary":salary},function(data){
		if(data){
			alert("更改成功");
			window.location.href="salary.html";
		}
		else{
			alert("更改失败")
		}
	})
}
function updateS(){
	var salary = $("#addsalary").val();
	$.getJSON("updateS",{"salary":salary},function(data){
		if(data){
			alert("更改成功");
			window.location.href="user.html";
		}
		else{
			alert("操作失败")
		}
	})
}