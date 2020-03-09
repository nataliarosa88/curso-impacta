package Aula7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ExercicioIdade {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Calendar cal = GregorianCalendar.getInstance();
        int ano_atual = cal.get(Calendar.YEAR);
        int ano_nascimento;


        System.out.println("Digite o ano de nascimento: ");
        ano_nascimento = entrada.nextInt();
        int idade = ano_atual - ano_nascimento;

        System.out.printf("Você tem " + idade);

    }
}
