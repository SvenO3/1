import java.util.Scanner;

public class Glücksspiel {

	public static void main(String[] args){
		boolean Geschlecht = false;
		String Name = "Oehler";
		int Alter = 18;
		boolean Geschlecht2 = false;
		String Name2 = "Sven";
		int Alter2 = 16;
		
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
		s.close();
		//System.out.println("");
		
		double a = Math.random();
		a=a*100;
		int b = (int) (a);
		
		System.out.println(b);
		
		zahl = zahl - b;
		if(zahl<0){
			zahl=zahl*-1;
		}
		
		zahl2 = zahl2 - b;
		if(zahl2<0){
			zahl2=zahl2*-1;
		}
		
		if(zahl<zahl2){
			if (Alter<18){
				System.out.print(Name);
			}
			else{
				if(Geschlecht){
					System.out.print("Frau " + Name);
				}
				else{
					System.out.print("Herr " + Name);
				}
			}
		}
		
		if(zahl>zahl2){
			if (Alter2<18){
				System.out.print(Name2);
			}
			else{
				if(Geschlecht2){
					System.out.print("Frau " + Name2);
				}
				else{
					System.out.print("Herr " + Name2);
				}
			}
		}
		
		System.out.print(" hat gewonnen");
		//if (a<=0.42){
			//System.out.println("verloren");
		//}
		//else{
			//System.out.println("gewonnen");
		//}
	}

}


