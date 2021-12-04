package com.bridgelabz.day09;

import java.util.Scanner;

public class AddressBook2 {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("How many books do you want to create? ");
		int howManyBooks;
		int howManyEntries;

		AddressBook[] library = new AddressBook[0];


		while(true)
		{
			howManyBooks = s.nextInt();
			if (howManyBooks>0){
				library = new AddressBook[howManyBooks];                
				break;
			}
			else System.out.print("You must create at least 1 book.");
		}



		for (int i=0;i<library.length;i++){


			library[i] = new AddressBook(); 

			while(true){
				System.out.print("How many entries in book "+i+"? ");
				howManyEntries = s.nextInt();
				if (howManyEntries>0) {
					library[i].initEntries(howManyEntries);                
					break;
				}
				else System.out.println("You must create at least 1 Entry.");
			}


		}
		boolean done = false;
		int selectedBook = 0;
		int selection;
		while (done==false){
			System.out.println("Book "+selectedBook+" is currently selected.");

			for (int i = 0;i<library[selectedBook].getEntries();i++){
				System.out.println("===========Entry "+i+" ===========");
				library[selectedBook].contents[i].readEntry(); 
				System.out.println("================================");
			}


			System.out.println("Select an option!");
			System.out.println("1. Add an entry");
			System.out.println("2. Exit the menu");
			System.out.print("> ");
			selection = s.nextInt();
			String first, last, address, email;
			switch(selection){
			case 1: 
				System.out.print("First name? ");
				first = s.next();
				System.out.print("Last name? ");
				last = s.next();
				System.out.print("Address? ");
				address = s.next();
				System.out.print("Email? ");
				email = s.next();
				library[selectedBook].add(first, last, address, email);
				break;
			case 2:
				done = true;
				break;
			default:
				System.out.print("Please choose a valid menu number");


			}

		}
	}
}