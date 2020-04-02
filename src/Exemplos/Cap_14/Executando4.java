package Exemplos.Cap_14;

public class Executando4 {

    public static void main(String[] args) {

        ExemploFuncional1 funcao = (n, i, s) -> {
            String nomeMaiusculo = n.toUpperCase();
            if (i < 18) {
                System.out.println("Funcionario n�o pode ser menor de idade!");
            } else {
                System.out.println("Funcionario " + nomeMaiusculo
                    + " recebe sal�rio " + s);
            }
        };
        
        funcao.exibeDados("Manuel", 45, 5500.15);
    }
}
