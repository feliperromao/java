
package empresa_estudo_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Felipe Romao
 */
public class Empresa_estudo_JDBC {
    
    //URL do banco de dados
    static final String DATABASE_URL = "jdbc:mysql://localhost/empresa";
    
    //Carrega o aplicativo
    public static void main(String[] args) {
        Connection conexao = null; //Gerencia a conexão
        Statement statement = null; //Instrução de consulta
        ResultSet resultados = null; //Gerencia os resultados
        
        //COnexão com o banco e consulta
        try{ 
            //Estabelecer conexao com o banco
            conexao = DriverManager.getConnection(DATABASE_URL, "root", "");
            //Cria um Statementt para consultar banco de dados
            statement = conexao.createStatement();
            //COnsulta o banco de dados com a query passada no parametro
            resultados = statement.executeQuery("SELECT nome, email FROM clientes");
            
            //Processa os resultados da consulta ao banco
            ResultSetMetaData dadosTabela = resultados.getMetaData();
            
            int numColunas = dadosTabela.getColumnCount();
            System.out.println("Nomes e emails dos cliente:");
            
            //Printa na tela o nome das columas
            for(int i = 1; i <= numColunas; i++){
                System.out.printf("%-8s\t",dadosTabela.getColumnName(i));
            }
            System.out.println(); //Faz pular uma linha
            
            while(resultados.next()){
                
                for(int i = 1; i <= numColunas; i++){
                    System.out.printf("%-8s\t",resultados.getObject(i));
                }
                
                System.out.println();
            } // Fim do WHILE
            
        }//fim do TRY
        //Tratamento de erros com catch
        catch(SQLException e){
            System.err.println("Error ao conectar com  banco: "+e);
        } //Fim do CATCH
        finally{
            try{
                conexao.close();
                statement.close();
                resultados.close();
            }
            catch(Exception e){
                System.out.println("Error ao fechar conexão com banco: "+e);
            }
        }
        
    }
    
}
