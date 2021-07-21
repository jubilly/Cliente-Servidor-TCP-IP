package Redes2017;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServidorEcho {

    public static void main(String[] args) throws IOException {

        ServerSocket servidor = new ServerSocket(9500);
        while (true) {
            System.out.println("Servidor aguardando cliente...");
            Socket s = servidor.accept();
            System.out.println(" O que estou imprimindo: " + s);
            String txt;
            do {
                Scanner entrada = new Scanner(s.getInputStream());//le os dados enviados pelo cliente
                txt = entrada.nextLine();//recebe a string
                PrintWriter saida = new PrintWriter(s.getOutputStream(), true);//saida na rede
                saida.println(txt);//devolve a string 
            } while (!txt.equals("bye"));
            s.close();
        }

    }
}
