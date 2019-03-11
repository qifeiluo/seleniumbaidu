package com.testcase;


import org.testng.annotations.Test;

import com.business.loginbusiness;
import com.util.loginutil;

public class logintestcase extends loginutil{
  @Test
  public void login() throws Exception {
	  loginbusiness l=new loginbusiness();
	  l.loginb();	  
  }
}

