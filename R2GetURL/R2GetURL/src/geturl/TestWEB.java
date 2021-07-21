package geturl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestWEB {

    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o URL:");
        nome = teclado.nextLine();
        try {
            InetAddress end = InetAddress.getByName(nome);
            Socket s = new Socket(end,80); 
            System.out.println("servidor web ativo!");
        } catch (UnknownHostException ex) {
            System.out.println("Erro!!");
        } catch (IOException ex) {
           System.out.println("não ha servidor web!");
        }
  
    }
}
