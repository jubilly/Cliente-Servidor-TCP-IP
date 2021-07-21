
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(6100);
        Socket s = servidor.accept();
        Scanner entrada = new Scanner(s.getInputStream());
        String m = entrada.nextLine();
        Message obj = new ImpMessage(m);
        ObjectOutputStream saida = new ObjectOutputStream(s.getOutputStream());
        saida.writeObject(obj);
        //saida.flush();
        s.close();
        servidor.close();
    }
}
