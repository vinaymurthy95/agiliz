package agiliz;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
			System.out.print("Enter number:");        
			int n=scan.nextInt();
		        for(int i=1; i <= 10; i++)
		        {
		            System.out.println(n+" * "+i+" = "+n*i);
		        }
	}

}
