/**
 * 
 */
package com.springjunitdemo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Himanshu.Gupta
 * This is an nexample for Test Suite where you can create a Test Suite
 * which executes multiple testing classes in single run
 */
@RunWith(Suite.class)
@SuiteClasses(value= {
		SpringJUnitDemoApplicationTests.class,
		SpringJUnitNewApplicationTest.class
})
public class JunitTestingSuiteTest {

}
