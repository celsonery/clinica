/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import static clinica.Clinica.config;
import clinica.acessodb.ConexaoSQlite;
import clinica.bean.Usuario;
import clinica.util.Md5;
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
public class UsuarioDao {

    Connection conn;

    public UsuarioDao() {
        conn = ConexaoSQlite.getConexao();
    }

    public boolean ValidaLogin(String login, String senha) {
        Md5 t = new Md5();
        Boolean val = false;

        try {
            String sql = "SELECT * FROM tblUsuario WHERE usrLogin = ? AND usrStatus = 1";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, login);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                if (t.crypt(senha).equals(rs.getString("usrSenha"))) {
                    config.setNivel(rs.getInt("tblNivel_nID"));
                    val = true;
                }
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return val;
    }

    public List<Usuario> ListarUsuarios() {
        try {
            String sql = "SELECT * FROM tblUsuario WHERE usrId != 1 ORDER BY usrLogin";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            List<Usuario> users = new ArrayList<Usuario>();

            while (rs.next()) {
                Usuario user = new Usuario();

                user.setUsrId(rs.getLong("usrId"));
                user.setUsrLogin(rs.getString("usrLogin"));

                users.add(user);
            }
            stmt.close();
            rs.close();
            return users;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int ExcluirUsuario(String usrLogin){
        try {
            String sql = "DELETE FROM tblUsuario WHERE usrLogin = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, usrLogin);

            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int AlterarSenha(String usrLogin, String usrSenha){
        try {
            String sql = "UPDATE tblUsuario SET usrSenha = ? WHERE usrLogin = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, usrSenha);
            stmt.setString(2, usrLogin);

            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int AdicionarUsuario(Usuario user){
        try {
            String sql = "INSERT INTO tblUsuario VALUES(null, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, user.getUsrLogin());
            stmt.setString(2, user.getUsrNome());
            stmt.setString(3, user.getUsrSenha());
            stmt.setInt(4, user.getUsrStatus());
            stmt.setInt(5, user.getTblNivel_nID());

            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    
    public List BuscaTipoUsuarios(){
        try {
            String sql = "SELECT * FROM tblNivel";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            ResultSet rs = stmt.executeQuery();
            
            List niveis = new ArrayList();
            
            while(rs.next()){
                niveis.add(rs.getString("nTipo"));
            }
            return niveis;
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
