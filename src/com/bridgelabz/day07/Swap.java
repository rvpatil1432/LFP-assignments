package com.bridgelabz.day07;

import java.util.*;  
public class Swap 
{
	public static void main(String[] args)
	{  
		int num1, num2;
		int temp;
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the value of num1 and num2");  
		num1 = sc.nextInt();  
		num2 = sc.nextInt();  
		Swap sw = new Swap();
		System.out.println("before swapping numbers: "+num1 +"  "+ num2);  
		temp = num1;  
		num1 = num2;  
		num2 = temp;  
		System.out.println("After swapping: "+num1 +"   " + num2);  
		sw.sumOfSwapNumber(num1, num2);
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
	}