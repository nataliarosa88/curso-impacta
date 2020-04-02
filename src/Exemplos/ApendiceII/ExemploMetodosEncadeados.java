package Exemplos.ApendiceII;

public class ExemploMetodosEncadeados {
	public static void main(String args[]){
		String x = "teste";
		x = x.concat(" final").toUpperCase().replace('E', 'x'); // m�todos encadeados
		System.out.println("x = " + x);
	}
}
