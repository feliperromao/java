
package testesjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Felipe Romao
 */
public class TestesJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        /*
        jdbc:mysql>//localhost/testeJDBC
        */
        try{
            String url = "jdbc:mysql://localhost/testeJDBC";
            String user = "root";
            String passwd = "";
            Connection conexao = DriverManager.getConnection(url, user, passwd);
            System.out.println("Conectado");
            conexao.close();
        }
        catch(SQLException e){
            System.err.println("Error ao conectar com banco: "+e);
        }
    }
    
}
