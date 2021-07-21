import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;

public class Servidor {

    public static void main(String[] args) throws IOException {
        //Criando conexão 
        ServerSocket servidor = new ServerSocket(30000);//responsável por esperar a conexão do cliente; responsável por atender pedidos via rede e em determinada porta; Espera conexões na porta 30000
        //O método accept() escuta uma conexão e aceita se alguma for encontrada. 
        //O accept() bloqueia todo o restante até que uma conexão seja feita, ele fica em espera aguardando que alguém conecte. 
        //Quando alguma conexão é aceita ele retorna um objeto Socket, que veremos mais à frente.
        while (true) {
            System.out.println("Servidor aguardando cliente...");
            Socket s = servidor.accept();
            Date d = new Date();
            String txt;
            Scanner entrada = new Scanner(s.getInputStream());//le os dados enviados pelo cliente
            int contarVogais = 0;
            txt = entrada.nextLine().toLowerCase();//recebe a string
            for (int i = 0; i < txt.length(); i++) {
                char c = txt.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    contarVogais++;
                }
            }
            PrintWriter saida = new PrintWriter(s.getOutputStream(), true);//saida na rede
            saida.println("A palavra e " + txt + "\tO numero de vogais dela e " + contarVogais);
            System.out.println("A data: " + d.toString());
            System.out.println("O endereco de IP e a porta do cliente: " + s.toString());
            s.close();
        }
    }

}
