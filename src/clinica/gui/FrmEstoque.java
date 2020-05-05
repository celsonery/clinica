/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.gui;

import clinica.bean.CatEstoque;
import clinica.bean.Produto;
import clinica.dao.CatEstoqueDao;
import clinica.dao.ProdutoDao;
import clinica.util.OnlyNumberField;
import clinica.util.guis;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author celso
 */
public class FrmEstoque extends javax.swing.JInternalFrame {

    DefaultTableModel tabProdutos, tabCategoria;
    private List<Produto> ProdutoList;
    private List<CatEstoque> catList;
    TableRowSorter sorter;
    int linhaSelecionada;

    /**
     * Creates new form FrmAdmPrecos
     */
    public FrmEstoque() {
        initComponents();
        BuscaTabelas();
        txtAddQtd.setDocument(new OnlyNumberField());
        txtDelQtd.setDocument(new OnlyNumberField());
    }

    private void BuscaTabelas() {
        CatEstoqueDao catDao = new CatEstoqueDao();

        List<CatEstoque> catList = catDao.BuscaCategoria();
        if (!catList.isEmpty()) {
            PreencheCategoria(catList);
            btnNCategoria.setEnabled(true);
        }

        tabProdutos = (DefaultTableModel) jTabProdutos.getModel();
        sorter = new TableRowSorter(tabProdutos);
    }

    private void PreencheCategoria(List<CatEstoque> catList) {

        System.out.println("Vou preencher categoria com " + catList.size() + " elementos.");
        tabCategoria = (DefaultTableModel) jTabCategorias.getModel();
        tabCategoria.setRowCount(0);

        String[] user = new String[]{null};

        for (int i = 0; i < catList.size(); i++) {
            tabCategoria.addRow(user);
            tabCategoria.setValueAt(catList.get(i).getCatNome(), i, 0);
        }
        this.catList = catList;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscaProduto = new clinica.util.JTextUpper();
        lblMsg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabCategorias = new javax.swing.JTable();
        btnNCategoria = new javax.swing.JButton();
        btnEditCategoria = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        txtAddNomeProduto = new clinica.util.JTextUpper();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEntrada = new javax.swing.JButton();
        txtAddQtd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtFornecedor = new clinica.util.JTextUpper();
        txtValor = new clinica.util.JTextUpper();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtDelNomeProduto = new clinica.util.JTextUpper();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDelPessoa = new clinica.util.JTextUpper();
        jLabel8 = new javax.swing.JLabel();
        txtDelDestino = new clinica.util.JTextUpper();
        btnSaida = new javax.swing.JButton();
        txtDelQtd = new javax.swing.JTextField();
        btnViewHistory = new javax.swing.JButton();
        btnXCategoria = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabProdutos = new javax.swing.JTable();
        btnXProduto = new javax.swing.JButton();
        btnNovoProduto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblTotalLista = new javax.swing.JLabel();
        btnEdProduto = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("Controle de Estoque");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrar"));

        txtBuscaProduto.setToolTipText("Digite o texto a ser procurado.");
        txtBuscaProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBuscaProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaProdutoKeyReleased(evt);
            }
        });

        lblMsg.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(0, 0, 255));
        lblMsg.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtBuscaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela de Produtos"));

        jTabCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabCategorias.setToolTipText("Seleciona a categoria de produtos");
        jTabCategorias.setColumnSelectionAllowed(true);
        jTabCategorias.getTableHeader().setReorderingAllowed(false);
        jTabCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabCategoriasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTabCategorias);
        jTabCategorias.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnNCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/novo.png"))); // NOI18N
        btnNCategoria.setToolTipText("Cadastra nova categoria de produtos");
        btnNCategoria.setEnabled(false);
        btnNCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNCategoria.setName(""); // NOI18N
        btnNCategoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNCategoriaActionPerformed(evt);
            }
        });

        btnEditCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Modify.png"))); // NOI18N
        btnEditCategoria.setToolTipText("Exclui categoria de produtos");
        btnEditCategoria.setEnabled(false);
        btnEditCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditCategoria.setName(""); // NOI18N
        btnEditCategoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCategoriaActionPerformed(evt);
            }
        });

        txtAddNomeProduto.setEditable(false);
        txtAddNomeProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtAddNomeProduto.setToolTipText("Produto selecionado.");
        txtAddNomeProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setText("Produto");

        jLabel4.setText("Quantidade");

        btnEntrada.setText("OK");
        btnEntrada.setToolTipText("Adiciona quantidade para o item selecionado");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        txtAddQtd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtAddQtd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAddQtd.setToolTipText("Digite a quantidade para realizar entrada no estoque.");

        jLabel2.setText("Fornecedor");

        jLabel9.setText("Valor");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAddNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEntrada))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(txtAddQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Entrada", jPanel4);

        jLabel5.setText("Produto");

        txtDelNomeProduto.setEditable(false);
        txtDelNomeProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtDelNomeProduto.setToolTipText("Produto selecionado.");
        txtDelNomeProduto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel6.setText("Quantidade");

        jLabel7.setText("Pessoa");

        txtDelPessoa.setToolTipText("Informe a pessoa que realizou o pedido.");
        txtDelPessoa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel8.setText("Destino");

        txtDelDestino.setToolTipText("Informe o destino para onde será realizada a retirada.");
        txtDelDestino.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDelDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDelDestinoActionPerformed(evt);
            }
        });

        btnSaida.setText("OK");
        btnSaida.setToolTipText("Retira do estoque quantidade de produto selecionado");
        btnSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaActionPerformed(evt);
            }
        });

        txtDelQtd.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtDelQtd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDelQtd.setToolTipText("Digite a quantidade do produto para realizar retirada do estoque.");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSaida))
                    .addComponent(txtDelPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDelNomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDelDestino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(txtDelQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDelNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDelQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDelPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDelDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Saida", jPanel5);

        btnViewHistory.setText("Visualizar atividade de histórico");
        btnViewHistory.setToolTipText("Visualiza o histórico do produto selecionado");
        btnViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHistoryActionPerformed(evt);
            }
        });

        btnXCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/DeleteExame.png"))); // NOI18N
        btnXCategoria.setToolTipText("Exclui categoria de produtos");
        btnXCategoria.setEnabled(false);
        btnXCategoria.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXCategoria.setName(""); // NOI18N
        btnXCategoria.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(10, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEditCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnViewHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEditCategoria, btnNCategoria});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEditCategoria, btnNCategoria});

        jTabbedPane1.getAccessibleContext().setAccessibleName("Entrada");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Exames e Procedimentos"));

        jTabProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabProdutos.setToolTipText("Seleciona o produto");
        jTabProdutos.setColumnSelectionAllowed(true);
        jTabProdutos.getTableHeader().setReorderingAllowed(false);
        jTabProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabProdutosMouseClicked(evt);
            }
        });
        jTabProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabProdutosKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTabProdutos);
        jTabProdutos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTabProdutos.getColumnModel().getColumnCount() > 0) {
            jTabProdutos.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTabProdutos.getColumnModel().getColumn(1).setPreferredWidth(10);
        }

        btnXProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/DeleteExame.png"))); // NOI18N
        btnXProduto.setText("Excluir");
        btnXProduto.setToolTipText("Exclui produto selecionado");
        btnXProduto.setEnabled(false);
        btnXProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXProdutoActionPerformed(evt);
            }
        });

        btnNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/novo.png"))); // NOI18N
        btnNovoProduto.setText("Novo");
        btnNovoProduto.setToolTipText("Cadastrar novo produto");
        btnNovoProduto.setEnabled(false);
        btnNovoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });

        jLabel3.setText("Total:");

        lblTotalLista.setForeground(new java.awt.Color(0, 0, 255));
        lblTotalLista.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalLista.setText("0");

        btnEdProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Modify.png"))); // NOI18N
        btnEdProduto.setText("Editar");
        btnEdProduto.setToolTipText("Editar o nome do produto selecionado.");
        btnEdProduto.setEnabled(false);
        btnEdProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEdProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdProdutoActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/sair2.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setToolTipText("Exclui produto selecionado");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalLista, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNovoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnEdProduto, btnNovoProduto, btnSair, btnXProduto});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTotalLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNovoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair)
                    .addComponent(btnEdProduto, 0, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnEdProduto, btnNovoProduto, btnSair, btnXProduto});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabCategoriasMouseClicked

        if (jTabCategorias.getSelectedRow() >= 0) {
            btnEditCategoria.setEnabled(true);
            btnNovoProduto.setEnabled(true);
            btnXCategoria.setEnabled(true);
        } else {
            btnEditCategoria.setEnabled(false);
            btnNovoProduto.setEnabled(false);
            btnXCategoria.setEnabled(false);
        }

        ProdutoDao catDao = new ProdutoDao();
        ProdutoList = catDao.BuscarListaDeProdutos(this.catList.get(jTabCategorias.getSelectedRow()).getCatID());

        if (!ProdutoList.isEmpty()) {
            tabProdutos.setNumRows(0);

            String[] prodTitle = new String[]{null, null};

            for (int i = 0; i < ProdutoList.size(); i++) {
                tabProdutos.addRow(prodTitle);
                tabProdutos.setValueAt(ProdutoList.get(i).getProdNome(), i, 0);
                tabProdutos.setValueAt(ProdutoList.get(i).getProdQuantidade(), i, 1);
            }
            jScrollPane2.getVerticalScrollBar().setMaximum(jTabProdutos.getRowCount());

            lblTotalLista.setText(String.valueOf(tabProdutos.getRowCount()));
            txtBuscaProduto.requestFocus();
        } else {
            tabProdutos.setNumRows(0);

            jScrollPane2.getVerticalScrollBar().setMaximum(jTabProdutos.getRowCount());

            btnXProduto.setEnabled(false);
            lblTotalLista.setText(String.valueOf(tabProdutos.getRowCount()));
        }
    }//GEN-LAST:event_jTabCategoriasMouseClicked

    private void jTabProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabProdutosMouseClicked
        if (jTabProdutos.getSelectedRow() >= 0) {
            txtAddNomeProduto.setText(tabProdutos.getValueAt(jTabProdutos.getSelectedRow(), 0).toString());
            txtDelNomeProduto.setText(tabProdutos.getValueAt(jTabProdutos.getSelectedRow(), 0).toString());
            this.linhaSelecionada = jTabProdutos.getSelectedRow();
            btnXProduto.setEnabled(true);
            btnEdProduto.setEnabled(true);
        }

    }//GEN-LAST:event_jTabProdutosMouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtBuscaProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaProdutoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            if (tabProdutos.getRowCount() != 0) {
                jTabProdutos.requestFocus();
                jTabProdutos.setRowSelectionInterval(0, 0);
                btnXProduto.setEnabled(true);
            }
        } else {
            if (!txtBuscaProduto.getText().isEmpty()) {
                int tam = txtBuscaProduto.getText().length();

                System.out.println("Tamanho da string: " + tam);

                for (int linha = 0; linha < jTabProdutos.getRowCount(); linha++) {
                    String tabela = (String) jTabProdutos.getValueAt(linha, 0);
                    if (tabela.substring(0, tam).equals(txtBuscaProduto.getText())) {
                        jTabProdutos.setRowSelectionInterval(linha, linha);
                        jTabProdutos.scrollRectToVisible(jTabProdutos.getCellRect(jTabProdutos.getSelectedRow(), 0, true));
                        break;
                    }
                }
            } else {
                jTabProdutos.setRowSelectionInterval(0, 0);
                jTabProdutos.scrollRectToVisible(jTabProdutos.getCellRect(0, 0, true));
            }

        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTabProdutos.getSelectedRow() >= 0) {
                jTabProdutosMouseClicked(null);
            }
        }
    }//GEN-LAST:event_txtBuscaProdutoKeyReleased

    private void btnEditCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCategoriaActionPerformed
        String novoNomeTab = JOptionPane.showInputDialog(this, "Digite o novo nome para a tabela.", jTabCategorias.getValueAt(jTabCategorias.getSelectedRow(), 0));

        if (novoNomeTab != null) {
            CatEstoqueDao catDao = new CatEstoqueDao();
                     

            if( catDao.EditarCategoria(novoNomeTab, catList.get(jTabCategorias.getSelectedRow()).getCatID()) == 1 ){
                jTabCategorias.setValueAt(novoNomeTab, jTabCategorias.getSelectedRow(), 0);
            }
        }
    }//GEN-LAST:event_btnEditCategoriaActionPerformed

    private void btnNCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNCategoriaActionPerformed
        String resposta = JOptionPane.showInputDialog(this, "Digite o nome da nova categoria de produtos", "Incluir nova Categoria de Produtos", JOptionPane.INFORMATION_MESSAGE);

        System.out.println("Resposta: " + resposta);

        if (resposta == null || resposta.equals("")) {
        } else {
            CatEstoqueDao prodDao = new CatEstoqueDao();

            if (prodDao.AdicionaCategoria(resposta.toUpperCase()) == 1) {
                BuscaTabelas();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao Adicionar Categoria digitada!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnNCategoriaActionPerformed

    private void jTabProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabProdutosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jTabProdutosMouseClicked(null);
        }
    }//GEN-LAST:event_jTabProdutosKeyPressed

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed

        String prodNome = JOptionPane.showInputDialog(this, "Cadastrar novo produto na categoria selecionada, Digite o nome do novo produto", "Cadastro de Novo Produto", JOptionPane.INFORMATION_MESSAGE);

        if (!prodNome.equals("")) {
            Produto prod = new Produto();

            prod.setProdNome(prodNome.toUpperCase());
            prod.setProdQuantidade(0);
            prod.setInformar(0);
            prod.setTblCategoria_catID(catList.get(jTabCategorias.getSelectedRow()).getCatID());

            ProdutoDao prodDao = new ProdutoDao();

            if (prodDao.AdicionarProduto(prod) == 1) {
                jTabCategoriasMouseClicked(null);
            }
        }
        /*
         FrmAddExame addExame = new FrmAddExame();

         if (jTabCategorias.getSelectedRow() >= 0) {
         addExame.setTabela(tabList.get(jTabCategorias.getSelectedRow()).getTexNome());
         System.out.println(tabList.get(jTabCategorias.getSelectedRow()).getTexNome());
         } else {
         addExame.setTabela("");
         }
         addExame.PreencherCombo(tabList);
         addExame.setLocationRelativeTo(null);
         addExame.setVisible(true);
         */
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void txtDelDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDelDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDelDestinoActionPerformed

    private void btnXProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXProdutoActionPerformed
        if (jTabProdutos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Você precisa selecionar um produto", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir produto selecionado?", "ATENÇÂO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                System.out.println("Vou excluir Produto: " + this.ProdutoList.get(jTabProdutos.getSelectedRow()).getProdNome());

                ProdutoDao prodDao = new ProdutoDao();

                if (prodDao.ExcluirProduto(this.ProdutoList.get(jTabProdutos.getSelectedRow()).getProdID()) == 0) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir produto selecionado!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                } else {
                    tabProdutos.removeRow(jTabProdutos.getSelectedRow());
                }
                btnXProduto.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnXProdutoActionPerformed

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed

        this.setEnabled(false);
        txtAddNomeProduto.setEnabled(false);
        txtAddQtd.setEnabled(false);
        txtFornecedor.setEnabled(false);
        txtValor.setEnabled(false);

        if (!txtAddNomeProduto.getText().equals("")) {
            if (!txtAddQtd.getText().equals("0") || txtAddQtd.getText().equals("")) {
                ProdutoDao prodDao = new ProdutoDao();

                if (JOptionPane.showConfirmDialog(this, "Deseja dar entrada em " + txtAddNomeProduto.getText() + " a quantidade " + txtAddQtd.getText() + " ?", "Confirma entrada", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
                    // Atualiza estoque com entrada de produto
                    if (prodDao.EntradaEstoque(this.ProdutoList.get(jTabProdutos.getSelectedRow()), Integer.parseInt(txtAddQtd.getText()), "Entrada", txtFornecedor.getText(), Integer.parseInt(txtValor.getText())) != 0) {

                        // Atualiza tabela com nova quantidade de produto
                        int qtdAnt = Integer.parseInt(jTabProdutos.getValueAt(linhaSelecionada, 1).toString());
                        int qtdNov = qtdAnt + Integer.parseInt(txtAddQtd.getText());
                        tabProdutos.setValueAt(qtdNov, jTabProdutos.getSelectedRow(), 1);

                        txtAddQtd.setText(null);
                        txtFornecedor.setText(null);
                        txtValor.setText(null);

                        JOptionPane.showMessageDialog(this, "Entrada de produto realizada com sucesso!", "Entrada de produto", JOptionPane.PLAIN_MESSAGE);
                    }
                }
            }
        }

        this.setEnabled(true);
        txtAddNomeProduto.setEnabled(true);
        txtAddQtd.setEnabled(true);
        txtFornecedor.setEnabled(true);
        txtValor.setEnabled(true);
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaActionPerformed

        this.setEnabled(false);
        txtDelQtd.setEnabled(false);
        txtDelPessoa.setEnabled(false);
        txtDelDestino.setEnabled(false);

        if (!txtDelNomeProduto.getText().equals("")) {
            if (!txtDelQtd.getText().equals("0") || txtDelQtd.getText().equals("")) {
                ProdutoDao prodDao = new ProdutoDao();

                // Verifica se a quantidade de saida e invalida
                int QtdSaida = Integer.parseInt(txtDelQtd.getText());
                int QtdEst = this.ProdutoList.get(linhaSelecionada).getProdQuantidade();
                if (!(QtdSaida >= QtdEst)) {

                    if (JOptionPane.showConfirmDialog(this, "Deseja realizar saída de produto " + txtDelNomeProduto.getText() + " ?", "Saída de produto do estoque", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
                        // Atualiza estoque com saida de produto
                        if (prodDao.SaidaEstoque(this.ProdutoList.get(jTabProdutos.getSelectedRow()), Integer.parseInt(txtDelQtd.getText()), "Saida", txtDelPessoa.getText(), txtDelDestino.getText()) != 0) {

                            // Atualiza tabela com nova quantidade de produto
                            int qtdAnt = Integer.parseInt(jTabProdutos.getValueAt(linhaSelecionada, 1).toString());
                            int qtdNov = qtdAnt - Integer.parseInt(txtDelQtd.getText());
                            tabProdutos.setValueAt(qtdNov, jTabProdutos.getSelectedRow(), 1);

                            txtDelQtd.setText(null);
                            txtDelPessoa.setText(null);
                            txtDelDestino.setText(null);

                            JOptionPane.showMessageDialog(this, "Saída de produto realizada com sucesso!", "Saída de produto", JOptionPane.PLAIN_MESSAGE);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "A Quantidade informada de saida: " + QtdSaida + " é maior que a existente em estoque: " + QtdEst, "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }

        this.setEnabled(true);
        txtDelQtd.setEnabled(false);
        txtDelPessoa.setEnabled(false);
        txtDelDestino.setEnabled(false);
    }//GEN-LAST:event_btnSaidaActionPerformed

    private void btnEdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdProdutoActionPerformed
        String novoNomeProduto = JOptionPane.showInputDialog(this, "Digite o novo nome para o produto", jTabProdutos.getValueAt(jTabProdutos.getSelectedRow(), 0));

        if (novoNomeProduto != null) {
            ProdutoDao prodDao = new ProdutoDao();

            if (prodDao.EditarProduto(this.ProdutoList.get(jTabProdutos.getSelectedRow()), novoNomeProduto) == 1) {
                jTabProdutos.setValueAt(novoNomeProduto, jTabProdutos.getSelectedRow(), 0);
            }

        }

    }//GEN-LAST:event_btnEdProdutoActionPerformed

    private void btnViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHistoryActionPerformed
        if (!txtAddNomeProduto.getText().equals("")) {

            System.out.println("Buscar historico para " + ProdutoList.get(jTabProdutos.getSelectedRow()).getProdID());
            FrmHistEstoque fHist = new FrmHistEstoque();
            ProdutoDao prod = new ProdutoDao();

            fHist.RecebeDados(prod.ListarHistorico(this.ProdutoList.get(jTabProdutos.getSelectedRow()).getProdID()));

            fHist.setLocationRelativeTo(this);
            fHist.setVisible(true);
        }
    }//GEN-LAST:event_btnViewHistoryActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        guis.setiEstoque(null);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnXCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXCategoriaActionPerformed
        this.setEnabled(false);

        if (jTabCategorias.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Você precisa selecionar uma categoria", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        } else if (jTabProdutos.getRowCount() > 0) {
            JOptionPane.showMessageDialog(this, "Categoria com produtos relacionados, não pode ser excluida!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        } else {
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esta categoria de produtos?", "ATENÇÂO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                System.out.println("Vou excluir Categoria de produtos: " + this.catList.get(jTabCategorias.getSelectedRow()).getCatNome());

                CatEstoqueDao dao = new CatEstoqueDao();

                if (dao.DeletaCategoria(this.catList.get(jTabCategorias.getSelectedRow()).getCatID()) == 0) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir Categoria selecionada!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                } else {
                    tabCategoria.removeRow(jTabCategorias.getSelectedRow());
                }
            }
        }

        this.setEnabled(true);

    }//GEN-LAST:event_btnXCategoriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdProduto;
    private javax.swing.JButton btnEditCategoria;
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnNCategoria;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnSaida;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnViewHistory;
    private javax.swing.JButton btnXCategoria;
    private javax.swing.JButton btnXProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTabCategorias;
    private javax.swing.JTable jTabProdutos;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblTotalLista;
    private clinica.util.JTextUpper txtAddNomeProduto;
    private javax.swing.JTextField txtAddQtd;
    private clinica.util.JTextUpper txtBuscaProduto;
    private clinica.util.JTextUpper txtDelDestino;
    private clinica.util.JTextUpper txtDelNomeProduto;
    private clinica.util.JTextUpper txtDelPessoa;
    private javax.swing.JTextField txtDelQtd;
    private clinica.util.JTextUpper txtFornecedor;
    private clinica.util.JTextUpper txtValor;
    // End of variables declaration//GEN-END:variables

    public void FiltrarProdutos(String text) {

        jTabProdutos.setRowSorter(sorter);
        String texto = text;

        if (texto.length() == 0) {
            sorter.setRowFilter(null);
            System.out.println("Informe um valor");
        } else {
            try {
                sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto));
            } catch (Exception ex) {
                System.out.println("Valor nao encontrado!");
            }
        }
    }    
}
