package com.bridgelabz.day03;

import java.util.Scanner;

public class LengthOfLine
{
	public static void main(String arg[])
	{
		int x1,x2,y1,y2;
		double length;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x1 point");
		x1=sc.nextInt();
		System.out.println("Enter y1 point");
		y1=sc.nextInt();
		System.out.println("Enter x2point");
		x2=sc.nextInt();
		System.out.println("Enter y2 point");
		y2=sc.nextInt();

		length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

		System.out.println("Length of line : "+length);

	}

}