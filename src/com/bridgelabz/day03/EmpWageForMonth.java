package com.bridgelabz.day03;

import java.util.Scanner;

public class EmpWageForMonth
{
	static int randomDigit;
	
	public static void main(String[] args)
	{
		int perHourSalary=20;
		int workingHour=0;
		double salary = 0;
		double totalSalary = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of woring days..");
		int numOfWorkingDays = sc.nextInt();
		randomDigit = (int) (Math.floor(Math.random()*10)%3); 
		System.out.println(randomDigit);
		for(int day=0;day<numOfWorkingDays;day++) 
		{
			switch(randomDigit) 
			{
			case 0:
				workingHour=0;
				break;
			case 1:
				workingHour=8;
				break;
			case 2:
				workingHour=4;
				break;
			}
			salary=perHourSalary * workingHour;
			totalSalary = totalSalary+salary;

		}
		System.out.println("Employee has earned "+totalSalary+"$for month");
	}

}
