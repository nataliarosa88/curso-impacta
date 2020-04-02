package Exemplos.Cap_06;

public class UsaCalculadora {
	public static void main(String args[]){
		int s; // defini��o simples de vari�vel
		// cria��o de uma inst�ncia de Calculadora
		Calculadora calc = new Calculadora();
		// atribuindo a 's' a chamada do m�todo somar com dois valores
		s = calc.somar(15, 20);
		// mostra o valor de s na tela
		System.out.println("s = " + s);
	}
}
