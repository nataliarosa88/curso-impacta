package Exemplos.ApendiceII;

public class Exemplo2ImutabilidadeString {
	public static void main(String args[]){
		String a = "Aluno";
		a = a.concat(" M�dulo Avan�ado"); // a est� sendo atribu�do � nova String
		System.out.println("a = " + a); // o resultado � a = Aluno M�dulo Avan�ado
	}
}
