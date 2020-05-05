/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import clinica.acessodb.ConexaoSQlite;
import clinica.bean.Paciente;
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
public class PacienteMedicoDao {

    Connection conn;

    public PacienteMedicoDao() {
        conn = ConexaoSQlite.getConexao();
    }

    public boolean verificaCpf(String cpf) {
        String cpf1 = cpf.replace(".", "");
        String cpf2 = cpf1.replace("-", "");

        try {
            String sql = "SELECT * FROM tblPacienteMedico WHERE pacCpf = ?";
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

    public List<Paciente> buscaPacId(String id) {
        try {
            String sql = "SELECT * FROM tblPacienteMedico WHERE pacID = ? ORDER BY pacID";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();

            List<Paciente> pacEncontrados = new ArrayList<Paciente>();

            while (rs.next()) {
                Paciente p1 = new Paciente();

                p1.setPacID(rs.getInt("pacID"));
                p1.setPacMat(rs.getInt("pacMat"));
                p1.setPacNome(rs.getString("pacNome"));
                p1.setPacCpf(rs.getString("pacCpf"));
                p1.setPacDeclara(rs.getString("pacDeclara"));
                p1.setPacSexo(rs.getString("pacSexo"));
                p1.setPacNasc(rs.getString("pacNasc"));
                p1.setPacEnd(rs.getString("pacEndereco"));
                p1.setPacNum(rs.getInt("pacNum"));
                p1.setPacComplemento(rs.getString("pacComplemento"));
                p1.setPacBairro(rs.getString("pacBairro"));
                p1.setPacCidade(rs.getString("pacCidade"));
                p1.setPacUf(rs.getString("pacUF"));
                p1.setPacCep(rs.getInt("pacCep"));
                p1.setPacTelRes(rs.getString("pacTelRes"));
                p1.setPacTelCom(rs.getString("pacTelCom"));
                p1.setPacOp1(rs.getString("pacOp1"));
                p1.setPacTelCel(rs.getString("pacTelCel"));
                p1.setPacOp2(rs.getString("pacOp2"));
                p1.setPacTelFax(rs.getString("pacTelFax"));
                p1.setPacTelOutro(rs.getString("pacTelOutro"));
                p1.setPacObs(rs.getString("pacObs"));
                p1.setPacAlert(rs.getString("pacAlerta"));
                p1.setPacDtCadastro(rs.getString("pacDtCadastro"));
                p1.setPacDtUpdate(rs.getString("pacDtUpdate"));

                pacEncontrados.add(p1);
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

    public List<Paciente> buscaPacCpf(String cpf) {
        try {
            String sql = "SELECT * FROM tblPacienteMedico WHERE pacCpf = ? ORDER BY pacCpf";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();

            List<Paciente> pacEncontrados = new ArrayList<Paciente>();

            while (rs.next()) {
                Paciente p1 = new Paciente();

                p1.setPacID(rs.getInt("pacID"));
                p1.setPacMat(rs.getInt("pacMat"));
                p1.setPacNome(rs.getString("pacNome"));
                p1.setPacCpf(rs.getString("pacCpf"));
                p1.setPacDeclara(rs.getString("pacDeclara"));
                p1.setPacSexo(rs.getString("pacSexo"));
                p1.setPacNasc(rs.getString("pacNasc"));
                p1.setPacEnd(rs.getString("pacEndereco"));
                p1.setPacNum(rs.getInt("pacNum"));
                p1.setPacComplemento(rs.getString("pacComplemento"));
                p1.setPacBairro(rs.getString("pacBairro"));
                p1.setPacCidade(rs.getString("pacCidade"));
                p1.setPacUf(rs.getString("pacUF"));
                p1.setPacCep(rs.getInt("pacCep"));
                p1.setPacTelRes(rs.getString("pacTelRes"));
                p1.setPacTelCom(rs.getString("pacTelCom"));
                p1.setPacOp1(rs.getString("pacOp1"));
                p1.setPacTelCel(rs.getString("pacTelCel"));
                p1.setPacOp2(rs.getString("pacOp2"));
                p1.setPacTelFax(rs.getString("pacTelFax"));
                p1.setPacTelOutro(rs.getString("pacTelOutro"));
                p1.setPacObs(rs.getString("pacObs"));
                p1.setPacAlert(rs.getString("pacAlerta"));
                p1.setPacDtCadastro(rs.getString("pacDtCadastro"));
                p1.setPacDtUpdate(rs.getString("pacDtUpdate"));

                pacEncontrados.add(p1);
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

    public List<Paciente> buscaPacNome(String str) {
        try {
            String sql = "SELECT * FROM tblPacienteMedico WHERE pacNome LIKE ? ORDER BY pacNome";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, str + '%');
            ResultSet rs = stmt.executeQuery();

            System.out.println("Vou procurar por: Nome onde: " + str);
            System.out.println(sql);

            //String Sql = "SELECT * FROM tblPacienteMedico WHERE ? LIKE ?";
            List<Paciente> pacEncontrados = new ArrayList<Paciente>();

            while (rs.next()) {
                Paciente p1 = new Paciente();

                p1.setPacID(rs.getInt("pacID"));
                p1.setPacMat(rs.getInt("pacMat"));
                p1.setPacNome(rs.getString("pacNome"));
                p1.setPacCpf(rs.getString("pacCpf"));
                p1.setPacDeclara(rs.getString("pacDeclara"));
                p1.setPacSexo(rs.getString("pacSexo"));
                p1.setPacNasc(rs.getString("pacNasc"));
                p1.setPacEnd(rs.getString("pacEndereco"));
                p1.setPacNum(rs.getInt("pacNum"));
                p1.setPacComplemento(rs.getString("pacComplemento"));
                p1.setPacBairro(rs.getString("pacBairro"));
                p1.setPacCidade(rs.getString("pacCidade"));
                p1.setPacUf(rs.getString("pacUF"));
                p1.setPacCep(rs.getInt("pacCep"));
                p1.setPacTelRes(rs.getString("pacTelRes"));
                p1.setPacTelCom(rs.getString("pacTelCom"));
                p1.setPacOp1(rs.getString("pacOp1"));
                p1.setPacTelCel(rs.getString("pacTelCel"));
                p1.setPacOp2(rs.getString("pacOp2"));
                p1.setPacTelFax(rs.getString("pacTelFax"));
                p1.setPacTelOutro(rs.getString("pacTelOutro"));
                p1.setPacObs(rs.getString("pacObs"));
                p1.setPacAlert(rs.getString("pacAlerta"));
                p1.setPacDtCadastro(rs.getString("pacDtCadastro"));
                p1.setPacDtUpdate(rs.getString("pacDtUpdate"));

                pacEncontrados.add(p1);
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

    public int ExcluirPaciente(Paciente p1) {
        try {
            String sql = "DELETE FROM tblPacienteMedico WHERE pacID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, p1.getPacID());

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

    public int AdicionarPaciente(Paciente p1) {
        try {
            String sql = "INSERT INTO tblPacienteMedico VALUES(null, null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, p1.getPacNome());
            stmt.setString(2, p1.getPacCpf());
            stmt.setString(3, p1.getPacDeclara());
            stmt.setString(4, p1.getPacSexo());
            stmt.setString(5, p1.getPacNasc());
            stmt.setString(6, p1.getPacEnd());
            stmt.setInt(7, p1.getPacNum());
            stmt.setString(8, p1.getPacComplemento());
            stmt.setString(9, p1.getPacBairro());
            stmt.setString(10, p1.getPacCidade());
            stmt.setString(11, p1.getPacUf());
            stmt.setInt(12, p1.getPacCep());
            stmt.setString(13, p1.getPacTelRes());
            stmt.setString(14, p1.getPacTelCom());
            stmt.setString(15, p1.getPacOp1());
            stmt.setString(16, p1.getPacTelCel());
            stmt.setString(17, p1.getPacOp2());
            stmt.setString(18, p1.getPacTelFax());
            stmt.setString(19, p1.getPacTelOutro());
            stmt.setString(20, p1.getPacEmail());
            stmt.setString(21, p1.getPacObs());
            stmt.setString(22, p1.getPacAlert());
            stmt.setString(23, p1.getPacDtCadastro());
            stmt.setString(24, p1.getPacDtUpdate());

            stmt.executeUpdate();

            return LastID("tblPacienteMedico");

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

    public int AlterarPaciente(Paciente p1) {
        try {
            String sql = "UPDATE tblPacienteMedico set pacNome = ?, pacCpf = ?, pacDeclara = ?, pacSexo = ?, pacNasc = ?, pacEndereco = ?, pacNum = ?, pacComplemento = ?, pacBairro = ?, pacCidade = ?, pacUF = ?, pacCep = ?,"
                    + "pacTelRes = ?, pacTelCom = ?, pacOp1 = ?, pacTelCel = ?, pacOp2 = ?, pacTelFax = ?, pacTelOutro = ?, pacEmail = ?, pacObs = ?, pacAlerta = ?, pacDtUpdate = ? WHERE pacID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, p1.getPacNome());
            stmt.setString(2, p1.getPacCpf());
            stmt.setString(3, p1.getPacDeclara());
            stmt.setString(4, p1.getPacSexo());
            stmt.setString(5, p1.getPacNasc());
            stmt.setString(6, p1.getPacEnd());
            stmt.setInt(7, p1.getPacNum());
            stmt.setString(8, p1.getPacComplemento());
            stmt.setString(9, p1.getPacBairro());
            stmt.setString(10, p1.getPacCidade());
            stmt.setString(11, p1.getPacUf());
            stmt.setInt(12, p1.getPacCep());
            stmt.setString(13, p1.getPacTelRes());
            stmt.setString(14, p1.getPacTelCom());
            stmt.setString(15, p1.getPacOp1());
            stmt.setString(16, p1.getPacTelCel());
            stmt.setString(17, p1.getPacOp2());
            stmt.setString(18, p1.getPacTelFax());
            stmt.setString(19, p1.getPacTelOutro());
            stmt.setString(20, p1.getPacEmail());
            stmt.setString(21, p1.getPacObs());
            stmt.setString(22, p1.getPacAlert());
            stmt.setString(23, p1.getPacDtUpdate());

            stmt.setInt(24, p1.getPacID());

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

    public int BuscaNovoID() {
        try {
            int LastID;

            String sql = "SELECT count(*) FROM tblPacienteMedico";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            LastID = rs.getInt(1);

            stmt.close();
            rs.close();

            return LastID + 1;

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

    private int FisrtID(String tbl) {
        try {
            String sql = "SELECT pacID FROM tblPacienteMedico LIMIT 1";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            
            return rs.getInt("pacID");

        } catch (SQLException ex) {
            Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public int LastID(String Tbl) {
        try {
            String sql = "SELECT pacID FROM tblPacienteMedico ORDER by pacID DESC LIMIT 1";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            
            return rs.getInt("pacID");
            
        } catch (SQLException ex) {
            Logger.getLogger(PacienteMedicoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }

    public Paciente BuscaPaciente(int id) {
        try {
            String sql = "SELECT * FROM tblPacienteMedico WHERE pacID = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            Paciente p1 = new Paciente();
            
            if (rs.next()) {
                p1.setPacID(rs.getInt("pacID"));
                p1.setPacMat(rs.getInt("pacMat"));
                p1.setPacNome(rs.getString("pacNome"));
                p1.setPacCpf(rs.getString("pacCpf"));
                p1.setPacDeclara(rs.getString("pacDeclara"));
                p1.setPacSexo(rs.getString("pacSexo"));
                p1.setPacNasc(rs.getString("pacNasc"));
                p1.setPacEnd(rs.getString("pacEndereco"));
                p1.setPacNum(rs.getInt("pacNum"));
                p1.setPacComplemento(rs.getString("pacComplemento"));
                p1.setPacBairro(rs.getString("pacBairro"));
                p1.setPacCidade(rs.getString("pacCidade"));
                p1.setPacUf(rs.getString("pacUF"));
                p1.setPacCep(rs.getInt("pacCep"));
                p1.setPacTelRes(rs.getString("pacTelRes"));
                p1.setPacTelCom(rs.getString("pacTelCom"));
                p1.setPacOp1(rs.getString("pacOp1"));
                p1.setPacTelCel(rs.getString("pacTelCel"));
                p1.setPacOp2(rs.getString("pacOp2"));
                p1.setPacTelFax(rs.getString("pacTelFax"));
                p1.setPacTelOutro(rs.getString("pacTelOutro"));
                p1.setPacObs(rs.getString("pacObs"));
                p1.setPacAlert(rs.getString("pacAlerta"));
                p1.setPacDtCadastro(rs.getString("pacDtCadastro"));
                p1.setPacDtUpdate(rs.getString("pacDtUpdate"));
            }
            
            return p1;                

            
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

    // Metodos para Navegacao dos registros
    
    public Paciente PrimeiroRegistro() {
        return BuscaPaciente(FisrtID("tblPacienteMedico"));
    }
    
    public Paciente UltimoRegistro(){    
        return BuscaPaciente(LastID("tblPacienteMedico"));
    }
    
    public Paciente ProximoRegistro(int id) {
        try {
            String sql = "SELECT pacID FROM tblPacienteMedico WHERE pacID > ? LIMIT 1";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                return BuscaPaciente(rs.getInt("pacID"));
            } else {
                return BuscaPaciente(id);
            }
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

    public Paciente RegistroAnterior(int id) {
        try {
            String sql = "SELECT pacID FROM tblPacienteMedico WHERE pacID < ? ORDER by pacID DESC LIMIT 1";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                return BuscaPaciente(rs.getInt("pacID"));
            } else {
                return BuscaPaciente(id);
            }
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
