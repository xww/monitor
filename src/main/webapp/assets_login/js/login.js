/**
 * 
 */



function login_check(){
        	
        	var user_name = document.getElementById("form-username"); 
        	var pass = document.getElementById("form-password");
        	var check_result = document.getElementById("check_result");        	
        	
        	if( user_name.value.indexOf("cyou-inc.com") < 0 ){        		
        		check_result.style.display="inline";
        		//style="height:51px;width:449px"
        		check_result.style.height='50px';
        		check_result.style.width='449px';
        		check_result.style.color='red';
        		check_result.value="用户名或密码错误，请重新登录！";
        		return false;
        	}else{        		
        		return true;        		
        	}
        	
}