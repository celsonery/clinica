/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import clinica.acessodb.ConexaoSQlite;
import clinica.bean.CatEstoque;
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
public class CatEstoqueDao {

    Connection conn;    
    
    public CatEstoqueDao() {
        conn = ConexaoSQlite.getConexao();
    }

    public int DeletaCategoria(int catId) {
        try {
            String sql = "DELETE FROM tblCategoria WHERE catID = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, catId);

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

    public int AdicionaCategoria(String catNome) {
        try {
            String sql = "INSERT INTO tblCategoria VALUES(null, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, catNome);

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

    public List<CatEstoque> BuscaCategoria() {
        try {

            List<CatEstoque> catList = new ArrayList<CatEstoque>();

            String sql = "SELECT * FROM tblCategoria ORDER BY catNome";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Encontrei registros: " + rs.getString("catNome"));

                CatEstoque prod = new CatEstoque();

                prod.setCatID(rs.getInt("catID"));
                prod.setCatNome(rs.getString("catNome"));

                catList.add(prod);
            }

            System.out.println("Retornando lista com " + catList.size() + " elementos.");

            stmt.close();
            rs.close();

            return catList;

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
    
    public boolean VerifcarCategoriaExiste(String text) {
        try {
            String sql = "SELECT * FROM tblCategoria WHERE catNome = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, text);
            ResultSet rs = stmt.executeQuery();
            
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(ExameDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ExameDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int EditarCategoria(String nomeNovo, int catID){
        try {
            String sql = "UPDATE tblCategoria SET catNome = ? WHERE catID = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, nomeNovo);
            stmt.setInt(2, catID);
            
            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CatEstoqueDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CatEstoqueDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

}
