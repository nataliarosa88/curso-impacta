package Exemplos.Cap_15;

import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {

    public static void main(String[] args) {

        List<String> paises = new ArrayList<>();

        paises.add("Brasil");
        paises.add("Portugal");
        paises.add("Estados Unidos");
        paises.add("Fran�a");
        paises.add("Inglaterra");
        paises.add(2, "It�lia");

        System.out.println("Pa�ses na ordem original:");
        paises.forEach(curso -> System.out.println(" - " + curso));

        System.out.println("==============================");
        
        /* Verifica se esta lista possui o String "Estados Unidos" */
        System.out.println(paises.contains("Estados Unidos"));

        /* Imprime o item na posi��o 2 */
        System.out.println(paises.get(2));

        /* Imprime o tamanho desta lista */
        System.out.println(paises.size());

        /* Imprime em que posi��o da lista est� a "Fran�a" */
        System.out.println(paises.indexOf("Fran�a"));

        /* Substitui todos os elementos pelo seu conte�do em mai�sculo */
        paises.replaceAll(s -> s.toUpperCase());

        /* Reordena todo a lista utilizando a ordem natural de Strings */
        paises.sort((x, y) -> x.compareTo(y));

        System.out.println("==============================");
        
        System.out.println("Pa�ses ordenados e em mai�sculo:");
        paises.forEach(curso -> System.out.println(" - " + curso));
    }
}
