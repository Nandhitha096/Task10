package oopsconcepts;

import java.math.*;
import java.util.Scanner;

public class Circle {
	
	static int radius;
	static double circumference;
	
	Circle()
	{
		System.out.println("Calculating the Circumference of the circle");
	}
	
	Circle(int r, double p)
	{
		radius=r;
		p=2.14;
	}
	
	public double calculate_circumference()
	{
		circumference = 2* Math.PI * radius;
		return circumference;
	}
	

	public static void main(String[] args) {
		
		Circle cir=new Circle();
		System.out.println();
		System.out.println("Enter the radius to calculate circumference of the circle : ");
		Scanner sc=new Scanner(System.in);
		radius=sc.nextInt();
		System.out.println();
		System.out.print("The circumference of the Circle is : ");
		System.out.println(cir.calculate_circumference());
		
		/*double val=Math.round(cir.calculate_circumference());
		System.out.println(String.format("%1f",val));*/
			

	}

}
