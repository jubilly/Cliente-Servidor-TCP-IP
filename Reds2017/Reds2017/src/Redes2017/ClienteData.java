
package Redes2017;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClienteData {
    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress end = InetAddress.getLocalHost();
        Socket s = new Socket(end,9000); // porta 13 data e hora
        Scanner entrada = new Scanner(s.getInputStream());
        String msg = entrada.nextLine();
        System.out.println(msg);
        s.close();
    }
}
