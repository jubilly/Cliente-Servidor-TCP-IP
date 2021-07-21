
package Redes2017;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SomaURL {
    public static void main(String[] args) {
        try{
            URL somaurl = new URL("http://localhost/soma.php?n1=4&n2=8");
            Scanner entrada = new Scanner(somaurl.openStream());
            while(entrada.hasNext())//Enquanto tem dados, imprime na tela
                System.out.println(entrada.nextLine());
        }catch(MalformedURLException ex){
            System.out.println("Erro!");
        } catch (IOException ex) { //Quando não consegue abrir a conexão
            System.out.println("Erro!");;
        }
    }
}
