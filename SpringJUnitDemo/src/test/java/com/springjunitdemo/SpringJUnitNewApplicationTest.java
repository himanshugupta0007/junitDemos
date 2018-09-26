/**
 * 
 */
package com.springjunitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springjunitdemo.component.JunitTestingAnotherComponent;
import com.springjunitdemo.component.JunitTestingComponent;

/**
 * @author Himanshu.Gupta
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Category(RegressionTestCategory.class)
public class SpringJUnitNewApplicationTest {
	


	JunitTestingAnotherComponent component = null;
	
	@Before
	public void setUP()
	{
		component = new JunitTestingAnotherComponent();
	}
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testName()
	{
		assertEquals("Checking name", "himanshu", component.getName());
	}
	
	@Test
	public void addNameTest()
	{
		component.addName("himanshu");
		assertEquals("Checking name", "himanshu", component.getName());
	}
	
	@After
	public void destroyObject()
	{
		component = null;
	}
}
