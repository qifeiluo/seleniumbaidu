package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


import com.util.loginutil;

public class loginpage extends loginutil{
	
	//�û�������
	public void setusername(){
		
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td/input")).sendKeys("hujianming");
		
	}
	
	//��������
	public void setpassword(){
		
		  driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[2]/td/input")).sendKeys("hujianming123");
		  
	}
	//ѡ������
	public void selectlx()  {
		new Select(driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[3]/td/select"))).selectByVisibleText("����Ա");
		
	}
	public void clicklogin() {
		driver.findElement(By.cssSelector("button.tm_btn")).click();
	}
	//�������
	public void add() {
		driver.switchTo().frame("menu");
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
	
		driver.switchTo().defaultContent();
		driver.switchTo().frame("main");
		driver.findElement(By.name("d_name")).sendKeys("���ֱײ��ʮ�꣡");
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
		
	}
	
}

