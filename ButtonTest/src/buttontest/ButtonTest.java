/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttontest;

import javax.swing.JFrame;

/**
 *
 * @author Felipe Romao
 */
public class ButtonTest {

    public static void main(String[] args) {
        ButtonFrame janela = new ButtonFrame();
        
        janela.setSize(200,200);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
}
