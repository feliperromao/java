
package checkboxtext;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Felipe Romao
 */
public class CheckBox extends JFrame {
    JCheckBox ckBox1, ckBox2;
    JLabel lbText1;
    JTextField fdCampo1;
    JButton fecha;
    
    public CheckBox(){
        super("Testando o JCheckBox");
        setLayout(new FlowLayout());
        
        Font serif = new Font("Sans-Serif", Font.PLAIN, 14);
        Font arial = new Font("Arial", Font.BOLD, 14);
        Icon x = new ImageIcon(getClass().getResource("buton.png"));
        
        lbText1 = new JLabel("Digite o texto que deseja formatar");
        lbText1.setFont(arial);
        add(lbText1);
        
        fdCampo1 = new JTextField(20);
        fdCampo1.setFont(serif);
        add(fdCampo1);
        
        fecha = new JButton(x);
        fecha.setBackground(Color.WHITE);
        add(fecha);
        
        ckBox1 = new JCheckBox("Itálico");
        ckBox1.setFont(serif);
        add(ckBox1);
        
        
        ckBox2 = new JCheckBox("Negrito");
        ckBox2.setFont(serif);
        add(ckBox2);
        
        MudaFonte handler = new MudaFonte();
        
        ckBox1.addItemListener(handler);
        ckBox2.addItemListener(handler);
        
        LimpaCampo limpar = new LimpaCampo();
        fecha.addActionListener(limpar);
    }
    
    public class MudaFonte implements ItemListener {

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(ckBox1.isSelected() && ckBox2.isSelected()){
                fdCampo1.setFont(new Font("Sans-Serif", Font.BOLD + Font.ITALIC, 14));
            }else if(ckBox1.isSelected()){
                fdCampo1.setFont(new Font("Sans-Serif", Font.ITALIC, 14));
            }else if(ckBox2.isSelected()){
                fdCampo1.setFont(new Font("Sans-Serif", Font.BOLD, 14));
            }else{
                fdCampo1.setFont(new Font("Sans-Serif", Font.PLAIN, 14));
            }
        }
        
    }
    
    public class LimpaCampo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == fecha){
                fdCampo1.setText("");
            }
        }
    }
}
