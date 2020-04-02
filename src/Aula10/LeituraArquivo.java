package Aula10;

import java.io.*;

public class LeituraArquivo {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File arquivo = new File("C:\\Users\\Natalia\\Desktop\\natalia\\natalia\\curso-impacta\\JavaProgrammer\\Laboratórios\\Cap_16\\leitura.txt");
        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String leitura;
        while((leitura = br.readLine()) !=null){
            System.out.println(leitura);
        }

    }
}
