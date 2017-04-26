
package eventosdeclick;

import javax.swing.JFrame;

public class EventosDeClick {

    
    public static void main(String[] args) {
        JanelaClickEventos janela = new JanelaClickEventos();
        janela.setSize(150, 150);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
}
