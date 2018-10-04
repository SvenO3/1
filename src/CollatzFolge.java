
public class CollatzFolge {

		public static void main(String[] args) {
			
			for(int i = 2;i<=100;i++){ //i wird von 2 bis 100 hoch gezählt
		int zahl = i;
		System.out.print("zahl = " +i+" : ");
		while(zahl>1){  //solange zahl größer ist als 1
			if(zahl%2 != 0){ //wenn beim Teilen durch 2 der Rest nicht 0 ist 
				zahl = zahl*3+1; //
			}
			else{
				zahl = zahl/2;
			}
			System.out.print(zahl+"  ");
		}
		System.out.println("  ");

		}
		}



}
