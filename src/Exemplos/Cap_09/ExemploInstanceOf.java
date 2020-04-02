package Exemplos.Cap_09;

public class ExemploInstanceOf {
	public static void main(String args[]){
		String a = "teste";
		if(a instanceof String){
			System.out.println("A vari�vel a � uma String.");
		}
		else{
			System.out.println("A vari�vel a n�o � uma String.");
		}
	}
}
