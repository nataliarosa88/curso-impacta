package Exemplos.Cap_08;

public class ExemploAcessoInvalido {
	public static void main(String args[]){
		
		int numeros[] = new int[6];
		numeros[6] = 3; // exce��o em tempo de execu��o.
						// o �ltimo elemento est� na posi��o de �ndice 5
		
		int valores[] = new int[6];
		int indice = -5;
		valores[indice] = 3; // exce��o em tempo de execu��o.
							 // indice � um n�mero negativo
	}
}
