package Aula10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Cap16_Lab2 {

    public static final String PASTA_ORIGEM = "C:\\Users\\Natalia\\Desktop\\natalia\\natalia\\curso-impacta\\JavaProgrammer\\Laboratórios\\Cap_16\\documentos";
    public static final String PASTA_BACKUP = "C:\\Users\\Natalia\\Desktop\\natalia\\natalia\\curso-impacta\\JavaProgrammer\\Laboratórios\\Cap_16\\documentos_backup";

    public static void main(String args[]){
        Path origem = Paths.get(PASTA_ORIGEM);
        Path backup = Paths.get(PASTA_BACKUP);

        try{
            if (!Files.exists(backup)){
                System.out.println("O diretório já existe");
            }else{
                Files.createDirectories(backup);
                System.out.println("O diretório foi criado com sucesso!");
            }

            Stream<Path> streamOrigem = Files.list(origem);
            streamOrigem.forEach(p -> {
                try {
                    System.out.println("Copiando arquivo " + p.getFileName());
                    Files.copy(p, backup.resolve(p.getFileName()));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
