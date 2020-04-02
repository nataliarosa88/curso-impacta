package Exemplos.Cap_06;

public class ExemploFluxoExecucaoComandos {
	/*** defini��o do m�todo executarTareda ***/
	static void executarTarefa(){
		System.out.println("Executando uma tarefa");
	}
	/*** t�rmino da defini��o ***/
	
	public static void main(String args[]){
		System.out.println("Executando o primeiro comando");
		System.out.println("Executando o segundo comando");
		System.out.println(" . ");
		System.out.println(" . ");
		System.out.println(" . ");
		
		executarTarefa();
		
		System.out.println("Sou o pr�ximo comando que segue a chamada do m�todo");
		System.out.println(" . ");
		System.out.println(" . ");
		System.out.println(" . ");
		System.out.println("Executando o �ltimo comando");
	}
}
