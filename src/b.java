import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner eingabeAdresse = new Scanner(System.in);
		Scanner eingabeAnzahl = new Scanner(System.in);
		System.out.println("Name:");
		String a = eingabeAdresse.nextLine();
		System.out.println("Straﬂe:");		
		String b = eingabeAdresse.nextLine();
		System.out.println("Postleitzahl:");
		String c = eingabeAdresse.nextLine();
		System.out.println("Anzahl:");
		Double d = eingabeAnzahl.nextDouble();
		
		
	for(int i=0; i<d; i++){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
	}
}
}
