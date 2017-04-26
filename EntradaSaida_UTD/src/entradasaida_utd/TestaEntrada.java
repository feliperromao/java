/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradasaida_utd;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Felipe Romao
 */
public class TestaEntrada {
    public static void main(String[] args) throws IOException{
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        System.out.println(s);
        
        /*while(s != null){;
            s = br.readLine();
            System.out.println(s);
        }*/
        
        br.close();
        
    }
    
}
