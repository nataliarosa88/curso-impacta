package Exemplos.Cap_14;

public class Executando1 {

    public static void main(String[] args) {

        ExemploFuncional1 funcao = (n, i, s) -> System.out.println(
            "Parab�ns " + n.toUpperCase() +
            " pelos seus " + i +
            " anos de vida. Seu novo sal�rio �: " + s);
        
        funcao.exibeDados("Manuel", 45, 5500.15);
    }
}
