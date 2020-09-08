function addUser(){
    var uname = $("[name='uname']").val();
    var unumber=$("[name='unumber']").val();
    var uphone=$("[name='uphone']").val();
    var cardid = $("[name='cardid']").val();
    var sex = $("[name='sex']:checked").val();
    var salary = $("[name='salary']").val();
    var estate = $("[name='estate']").val();
    var ulevel = $("#ulevel:checked").val();
    if(unumbereg()){
    	if(getUserByNumber()){
        $.getJSON("addUser",{"uname":uname,"unumber":unumber,"uphone":uphone,"cardid":cardid,"usex":sex,"salary":salary,"ulevel":ulevel},function(data){
        	if(data){
        		alert("添加成功!");
        		window.location.href = "user.html";
        	}else{
        		
        		window.location.href = "register.html";
        	      }
              })
    }else{
    	alert("用户账号已存在！")
    }
    }
    else{
    	alert("用户名不合法！");
    }
}


function getUserByNumber(){
	var unumber = $("[name='unumber']").val();
	$.getJSON("getUserByNumber",{"unumber":unumber},function(data){
		if(data){
			$("#uid").html("<span style='color:green'>账号可用</span>");
			flag =true;
		}else{
			$("#uid").html("<span style='color:red'>账号已存在</span>");
			flag = false;
		}
	})
	return flag;
}
function unumbereg(){
	var unumber = $("[name='unumber']").val();
	var reg = /^\w{5,20}$/;
	if(unumber!=""){
		if(reg.test(unumber)){
			return true;
		}else{
			return false;
		}
	}
}
