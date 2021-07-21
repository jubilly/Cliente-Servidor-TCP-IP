
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws UnknownHostException, IOException {

        InetAddress endereco = InetAddress.getLocalHost();//O cliente precisa ter um endereco para que então possa ser criado um socket
        /*Ao contrário da classe ServerSocket que funciona como um Servidor escutando
        o cliente, a classe Socket é o cliente propriamente dito.
         */
        Socket s = new Socket(endereco, 30000);//No modo servidor cliente é necessário um socket para manter o "dialogo" já que eles não se comunicam diretamente
        String texto;//Essa variável precisa ser criada antes do laço, pois caso dentro, não seria possível utiliza-la para condição

        //Lembrando que a classe Scanner e PrintWriter são de alto nível
        //O objeto System.in é o que faz a leitura do que se escreve no teclado
        Scanner inserir_dados = new Scanner(System.in);//Instancea um objeto estatico referente a classe scanner

        // É através deste método getInputStream() que o Servidor (ServerSocket) consegue capturar o que o cliente está enviando. 
        Scanner entrada = new Scanner(s.getInputStream());

        /* O getOutputStream() envia dados para o outro lado da comunicação, neste caso o ServerSocket
             Colocamos o que o usuário está digitando no console na variável “saida” 
            que é do tipo PrintStream, que consequentemente será o que o nosso servidor 
            receberá do outro lado, ou seja, nosso ServerSocket. O true é referente ao */
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);

        System.out.println("Digite um texto: ");//Solicita um texto
        texto = inserir_dados.nextLine();//grava um texto na objeto texto .netLine() Mostra a linha atual do objeto Scanner e avança para a próxima linha
        saida.println(texto);//Retorna o texto digitado para o objeto saida do tipo PrintWriter

        String txt = entrada.nextLine();// cria um objeto string txt associado a classe string que recebera a entrada(scanner)

        System.out.println(txt);//imprime na tela o conteudo do objeto txt

        s.close();//Um método de extrema importância que fecha a conexão atual. Qualquer cliente que esteja conectado será automaticamente desconectado

    }
}
