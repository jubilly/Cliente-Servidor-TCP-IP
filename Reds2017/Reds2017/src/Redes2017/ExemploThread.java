package Redes2017;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExemploThread extends Thread {

    private String nome;

    public ExemploThread(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {//o que a Thread fará
        for(int i=1; i<=100; i++){
            try {
                Thread.sleep(100);//A Thread dormirá por 100 milisegundos
            } catch (InterruptedException ex) {
                System.out.println("Erro");
            }
            System.out.println(nome+"="+i);
        }
            
    }
    public static void main(String[] args) {
        ExemploThread t1 = new ExemploThread("Thread A");
        ExemploThread t2 = new ExemploThread("Thread B");
        t1.start();//Quando chama o start, ele diz que a Thread está pronta para ser executada chamando o metodo run
        t2.start();
    }
}
