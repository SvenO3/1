import java.util.Scanner;

public class Wind {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		double kmh = s.nextDouble();
		
		System.out.print(kmh);
		System.out.println(" km/h");
		
		System.out.print("Knoten:");
		double k= kmh*0.539957;
		System.out.println(k);
		
		System.out.print("Beaufort:");
		double b= Math.round(Math.pow((kmh/3.6)/0.836,0.6666666));
		if(b>=12){
		b=12;
		}
		System.out.print(b);
		
		if(b<=0){
		System.out.print(" windstill");
		}
		
		if((b<1.1)&&(b>0.9)){
		System.out.print(" leiser Zug ");
		}
		
		if(b>=12){
		System.out.print(" Orkan");
		}


		}
		
	}

	
