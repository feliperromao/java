
package textfield;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Felipe Romao
 */
public class TextFieldFrame extends JFrame {
    JLabel nome;
    
    JTextField campo1;
    JTextField campo2;
    JTextField campo3;
    JPasswordField senha1;
    
    public TextFieldFrame(){
        super("Testando JTextField e JPasswordField");
        setLayout( new FlowLayout() );
        
        //Constroi um label
        nome = new JLabel("Nome de Usuário: ");
        add(nome);
        
        //Constroi o textfield com 10 colunas
        campo1 = new JTextField(10);
        add(campo1);
        
        campo2 = new JTextField("Digite o texto aqui");
        add(campo2);
        
        campo3 = new JTextField("Campo de texto não editável", 21);
        campo3.setEditable(false);
        add(campo3);
        
        senha1 = new JPasswordField("Texto Oculto");
        add(senha1);
        
        //Handles de evento registradores
        TextFieldHandle handle = new TextFieldHandle();
        campo1.addActionListener(handle);
        campo2.addActionListener(handle);
        campo3.addActionListener(handle);
        senha1.addActionListener(handle);
        
    }// Fim do método construtor
    
    // Classe interna private para tratamento de evento
    private class TextFieldHandle implements ActionListener{
        
        // processa eventos de campo de texto
        public void actionPerformed(ActionEvent event) {
            String texto = ""; // declara string a ser exibida
            if( event.getSource() == campo1 ){
                texto = String.format( "Campo 1: %s", event.getActionCommand() );
            }else if( event.getSource() == campo2 ){
                texto = String.format( "Campo 2: %s", event.getActionCommand() );
            }else if( event.getSource() == campo3 ){
                texto = String.format( "Campo 3: %s", event.getActionCommand() );
            }else if(event.getSource() == senha1){
                texto = String.format( "Senha 1: %s", event.getActionCommand() );
            }
            
            JOptionPane.showMessageDialog(null, texto);
            
        }// Fim do método actionPerformed

    }// Fim da classe TextFieldHandle
}
