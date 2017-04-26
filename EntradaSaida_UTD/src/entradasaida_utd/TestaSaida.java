/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasaida_utd;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author Felipe Romao
 */
public class TestaSaida {
    public static void main(String[] args) throws IOException{
        OutputStream os = new FileOutputStream("arquivo.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("O que vc deseja escrever no arquivo?");
        String texto = entrada.nextLine();
        
        bw.write(texto);
        bw.newLine();
        bw.close();
    }
}
