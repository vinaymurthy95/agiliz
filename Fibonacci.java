package agiliz;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,i;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter count value");
		int count=scan.nextInt();
		 System.out.print(n1+" "+n2);    
		    
		 for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    

	}

}
