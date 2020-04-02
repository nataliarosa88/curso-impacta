package Exemplos.Cap_05;

public class Exemplo1Atribuicao {
	public static void main(String args[]){
		
		Pessoa joao = new Pessoa();
		Pessoa maria = new Pessoa();
		
		joao.sexo = 'M';
		joao.idade = 45;
		
		maria.sexo = 'F';
		maria.idade = 17;
		
		joao = maria; // atribui��o realizada
		// as vari�veis joao e maria fazem refer�ncia ao mesmo objeto
		System.out.println("Jo�o sexo = " + joao.sexo);
		System.out.println("Jo�o idade = " + joao.idade);
	}
}
