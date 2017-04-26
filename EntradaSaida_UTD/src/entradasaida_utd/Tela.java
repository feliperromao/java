
package entradasaida_utd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Felipe Romao
 * 
 *      feliperomaocad@gmail.com
 *      
 *      Programa com interface grafica Java para salvar dados em arquivo de texto
 * 
 */
    public class Tela extends JFrame{
        //Criando Labels
        JLabel lbCodigo;
        JLabel lbNome;
        JLabel lbEmail;
        
        //Criando Campos de Texto
        JTextField fdCod;
        JTextField fdNome;
        JTextField fdEmail;
        
        //Criando Botoes
        JButton btnCadastro;
        JButton btnBuscar;
        JButton btnDeletar;
        
        public Tela(){
            super("Cadastro");
            setLayout(null);
            
            lbCodigo = new JLabel("Código");
            lbCodigo.setBounds(10, 10, 50, 20);
            add(lbCodigo);
            
            lbNome = new JLabel("Nome");
            lbNome.setBounds(10, 40, 50, 20);
            add(lbNome);
            
            lbEmail = new JLabel("Email");
            lbEmail.setBounds(10, 70, 50, 20);
            add(lbEmail);
            
            fdCod = new JTextField();
            fdCod.setBounds(70, 10, 100, 20);
            add(fdCod);
            
            fdNome = new JTextField();
            fdNome.setBounds(70, 40, 200, 20);
            add(fdNome);
            
            fdEmail = new JTextField();
            fdEmail.setBounds(70, 70, 200, 20);
            add(fdEmail);
            
            btnCadastro = new JButton("Cadastrar");
            btnCadastro.setBounds(9, 100, 95, 30);
            add(btnCadastro);
            
            btnBuscar =  new JButton("Buscar");
            btnBuscar.setBounds(107, 100, 90, 30);
            add(btnBuscar);
            
            btnDeletar = new JButton("Limpar");
            btnDeletar.setBounds(200, 100, 90, 30);
            add(btnDeletar);
            
            
            Cadastrar handler = new Cadastrar();
            btnCadastro.addActionListener(handler);
            
            LimpaCampos handle2 = new LimpaCampos();
            btnDeletar.addActionListener(handle2);
            
            BuscarRegistro handle3 = new BuscarRegistro();
            btnBuscar.addActionListener(handle3);
        }
        public class Cadastrar implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                if(fdCod.getText().equals("")){
                    JOptionPane.showMessageDialog(Tela.this, "Favor digite um valor para codigo",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    fdCod.requestFocus();
                }else if(fdNome.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Preencha o campo de Nome",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    fdNome.requestFocus();
                }else if(fdEmail.getText().equals("")){
                    JOptionPane.showMessageDialog(rootPane, "Preencha o campo de Email",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    fdEmail.requestFocus();
                }else{
                    try{
                        OutputStream arquivo = new FileOutputStream(fdCod.getText()+".txt");
                        OutputStreamWriter escreva = new OutputStreamWriter(arquivo);
                        BufferedWriter buffer = new BufferedWriter(escreva);
                        buffer.write(fdCod.getText());
                        buffer.newLine();
                        buffer.write(fdNome.getText());
                        buffer.newLine();
                        buffer.write(fdEmail.getText());
                        buffer.close();
                        
                        JOptionPane.showMessageDialog(Tela.this, "Arquivo gravado com sucesso!",
                                "Success", JOptionPane.INFORMATION_MESSAGE);
                        
                        //Limpando Campos
                        fdCod.setText("");
                        fdNome.setText("");
                        fdEmail.setText("");
                        
                    }catch(IOException Erro){
                        JOptionPane.showMessageDialog(Tela.this,"Error ao gravar arquivo",
                                "Error de gravação", JOptionPane.ERROR_MESSAGE);
                    }
                }
                
            }
            
        }
        public class LimpaCampos implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                fdCod.setText("");
                fdNome.setText("");
                fdEmail.setText("");
            }
            
        }
        
        public class BuscarRegistro implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                if(!(fdCod.getText().equals(""))){
                    try{
                        InputStream entrada = new FileInputStream(fdCod.getText()+".txt");
                        InputStreamReader leitor = new InputStreamReader(entrada);
                        BufferedReader buffer = new BufferedReader(leitor);

                        fdCod.setText(buffer.readLine());
                        fdNome.setText(buffer.readLine());
                        fdEmail.setText(buffer.readLine());

                        buffer.close();
                    }catch(IOException Erro){
                        JOptionPane.showMessageDialog(rootPane, "Não foi possivel acessar o arquivo: \n"+Erro,
                                "Falha ao acessar arquivo", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Informe um valor para o Código",
                            "Informe o Código", JOptionPane.QUESTION_MESSAGE);
                    fdCod.requestFocus();
                }
                
                
            }
            
        }
        
    }
