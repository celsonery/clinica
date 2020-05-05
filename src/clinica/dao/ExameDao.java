/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import clinica.acessodb.ConexaoSQlite;
import clinica.bean.Exame;
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
public class ExameDao {
    Connection conn;
    
    public ExameDao(){
        conn = ConexaoSQlite.getConexao();
    }
    
    public List<Exame> BuscaListaDeExame(int Tabela){
        
        try {
            List<Exame> ListaExame = new ArrayList<Exame>();
            
            String sql = "SELECT * FROM tblExame WHERE tblTableExame_texID = ? ORDER BY exNome";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Tabela);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Exame ex = new Exame();
                ex.setExID(rs.getInt("exID"));
                ex.setExNome(rs.getString("exNome"));
                ex.setExCol1(rs.getDouble("exCol1"));
                ex.setExCol2(rs.getDouble("exCol2"));
                ex.setExPreco(rs.getDouble("exPreco"));
                
                ListaExame.add(ex);
            }
            stmt.close();
            rs.close();
            return ListaExame;
            
        } catch (SQLException ex) {
            Logger.getLogger(ExameDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ExameDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    public boolean VerifcaExameExiste(String text) {
        try {
            String sql = "SELECT * FROM tblExame WHERE exNome = ?";
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

    public int AdicionaExame(Exame exame) {
        try {
            String sql = "INSERT INTO tblExame VALUES(null, ?, ?, ?, ?, ?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, exame.getExNome());
            stmt.setDouble(2, exame.getExCol1());
            stmt.setDouble(3, exame.getExCol2());
            stmt.setDouble(4, exame.getExPreco());
            stmt.setInt(5, exame.getExTab());
            
            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ExameDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ExameDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public int ExcluirExame(int exID){
        try {
            String sql = "DELETE FROM tblExame WHERE exID = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, exID);
            
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ExameDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ExameDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int AlterarExame(Exame ex){
        try {
            String sql = "UPDATE tblExame SET exNome = ?, exCol1 = ?, exCol2 = ?, exPreco = ? WHERE exID = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, ex.getExNome());
            stmt.setDouble(2, ex.getExCol1());
            stmt.setDouble(3, ex.getExCol2());
            stmt.setDouble(4, ex.getExPreco());
            stmt.setLong(5, ex.getExID());
            
            
            return stmt.executeUpdate();
        } catch (SQLException ex1) {
            Logger.getLogger(ExameDao.class.getName()).log(Level.SEVERE, null, ex1);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex1) {
                Logger.getLogger(ExameDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
}
