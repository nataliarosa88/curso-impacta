package Exemplos.Cap_05;

public class CadastroDePessoas {

    static Pessoa pes;

    public static void main(String[] args) {

        if (pes == null) {
            System.out.println("A vari�vel ainda n�o foi instanciada.");
            pes = new Pessoa();
            System.out.println("Vari�vel inicializada. Prosseguindo...");
        }

        pes.nome = "Manuel";
        pes.idade = 25;
    }
}
