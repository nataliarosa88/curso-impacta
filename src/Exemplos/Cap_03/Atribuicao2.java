package Exemplos.Cap_03;

public class Atribuicao2 {
	public static void main(String args[]){
		// atribui o valor 3 para a variavel x
		int x = 3;
		System.out.println("x = " + x);
		// a vari�vel y recebe a vari�vel x
		int y = x;
		System.out.println("y = " + y);
		y = 5;
		System.out.println("y = " + y);
	}
}
