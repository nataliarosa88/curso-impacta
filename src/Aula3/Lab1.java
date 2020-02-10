public class Lab1 {
	
	public static void main (String args[]) {
	
		int numero =  Integer.parseInt (args[0]);
		int divisoes = 0;
		
		for (int i = 1; i <= numero; i++){
				if (numero % i == 0) {
					divisoes++;
			}
			
			if (divisoes > 2 || numero == 0 || numero == 1) {
				System.out.println(numero + " não é número primo");
			}
			else{
				System.out.println (numero + " é um número primo ");
			}	
		
		}
	}
}