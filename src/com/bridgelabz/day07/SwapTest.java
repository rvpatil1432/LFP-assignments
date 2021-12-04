package com.bridgelabz.day07;

import org.junit.Test;

import junit.framework.Assert;

public class SwapTest 
{
	@Test
	public void sumOfSwapNumberPass() 
	{
		Swap sw = new Swap();
		int result = sw.sumOfSwapNumber(20, 30);
		Assert.assertEquals(5, result);
		
	}
	@Test
	public void sumOfSwapNumberFail() 
	{
		Swap sw = new Swap();
		int result = sw.sumOfSwapNumber(20, 30);
		Assert.assertEquals(4, result);
		
	}
}
