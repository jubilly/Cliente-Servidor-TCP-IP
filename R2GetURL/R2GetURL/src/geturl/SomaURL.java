package geturl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class SomaURL {

    public static void main(String[] args){
        try {
            URL somaURL = new URL ("http://localhost/soma.php?n1=4&n2=8");
            Scanner entrada = new Scanner(somaURL.openStream());
            while (entrada.hasNext())
                System.out.println(entrada.nextLine());
                    
        } catch (MalformedURLException ex) {
            System.out.println("Erro!!");
        } catch (IOException ex) {
           System.out.println("Erro!!");
        }
        
    }
}
