/* Q4. Create a class Account class with all necessary parameters as data member. Create two
       constructors (no argument, and two arguments) and methods to withdraw and deposit
       balance and check balance
 */

package oopsconcepts;

import java.util.Scanner;

//Creating a class named "Account" 
public class Account {

	static long balance=70000;
	static String account_number;
	
	//Creating no argument Constructor for the class "Account"
	
	Account()
	{
		System.out.println("	Account Details	   ");
	}
	
	//Creating two arguments constructor for the class "Account"
	
	Account(String accnum,long bal)
	{
		account_number=accnum;
		balance=bal;
	}
	
	//Method to Withdraw amount from the account
	
	public long balWithdraw(int wit_amount)
	{
		if(balance>wit_amount)
		{
		balance=balance-wit_amount;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		return balance;
	}
	
	//Method to deposit amount to the account
	
	public long balDeposit(int dep_amount)
	{
		balance= balance+dep_amount;
		return balance;
	}
	
		
	public static void main(String[] args) {
		
		//Creating object for the class "Account"
		
		Account a=new Account();
		System.out.println();
		System.out.println("Enter the Account number : ");
		Scanner sc=new Scanner(System.in);
		account_number=sc.nextLine();
		
		//View Account Balance
		
		System.out.println();
		System.out.println("Account number is " +account_number);
		System.out.println();
		System.out.println("Available account Balance :" +balance);
		System.out.println();
		
		//Choose the operations to be performed
		
		System.out.println("Enter any of the below option to perform transactions ");
		System.out.println();
		System.out.println("1. View Balance");
		System.out.println("2. Withdraw amount from the account and check balance");
		System.out.println("3. Deposit amount to the account and check balance");
		
		Scanner s1= new Scanner(System.in);
		int opt= s1.nextInt();
		
		switch(opt)
		{
		
		case 1:   //View account balance
		{
			
			System.out.println("Welcome to *** Bank ");
			System.out.println();
			System.out.println("Your Available account Balance is : "+balance);
		    break;
		}
		case 2:    //Withdraw amount from the account
		{
			System.out.println("Enter the amount to be withrawed from the account :");
			Scanner sc1=new Scanner(System.in);
			int witamo=sc1.nextInt();
			long w1 =a.balWithdraw(witamo);
			System.out.println("Your amount has been withrawn successfully");
			System.out.println();
			System.out.print("Available account balance after withdrawal : " +w1);
			break;
		}
		case 3:      //Deposit amount to the account
		{
			System.out.println("Enter the amount to be deposited in the account :");
			Scanner sc2=new Scanner(System.in);
			int depamo=sc2.nextInt();
			long d1= a.balDeposit(depamo);
			System.out.println("Your amount has been deposited successfully into the account");
			System.out.println();
			System.out.print("Available account balance after deposited amount : " +d1);
			
			break;
			
		}
		default:
		{
			System.out.println("Enter valid option ");
		}
		}

	}

}
