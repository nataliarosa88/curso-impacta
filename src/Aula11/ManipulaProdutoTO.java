package Aula11;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class ManipulaProdutoTO {

    public static void main (String args[]) throws IOException {
        ProdutoTO obj1 = new ProdutoTO(1,"PAPEL SULFITE",23.80F,"2526755373737");
        ProdutoTO obj2 = new ProdutoTO(2,"CANETA",1.60F,"908980808080");
        ProdutoTO obj3 = new ProdutoTO(3,"LAPIS",0.80F,"789799766666");

        Path arquivo = Paths.get("arqProduto.txt");

        try {
            arquivo = Files.createFile(arquivo);
            Files.write(arquivo,obj1.toString().getBytes(),StandardOpenOption.APPEND);
            Files.write(arquivo,obj2.toString().getBytes(),StandardOpenOption.APPEND);
            Files.write(arquivo,obj3.toString().getBytes(),StandardOpenOption.APPEND);
        }
        catch (FileAlreadyExistsException e ) {
            Files.write(arquivo,obj1.toString().getBytes(),StandardOpenOption.APPEND);
            Files.write(arquivo,obj2.toString().getBytes(),StandardOpenOption.APPEND);
            Files.write(arquivo,obj3.toString().getBytes(),StandardOpenOption.APPEND);

        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}