package com.bridgelabz.day03;

public class DailyEmpWage
{
	static int randomDigit;
	
	public static void main(String[] args)
	{
		int perHourSalary=20;
		int workingHour=0;
		double salary = 0;
		randomDigit = (int) Math.round( Math.random()); 
		if (randomDigit==0) 
		{
			workingHour=0;
			System.out.println("Employee is Absent");
		}else 
		{
			workingHour=8;
			System.out.println("Employee is Present");
		}
		salary=perHourSalary * workingHour;
		System.out.println("Employee has earned "+salary+"$today");
	}

}
