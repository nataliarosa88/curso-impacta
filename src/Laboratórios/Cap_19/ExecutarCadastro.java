package Laboratórios.Cap_19;

import java.util.Scanner;

public class ExecutarCadastro {

    public static void main(String[] args) {

        FuncionarioDAO dao = new FuncionarioDAO();
        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Nome      : ");
            String nome = scanner.nextLine();

            System.out.print("Salario   : ");
            double salario = Double.parseDouble(scanner.nextLine());

            System.out.print("Cod. Cargo: ");
            int cargoId = Integer.parseInt(scanner.nextLine());

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(nome);
            funcionario.setSalario(salario);
            funcionario.setCargoId(cargoId);

            dao.persist(funcionario);
            System.out.println("Funcion�rio cadastrado com sucesso.");

        } catch (NumberFormatException e) {
            System.out.println("Dados inv�lidos. Tente novamente.");
        } catch (DAOException e) {
            System.out.println("Falha ao salvar dados do funcion�rio.");
        } finally {
            scanner.close();
        }
    }
}
