package buttonframe2utd;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame2 extends JFrame {
    private JButton ouro;
    private JButton prata;
    
    public ButtonFrame2(){
        super("Ações de click em botões");
        setLayout(new FlowLayout());
        
        ouro = new JButton("Ouro");
        add(ouro);
        
        prata = new JButton("prata");
        add(prata);
        
        ButtonHandler handler =  new ButtonHandler();
        
        ouro.addActionListener(handler);
        prata.addActionListener(handler);
    }
    
    private class ButtonHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ButtonFrame2.this, String.format("Você clicou em: %s", e.getActionCommand()));
        }
        
    }
}
