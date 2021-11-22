package com.bridgelabz.day05;
//
import java.util.Random;
import java.util.Scanner;
//
//public class CoinToss {
//
//	
//	//private int heads = 0;
//	//private int tails = 1;
//	
//	private enum Coin{Heads, Tails};
//	public static void main(String[] args) {
//		
//	
//		Random randomNum = new Random();
//		int result;
//		result = randomNum.nextInt(2);
//		System.out.println(result);
//		Coin coinFlip;
//		if(result == 0)
//		{
//		   coinFlip = Coin.Heads;
//		   System.out.println("You flipped Heads!");
//		}
//		else
//		{
//		   coinFlip = Coin.Tails;
//		   System.out.println("You flipped Tails!");
//		}
//	}
//	}
public class CoinToss
{
	public static void main(String[] args)
	{ 
		int headCount=0;
		int tailCount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of time coin to be toss..");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if (Math.random() < 0.5)
			{
				System.out.println(Math.random());
				headCount++;
			}else
			{
				System.out.println(Math.random());
				tailCount++;
			}
		}
		System.out.println("headCount.."+headCount);
		System.out.println("tailCount.."+tailCount);
		float percentHeads = ((float)headCount/n)*100;
		float percentTails = ((float)tailCount/n)*100;
		System.out.println("percentHeads.."+percentHeads);
		System.out.println("percentTails"+percentTails);
	}
}