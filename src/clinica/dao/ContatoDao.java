/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import clinica.acessodb.ConexaoSQlite;
import clinica.bean.Contato;
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
public class ContatoDao {

    Connection conn;

    // Abre conexao com o banco de dados
    public ContatoDao() {
        this.conn = ConexaoSQlite.getConexao();
    }

    // Metodo para adicionar contato novo
    public int AdicionaContato(Contato contato) {
        try {
            String sql = "INSERT INTO tblContato VALUES(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, contato.getAgNome());
            stmt.setString(2, contato.getAgEnd());
            stmt.setString(3, contato.getAgComp());
            stmt.setString(4, contato.getAgBairro());
            stmt.setString(5, contato.getAgCidade());
            stmt.setString(6, contato.getAgUf());
            stmt.setInt(7, contato.getAgCep());
            stmt.setString(8, contato.getAgTelCom1());
            stmt.setString(9, contato.getAgTelCom2());
            stmt.setString(10, contato.getAgTelRes());
            stmt.setString(11, contato.getAgOp1());
            stmt.setString(12, contato.getAgTelCel());
            stmt.setString(13, contato.getAgOp2());
            stmt.setString(14, contato.getAgTelFax());
            stmt.setString(15, contato.getAgEmail());
            stmt.setString(16, contato.getAgObs());
            stmt.setString(17, contato.getAgAtividade());

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Metodo para Excluir contato
    public int ExcluirContato(int agID) {
        try {
            String sql = "DELETE FROM tblContato WHERE agID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, agID);

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Metodo para atulizar contato
    public int AtualizaContato(Contato contato) {
        try {
            String sql = "UPDATE tblContato SET  agNome = ?, agEnd = ?, agComp = ?, agBairro = ?, agCidade = ?, agUF = ?, agCep = ?, agTelCom1 = ?, agTelCom2 = ?, agTelRes = ?, agOp1 =?, agTelCel = ?, agOp2 = ?, agTelFax = ?, agEmail = ?, agObs = ?, agAtividade = ? WHERE agID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, contato.getAgNome());
            stmt.setString(2, contato.getAgEnd());
            stmt.setString(3, contato.getAgComp());
            stmt.setString(4, contato.getAgBairro());
            stmt.setString(5, contato.getAgCidade());
            stmt.setString(6, contato.getAgUf());
            stmt.setInt(7, contato.getAgCep());
            stmt.setString(8, contato.getAgTelCom1());
            stmt.setString(9, contato.getAgTelCom2());
            stmt.setString(10, contato.getAgTelRes());
            stmt.setString(11, contato.getAgOp1());
            stmt.setString(12, contato.getAgTelCel());
            stmt.setString(13, contato.getAgOp2());
            stmt.setString(14, contato.getAgTelFax());
            stmt.setString(15, contato.getAgEmail());
            stmt.setString(16, contato.getAgObs());
            stmt.setString(17, contato.getAgAtividade());

            stmt.setInt(18, contato.getAgID());

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Metodo para listar contatos buscando pela letra
    public List<Contato> ListaContatoLetra(String letra) {
        try {
            String sql = "SELECT * FROM tblContato WHERE agNome LIKE ? ORDER BY agNome";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, letra + "%");

            ResultSet rs = stmt.executeQuery();

            List<Contato> contatos = new ArrayList<Contato>();

            while (rs.next()) {
                Contato cont = new Contato();

                cont.setAgID(rs.getInt("agID"));
                cont.setAgNome(rs.getString("agNome"));
                cont.setAgEnd(rs.getString("agEnd"));
                cont.setAgComp(rs.getString("agComp"));
                cont.setAgBairro(rs.getString("agBairro"));
                cont.setAgCidade(rs.getString("agCidade"));
                cont.setAgUf(rs.getString("agUF"));
                cont.setAgCep(rs.getInt("agCep"));
                cont.setAgTelCom1(rs.getString("agTelCom1"));
                cont.setAgTelCom2(rs.getString("agTelCom2"));
                cont.setAgTelRes(rs.getString("agTelRes"));
                cont.setAgOp1(rs.getString("agOp1"));
                cont.setAgTelCel(rs.getString("agTelCel"));
                cont.setAgOp2(rs.getString("agOp2"));
                cont.setAgTelFax(rs.getString("agTelFax"));
                cont.setAgEmail(rs.getString("agEmail"));
                cont.setAgObs(rs.getString("agObs"));
                cont.setAgAtividade(rs.getString("agAtividade"));
                
                contatos.add(cont);
            }

            stmt.close();
            rs.close();

            return contatos;

        } catch (SQLException ex) {
            Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    // Metodo para lista contatos buscando por ramo de atividade
    public List<Contato> ListaContatoAtividade(String ativ) {
        try {
            String sql = "SELECT * FROM tblContato WHERE agAtividade = ? ORDER BY agNome";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, ativ);

            ResultSet rs = stmt.executeQuery();

            List<Contato> contatos = new ArrayList<Contato>();

            while (rs.next()) {
                Contato cont = new Contato();

                cont.setAgID(rs.getInt("agID"));
                cont.setAgNome(rs.getString("agNome"));
                cont.setAgEnd(rs.getString("agEnd"));
                cont.setAgComp(rs.getString("agComp"));
                cont.setAgBairro(rs.getString("agBairro"));
                cont.setAgCidade(rs.getString("agCidade"));
                cont.setAgUf(rs.getString("agUF"));
                cont.setAgCep(rs.getInt("agCep"));
                cont.setAgTelCom1(rs.getString("agTelCom1"));
                cont.setAgTelCom2(rs.getString("agTelCom2"));
                cont.setAgTelRes(rs.getString("agTelRes"));
                cont.setAgOp1(rs.getString("agOp1"));
                cont.setAgTelCel(rs.getString("agTelCel"));
                cont.setAgOp2(rs.getString("agOp2"));
                cont.setAgTelFax(rs.getString("agTelFax"));
                cont.setAgEmail(rs.getString("agEmail"));
                cont.setAgObs(rs.getString("agObs"));
                cont.setAgAtividade(rs.getString("agAtividade"));
                
                contatos.add(cont);
            }

            stmt.close();
            rs.close();
            
            return contatos;
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List listaAtividades() {
        try {
            String sql = "SELECT distinct(agAtividade) FROM tblContato WHERE agAtividade <> '' order by agAtividade";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
       
            List lista = new ArrayList();
            
            while(rs.next()){
                lista.add(rs.getString("agAtividade"));
            }
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List BuscarContato(String text) {
        try {
            String sql = "SELECT * FROM tblContato WHERE agNome LIKE ? ORDER BY agNome";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, text + "%");

            ResultSet rs = stmt.executeQuery();

            List<Contato> contatos = new ArrayList<Contato>();

            while (rs.next()) {
                Contato cont = new Contato();

                cont.setAgID(rs.getInt("agID"));
                cont.setAgNome(rs.getString("agNome"));
                cont.setAgEnd(rs.getString("agEnd"));
                cont.setAgComp(rs.getString("agComp"));
                cont.setAgBairro(rs.getString("agBairro"));
                cont.setAgCidade(rs.getString("agCidade"));
                cont.setAgUf(rs.getString("agUF"));
                cont.setAgCep(rs.getInt("agCep"));
                cont.setAgTelCom1(rs.getString("agTelCom1"));
                cont.setAgTelCom2(rs.getString("agTelCom2"));
                cont.setAgTelRes(rs.getString("agTelRes"));
                cont.setAgOp1(rs.getString("agOp1"));
                cont.setAgTelCel(rs.getString("agTelCel"));
                cont.setAgOp2(rs.getString("agOp2"));
                cont.setAgTelFax(rs.getString("agTelFax"));
                cont.setAgEmail(rs.getString("agEmail"));
                cont.setAgObs(rs.getString("agObs"));
                cont.setAgAtividade(rs.getString("agAtividade"));
                
                contatos.add(cont);
            }

            stmt.close();
            rs.close();

            return contatos;
            
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ContatoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
