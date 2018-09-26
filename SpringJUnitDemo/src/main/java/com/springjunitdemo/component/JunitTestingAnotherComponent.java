/**
 * 
 */
package com.springjunitdemo.component;

import org.springframework.stereotype.Component;

/**
 * @author Himanshu.Gupta
 *
 */
@Component
public class JunitTestingAnotherComponent {

	String name;
	
	public String getName()
	{
		return this.name;
	}
	
	public void addName(String argName)
	{
		this.name = argName;
	}
	
}
