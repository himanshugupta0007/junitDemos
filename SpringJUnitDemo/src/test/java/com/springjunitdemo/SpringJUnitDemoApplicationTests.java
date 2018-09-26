package com.springjunitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springjunitdemo.component.JunitTestingComponent;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringJUnitDemoApplicationTests {

	JunitTestingComponent component = null;
	
	@Before
	public void setUP()
	{
		component = new JunitTestingComponent();
	}
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testTotal()
	{
		assertEquals("Checking Totals", 0, component.getTotal());
	}
	
	@Test
	@Category(SanityTestCategory.class)
	public void addAmouontTest()
	{
		component.addAmount(10);
		assertEquals("Checking Totals", 10, component.getTotal());
	}

	//@Ignore // ignore this test case
	@Test(expected = IllegalStateException.class)
	public void subAmountTest()
	{
		component.subAmount(0);
		//assertEquals("Checking Totals", 0, component.getTotal());
	}
}
