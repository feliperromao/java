
package eventosdeclick;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class JanelaClickEventos extends JFrame{
    JButton btn1;
    
    public JanelaClickEventos(){
        btn1 = new JButton("Botão 1");
        add(btn1);
        
        CapEventButton handler = new CapEventButton();
        btn1.addActionListener(handler);
    }
    private class CapEventButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            btn1.setText("Voce clicou!");
        }
    }
}
