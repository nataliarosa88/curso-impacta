package Aula11;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestaOperacoesFiles {

    public static void main(String[] args) {

        Path arquivoOrigem = Paths.get("temporario.txt");
        Path arquivoDestino = Paths.get("D:temporario_backup.txt");
        try {
            Files.copy(arquivoOrigem, arquivoDestino,StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e ){
            System.out.print("Erro na copia do arquivo");
        }
        System.out.println(arquivoOrigem.toAbsolutePath());
        System.out.println(arquivoOrigem.getFileName());
        System.out.println(arquivoOrigem.compareTo(arquivoDestino));

        Path leituraArquivo = Paths.get("temporario.txt");
        Charset cs = Charset.forName("ISO-8859-1");
        try {
            //List<String> linhasArquivo = Files.readAllLines(leituraArquivo,cs);
            List<String> linhasArquivo = Files.readAllLines(leituraArquivo,cs);

            for (String linha : linhasArquivo) {
                System.out.println(linha);

            }

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        String insereStringArquivo = "Valor Inserido no arquivo\n";
        try {
            Files.write(arquivoOrigem, insereStringArquivo.getBytes(),StandardOpenOption.APPEND);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
