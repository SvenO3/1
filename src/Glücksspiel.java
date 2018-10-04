import java.util.Scanner;

public class Glücksspiel {

	public static void main(String[] args){
		boolean Geschlecht = false;
		String Name = "Oehler";
		int Alter = 18;
		boolean Geschlecht2 = false;
		String Name2 = "Oehler";
		int Alter2 = 18;
		
		int zahl;
		int zahl2;
		
		Scanner s = new Scanner(System.in);
		
		if (Alter<18){
			System.out.println("Hallo " + Name);
			System.out.print("Gib deine Zahl ein ");
			zahl = s.nextInt();
		}
		else{
				if(Geschlecht){
					System.out.println("Liebe Frau " + Name);
					System.out.print("Geben sie ihre Zahl ein ");
					zahl = s.nextInt();
				}
				else{
					System.out.println("Lieber Herr " + Name);
					System.out.print("Geben sie ihre Zahl ein ");
					zahl = s.nextInt();
				}
		}
		
		if (Alter2<18){
			System.out.println("Hallo " + Name2);
			System.out.print("Gib deine Zahl ein ");
			zahl2 = s.nextInt();
		}
		else{
				if(Geschlecht2){
					System.out.println("Liebe Frau " + Name2);
					System.out.print("Geben sie ihre Zahl ein ");
					zahl2 = s.nextInt();
				}
				else{
					System.out.println("Lieber Herr " + Name2);
					System.out.print("Geben sie ihre Zahl ein ");
					zahl2 = s.nextInt();
				}
		}
		
		
		double a = Math.random();
		a=a*100;
		int b = (int) (a);
		
		zahl = zahl - b;
		
		
		
		
		//if (a<=0.42){
			//System.out.println("verloren");
		//}
		//else{
			//System.out.println("gewonnen");
		//}
	}

}


