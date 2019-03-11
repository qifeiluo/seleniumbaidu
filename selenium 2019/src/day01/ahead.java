package day01;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class ahead{
	 public static WebDriver driver;
	 public static String url1;
	 @BeforeClass
	  public void setUp() throws Exception,InterruptedException{
		//System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		//driver=new ChromeDriver();
		 
		DesiredCapabilities a=DesiredCapabilities.chrome();
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.43.87:5454/wd/hub"),a);
		url1="http://localhost:8080/examsys/index.thtml";
	driver.get(url1);
	driver.findElement(By.name("username")).clear();
    driver.findElement(By.name("username")).sendKeys("hujianming");
    driver.findElement(By.name("userpass")).clear();
    driver.findElement(By.name("userpass")).sendKeys("hujianming123");
    new Select(driver.findElement(By.name("usertype"))).selectByVisibleText("π‹¿Ì‘±");
    Thread.sleep(10000);
    driver.findElement(By.cssSelector("button.tm_btn")).click();
	driver.switchTo().frame("main");
    String wenzi=driver.findElement(By.xpath("/html/body/div/div[1]/ul")).getText();
  	System.out.println(wenzi);
  	
  		Thread.sleep(2000);
  		driver.close();
	 }
@Test
public void open() throws InterruptedException{
		
    
}		
	 @AfterClass
	  public void tearDown() throws Exception {
		 
		// driver.close();
	    }
}
