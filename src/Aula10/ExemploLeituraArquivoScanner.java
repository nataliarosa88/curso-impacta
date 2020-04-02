package Aula10;

import java.io.*;
import java.util.*;

public class ExemploLeituraArquivoScanner {

    public static void main(String[] args) throws FileNotFoundException{

        File arquivo = new File("C:\\Users\\Natalia\\Desktop\\natalia\\natalia\\curso-impacta\\JavaProgrammer\\Laboratórios\\Cap_16\\exemploarquivoscanner.txt");
        Scanner scan = new Scanner(arquivo);
        int numeroLinha = 1;
        while(scan.hasNextLine()){
            String linha = scan.nextLine();
            System.out.println("linha " + numeroLinha + " : " + linha);
            numeroLinha++;

        }

    }


}
