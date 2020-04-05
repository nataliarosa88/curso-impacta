package Aula11;

public class ExemploThread extends Thread {

    public void run(){
        System.out.println("Algo executando em Segmento");
    }

    public void run(String segmento){
        System.out.println("A String em execução é " + segmento);
    }

}
