package com.testcase;

import org.testng.annotations.Test;

import com.business.loginbusiness;
import com.business.tikubusiness;
import com.util.loginutil;

public class tikutestcase extends loginutil {
@Test
public void tiku() throws Exception {
	loginbusiness l=new loginbusiness();
	tikubusiness tiku=new tikubusiness();
	  l.loginb();
	  tiku.tikub();
}
}
