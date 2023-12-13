package package2;

public class Revstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "chennai", str1="";
		char ch;
		
		for(int i=0; i<name.length(); i++) {
			ch=name.charAt(i);
			str1= ch+str1;
		}
		
		System.out.println("Reverse word: "+ str1);
		 
			
			
		}
		
		
		
	}


