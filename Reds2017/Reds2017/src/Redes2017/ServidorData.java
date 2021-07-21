
package Redes2017;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServidorData {
        public static void main(String[] args) throws IOException {
            
            ServerSocket servidor = new ServerSocket(9000);
            System.out.println("Servidor aguardando conexao...");
            Socket s = servidor.accept();
            Date d = new Date();
            PrintWriter saida = new PrintWriter(s.getOutputStream(), true);// Assim que tiver dados, o true permite que esses dados sejam enviados
            saida.println(d.toString());
            s.close();
            servidor.close();
    }
        
}
