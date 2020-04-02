package Aula10;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExemploPath {

    public static void main(String args[]){

        Path poema = Paths.get("resources\\poema.txt");

        System.out.println(poema);

        System.out.println(poema.toAbsolutePath());

        System.out.println(poema.getFileName());

        System.out.println(poema.getParent().toAbsolutePath());

    }
}
