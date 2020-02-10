package cap5lab1;

public class Cap5_Lab1 {

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setNome("João");
		func.setSobrenome("Pedro");
		func.setCargo("Programador");
		func.setSalario(4000.0);
		
		System.out.println("Nome: " + func.getNome());
		System.out.println("Sobrenome: " + func.getSobrenome());
		System.out.println("Cargo: " + func.getCargo());
		System.out.println("Salário: " + func.getSalario());
	
	}

}
