package Aula10;

import java.io.FileReader;
import java.io.Reader;

public class ExemploReader {
    public static void main(String[] args) {
        try{
            Reader r = new FileReader("C:\\Users\\Natalia\\Desktop\\natalia\\natalia\\curso-impacta\\JavaProgrammer\\Laboratórios\\Cap_16\\ExemploReader.txt");
            int dados = r.read();
            while (dados != -1){
                System.out.print((char) dados);
                dados = r.read();
            }
            r.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
