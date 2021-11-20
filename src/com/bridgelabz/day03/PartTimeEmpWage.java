package com.bridgelabz.day03;

public class PartTimeEmpWage
{
	static double randomDigit;
	
	public static void main(String[] args)
	{
		int perHourSalary=20;
		int workingHour=0;
		double salary = 0;
		randomDigit = Math.floor(Math.random()*10)%3; 
		System.out.println(randomDigit);
		if (randomDigit==0) 
		{
			workingHour=0;
			System.out.println("Employee is Absent");
		}else if(randomDigit==1)
		{
			workingHour=8;
			System.out.println("Employee is Present");
		}
		else 
		{
			workingHour=4;
			System.out.println("Employee is PartTime");
		}
		salary=perHourSalary * workingHour;
		System.out.println("Employee has earned "+salary+"$today");
	}

}
