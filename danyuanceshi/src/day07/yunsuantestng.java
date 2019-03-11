package day07;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class yunsuantestng {
	yunsuan a=new yunsuan();
	@DataProvider(name="add")
	public Object[][] data(){
		return new Object[][] {{20,40},{23,25},{2,5}};
	}
	@Test(dataProvider="add")
	
	//@Test
	//@Parameters({"a1","a2"})
	public void Aadd(int a1,int a2) {
		int b=a.add(a1, a2);
		int c=a.cheng(a1, a2);
		int d=a.chu(a1, a2);
		int e=a.sub(a1, a2);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		/*System.out.println(a1+a2);
		System.out.println(a1-a2);
		System.out.println(a1*a2);
		System.out.println(a1/a2);*/
	}
	/*@Test(dataProvider="add")
	public void jian(int a1,int a2) {
		System.out.println(a1-a2);
	}
	@Test(dataProvider="add")
	public void cheng(int a1,int a2) {
		System.out.println(a1*a2);
	}
	@Test(dataProvider="add")
	public void chu(int a1,int a2) {
		System.out.println(a1/a2);
	}*/
}
