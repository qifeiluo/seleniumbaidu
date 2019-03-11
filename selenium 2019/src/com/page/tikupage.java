package com.page;

import org.openqa.selenium.By;

import com.util.loginutil;

public class tikupage extends loginutil{

	//点击题库管理
	public void tikumenu() {
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();		
	}
	//点击题库管理下的新增题库
	public void addtiku() {
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
	}

	//输入题库名称
	public void tikuname(String name) {
		driver.findElement(By.name("d_name")).sendKeys(name);
	}
	//点击提交
	public void submit() {
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
}
