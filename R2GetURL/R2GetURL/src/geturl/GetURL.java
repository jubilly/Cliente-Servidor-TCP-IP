package geturl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetURL {

    public static void main(String[] args) {
        
        try {
            System.out.println("Digite a URL");
            Scanner teclado = new Scanner(System.in);
            String nome = teclado.next();
            URL end = new URL(nome);
            Scanner entrada = new Scanner(end.openStream());
            while (entrada.hasNext()) {
                String msg = entrada.nextLine();
                System.out.println(msg);
                
            }
        } catch (MalformedURLException ex) {
             System.out.println("URL mal formada!");
        } catch (IOException ex) {
            System.out.println("Nao foi possivel connectar");
        }
    }
    
}
