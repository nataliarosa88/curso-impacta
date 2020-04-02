package Aula10;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Cap16_Projeto {

    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);

        Path filmes = Paths.get("C:\\Users\\Natalia\\Desktop\\natalia\\natalia\\curso-impacta\\JavaProgrammer\\Projeto\\Cap16\\fase004-artefatos-projeto\\filmes-imdb.csv");

        String nome = ler.nextLine();

        File objFile = new File(nome);



    }
}