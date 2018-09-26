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
public class JunitTestingComponent {

	int amount;
	
	public void addAmount(int argAmount)
	{
		this.amount = this.amount+argAmount;
	}
	
	public int getTotal()
	{
		return this.amount;
	}
	
	public void subAmount(int argAmount)
	{
		this.amount = this.amount - argAmount;
		if(this.amount < 0)
		{
			throw new IllegalStateException();
		}
	}
}
