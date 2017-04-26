/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labelframe;

import javax.swing.JFrame;

/**
 * Firuga 14.7 LabelTest
 * @author Felipe Romao
 * Testando labelFrame
 */
public class LabelTest {
    public static void main(String[] args){
        LabelFrame labelframe = new LabelFrame(); //cria o LabelFrame
        labelframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labelframe.setSize(260, 180);
        labelframe.setVisible(true); //exibe o frame
    } //Fim do metodo main
} //Fim da classe LsbelTest
