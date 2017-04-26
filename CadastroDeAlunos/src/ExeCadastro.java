
import javax.swing.JFrame;



/**
 *
 * @author Felipe Romao
 */
public class ExeCadastro {
    public static void main(String[] args){
        TelaCadastro tela = new TelaCadastro();
        tela.setSize(285,470);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
