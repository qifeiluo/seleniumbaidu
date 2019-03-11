package day05;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class yunsuantestng {
	yunsuan a=new yunsuan();
  @BeforeClass
  public void beforeClass() {
	  System.out.println("²âÊÔ¿ªÊ¼");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("²âÊÔ½áÊø");
  }


  @Test
  public void Aadd() {
   int result=a.add(1, 3);
   Assert.assertEquals(result, 4);
  }

  @Test
  public void Ccheng() {
    int result=a.cheng(1, 3);
    Assert.assertEquals(result, 3);
  }

  @Test
  public void Dchu() {
	  int result=a.chu(100, 10);
	    Assert.assertEquals(result, 10);
  }

  @Test
  public void Bsub() {
	  int result=a.sub(1, 3);
	    Assert.assertEquals(result, -2);
  }
}
