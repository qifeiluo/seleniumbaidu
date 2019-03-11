package com.util;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class loginutil {
 
	 public static WebDriver driver;
	 public static String url1;
	 @BeforeClass
	  public void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		//driver=new ChromeDriver();
		 
		DesiredCapabilities a=DesiredCapabilities.chrome();
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.43.87:4444/wd/hub"),a);
		 
		url1="http://localhost:8080/examsys/";
			driver.get(url1);
		
	  }
	 @AfterClass
	  public void tearDown() throws Exception {		 
		// driver.close();
	    }
}
