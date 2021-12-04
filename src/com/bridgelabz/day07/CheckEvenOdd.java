package com.bridgelabz.day07;
import java.util.Scanner;

public class CheckEvenOdd 
{
  public static void main(String args[])
  {
	  int num;
	  int i;
	  System.out.println("Enter an Integer number:");
	  Scanner input = new Scanner(System.in);
	  num = input.nextInt();
	  CheckEvenOdd ch = new CheckEvenOdd();
	  ch.CheckEvenOdd(num);
	  for( i=1; i <= 10; i++)
      {
          System.out.println(num*i);
          
      }
  }
  public String CheckEvenOdd(int num) 
  {
	  String result;
	  if ( num % 2 == 0 )
	  {
		   result = "Even";
	  }
	  else
	  {
		   result = "Odd";
	  }
	  return result;
  }
}