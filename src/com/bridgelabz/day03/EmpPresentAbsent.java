package com.bridgelabz.day03;

public class EmpPresentAbsent 
{
	static int randomDigit;
	public static void main(String[] args) 
	{
		EmpPresentAbsent emp = new EmpPresentAbsent();
		randomDigit = (int) Math.round( Math.random()); 
		if (randomDigit==0) 
		{
			System.out.println("Employee is Absent");
		}else 
		{
			System.out.println("Employee is Present");
		}
	}
}
