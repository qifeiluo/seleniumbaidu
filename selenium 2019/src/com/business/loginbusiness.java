package com.business;

import com.page.loginpage;

public class loginbusiness extends loginpage {
	
	public void loginb() throws Exception {
     loginpage page=new loginpage();  
     page.setusername();
     page.setpassword();
     page.selectlx();
     Thread.sleep(10000);
     page.clicklogin();
     //page.add();
	}
}
