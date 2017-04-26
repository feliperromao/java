/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Layouts;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Felipe Romao
 */
public class TestaBoxLayout {
    public static void main(String[] args){
        Layouts_BoxLayout boxlayout = new Layouts_BoxLayout();
        JPanel painel2 = new JPanel();
        painel2.setLayout(new BoxLayout(painel2,BoxLayout.Y_AXIS));
        boxlayout.setVisible(true);
        boxlayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        boxlayout.setSize(300,300);
    }
}
