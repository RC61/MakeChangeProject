package makechange;

import java.util.Scanner;

public class MakeChangeApp {

//	User Story #1
//	The user is prompted
//	asking for the price of the item. --------------------------DONE--------
//
//	User Story #2
//	The user is then prompted asking 
//	how much money was tendered by the customer. ----------------DONE-------
//
//	User Story #3
//	Display an appropriate message if the customer 
//	provided too little money or the exact amount. ---------------DONE------
//
//	User Story #4
//	If the amount tendered is more than the cost of the item, ----DONE------
//	display the number of bills and coins that should be given to the customer.

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		

		System.out.print("What is the price of your purchase? $");
		double price = kb.nextDouble();
		System.out.print("How much money are you using to pay for your purchase? $");
		double payment = kb.nextDouble();
		int change = (int) (100*(payment) - (100*(price)));
		
		kb.close();
		
		if (payment > price) {
			GIMMECHANGE(change);
		}
		else if (payment < price) {
			GIMMEMONIES(payment, price);
		}
		else if (payment == price) {
			BreakEven();
		}
		else {
			System.out.println("Don't make me throw you out of my store...");
		}
		
	}

		
	public static void GIMMECHANGE(int change) {
		System.out.println("Looks like I owe you..." );
		
		int penny = 0;
		int nickel = 0;
		int dime = 0;
		int quarter = 0;
		int dollar = 0;
		int five = 0;
		int ten = 0;
		int twenty = 0;
	

		while (change != 0) {
		
		if (change > 2000) {
			change -= 2000;
			twenty++;
		}	
		
		else if (change > 1000) {
			change -= 1000;
			ten++;
		}
		else if (change > 500) {
			change -= 500;
			five++;
		}
		
		else if (change > 100) {
			change -= 100;
			dollar++;
		}
		else if (change > 25) {
			change -= 25;
			quarter++;
		}
		else if (change > 10) {
			change -= 10;
			dime++;
		}
		else if (change > 5) {
			change -= 5;
			nickel++;
		}
		else if (change >= 1) {
			change -= 1;
			penny++;
		}
		else {
			System.out.println("I dont know whats going wrong.");
			change = 0;
		}
		
		}
		System.out.println(twenty + ": Twentie(s)");
		System.out.println(ten + ": Ten(s)");
		System.out.println(five + ": Five(s)");
		System.out.println(dollar + ": Single(s)");
		System.out.println(quarter + ": Quarter(s)");
		System.out.println(dime + ": Dime(s)");
		System.out.println(nickel + ": Nickle(s)");
		System.out.println(penny + ": Pennie(s)");
		
		int pennyD = (penny *1);
		int nickelD = (nickel * 5);
		int dimeD = (dime * 10);
		int quarterD = (quarter * 25);
		int dollarD = (dollar * 1);
		int fiveD = (five * 5);
		int tenD = (ten * 10);
		int twentyD = (twenty * 20);
		int cents = pennyD + nickelD + dimeD + quarterD;
		int dollars = fiveD + tenD + twentyD;
		String $dollars$ = "$" + dollars;

		
		System.out.println("Which is " + $dollars$ + "." + cents + " in change");
		
	}
	public static void GIMMEMONIES(double payment, double price) {
		double notEnough = (price - payment);
		System.out.println("Nah chief. Thats not enough to cover your purchase.");
	}
	public static void BreakEven() {
		System.out.println("Looks like we're good. Thank you for shopping with us.");
	}
}
