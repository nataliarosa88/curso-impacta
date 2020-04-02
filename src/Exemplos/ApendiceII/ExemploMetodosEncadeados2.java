package Exemplos.ApendiceII;

public class ExemploMetodosEncadeados2 {
	public static void main(String args[]){
		String a = "Pessoa F�sica";
		String b = a.concat(" Jur�dica").toUpperCase().substring(7);
		System.out.println(b);
	}
}
