package Aula10;

import java.util.*;

public class ExemploScanner {

    public static void main(String[] args) {
        String x = "Bem vindos ao treinamento de java da Impacta Tecnologia";
        Scanner scan = new Scanner(x);
        System.out.println(scan.hasNext());
        System.out.println(scan.nextLine());
        scan.close();
        Scanner teclado = new Scanner(System.in); //associando scanner ao teclado
        System.out.println("Informe o nome");
        System.out.println("Nome: " + teclado.next());
        System.out.println("Informe a idade");
        System.out.println("Idade: " + teclado.next());
        System.out.println("Informe a cidade");
        System.out.println("Cidade: " + teclado.next());

    }
}
