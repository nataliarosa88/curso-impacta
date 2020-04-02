package Exemplos.Cap_09;

public class Zoologico {
	public static void main(String args[]){
		Animal a = new Animal(); // a est� se referenciando � um objeto da classe base Animal
		a.comer(); // aqui ser� executado o m�todo comer da classe base Animal
		
		Zebra z = new Zebra();
		a = z; // a passa a referenciar um objeto da classe derivada Zebra
		a.comer(); // aqui ser� executado o m�todo comer da classe derivada Zebra
		
		a = new Leao(); // a passar a referenciar o objeto da classe derivada Leao
		a.comer(); // aqui ser� executado o m�todo comer da classe derivada Leao
	}
}
