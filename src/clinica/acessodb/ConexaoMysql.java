/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.acessodb;

import clinica.Config;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author celso
 */
public class ConexaoMysql {

    public static void lerConfig() {
        FileReader reader = null;
        try {
            reader = new FileReader("config.xml");
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }

        XStream xml = new XStream(new DomDriver());
        xml.alias("config", Config.class);
        xml.aliasField("banco", Config.class, "banco");
        xml.aliasField("host", Config.class, "host");
        xml.aliasField("user", Config.class, "user");
        xml.aliasField("pass", Config.class, "pass");

        Config conf = (Config) xml.fromXML(reader);
        
        System.out.println("Banco:" + conf.getBanco());
        System.out.println("Host:" + conf.getHost());
        System.out.println("User:" + conf.getUser());
        System.out.println("Pass:" + conf.getPass());
        
        //System.out.println(config.toString());
    }

    public static Connection getConexao() throws SQLException {
        lerConfig();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/clinica?zeroDateTimeBehavior=convertToNull", "root", "senhadb");
        } catch (ClassNotFoundException ex) {
            throw new SQLException(ex.getMessage());
        }
    }
}
