package Exemplos.ApendiceII;

public class ExemploInalterabilidadeString {
	public static void main(String args[]){
		String a = "Aluno";
		a.concat(" M�dulo Avan�ado");
		System.out.println("a = " + a); // o resultado � a = Aluno
		a.toUpperCase();
		System.out.println("a = " + a); // o resultado ainda � a = Aluno
		a.replace('A', 'e');
		System.out.println("a = " + a); // o resultado ainda � a = Aluno
	}
}
