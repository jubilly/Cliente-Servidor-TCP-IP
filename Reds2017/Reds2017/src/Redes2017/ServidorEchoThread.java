package Redes2017;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorEchoThread {

    public static void main(String[] args) throws IOException {
        
        ServerSocket servidor = new ServerSocket(9500);
        while (true) {
            
            System.out.println("Servidor aguardando cliente...");
            Socket s = servidor.accept();
            Worker t = new Worker(s);
            t.start();
            System.out.println(s);
        }
    }
}

class Worker extends Thread{

        private Socket s;
        public Worker(Socket s){
            this.s=s;
        }
        @Override
        public void run()
        {
            Scanner entrada;
            PrintWriter saida;
            String txt;
            try {
                 entrada = new Scanner(s.getInputStream());
                 saida = new PrintWriter(s.getOutputStream(), true);//saida na rede
                    do{
                        txt = entrada.nextLine();
                        saida.println(txt);//devolve a string
                    }while(!txt.equals("bye"));
            s.close();
            } catch (IOException ex) {
                
            }
        }
}