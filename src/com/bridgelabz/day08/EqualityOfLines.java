package com.bridgelabz.day08;

import java.util.Scanner;

public class EqualityOfLines
{
	public static void main(String[] args)
	{
		int l1x1,l1x2,l1y1,l1y2,l2x1,l2x2,l2y1,l2y2;
		Double lengthOfFirstLine,lengthOfSecondLine;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1 point");
		l1x1=sc.nextInt();
		System.out.println("Enter y1 point");
		l1y1=sc.nextInt();
		System.out.println("Enter x2point");
		l1x2=sc.nextInt();
		System.out.println("Enter y2 point");
		l1y2=sc.nextInt();
		lengthOfFirstLine=Math.sqrt((l1x2-l1x1)*(l1x2-l1x1) + (l1y2-l1y1)*(l1y2-l1y1));
		System.out.println("Enter x1 point");
		l2x1=sc.nextInt();
		System.out.println("Enter y1 point");
		l2y1=sc.nextInt();
		System.out.println("Enter x2point");
		l2x2=sc.nextInt();
		System.out.println("Enter y2 point");
		l2y2=sc.nextInt();
		lengthOfSecondLine=Math.sqrt((l2x2-l2x1)*(l2x2-l2x1) + (l2y2-l2y1)*(l2y2-l2y1));
		System.out.println("lengthOfFirstLine.."+lengthOfFirstLine+" lengthOfSecondLine.."+lengthOfSecondLine);
		if (lengthOfFirstLine.equals(lengthOfSecondLine)) 
		{
			System.out.println("Both lines are equal");
		}else 
		{
			System.out.println("Both lines are not equal");
		}
	}
}
