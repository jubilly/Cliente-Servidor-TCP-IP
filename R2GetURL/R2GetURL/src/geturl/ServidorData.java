package geturl;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorData {

    public static void main(String[] args) {
        try {

            ServerSocket servidr = new ServerSocket(7000);
            while (true) {
                System.out.println("servidor aguardando conexao...");
                try (Socket socket = servidr.accept()) {
                    Date data = new Date();
                    System.out.println(data.toInstant() + " " + socket);
                    PrintWriter saida = new PrintWriter(socket.getOutputStream(), true);
                    saida.println(data.toString());
                }
            }
        } catch (IOException ex) {
            System.out.println("porta invalida");
        }
    }
}
