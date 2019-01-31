import java.util.Scanner;

public class DigiXTHREE {
	 public static void main(String args[]) {	
		 
		 DigiX();      // Hannah supposed to be hannah
	 	}	
	 
	 	 static void DigiX() {
	 		 
		 while(true) {
			 
		 String reverese ="";
		 
		 System.out.println("Enter string to check palindrome: ");
		 Scanner test = new Scanner(System.in);
		 String original = test.nextLine();
		 
		 for(int i = original.length() - 1 ; i>=0; i--) {
			 
			 reverese = reverese+original.charAt(i);
		 }
		 
		 if(original.equals(reverese)) {
			 
			 System.out.println("true");
		 }
		 else {
				 
			 System.out.println("false");		
		    }
		}	 
	}	
}
