/**
 * 
 */

function login_check(){
        	
        	var user_name = document.getElementById("form-username"); 
        	var pass = document.getElementById("form-password");
//        	var xwwform = document.getElementById("xwwform");
        	var check_result = document.getElementById("check_result");        	
        	
        	if( user_name.value.indexOf("cyou-inc.com") < 0 ){
        		alert(11);
        		check_result.style.display="block";
        		check_result.value="error";
        		return false;
        	}else{
        		alert(12222);
        		return true;
        		
        	}
        	
}