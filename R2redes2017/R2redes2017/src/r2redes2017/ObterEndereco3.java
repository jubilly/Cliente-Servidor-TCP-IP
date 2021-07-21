package r2redes2017;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ObterEndereco3 {
        
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome ");
        String nome = teclado.next();
        
        
          try {
            InetAddress endereco [] = InetAddress.getAllByName(nome);
            for(InetAddress end : endereco)
                System.out.println(end.getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(ObterEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
