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
		int change = (int) (100 * (payment) - (100 * (price)));

		kb.close();

		if (payment > price) {
			youNeedChange(change);
		} else if (payment < price) {
			iNeedMoreMoney(payment, price);
		} else if (payment == price) {
			BreakEven();
		} else {
			System.out.println("Don't make me throw you out of my store...");
		}
	}

	public static void youNeedChange(int change) {
		System.out.println("Looks like I owe you...");

		int penny = 0;
		int nickel = 0;
		int dime = 0;
		int quarter = 0;
		int one = 0;
		int five = 0;
		int ten = 0;
		int twenty = 0;

		while (change != 0) {

			if (change >= 2000) {
				change -= 2000;
				twenty++;
			}
			else if (change >= 1000) {
				change -= 1000;
				ten++;
			} 
			else if (change >= 500) {
				change -= 500;
				five++;
			}
			else if (change >= 100) {
				change -= 100;
				one++;
			} 
			else if (change >= 25) {
				change -= 25;
				quarter++;
			} 
			else if (change >= 10) {
				change -= 10;
				dime++;
			} 
			else if (change >= 5) {
				change -= 5;
				nickel++;
			} 
			else if (change >= 1) {
				change -= 1;
				penny++;
			} 
			else {
				System.out.println("I dont know whats going on here.");
				change = 0;
			}
		}
		
		String sBill = "dollar bill";
		
		if (twenty == 1) {
			System.out.println(twenty + ": Twenty " + sBill);
		}
		else if (twenty > 1) {
			System.out.println(twenty + ": Twenty " + sBill + "s");
		}
		if (ten == 1) {
			System.out.println(ten + ": Ten " + sBill);
		}
		else if (ten > 1) {
			System.out.println(ten + ": Ten " + sBill + "s");
		}
		if (five == 1) {
			System.out.println(five + ": Five " + sBill);
		}
		else if (five > 1) {
			System.out.println(five + ": Five " + sBill + "s");
		}
		if (one == 1) {
			System.out.println(one + ": One " + sBill);
		}
		else if (one > 1) {
			System.out.println(one + ": One " + sBill + "s");
		}
		if (quarter == 1) {
			System.out.println(quarter + ": Quarter");
		}
		else if (quarter > 1) {
			System.out.println(quarter + ": Quarters");
		}
		if (dime == 1) {
			System.out.println(dime + ": Dime");
		}
		else if (dime > 1) {
			System.out.println(dime + ": Dimes");
		}
		if (nickel == 1) {
			System.out.println(nickel + ": Nickel");
		}
		else if (nickel > 1) {
			System.out.println(nickel + ": Nickels");
		}
		if (penny == 1) {
			System.out.println(penny + ": Penny");
		}
		else if (penny > 1) {
			System.out.println(penny + ": Pennies");
		}
		
		int pennyVal = (penny * 1);
		int nickelVal = (nickel * 5);
		int dimeVal = (dime * 10);
		int quarterVal = (quarter * 25);
		int dollarVal = (one * 1);
		int fiveVal = (five * 5);
		int tenVal = (ten * 10);
		int twentyVal = (twenty * 20);
		int cents = (pennyVal + nickelVal + dimeVal + quarterVal);
		int dollars = dollarVal + fiveVal + tenVal + twentyVal;
		String $dollars$ = "$" + dollars;
		
		if (cents >= 10) {
		System.out.println("Which is " + $dollars$ + "." + cents + " in change");
		}
		else if (cents <10) {
			System.out.println("Which is " + $dollars$ + ".0" + cents+ " in change");
		}

	}

	public static void iNeedMoreMoney(double payment, double price) {
		System.out.println("Nah chief. Thats not enough to cover your purchase.");
	}

	public static void BreakEven() {
		System.out.println("Looks like we're good. Thank you for shopping with us.");
	}
}