package Aula10;
import java.io.*;

public class ExemploWriter {
    public static void main(String[] args) throws IOException {
        File arquivo = new File("C:\\Users\\Natalia\\Desktop\\natalia\\natalia\\curso-impacta\\JavaProgrammer\\Laboratórios\\Cap_16\\ExemploWriter.txt");
        Writer w = new FileWriter(arquivo);
        w.write("Empresa 1" + "\n");
        w.write("Empresa 2" + "\n");
        w.write("Empresa 3" + "\n");
        w.flush();
        w.close();
        System.out.println("arquivo salvo");


    }
}
