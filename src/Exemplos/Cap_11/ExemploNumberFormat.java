package Exemplos.Cap_11;

public class ExemploNumberFormat {

    public static void main(String[] args) {

        try {

            String texto = "10xpt23";
            int idade = Integer.parseInt(texto);

            System.out.println("Parab�ns pelos seus " + idade + " anos de idade.");

        } catch (NumberFormatException e) {
            System.out.println("N�mero inv�lido.");
            e.printStackTrace();
        }
    }
}
