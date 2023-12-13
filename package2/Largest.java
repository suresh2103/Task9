package package2;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=67;
		int n2=88;
		int n3=93;
		
		if(n1>=n2 && n1>=n3) {
			
			System.out.println(n1 + "is the Largest number.");
		}
		
		else if (n2>= n3 && n2>=n1) {
			
			System.out.println(n2 + "is the Largest number.");
		}
			
		else
			
			System.out.println(n3 + "is the Largest number.");
		

	}

}
