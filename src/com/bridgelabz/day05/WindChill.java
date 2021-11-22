package com.bridgelabz.day05;

public class WindChill
{
	public static void main(String[] args)
	{
		double t = Double.parseDouble(args[0]); 
		double v = Double.parseDouble(args[1]); 
		if(t<=50 && v>=3 && v<=120) 
		{
			double windChillTemp = 35.74 + 0.6215 * t +
					(0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println(windChillTemp); 
		}
		else 
		{
			System.out.println("Enter tempreture less than 50 & wind speed between 3 to 120..");
		}
	}
}