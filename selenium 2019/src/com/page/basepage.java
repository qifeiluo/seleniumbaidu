package com.page;

import com.util.loginutil;

public class basepage extends loginutil {
	  //跳转至左边菜单
		public void leftmenu() {
			driver.switchTo().frame("menu");
		}
		//跳转至右边框架
		public void right() {
			driver.switchTo().defaultContent();
			driver.switchTo().frame("main");
		}
}
