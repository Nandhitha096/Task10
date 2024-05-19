package oopsconcepts;

import java.util.Scanner;

public class Account {

	static long balance=70000;
	static String account_number;
	
	Account()
	{
		System.out.println("	Account Details	   ");
	}
	
	Account(String accnum,long bal)
	{
		account_number=accnum;
		balance=bal;
	}
	
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
	public long balDeposit(int dep_amount)
	{
		balance= balance+dep_amount;
		return balance;
	}
	
		
	public static void main(String[] args) {
		
		Account a=new Account();
		System.out.println();
		System.out.println("Enter the Account number : ");
		Scanner sc=new Scanner(System.in);
		account_number=sc.nextLine();
		
		System.out.println();
		System.out.println("Account number is " +account_number);
		System.out.println();
		System.out.println("Available account Balance :" +balance);
		System.out.println();
		
		System.out.println("Enter any of the below option to perform transactions ");
		System.out.println();
		System.out.println("1. View Balance");
		System.out.println("2. Withdraw amount from the account and check balance");
		System.out.println("3. Deposit amount to the account and check balance");
		
		Scanner s1= new Scanner(System.in);
		int opt= s1.nextInt();
		
		switch(opt)
		{
		
		case 1:
		{
			
			System.out.println("Welcome to *** Bank ");
			System.out.println();
			System.out.println("Your Available account Balance is : "+balance);
		    break;
		}
		case 2:
		{
			System.out.println("Enter the amount to be withrawed from the account :");
			Scanner sc1=new Scanner(System.in);
			int witamo=sc1.nextInt();
			System.out.println("Your amount has been withrawn successfully");
			System.out.println();
			System.out.print("Available account balance after withdrawal : ");
			System.out.print(a.balWithdraw(witamo));
			break;
		}
		case 3:
		{
			System.out.println("Enter the amount to be deposited in the account :");
			Scanner sc2=new Scanner(System.in);
			int depamo=sc2.nextInt();
			System.out.println("Your amount has been deposited successfully into the account");
			System.out.println();
			System.out.print("Available account balance after deposited amount : ");
			System.out.print(a.balDeposit(depamo));
			break;
			
		}
		default:
		{
			System.out.println("Enter valid option ");
		}
		}

	}

}
