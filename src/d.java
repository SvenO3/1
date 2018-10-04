import java.util.Scanner;

public class d {
	public static void main(String[] args){ 

		Scanner eingabeZahl = new Scanner(System.in);
		int a = eingabeZahl.nextInt();
		String b = eingabeZahl.next();
		eingabeZahl.close();
		
		for(int i=0; i<a+1; i++){
			
		
		  for(int j=1; j<i+1; j++){
			  System.out.print(b);
		  }
		  System.out.println();
	    }
	}
}
