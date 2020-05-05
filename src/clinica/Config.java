/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author celso
 */
public final class Config {

    private String host;
    private String banco;
    private String user;
    private String pass;
    private String local;
    private String destino;
    private Integer nivel;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Config() {
        FileReader reader = null;
        try {
            reader = new FileReader("config.xml");
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo config.xml não encontrado: " + ex.getMessage());
        }

        XStream xml = new XStream(new DomDriver());
        
        xml.alias("config", Config.class);
        xml.aliasField("banco", Config.class, "banco");
        xml.aliasField("host", Config.class, "host");
        xml.aliasField("user", Config.class, "user");
        xml.aliasField("pass", Config.class, "pass");
        xml.aliasField("local", Config.class, "local");
        xml.aliasField("destino", Config.class, "destino");

        Config conf = (Config) xml.fromXML(reader);

        this.setBanco(conf.getBanco());
        this.setHost(conf.getHost());
        this.setUser(conf.getUser());
        this.setPass(conf.getPass());
        this.setLocal(conf.getLocal());
        this.setDestino(conf.getDestino());
    }
    
    public void salvarConfig(String doc) {

        File path = new File("config.xml");
        
        try {
            PrintWriter writer = new PrintWriter(path);
            writer.println("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" standalone=\"no\"?>");
            writer.println(doc);
            writer.flush();
            writer.close();
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo config.xml não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro de arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
