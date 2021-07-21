/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package r2redes2017;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dj_gu
 */
public class ObterEndereco {
    public static void main(String[] args) {
        
        try {
            InetAddress endereco = InetAddress.getLocalHost();
            System.out.println(endereco);
        } catch (UnknownHostException ex) {
            Logger.getLogger(ObterEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
