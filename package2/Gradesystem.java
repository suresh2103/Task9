package package2;

import java.util.Scanner;

public class Gradesystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your mark: ");
		int mark=sc.nextInt();
		
		if(mark == 100) {
			System.out.println("Your Grade is: S");
		}
		else if(mark>=90 && mark<=99) {
			
			System.out.println("Your Grade is:A");
			}
		else if(mark>=80 && mark<=89) {

			System.out.println("Your Grade is:B");
		}
		else if(mark>=70 && mark<=79) {
		
			System.out.println("Your Grade is:C");
	    }
		else if(mark>=60 && mark<=69) {
		
			System.out.println("Your Grade is:D");
		}
		else if(mark>=50 && mark<=59) {
		
			System.out.println("Your Grade is:E");
	    }
		else if(mark>=1 && mark<=49) {
			System.out.println("Sorry! you are Fail ");
	   }
		else 
			System.out.println("invalid Input");
	}
}
