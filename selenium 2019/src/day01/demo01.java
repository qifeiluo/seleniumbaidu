package day01;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class demo01 {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before //ע��
  public void setUp() throws Exception {
	  //����ȸ��������·��
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	driver = new ChromeDriver();
	//�������ַ
    baseUrl = "http://change-this-to-the-site-you-are-testing/";
    //ȫ��
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "file:///D:/2018%E8%AF%BE%E4%BB%B6/08%20Selenium/%E9%A1%B5%E9%9D%A2/autotest.html");
    driver.findElement(By.id("accountID")).clear();
    driver.findElement(By.id("accountID")).sendKeys("111");
    driver.findElement(By.id("passwordID")).clear();
    driver.findElement(By.id("passwordID")).sendKeys("222");
    new Select(driver.findElement(By.id("areaID"))).selectByVisibleText("�����");
    driver.findElement(By.id("sexID2")).click();
    driver.findElement(By.id("u2")).click();
    driver.findElement(By.id("buttonID")).click();
    assertEquals("hello continue...", closeAlertAndGetItsText());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}