
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Cliente {
    public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String txt = teclado.nextLine();
        InetAddress end = InetAddress.getLocalHost();
        Socket s = new Socket(end, 6100);
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);
        saida.println(txt);
        ObjectInputStream entrada = new ObjectInputStream(s.getInputStream());
        Message m = (Message) entrada.readObject();
        System.out.println("Digitos: "+ m.getDigitCount());
        System.out.println("Cacaracteres: "+ m.getCaracteresCount());
        s.close();
    }
}
