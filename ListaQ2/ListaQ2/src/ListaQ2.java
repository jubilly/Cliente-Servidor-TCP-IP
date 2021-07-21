import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ListaQ2 {

    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress endereco = InetAddress.getByName("www.facebook.com");
        int timeout = 30000;
       // System.out.println(endereco.toString());
        if (endereco.isReachable(timeout))
            System.out.println("Funcionou!");
        else
            System.out.println("Não conectou");
        
    }
}
