package com.page;

import com.util.loginutil;

public class basepage extends loginutil {
	  //��ת����߲˵�
		public void leftmenu() {
			driver.switchTo().frame("menu");
		}
		//��ת���ұ߿��
		public void right() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}
}
