package com.bridgelabz.day07;

import org.junit.Test;

import junit.framework.Assert;

public class UtilityTest 
{
	@Test
	public void CheckEvenOddPass() 
	{
		CheckEvenOdd ch = new CheckEvenOdd();
		String result = ch.CheckEvenOdd(4);
		Assert.assertEquals("Even", result);
		
	}
	@Test
	public void CheckEvenOddFail() 
	{
		CheckEvenOdd ch = new CheckEvenOdd();
		String result = ch.CheckEvenOdd(4);
		Assert.assertEquals("Odd", result);
	}
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
