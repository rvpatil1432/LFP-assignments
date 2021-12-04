package com.bridgelabz.day07;
import java.util.Scanner;  
public class LargestNumber 
{
	public static void main(String[] args)   
	{  
		int num1, num2, num3;  
		int sum=0;
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:");  
		num1 = sc.nextInt();  
		System.out.println("Enter the second number:");  
		num2 = sc.nextInt();  
		System.out.println("Enter the third number:");  
		num3 = sc.nextInt();  
		LargestNumber lr = new LargestNumber();
		lr.largestNum(num1, num2, num3);
		 
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