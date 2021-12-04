package com.bridgelabz.day07;

import org.junit.Test;

import junit.framework.Assert;

public class LargestNumberTest
{
	@Test
	public void LargestNumberPass() 
	{
		LargestNumber lr = new LargestNumber();
		int result = lr.largestNum(20,30,40);
		Assert.assertEquals(40, result);
		
	}
	@Test
	public void LargestNumberFail() 
	{
		LargestNumber lr = new LargestNumber();
		int result = lr.largestNum(20, 30, 40);
		Assert.assertEquals(30, result);
		
	}
}
