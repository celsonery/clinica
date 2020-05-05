package clinica.acessodb;

import static clinica.Clinica.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author celso
 */
public class ConexaoSQlite {
    public static Connection getConexao() {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:" + config.getBanco() + ":" + config.getHost());
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro Classe não encontrada: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro SQLException: " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Erro NullPointerException: " + ex.getMessage());
        }
        return null;
    }

}
