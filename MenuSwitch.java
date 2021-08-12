package agiliz;

import java.util.Scanner;

public class MenuSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	int choice;
//		char item;
		Scanner scan=new Scanner(System.in);
		System.out.println("Here is the menu using switch");
		System.out.println("Enter your choice ");
		System.out.println("1 for veg");
		System.out.println("2 for non-veg");
		int choice=scan.nextInt();
		char item=scan.next().charAt(0);
		
		switch(choice)
		{
		case 1: System.out.println("you entered to veg");
				
			switch(item)
			{
			case 'p':System.out.println("Palav");
				break;
			case 'g':System.out.println("gobi");
				break;
			}
			break;
		case 2:System.out.println("you entered to non-veg");
				
		switch(item)
		{
		case 'c':System.out.println("chicken");
			break;
		case 'm':System.out.println("mutton");
			break;
		}
		
				break;
				
		default: System.out.println("Thank u");
		}
		
		
	}

}
