package com.bridgelabz.day06;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String args[])
	{ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check prime..");
		int n = sc.nextInt();
		checkPrime(n);   
	}  
	static void checkPrime(int n)
	{  
		int i,m=0,flag=0;      
		m=n/2;      
		if(n==0||n==1){  
			System.out.println(n+" is not prime number");      
		}else{  
			for(i=2;i<=m;i++){      
				if(n%i==0){      
					System.out.println(n+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(n+" is prime number"); }  
		}  
	}  
	  
}   