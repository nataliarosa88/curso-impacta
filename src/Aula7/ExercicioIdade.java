package Aula7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ExercicioIdade {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Calendar cal = GregorianCalendar.getInstance();
        int ano_atual = cal.get(Calendar.YEAR);
        String ano_nascimento = "123";
        int numeroConvertido;
        numeroConvertido = Integer.parseInt(ano_nascimento);


        System.out.println("Digite o ano de nascimento: ");
        numeroConvertido = entrada.nextInt();
        int idade = ano_atual - numeroConvertido;

        System.out.printf("Você tem " + idade);

    }
}
