
public class fizz_buzz {
	public static void main(String[] args) {
		
		for(int i= 1; i<=1000000;i++){
		 if(d3(i)){
			System.out.print("fizz");
			if(d5(i)){
			
				System.out.print("buzz");				
			}
		  }
			else{
				if(d5(i)){
					System.out.print("buzz");
				}
				  else{
					System.out.print(i);					
				  }
		     }
			System.out.println(" ");				
		}
	}

	public static boolean d3(int i){
		if(i%3==0){
			return true;
		}
		else{return false;}
	}
	public static boolean d5(int i){
		if(i%5==0){
			return true;
		}
		else{return false;}
	}
}
