package package2;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your no: ");
		int n=sc.nextInt(),i,j;
		
	    int number = 1;
		
        for (i = 1; i<=n; i++) {
        	
            for (j = 1; j<=i; j++) {
            	
                System.out.print(number + " ");
                number++;
            }
            
            System.out.println();
        }
    }
}