
package Layouts;

import javax.swing.JFrame;

/**
 *
 * @author Felipe Romao
 */
public class BorderLayoutsTest {
    public static void main(String[] args){
        Layouts_BorderLayout borderlayout = new Layouts_BorderLayout();
        borderlayout.setVisible(true);
        borderlayout.setSize(450,350);
        borderlayout.setLocationRelativeTo(null);
        borderlayout.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
