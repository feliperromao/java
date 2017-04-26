/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Felipe Romao
 */
public class Layouts_BorderLayout extends JFrame {
    JButton botao1;
    JButton botao2;
    JButton botao3;
    JButton botao4;
    JButton botao5;
    
    public Layouts_BorderLayout(){
        super("Border Layout");
        setLayout(new BorderLayout());
        botao1 = new JButton("Botão 1");
        add(botao1, BorderLayout.NORTH);
        
        botao2 = new JButton("Botão 1");
        add(botao2, BorderLayout.EAST);
        
        botao3 = new JButton("Botão 1");
        add(botao3, BorderLayout.WEST);
        
        botao4 = new JButton("Botão 1");
        add(botao4, BorderLayout.CENTER);
        
        botao5 = new JButton("Botão 1");
        add(botao5, BorderLayout.SOUTH);
    }
    
}
