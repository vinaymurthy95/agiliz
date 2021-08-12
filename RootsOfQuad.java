package agiliz;

import java.util.Scanner;

public class RootsOfQuad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value of A");
		double a=scan.nextDouble();
		System.out.println("Enter value of B");
		double b=scan.nextDouble();
		System.out.println("Enter value of C");
		double c=scan.nextDouble();
		double d=b*b-4.0*a*c;
		if(d>0.0)
		{
			double r1=(-b+Math.pow(d, 0.5))/(2.0*a);
			double r2=(-b-Math.pow(d, 0.5))/(2.0*a);
			System.out.println("the Roots are" +r1+"and"+r2);
		}
		else if(d==0.0){
			
			double r1 = -b/(2.0*a);
			System.out.println("The roots is " +r1);
		}
		else {
			System.out.println("Roots arenot real");
		}
	

	}

}
