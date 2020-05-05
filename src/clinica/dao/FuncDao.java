/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import java.sql.Connection;
import clinica.acessodb.ConexaoSQlite;
import clinica.bean.Func;
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
public class FuncDao {
    Connection conn;
    
    public FuncDao(){
        conn = ConexaoSQlite.getConexao();
    }
    
    public int AdicionarFunc(Func func){
        try {
            String sql = "INSERT INTO tblFuncionario VALUES(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, func.getFncNome());
            stmt.setString(2, func.getFncCpf());
            stmt.setString(3, func.getFncSexo());
            stmt.setString(4, func.getFncNasc());
            stmt.setString(5, func.getFncEnd());
            stmt.setString(6, func.getFncComp());
            stmt.setString(7, func.getFncBairro());
            stmt.setString(8, func.getFncCidade());
            stmt.setString(9, func.getFncUf());
            stmt.setInt(10, func.getFncCep());
            stmt.setString(11, func.getFncRes());
            stmt.setString(12, func.getFncCom());
            stmt.setString(13, func.getFncOp1());
            stmt.setString(14, func.getFncCel());
            stmt.setString(15, func.getFncOp2());
            stmt.setString(16, func.getFncFax());
            stmt.setString(17, func.getFncEmail());
            stmt.setString(18, func.getFncCargo());
            stmt.setString(19, func.getFncPis());
            stmt.setString(20, func.getFncCtps());
            stmt.setString(21, func.getFncAdmissao());
            stmt.setString(22, func.getFncDemissao());
            stmt.setString(23, func.getFncObs());
            
            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FuncDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int ExcluirFunc(int fncID){
        try {
            String sql = "DELETE FROM tblFuncionario WHERE funcID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setInt(1, fncID);
            
            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FuncDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int AlterarFunc(Func func){
        try {
            System.out.println("Vou alterar funcionario: " + func.getFncNome() + " de ID: " + func.getFncId());
            
            String sql = "UPDATE tblFuncionario SET fncNome = ?, fncCpf = ?, fncSexo = ?, fncNasc = ?, " +
                         "fncEnd = ?, fncComp = ?, fncBairro = ?, fncCidade = ?, fncUF = ?, fncCep = ?, " +
                         "fncTelRes = ?, fncTelCom = ?, fncOp1 = ?, fncTelCel = ?, fncOp2 = ?, fncTelFax = ?, fncEmail = ?, fncCargo = ?, " +
                         "fncPis = ?, fncCtps = ?, fncAdmissao = ?, fncDemissao = ?, fncObs = ? WHERE fncID = ?";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, func.getFncNome());
            stmt.setString(2, func.getFncCpf());
            stmt.setString(3, func.getFncSexo());
            stmt.setString(4, func.getFncNasc());
            stmt.setString(5, func.getFncEnd());
            stmt.setString(6, func.getFncComp());
            stmt.setString(7, func.getFncBairro());
            stmt.setString(8, func.getFncCidade());
            stmt.setString(9, func.getFncUf());
            stmt.setInt(10, func.getFncCep());
            stmt.setString(11, func.getFncRes());
            stmt.setString(12, func.getFncCom());
            stmt.setString(13, func.getFncOp1());
            stmt.setString(14, func.getFncCel());
            stmt.setString(15, func.getFncOp2());
            stmt.setString(16, func.getFncFax());
            stmt.setString(17, func.getFncEmail());
            stmt.setString(18, func.getFncCargo());
            stmt.setString(19, func.getFncPis());
            stmt.setString(20, func.getFncCtps());
            stmt.setString(21, func.getFncAdmissao());
            stmt.setString(22, func.getFncDemissao());
            stmt.setString(23, func.getFncObs());
            
            stmt.setInt(24, func.getFncId());
            
            return stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FuncDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FuncDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public boolean verificaCpf(String text) {
        String cpf1 = text.replace(".", "");
        String cpf2 = cpf1.replace("-", "");

        try {
            String sql = "SELECT * FROM tblFuncionario WHERE fncCpf = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf2);
            ResultSet rs = stmt.executeQuery();

            stmt.close();
            rs.close();
            return rs.next();

        } catch (SQLException ex) {
            Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public List<Func> BuscarFunc(String str) {
        try {
            String sql = "SELECT * FROM tblFuncionario WHERE fncNome LIKE ? ORDER BY fncNome";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, str + '%');
            ResultSet rs = stmt.executeQuery();

            System.out.println("Vou procurar por: Nome onde: " + str);
            System.out.println(sql);

            List<Func> pacEncontrados = new ArrayList<Func>();

            while (rs.next()) {
                Func fnc = new Func();

                fnc.setFncId(rs.getInt("fncID"));
                fnc.setFncNome(rs.getString("fncNome"));
                fnc.setFncCpf(rs.getString("fncCpf"));
                fnc.setFncSexo(rs.getString("fncSexo"));
                fnc.setFncNasc(rs.getString("fncNasc"));
                fnc.setFncEnd(rs.getString("fncEnd"));
                fnc.setFncComp(rs.getString("fncComp"));
                fnc.setFncBairro(rs.getString("fncBairro"));
                fnc.setFncCidade(rs.getString("fncCidade"));
                fnc.setFncUf(rs.getString("fncUF"));
                fnc.setFncCep(rs.getInt("fncCep"));
                fnc.setFncRes(rs.getString("fncTelRes"));
                fnc.setFncCom(rs.getString("fncTelCom"));
                fnc.setFncOp1(rs.getString("fncOp1"));
                fnc.setFncCel(rs.getString("fncTelCel"));
                fnc.setFncOp2(rs.getString("fncOp2"));
                fnc.setFncFax(rs.getString("fncTelFax"));
                fnc.setFncEmail(rs.getString("fncEmail"));
                fnc.setFncCargo(rs.getString("fncCargo"));
                fnc.setFncPis(rs.getString("fncPis"));
                fnc.setFncCtps(rs.getString("fncCtps"));
                fnc.setFncAdmissao(rs.getString("fncAdmissao"));
                fnc.setFncDemissao(rs.getString("fncDemissao"));
                fnc.setFncObs(rs.getString("fncObs"));

                pacEncontrados.add(fnc);
            }

            rs.close();
            stmt.close();

            return pacEncontrados;

        } catch (SQLException ex) {
            Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    
}
