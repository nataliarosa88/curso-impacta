package Exemplos.Cap_06;

public class MetodoEstatico {
	public static void main(String args[]){
		Classe2.metodoEstatico(); // N�o precisa ser instanciada
		new Classe2().metodoNaoEstatico(); // Est� sendo instanciada
	}
}
