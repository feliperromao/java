
package buttontest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Felipe Romao
 */
public class ButtonFrame extends JFrame {
    JButton btn1,btn2;
    
    public ButtonFrame(){
        super("Testando Botões");
        setLayout(new FlowLayout());
        
        btn1 = new JButton("OK");
        add(btn1);
        
        Icon bug1 = new ImageIcon(getClass().getResource("bug1.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.gif"));
        
        btn2 = new JButton("Bem Vindo!", bug1);
        btn2.setRolloverIcon(bug2);
        
        add(btn2);
        
        PegaBotao handler = new PegaBotao();
        
        btn1.addActionListener(handler);
        btn2.addActionListener(handler);
        
    }
    
    public class PegaBotao implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("Você clicou no botão '%s'", e.getActionCommand()));
        }
            
    }
}
