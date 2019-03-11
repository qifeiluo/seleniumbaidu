package day05;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class practice1Test {
	practice1 w=new practice1();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testChu() {
		w.chu(100);
	}

	@Test
	public void testChu1() {
		w.chu1(15);
	}

}
