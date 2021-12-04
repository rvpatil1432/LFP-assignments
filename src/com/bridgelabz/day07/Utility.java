package com.bridgelabz.day07;

public class Utility 
{
	public String CheckEvenOdd(int num) 
	{
		String result;
		if ( num % 2 == 0 )
		{
			result = "Even";
		}
		else
		{
			result = "Odd";
		}
		return result;
	}
	public int sumOfSwapNumber(int a,int b) 
	{
		int sum=0;
		int combine = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
		System.out.println(combine);
		while(combine>0) {
			int	rem = combine % 10;
			combine = combine / 10;
			System.out.println(rem);
			sum = sum+rem;
		}
		System.out.println("Sum.."+sum);
		return sum;
	}
	public int largestNum(int num1,int num2,int num3) 
	{
		int largest, temp;
		temp=num1>num2?num1:num2;   
		largest=num3>temp?num3:temp;  
		System.out.println("The largest number is: "+largest); 
		return largest;

	}
}
