package Aula10;

import java.io.File;
import java.io.IOException;

public class ManipulaArquivo {

    public static void main(String[] args) {

        File arquivo = new File("C:\\Users\\Natalia\\Desktop\\natalia\\natalia\\curso-impacta\\JavaProgrammer\\Laboratórios\\Cap_16\\teste.txt");
        try {
            if (arquivo.createNewFile()) {
                System.out.println("O arquivo foi criado");
            } else {
                System.out.println("O arquivo já existe");
            }
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
