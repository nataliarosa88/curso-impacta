package Aula11;

import java.io.IOException;
import java.nio.file.*;

public class ManipulaClienteTO {

    public static void main (String args[]) throws IOException{

        ClienteTO obj1 = new ClienteTO(1, "Maria","Av. Brasil, 33", "maria@gmail.com", "1943467466743" );
        ClienteTO obj2 = new ClienteTO(1, "Jose","Av. Portugal, 33", "jose@gmail.com", "197377436473" );
        ClienteTO obj3 = new ClienteTO(1, "Antonio","Av. Estados Unidos, 33", "antonio@gmail.com", "19836543654" );
        ClienteTO obj4 = new ClienteTO(1, "Laura","Av. Espanha, 33", "laura@gmail.com", "1983276636" );
        ClienteTO obj5 = new ClienteTO(1, "Andre","Av. Itália, 33", "andre@gmail.com", "197636436743" );

        gravaCliente(obj1.toString());
        gravaCliente(obj2.toString());
        gravaCliente(obj3.toString());
        gravaCliente(obj4.toString());
        gravaCliente(obj5.toString());

        System.out.println("Clientes foram gravados no arquivo");

    }

    public static void gravaCliente (String cliente)  throws IOException {
        Path arquivo = Paths.get("arqCliente.txt");

        try {
            arquivo = Files.createFile(arquivo);
            Files.write(arquivo, cliente.toString().getBytes(), StandardOpenOption.APPEND);
        } catch (FileAlreadyExistsException e) {
            Files.write(arquivo, cliente.toString().getBytes(), StandardOpenOption.APPEND);
        }
    }
}
