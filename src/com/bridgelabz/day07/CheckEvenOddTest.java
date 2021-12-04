package com.bridgelabz.day07;

import org.junit.Test;

import junit.framework.Assert;

public class CheckEvenOddTest
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
}
