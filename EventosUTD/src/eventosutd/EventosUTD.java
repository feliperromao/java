
package eventosutd;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class EventosUTD implements ActionListener {
    
    private JButton btn;
    
    public void janela(){
        JFrame frame = new JFrame("Eventos");
        btn = new JButton();
        
        //Registra o Evento
        btn.addActionListener(this);
        
        frame.getContentPane().add(btn);
        frame.setSize(250,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        btn.setText("Clicou no botão");
        btn.setFont(new Font("SansSerif", Font.BOLD, 16));
    }
    
    public static void main(String[] args) {
        EventosUTD event = new EventosUTD();
        event.janela();
    }
    
}
