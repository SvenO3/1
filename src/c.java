import java.util.Scanner;

public class c {

	public static void main(String[] args){ 

		Scanner eingabeZahl = new Scanner(System.in);
		int a = eingabeZahl.nextInt();
		int b = eingabeZahl.nextInt();
		int c=0;
		int d=0;
		
		for(int i=a; i<b+1; i++){
		c=d;
		d=i+c;
		}
		System.out.println(d);
	}

}
