
package estudojframe1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Felipe Romao
 */
public class EstudoJFrame1 {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Testandoo 1, 2, 3");
        
        tela.setSize(150,200);
        JLabel lab1 = new JLabel("Ana beatriz");
        tela.add(lab1);
        
        JButton botao = new JButton("Ana Beatriz");
        tela.add(botao);
        
        tela.setVisible(true);
        
    }
    
}
