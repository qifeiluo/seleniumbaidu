package day05;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class yunsuanTest {

	yunsuan y=new yunsuan(); 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testAdd() {
		int result=y.add(1,4);
		assertEquals(5,result);
	}

	@Test
	public void testSub() {
		int result=y.sub(1,4);
		assertEquals(5,result);
	}

	@Test
	public void testCheng() {
		int result=y.cheng(1,4);
		assertEquals(5,result);
	}

	@Test
	public void testChu() {
		int result=y.chu(1,4);
		assertEquals(5,result);
	}

}
