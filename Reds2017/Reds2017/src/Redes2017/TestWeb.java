
package Redes2017;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestWeb {
    
    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o nome da maquina ");
        nome = teclado.nextLine();
        try {
           InetAddress end = InetAddress.getByName("www.fainor.com.br");
            Socket s = new Socket(end, 80);
            System.out.println("Servidor web ativo!");
            s.close();
        } catch (UnknownHostException ex) {
            System.out.println("Erro");
        } catch (IOException ex) {
            System.out.println("Não ha servidor web");
        }
        
    }
    
}
