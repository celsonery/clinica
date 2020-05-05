/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.dao;

import clinica.acessodb.ConexaoSQlite;
import clinica.bean.LogEstoque;
import clinica.bean.Produto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author celso
 */
public class ProdutoDao {

    Connection conn;

    public ProdutoDao() {
        conn = ConexaoSQlite.getConexao();
    }

    public List<Produto> BuscarListaDeProdutos(int Categoria) {

        try {
            List<Produto> ListaProduto = new ArrayList<Produto>();

            String sql = "SELECT * FROM tblProduto WHERE tblCategoria_catID = ? ORDER BY prodNome";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Categoria);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Produto prod = new Produto();
                prod.setProdID(rs.getInt("prodID"));
                prod.setProdNome(rs.getString("prodNome"));
                prod.setProdQuantidade(rs.getInt("prodQuantidade"));

                ListaProduto.add(prod);
            }
            stmt.close();
            rs.close();
            return ListaProduto;

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

    public boolean VerifcarProdutoExiste(String text) {
        try {
            String sql = "SELECT * FROM tblProduto WHERE prodNome = ?";
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

    public int AdicionarProduto(Produto prod) {
        try {
            String sql = "INSERT INTO tblProduto VALUES(null, ?, ?, ?, ?)";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, prod.getProdNome());
            stmt.setInt(2, prod.getProdQuantidade());
            stmt.setInt(3, prod.getInformar());
            stmt.setInt(4, prod.getTblCategoria_catID());

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

    public int ExcluirProduto(int prod) {
        try {
            String sql = "DELETE FROM tblProduto WHERE prodID = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, prod);

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

    public int EditarProduto(Produto prod, String novoNome) {
        try {
            String sql = "UPDATE tblProduto SET prodNome = ? WHERE prodID = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, novoNome.toUpperCase());
            stmt.setInt(2, prod.getProdID());

            return stmt.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int EntradaEstoque(Produto prod, int Quantidade, String operacao, String fornecedor, int Valor) {
        try {
            String sql = "UPDATE tblProduto SET prodQuantidade = prodQuantidade + ? WHERE prodID = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Quantidade);
            stmt.setInt(2, prod.getProdID());

            if (stmt.executeUpdate() != 0) {
                System.out.println("Atualizacao do estoque ok");
                String sqlHist = "INSERT INTO tblLogEstoque VALUES(null, 'Entrada', " + DataAtual() + ", null, null, ?, ?, ?, null, ?)";

                PreparedStatement stmtHist = conn.prepareStatement(sqlHist);
                stmtHist.setInt(1, Quantidade);
                stmtHist.setString(2, fornecedor);
                stmtHist.setInt(3, Valor);
                stmtHist.setInt(4, prod.getProdID());

                if (stmtHist.executeUpdate() != 0) {
                    System.out.println("Historico Entrada OK");
                    return 1;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public int SaidaEstoque(Produto prod, int Quantidade, String operacao, String pessoa, String destino) {
        try {
            String sql = "UPDATE tblProduto SET prodQuantidade = prodQuantidade - ? WHERE prodID = ?";

            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Quantidade);
            stmt.setInt(2, prod.getProdID());

            if (stmt.executeUpdate() != 0) {
                System.out.println("Atualizacao do estoque ok");

                String sqlHist = "INSERT INTO tblLogEstoque VALUES(null, 'Saida', " + DataAtual() + ", ?, ?, ?, null, ?)";

                PreparedStatement stmtHist = conn.prepareStatement(sqlHist);
                stmtHist.setString(1, pessoa);
                stmtHist.setString(2, destino);
                stmtHist.setInt(3, Quantidade);
                stmtHist.setInt(4, prod.getProdID());

                if (stmtHist.executeUpdate() != 0) {
                    System.out.println("Historico Saida OK");
                    return 1;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return 0;
    }

    public List<LogEstoque> ListarHistorico(int logId) {
        try {
            System.out.println("Buscando historico");
            List<LogEstoque> lista = new ArrayList<LogEstoque>();

            String sql = "SELECT * FROM tblLogEstoque WHERE tblProduto_prodID = ? ORDER BY logID";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, logId);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                LogEstoque log = new LogEstoque();

                log.setId(rs.getLong("logID"));
                log.setTipo(rs.getString("logTipo"));
                log.setData(rs.getString("logData"));
                log.setPessoa(rs.getString("logPessoa"));
                log.setDestino(rs.getString("logDestino"));
                log.setQuantidade(rs.getInt("logQuantidade"));

                lista.add(log);
            }

            stmt.close();
            rs.close();

            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private String DataAtual() {
        Date hoje = new Date(System.currentTimeMillis());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        return formato.format(hoje);
    }

}
