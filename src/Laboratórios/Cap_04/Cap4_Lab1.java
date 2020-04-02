package Laboratórios.Cap_04;

public class Cap4_Lab1 {
	public static void main (String args[]){
		int numero = 3;
		int divisoes = 0;

		for(int i = 1; i <= numero; i++){
			if(numero % i == 0)
				divisoes++;
		}
		
		if(divisoes > 2 || numero == 0 || numero == 1)
			System.out.println(numero + " n�o � um n�mero primo");
		else
			System.out.println(numero + " � um n�mero primo");
	}
}
