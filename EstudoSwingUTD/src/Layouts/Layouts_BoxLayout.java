/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;

import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Felipe Romao
 */
public class Layouts_BoxLayout extends JFrame {
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    
    public Layouts_BoxLayout(){
        super("Testando BoxLayout");
        
        btn1 = new JButton("01");
        add(btn1);
        
        btn2 = new JButton("02");
        add(btn2);
        
        btn3 = new JButton("03");
        add(btn3);
        
        btn4 = new JButton("04");
        add(btn4);
        
        btn5 = new JButton("05");
        add(btn5);
    }
       
}
