package package2;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your no: ");
		
		int n=sc.nextInt(),i,j;
		
        for (i = 1; i<=n; i++) {
        	
            for (j = 1; j<=n; j++) {
            	
            	if(i==j || i+j==n+1)
            		System.out.print("*");
            	else
            		System.out.print("  ");
            		
            }
            
            System.out.println();
        }
    }
}