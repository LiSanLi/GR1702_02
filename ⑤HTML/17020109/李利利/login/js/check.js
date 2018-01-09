function checkForm() {
	if (document.logins.kk.value==""　&&　document.logins.tt.value=="") {
		alert("用户名和密码不能为空,请输入!!!!!!!")
		return false;
	}
	 else if (document.logins.tt.value=="") {
		alert("用户名不能为空,请输入!!!!!!!")
		return false;
	}
	 else if (document.logins.kk.value=="") {
		alert("密码不能为空,请输入!!!!!!!")
		return false;
	}
	
}