package Laboratórios.Cap_08;

public class Cap8_Lab2 {

    public static void main(String[] args) {
        
        if (args.length > 0) {

            int soma = 0;
            String texto = "";

            for (int i = 0; i < args.length; i++) {
                soma += Integer.parseInt(args[i]);
                texto += args[i] + " ";
            }

            double media = soma / args.length;
            
            System.out.println("A m�dia das idades:");
            System.out.println(texto);
            System.out.println("� de : " + media + " anos.");
            
        } else {
            System.out.println("Entre com valores v�lidos para as idades");
        }
    }
}
