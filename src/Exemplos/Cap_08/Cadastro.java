package Exemplos.Cap_08;

public class Cadastro {
	public static void main(String args[]){
		
		Pessoa pessoas[] = new Pessoa[2]; // declara que pessoas vai armazenar 2 elementos do tipo Pessoa
		pessoas[0] = new Pessoa(); // cria inst�ncia para ocorr�ncia 0
		pessoas[0].altura = 1.68;
		pessoas[0].peso = 55;
		
		pessoas[1] = new Pessoa(); // cria inst�ncia para ocorr�ncia 1
		pessoas[1].altura = 1.77;
		pessoas[1].peso = 60;
		
	}
}
