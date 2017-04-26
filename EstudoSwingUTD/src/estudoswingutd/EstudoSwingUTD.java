package estudoswingutd;

import java.awt.Font;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class EstudoSwingUTD {

    public static void main(String[] args) {
        JFrame frame= new JFrame ("UTD - Java com Banco de Dados");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fechar quando clicar no x da janela
        frame.setSize(350,200); //tamanho da janela
        frame.setLocationRelativeTo(null); //centralizar a janela
     // frame.setBounds(100,100,550,400); // localização e tamanho da janela
        
        //Criando os campos
        
        JLabel titulo = new JLabel("Cadastro de Usuários");
        titulo.setFont(new Font("Arial", Font.BOLD,30));
        JLabel usuarioLabel = new JLabel("Usuario: ");
        JTextField usuarioText = new JTextField(15);
        
        JLabel senhaLabel = new JLabel("Senha: ");
        JPasswordField senhaText = new JPasswordField(15);
        
        JLabel lista = new JLabel("Cidade: ");
        JComboBox listaTimes = new JComboBox();
            listaTimes.addItem("Fortaleza");
            listaTimes.addItem("Caucaia");
            listaTimes.addItem("Maranguape");
            listaTimes.addItem("Maracanaú");
            listaTimes.addItem("Eusébio");
            listaTimes.setEditable(false);
            listaTimes.setSelectedIndex(1);
        
        JButton logar = new JButton("Logar");
        JButton cancelar = new JButton("Cancelar");
        
        JPanel panel = new JPanel();
        panel.add(titulo);
        panel.add(usuarioLabel);
        panel.add(usuarioText);
        panel.add(senhaLabel);
        panel.add(senhaText);
        panel.add(lista);
        panel.add(listaTimes);
        panel.add(logar);
        panel.add(cancelar);
        
        frame.setContentPane(panel);
        frame.setVisible(true); //deixar a janela visivel
    }
    
}
