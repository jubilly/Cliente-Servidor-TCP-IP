package Redes2017;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteEcho { //enviando e recebendo dados, mas para isso é necessário executar o servidor primeiro

    public static void main(String[] args) throws UnknownHostException, IOException {


        InetAddress end = InetAddress.getLocalHost();
        Socket s = new Socket(end, 9500);
        String texto;
        do{
            Scanner teclado = new Scanner(System.in);
            Scanner entrada = new Scanner(s.getInputStream());

            PrintWriter saida = new PrintWriter(s.getOutputStream(), true);
            System.out.println("Digite um texto: ");
            texto = teclado.nextLine();
            saida.println(texto);
            String txt = entrada.nextLine();
            System.out.println(txt);
        }while(!texto.equals("bye"));
        s.close();
    }
}
