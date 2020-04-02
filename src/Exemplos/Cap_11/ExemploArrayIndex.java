package Exemplos.Cap_11;

public class ExemploArrayIndex {

    public static void main(String[] args) {

        try {

            double[] salario = { 1200.5, 630.0, 950.15 };
            double s = salario[3];

            System.out.println("Sal�rio atual: " + s);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("N�mero inv�lido.");
            e.printStackTrace();
        }
    }
}
