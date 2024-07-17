/* Q3. Create a class Circle with radius as data member. Create two constructors (no argument
       and two arguments) and a method to calculate circumference.

 */
package oopsconcepts;

import java.math.*;
import java.util.Scanner;

//Creating class "Circle"

public class Circle {
	
	static int radius;
	static double circumference;
	
//Creating no argument constructor of class "Circle"
	
	Circle()
	{
		System.out.println("Calculating the Circumference of the circle");
	}
	
//Creating two arguments constructor of class "Circle"
	
	Circle(int r, double p)
	{
		radius=r;
		p=2.14;
	}
	
//Method to calculate circumference
	
	public double calculate_circumference()
	{
		circumference = 2* Math.PI * radius;
		return circumference;
	}
	

	public static void main(String[] args) {
		
	//Creating object for class "Circle"
		
		Circle cir=new Circle();
		System.out.println();
		System.out.println("Enter the radius to calculate circumference of the circle : ");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextInt();
		System.out.println();
		System.out.print("The circumference of the Circle is : ");
        //Calling the method that has been written to calculate circumference
		System.out.println(cir.calculate_circumference());
		
			

	}

}
