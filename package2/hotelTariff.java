package package2;

import java.util.Scanner;

public class hotelTariff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month,days;
		float rent,disprice,price;
		float dis=25;
		System.out.println("***Welcome to Hotel Western Gatz***");
		System.out.println("1. January, February, March ");
		System.out.println("2. April, May, June ");
		System.out.println("3. July, August, September ");
		System.out.println("4. October, November, December ");

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Select no of month:  ");
		
		month=sc.nextInt();
		
		System.out.print("Enter no of days: ");
		
		days=sc.nextInt();
		
		rent=days*2000;
		
		disprice =100-dis;
		
		price=(disprice*rent)/100;
		
		System.out.println("Price: " + rent);
	
		switch(month)
		{
		case 1:
			System.out.println("Your rent is: "+ rent);
			break;
		case 2:
			System.out.println("Your rent with 25% discount :"+ price);
			break;
		case 3:
			System.out.println("Your rent is: "+ rent);
			break;
		case 4:
			System.out.println("Your rent with 25% discount :"+ price);
			break;
		default:
			System.out.println("Your choise invalid! ");
	
	}
	    System.out.println("***Thank you***Visit again**");

	}
}
