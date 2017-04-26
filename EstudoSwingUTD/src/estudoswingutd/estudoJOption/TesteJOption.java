package estudoswingutd.estudoJOption;

import javax.swing.JOptionPane;
public class TesteJOption {
    public static void main(String[] args){
        String a = JOptionPane.showInputDialog("Digite o primeiro número:");
        String b = JOptionPane.showInputDialog("Digite o segundo número:");
        
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        
        int result = a1 + b1;
        
        JOptionPane.showMessageDialog(null, "A soma dos valores inseridos é: "+result,
                "Soma de Dois Inteiros",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
