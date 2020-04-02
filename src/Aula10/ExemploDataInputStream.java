package Aula10;

import java.io.*;

public class ExemploDataInputStream {

    public static void main(String[] args) throws IOException {

        DataOutputStream DOS = new DataOutputStream(new FileOutputStream("C:\\Users\\Natalia\\Desktop\\natalia\\natalia\\curso-impacta\\JavaProgrammer\\Laboratórios\\Cap_16\\exemplooutputstream.txt"));
        DOS.writeUTF("Impacta Treinamentos");
        DataInputStream DIS = new DataInputStream(new FileInputStream("C:\\Users\\Natalia\\Desktop\\natalia\\natalia\\curso-impacta\\JavaProgrammer\\Laboratórios\\Cap_16\\exemplooutputstream.txt"));
        while(DIS.available() > 0){
            String x = DIS.readUTF();
            System.out.println(x);
        }
    }


}
