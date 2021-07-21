/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r2redes2017;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dj_gu
 */
public class ObterEnderecov2 {
    public static void main(String[] args) {
        System.out.println("digite o nome");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.next();
        
        try {
            InetAddress endereco = InetAddress.getByName(nome);
            System.out.println(endereco);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ObterEnderecov2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
                
    }
    
    
    
}
