/**
 * 
 */
package com.springjunitdemo;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Himanshu.Gupta
 *	using
 */
@RunWith(Categories.class)
@IncludeCategory(value = {
		SanityTestCategory.class		
})
@ExcludeCategory(value = {RegressionTestCategory.class})
@SuiteClasses(value= {
		SpringJUnitDemoApplicationTests.class,
		SpringJUnitNewApplicationTest.class
})
public class SpringJUnitCategoryDemoTest {

}
