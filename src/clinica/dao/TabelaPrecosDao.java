/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import clinica.acessodb.ConexaoSQlite;
import clinica.bean.TabelaPrecos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author celso
 */
public class TabelaPrecosDao {

    Connection conn;

    public TabelaPrecosDao() {
        conn = ConexaoSQlite.getConexao();
    }

    public int DeletaTabela(int tabId) {
        try {
            String sql = "UPDATE tblTableExame SET texAtivo = 'N' WHERE texID = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, tabId);

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TabelaPrecosDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TabelaPrecosDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int AdicionaTabela(TabelaPrecos tabela) {
        try {
            String sql = "INSERT INTO tblTableExame VALUES(null, ?, ?, ?, 'S')";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, tabela.getTexNome());
            stmt.setString(2, tabela.getTexCol1());
            stmt.setString(3, tabela.getTexCol2());

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(TabelaPrecosDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TabelaPrecosDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int EditarTabela(TabelaPrecos tabela){
        
        try {
            String sql = "UPDATE tblTableExame set texNome = ?, texCol1 = ?, texCol2 = ? WHERE texID = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, tabela.getTexNome());
            stmt.setString(2, tabela.getTexCol1());
            stmt.setString(3, tabela.getTexCol2());
            stmt.setInt(4, tabela.getTexID());
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TabelaPrecosDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TabelaPrecosDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    

    public List<TabelaPrecos> BuscaTabela() {
        try {

            List<TabelaPrecos> tabList = new ArrayList<TabelaPrecos>();

            String sql = "SELECT * FROM tblTableExame WHERE texAtivo = 'S' ORDER BY texNome";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Encontrei registros: " + rs.getString("texNome"));

                TabelaPrecos tab = new TabelaPrecos();

                tab.setTexID(rs.getInt("texID"));
                tab.setTexNome(rs.getString("texNome"));
                tab.setTexCol1(rs.getString("texCol1"));
                tab.setTexCol2(rs.getString("texCol2"));

                tabList.add(tab);
            }

            System.out.println("Retornando lista com " + tabList.size() + " elementos.");

            stmt.close();
            rs.close();

            return tabList;

        } catch (SQLException ex) {
            Logger.getLogger(TabelaPrecosDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(TabelaPrecosDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
