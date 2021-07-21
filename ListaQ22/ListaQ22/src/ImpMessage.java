
import java.io.Serializable;


public class ImpMessage implements Message, Serializable {
    
    private String mensagem;
    private int quantDigitos;
    private int quantCaracteres;
    
    public ImpMessage(String Message){ 
        
        this.mensagem = mensagem;
        int  quantd =0;//quantidade de digitos
        for(int i=0; i < mensagem.length(); i++){
            if((mensagem.charAt(i)>= '0')&& (mensagem.charAt(i)<='9'))
            {
                quantd++;
            }
        }
        int  quantc = 0;//quantidade de caracteres
        for(int i=0; i < mensagem.length(); i++){
            if((mensagem.charAt(i)>= 'a')&& (mensagem.charAt(i)<='z'))
            {
                quantc++;
            }
        }
        setCounts(quantc, quantd);
            
    }
    
    @Override
    public void setCounts(int c, int d) {
        quantDigitos =d;
        quantCaracteres =c;
    }

    @Override
    public int getCaracteresCount() {
        return quantCaracteres;
    }

    @Override
    public int getDigitCount() {
        return quantDigitos;
    }
    
}
