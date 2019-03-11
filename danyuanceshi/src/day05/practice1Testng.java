package day05;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class practice1Testng {
	practice1 a=new practice1();
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }


  @Test
  public void chu() {
    a.chu(100);
  }

  @Test
  public void chu1() {
    a.chu1(144);
  }
}
