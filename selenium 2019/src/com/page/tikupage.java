package com.page;

import org.openqa.selenium.By;

import com.util.loginutil;

public class tikupage extends loginutil{

	//���������
	public void tikumenu() {
		driver.findElement(By.xpath("/html/body/div/div[3]/h2/a")).click();		
	}
	//����������µ��������
	public void addtiku() {
		driver.findElement(By.xpath("/html/body/div/div[3]/ul/li[1]/a")).click();
	}

	//�����������
	public void tikuname(String name) {
		driver.findElement(By.name("d_name")).sendKeys(name);
	}
	//����ύ
	public void submit() {
		driver.findElement(By.xpath("//*[@id=\"form_qdb_add\"]/table/tfoot/tr/td/button[1]")).click();
	}
}
