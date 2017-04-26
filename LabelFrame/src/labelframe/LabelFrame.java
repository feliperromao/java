
package labelframe;

import java.awt.FlowLayout; //Especifica como os componentes são organizados
import javax.swing.JFrame; //Fornece os recursos básicos de Janela
import javax.swing.JLabel; //Exibe textos e imagens
import javax.swing.Icon; //Interface utilizada para manipular imagens
import javax.swing.ImageIcon; //Carrega imagens
import javax.swing.SwingConstants; //Constantes comuns utilizadas com swing

/**
 * Figura 14.6 LabelFrame.java
 * @author Felipe Romao
 * Demonstrando a classe JLabel
 */
public class LabelFrame extends JFrame{
    private JLabel lab1; //JLabel apenas como texto
    private JLabel lab2; //JLabel construido com texto e ícone
    private JLabel lab3; //JLabel com texto e ícone adicionados
    
    //Método construtor LabelFrame adiciona JLabels a JFrame
    public LabelFrame(){
        super("Testando JLabel"); //Invoca o construtor da superclasse JFrame
        
        setLayout( new FlowLayout() ); //Configura o layout do Frame
        
        lab1 = new JLabel("Label com texto");
        lab1.setToolTipText("Esse e um JLabel com apenas texto");
        add(lab1);
        
        Icon bug = new ImageIcon( getClass().getResource("bug1.png") );
        lab2 = new JLabel( "Label com texto e ícone", bug, SwingConstants.RIGHT );
        lab2.setToolTipText( "Esse é um JLabel com imagem e icone" );
        add(lab2);
        
        lab3 = new JLabel();
        lab3.setText( "Label com icone e texto como botão" );
        lab3.setIcon( bug );
        lab3.setHorizontalTextPosition( SwingConstants.CENTER );
        lab3.setVerticalTextPosition( SwingConstants.BOTTOM );
        lab3.setToolTipText("JLabel com imagem e icone adicionado como botão");
        add( lab3 );
        
    } //Fim método construtor
}
