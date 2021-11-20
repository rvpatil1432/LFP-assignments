package com.bridgelabz.day03;

public class EmpWageSwitch
{
	static int randomDigit;
	
	public static void main(String[] args)
	{
		int perHourSalary=20;
		int workingHour=0;
		double salary = 0;
		randomDigit = (int) (Math.floor(Math.random()*10)%3); 
		System.out.println(randomDigit);
		switch(randomDigit) 
		{
		case 0:
			workingHour=0;
			System.out.println("Employee is Absent");
			break;
		case 1:
			workingHour=8;
			System.out.println("Employee is Present");
			break;
		case 2:
			workingHour=4;
			System.out.println("Employee is PartTime");
			break;
		}
		salary=perHourSalary * workingHour;
		System.out.println("Employee has earned "+salary+"$today");
	}

}
