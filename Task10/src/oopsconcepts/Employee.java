package oopsconcepts;

import java.util.Scanner;

public class Employee {
	
	static int id;
	static int n;
	static String firstname;
	static String lastname;
	static String name;
	static int salary;
	
	public void setID(int i)
	{
		id=i;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setFirstName(String n)
	{
		firstname=n;
	}
	
	public String getFirstName()
	{
		return firstname;
	}
	
	public void setLastName(String n1)
	{
		lastname=n1;
	}
	
	public String getLastName()
	{
		return lastname;
	}
	
	public void setSalary(int s)
	{
		salary=s;
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String getName()
	{
		return firstname+" "+lastname;
	}
	
	public int getAnnualSalary()
	{
		int annual_salary=salary*12;
		return annual_salary;
	}
	
	public int getRaiseSalary()
	{
		int sum=(salary*n)/100;  //salary increase by 40%
		int raise_salary=salary+sum;
		return raise_salary;
	}
	
	public String toString()
	{
		return "Employee{" + "Employee ID : " + id + " "+ "Employee Name : " + firstname+" "+lastname + " "+ "Employee Salary : "+ salary +"}";
	}
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		System.out.println("Enter the ID of the Employee : ");
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		System.out.println();
		
		System.out.println("Enter the First Name of the Employee : ");
		Scanner sc1=new Scanner(System.in);
		firstname=sc1.nextLine();
		System.out.println();
		
		System.out.println("Enter the Last Name of the Employee : ");
		Scanner sc2=new Scanner(System.in);
		lastname=sc2.nextLine();
		System.out.println();
		
		System.out.println("Enter the Salary of the Employee : ");
		Scanner sc3=new Scanner(System.in);
		salary=sc3.nextInt();
		System.out.println();
		
		System.out.println("DEnter the percentage of salary raise for the employee");
		Scanner sc4=new Scanner(System.in);
		n=sc4.nextInt();
			
		//System.out.println(emp.getID());
		//System.out.println(emp.getFirstName());
		//System.out.println(emp.getLastName());
		//System.out.println(emp.getName());
		//System.out.println(emp.getSalary());
		//System.out.println(emp.getAnnualSalary());
		//System.out.println(emp.getRaiseSalary());
		
		System.out.println(emp.toString());
		System.out.println();
		System.out.print("Employee Annual Salary : ");
		System.out.println(emp.getAnnualSalary());
		System.out.print("Employee Salary raise by "+n+"% : ");
		System.out.println(emp.getRaiseSalary());
				

	}

}
