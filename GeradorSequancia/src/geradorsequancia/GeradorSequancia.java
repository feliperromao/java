package geradorsequancia;

/**
 *
 * @author Felipe Romao
 */
public class GeradorSequancia {

    public static void main(String[] args) {
        String x[] = {"A","B","C","D","E","F"};
        String y[] = new String[6];
        
        for(int i = 1; i < y.length; i++){
            
            int valor = (int)Math.floor(Math.random()*6);
            String letra = x[valor];
            
            for (int j = 0; j < y.length; j++){
                if(y[j].equals(letra)){
                    
                }
            }
            
        }
        
    }
    
}
