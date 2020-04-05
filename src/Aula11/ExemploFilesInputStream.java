package Aula11;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.InputStream;
import java.io.IOException;


public class ExemploFilesInputStream {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Path arquivo = Paths.get("C:/TEMP","ARQUIVOTESTEINPUTSTREAM.TXT");
        int valor;
        try (InputStream objInputStream = Files.newInputStream(arquivo)){
            while ((valor = objInputStream.read()) != -1) {
                System.out.print((char) valor);

            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}