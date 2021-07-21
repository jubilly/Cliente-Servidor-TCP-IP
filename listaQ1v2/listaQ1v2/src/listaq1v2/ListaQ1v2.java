package listaq1v2;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;


public class ListaQ1v2 {

    
    public static void main(String[] args) throws UnknownHostException, SocketException {
       InetAddress teste = InetAddress.getLocalHost();
       NetworkInterface mac = NetworkInterface.getByInetAddress(teste);
        
        
        StringBuilder sb = new StringBuilder();
        byte[] macc = mac.getHardwareAddress();
        
        for (int i = 0; i < mac.getHardwareAddress().length; i++) {
            sb.append(String.format("%02X%s", macc[i], (i < macc.length - 1) ? ":" : ""));
            //System.out.println("\n\n\n\n");
            //System.out.print(" "+macc[i]+":");
        }
       System.out.println("MAC DA PLACA "+ sb);
    }
    
}
