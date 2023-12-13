package package2;

public class ChkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palind = "tenet";
		boolean flag = true;
		
		for(int i=0; i<palind.length()/2; i++) {
			
			 if(palind.charAt(i) != palind.charAt(palind.length()-i-1)){    
	                flag = false;    
	                    
	            }    
	        }    
	        if(flag)    
	            System.out.println("This is palindrome");    
	        else    
	            System.out.println("This is not a palindrome");    
	    }    
	}    
