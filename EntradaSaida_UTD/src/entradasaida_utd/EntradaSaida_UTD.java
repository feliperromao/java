
package entradasaida_utd;

import javax.swing.JFrame;

public class EntradaSaida_UTD {

    public static void main (String[] args) {
        Tela janela = new Tela();
        janela.setSize(305,180);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false);
        janela.setVisible(true);
    }  
}
