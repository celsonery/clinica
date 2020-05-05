/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.gui;

import static clinica.Clinica.config;
import clinica.bean.Exame;
import clinica.bean.Orcamento;
import clinica.bean.TabelaPrecos;
import clinica.dao.ExameDao;
import clinica.dao.TabelaPrecosDao;
import clinica.util.guis;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author celso
 */
public class FrmPrecos extends javax.swing.JInternalFrame {

    DefaultTableModel tabExames, tabOrca, tabTabelaPrecos;
    private List<Exame> ExameList;
    private List<TabelaPrecos> tabList;
    TableRowSorter sorter;
    private final DefaultTableCellRenderer direita = new DefaultTableCellRenderer();

    /**
     * Creates new form FrmAdmPrecos
     */
    public FrmPrecos() {
        initComponents();
        BuscaTabelas();
        VerifcarNivel();
    }

    public void BuscaTabelas() {
        TabelaPrecosDao TabPrecos = new TabelaPrecosDao();

        List<TabelaPrecos> tab = TabPrecos.BuscaTabela();
        if (!tab.isEmpty()) {
            PreencheTabela(tab);
            if (config.getNivel() == 1) {
                btnNTabela.setEnabled(true);
            }
        }

        tabExames = (DefaultTableModel) jTabExames.getModel();
        //tabTabelas = (DefaultTableModel) jTabTabelas.getModel();
        tabOrca = (DefaultTableModel) jTabOrca.getModel();
        sorter = new TableRowSorter(tabExames);
    }

    private void PreencheTabela(List<TabelaPrecos> tabList) {

        System.out.println("Vou preencher tabela com " + tabList.size() + " elementos.");
        tabTabelaPrecos = (DefaultTableModel) jTabTabelas.getModel();
        tabTabelaPrecos.setRowCount(0);

        String[] user = new String[]{null};

        for (int i = 0; i < tabList.size(); i++) {
            tabTabelaPrecos.addRow(user);
            tabTabelaPrecos.setValueAt(tabList.get(i).getTexNome(), i, 0);
        }
        this.tabList = tabList;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscaExame = new clinica.util.JTextUpper();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabTabelas = new javax.swing.JTable();
        btnNTabela = new javax.swing.JButton();
        btnXTabela = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabOrca = new javax.swing.JTable();
        btnPOrcamento = new javax.swing.JButton();
        btnLOrcamento = new javax.swing.JButton();
        btnXOrcamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblOrcamento = new javax.swing.JLabel();
        btnEditTabela = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabExames = new javax.swing.JTable();

        btnPrintCol1 = new javax.swing.JButton();
        btnPrintCol3 = new javax.swing.JButton();
        btnXExame = new javax.swing.JButton();
        btnAddOrcamento = new javax.swing.JButton();
        btnNovoExame = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblTotalLista = new javax.swing.JLabel();
        btnSaveExame = new javax.swing.JButton();
        btnAddOrcamento1 = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("Tabela de Preços");
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

        txtBuscaExame.setToolTipText("Digite o texto a ser procurado.");
        txtBuscaExame.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBuscaExame.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaExameKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscaExame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtBuscaExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela de Preços"));

        jTabTabelas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tabelas"
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
        jTabTabelas.setToolTipText("Selecione a tabela de preços desejada.");
        jTabTabelas.getTableHeader().setReorderingAllowed(false);
        jTabTabelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabTabelasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTabTabelas);
        jTabTabelas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnNTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/novo.png"))); // NOI18N
        btnNTabela.setToolTipText("Cadastra nova Tabela de exames");
        btnNTabela.setEnabled(false);
        btnNTabela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNTabela.setName(""); // NOI18N
        btnNTabela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNTabelaActionPerformed(evt);
            }
        });

        btnXTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/DeleteExame.png"))); // NOI18N
        btnXTabela.setToolTipText("Exclui tabela selecionada");
        btnXTabela.setEnabled(false);
        btnXTabela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXTabela.setName(""); // NOI18N
        btnXTabela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXTabelaActionPerformed(evt);
            }
        });

        jTabOrca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exame", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
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
        jTabOrca.setToolTipText("Selecione o exame/procedimento desejado.");
        jTabOrca.getTableHeader().setReorderingAllowed(false);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        jTabOrca.getColumnModel().getColumn(1).setCellRenderer(direita);
        jTabOrca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabOrcaMouseClicked(evt);
            }
        });
        jTabOrca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTabOrcaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTabOrca);
        jTabOrca.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTabOrca.getColumnModel().getColumnCount() > 0) {
            jTabOrca.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTabOrca.getColumnModel().getColumn(1).setPreferredWidth(10);
        }

        btnPOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Printer_Blue.png"))); // NOI18N
        btnPOrcamento.setToolTipText("Imprime Orçamento");
        btnPOrcamento.setEnabled(false);
        btnPOrcamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPOrcamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPOrcamentoActionPerformed(evt);
            }
        });

        btnLOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/limpar.png"))); // NOI18N
        btnLOrcamento.setToolTipText("Limpa orçamento");
        btnLOrcamento.setEnabled(false);
        btnLOrcamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLOrcamento.setName(""); // NOI18N
        btnLOrcamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLOrcamentoActionPerformed(evt);
            }
        });

        btnXOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/DeleteExame.png"))); // NOI18N
        btnXOrcamento.setToolTipText("Retira o exame selecionado do orçamento");
        btnXOrcamento.setEnabled(false);
        btnXOrcamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXOrcamento.setName(""); // NOI18N
        btnXOrcamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXOrcamentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Orçamento");

        lblOrcamento.setForeground(new java.awt.Color(255, 0, 0));
        lblOrcamento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrcamento.setToolTipText("");

        btnEditTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Modify.png"))); // NOI18N
        btnEditTabela.setToolTipText("Exclui tabela selecionada");
        btnEditTabela.setEnabled(false);
        btnEditTabela.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditTabela.setName(""); // NOI18N
        btnEditTabela.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTabelaActionPerformed(evt);
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
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(lblOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnXOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNTabela, btnXTabela});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnLOrcamento, btnPOrcamento, btnXOrcamento});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnNTabela)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnXOrcamento)
                    .addComponent(btnLOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNTabela, btnXTabela});

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnLOrcamento, btnPOrcamento, btnXOrcamento});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Exames e Procedimentos"));

        jTabExames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exame / Procedimento", "Lab 1", "Lab 2", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTabExames.setToolTipText("Selecione o exame/procedimento desejado.");
        jTabExames.setColumnSelectionAllowed(true);
        jTabExames.getTableHeader().setReorderingAllowed(false);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);
        jTabExames.getColumnModel().getColumn(1).setCellRenderer(direita);
        jTabExames.getColumnModel().getColumn(2).setCellRenderer(direita);
        jTabExames.getColumnModel().getColumn(3).setCellRenderer(direita);
        jTabExames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabExamesMouseClicked(evt);
            }
        });
        jTabExames.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTabExamesPropertyChange(evt);
            }
        });
        jTabExames.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabExamesKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTabExames);
        jTabExames.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTabExames.getColumnModel().getColumnCount() > 0) {
            jTabExames.getColumnModel().getColumn(0).setPreferredWidth(300);
            jTabExames.getColumnModel().getColumn(1).setPreferredWidth(10);
            jTabExames.getColumnModel().getColumn(2).setPreferredWidth(10);
            jTabExames.getColumnModel().getColumn(3).setPreferredWidth(10);
        }

        btnPrintCol1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Printer_Blue.png"))); // NOI18N
        btnPrintCol1.setText("1 COL");
        btnPrintCol1.setToolTipText("Imprime tabela de preços com somente preço final");
        btnPrintCol1.setEnabled(false);
        btnPrintCol1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrintCol1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrintCol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintCol1ActionPerformed(evt);
            }
        });

        btnPrintCol3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Printer_Green.png"))); // NOI18N
        btnPrintCol3.setText("3 COL");
        btnPrintCol3.setToolTipText("Imprime tabela de preços com os 3 preços.");
        btnPrintCol3.setEnabled(false);
        btnPrintCol3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrintCol3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrintCol3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintCol3ActionPerformed(evt);
            }
        });

        btnXExame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/DeleteExame.png"))); // NOI18N
        btnXExame.setText("Excluir");
        btnXExame.setToolTipText("Excluir exame / procedimento selecionado");
        btnXExame.setEnabled(false);
        btnXExame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnXExame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnXExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXExameActionPerformed(evt);
            }
        });

        btnAddOrcamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Orcamento.png"))); // NOI18N
        btnAddOrcamento.setText("Orça");
        btnAddOrcamento.setToolTipText("Adiciona exame selecionado ao orçamento");
        btnAddOrcamento.setEnabled(false);
        btnAddOrcamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddOrcamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddOrcamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrcamentoActionPerformed(evt);
            }
        });

        btnNovoExame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/novo.png"))); // NOI18N
        btnNovoExame.setText("Novo");
        btnNovoExame.setToolTipText("Cadastrar novo exame ou procedimento");
        btnNovoExame.setEnabled(false);
        btnNovoExame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoExame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoExameActionPerformed(evt);
            }
        });

        jLabel3.setText("Total:");

        lblTotalLista.setForeground(new java.awt.Color(0, 0, 255));
        lblTotalLista.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalLista.setText("0");

        btnSaveExame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/salvar.png"))); // NOI18N
        btnSaveExame.setText("Salvar");
        btnSaveExame.setToolTipText("Salvar alterações no exame ou procedimento selecionado.");
        btnSaveExame.setEnabled(false);
        btnSaveExame.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSaveExame.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSaveExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveExameActionPerformed(evt);
            }
        });

        btnAddOrcamento1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/sair2.png"))); // NOI18N
        btnAddOrcamento1.setText("Sair");
        btnAddOrcamento1.setToolTipText("Fecha janela de preços de exames/procedimentos.");
        btnAddOrcamento1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddOrcamento1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddOrcamento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrcamento1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNovoExame, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSaveExame, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintCol1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPrintCol3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXExame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddOrcamento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotalLista, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddOrcamento1))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddOrcamento, btnAddOrcamento1, btnNovoExame, btnPrintCol1, btnPrintCol3, btnSaveExame, btnXExame});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblTotalLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoExame)
                    .addComponent(btnPrintCol1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAddOrcamento)
                        .addComponent(btnXExame)
                        .addComponent(btnPrintCol3))
                    .addComponent(btnSaveExame)
                    .addComponent(btnAddOrcamento1)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddOrcamento, btnAddOrcamento1, btnNovoExame, btnPrintCol1, btnPrintCol3, btnSaveExame, btnXExame});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabTabelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabTabelasMouseClicked
        System.out.println("Verificando nivel");
        if (config.getNivel() == 1) {
            if (jTabTabelas.getSelectedRow() >= 0) {
                btnNTabela.setEnabled(true);
                btnXTabela.setEnabled(true);
                btnEditTabela.setEnabled(true);
                btnNovoExame.setEnabled(true);
                btnSaveExame.setEnabled(true);
                btnXExame.setEnabled(true);
                System.out.println("nivel 1 habilitando botoes");
            } else {
                btnNTabela.setEnabled(false);
                btnXTabela.setEnabled(false);
                btnEditTabela.setEnabled(false);
                btnNovoExame.setEnabled(false);
                btnSaveExame.setEnabled(false);
                btnXExame.setEnabled(false);
                System.out.println("nivel nao e 1 desabilitando botoes");
            }
        }

        ExameDao exDao = new ExameDao();

        ExameList = exDao.BuscaListaDeExame(this.tabList.get(jTabTabelas.getSelectedRow()).getTexID());
        jTabExames.getColumnModel().getColumn(1).setHeaderValue(tabList.get(jTabTabelas.getSelectedRow()).getTexCol1());
        jTabExames.getColumnModel().getColumn(2).setHeaderValue(tabList.get(jTabTabelas.getSelectedRow()).getTexCol2());
        jTabExames.getTableHeader().resizeAndRepaint();

        if (!ExameList.isEmpty()) {

            tabExames.setRowCount(0);

            String[] exTitle = new String[]{null, null, null, null};

            DecimalFormat df = new DecimalFormat("##0.00");
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumFractionDigits(2);
            nf.setMaximumFractionDigits(2);

            for (int i = 0; i < ExameList.size(); i++) {
                tabExames.addRow(exTitle);
                tabExames.setValueAt(ExameList.get(i).getExNome(), i, 0);
                tabExames.setValueAt(df.format(ExameList.get(i).getExCol1()), i, 1);
                tabExames.setValueAt(df.format(ExameList.get(i).getExCol2()), i, 2);
                tabExames.setValueAt(df.format(ExameList.get(i).getExPreco()), i, 3);
            }

            jScrollPane2.getVerticalScrollBar().setMaximum(jTabExames.getRowCount());

            btnPrintCol1.setEnabled(true);
            btnPrintCol3.setEnabled(true);
            lblTotalLista.setText(String.valueOf(tabExames.getRowCount()));
            txtBuscaExame.requestFocus();
        } else {
            tabExames.setNumRows(0);

            jScrollPane2.getVerticalScrollBar().setMaximum(jTabExames.getRowCount());

            btnPrintCol1.setEnabled(false);
            btnPrintCol3.setEnabled(false);
            btnXExame.setEnabled(false);
            btnAddOrcamento.setEnabled(false);
            lblTotalLista.setText(String.valueOf(tabExames.getRowCount()));
        }
    }//GEN-LAST:event_jTabTabelasMouseClicked

    private void btnAddOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrcamentoActionPerformed
        String[] tabOrcaTitle = new String[]{null, null};

        int linha = tabOrca.getRowCount();
        int linhaSel = jTabExames.getSelectedRow();

        System.out.println("Orcamento RowCount: " + linha);
        System.out.println("Linha selecionada: " + linhaSel);

        tabOrca.addRow(tabOrcaTitle);
        tabOrca.setValueAt(tabExames.getValueAt(linhaSel, 0), linha, 0);
        tabOrca.setValueAt(tabExames.getValueAt(linhaSel, 3), linha, 1);

        CalculaOrcamento();

        btnPOrcamento.setEnabled(true);
        btnLOrcamento.setEnabled(true);
    }//GEN-LAST:event_btnAddOrcamentoActionPerformed

    private void btnXOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXOrcamentoActionPerformed
        tabOrca.removeRow(jTabOrca.getSelectedRow());
        CalculaOrcamento();

        if (tabOrca.getRowCount() == 0) {
            btnPOrcamento.setEnabled(false);
            btnLOrcamento.setEnabled(false);
        }
        btnXOrcamento.setEnabled(false);
    }//GEN-LAST:event_btnXOrcamentoActionPerformed

    private void btnLOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLOrcamentoActionPerformed
        tabOrca.setRowCount(0);
        CalculaOrcamento();
        btnPOrcamento.setEnabled(false);
        btnLOrcamento.setEnabled(false);
        btnXOrcamento.setEnabled(false);
    }//GEN-LAST:event_btnLOrcamentoActionPerformed

    private void jTabExamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabExamesMouseClicked
        if (config.getNivel() == 1) {
            if (jTabExames.getSelectedRow() >= 0) {
                btnSaveExame.setEnabled(true);
                btnAddOrcamento.setEnabled(true);
                btnXExame.setEnabled(true);
            } else {
                btnAddOrcamento.setEnabled(false);
                btnXExame.setEnabled(false);
                btnSaveExame.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jTabExamesMouseClicked

    private void jTabOrcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabOrcaMouseClicked
        if (jTabOrca.getSelectedRow() >= 0) {
            btnXOrcamento.setEnabled(true);
            btnLOrcamento.setEnabled(true);
        } else {
            btnXOrcamento.setEnabled(false);
            btnLOrcamento.setEnabled(false);
        }
    }//GEN-LAST:event_jTabOrcaMouseClicked

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
    }//GEN-LAST:event_formInternalFrameClosing

    private void txtBuscaExameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaExameKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            if (tabExames.getRowCount() != 0) {
                jTabExames.requestFocus();
                jTabExames.setRowSelectionInterval(0, 0);
                btnXExame.setEnabled(true);
                btnAddOrcamento.setEnabled(true);
            }
        } else {
            if (!txtBuscaExame.getText().isEmpty()) {
                int tam = txtBuscaExame.getText().length();

                System.out.println("Tamanho da string: " + tam);
                for (int linha = 0; linha < jTabExames.getRowCount(); linha++) {
                    String tabela = (String) jTabExames.getValueAt(linha, 0);
                    if (tabela.substring(0, tam).equals(txtBuscaExame.getText())) {
                        jTabExames.setRowSelectionInterval(linha, linha);
                        jTabExames.scrollRectToVisible(jTabExames.getCellRect(jTabExames.getSelectedRow(), 0, true));
                        break;
                    }
                }
            } else {
                jTabExames.setRowSelectionInterval(0, 0);
                jTabExames.scrollRectToVisible(jTabExames.getCellRect(0, 0, true));
            }

        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (jTabExames.getSelectedRow() >= 0) {
                btnAddOrcamentoActionPerformed(null);
            }
        }
    }//GEN-LAST:event_txtBuscaExameKeyReleased

    private void btnXTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXTabelaActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esta tabela de exames?", "ATENÇÂO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            System.out.println("Vou excluir Tabela de exames: " + this.tabList.get(jTabTabelas.getSelectedRow()).getTexNome());

            if (jTabExames.getRowCount() == 0) {
                TabelaPrecosDao dao = new TabelaPrecosDao();

                if (dao.DeletaTabela(this.tabList.get(jTabTabelas.getSelectedRow()).getTexID()) == 0) {
                    JOptionPane.showMessageDialog(this, "Erro ao excluir tabela selecionada!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                } else {
                    tabTabelaPrecos.removeRow(jTabTabelas.getSelectedRow());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Não é possível excluir tabela com exames/procedimentos relacionados.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnXTabelaActionPerformed

    private void btnNTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNTabelaActionPerformed

        FrmNewTabelaExame frmNewTabela = new FrmNewTabelaExame();

        frmNewTabela.RecebeTabelaNova(this);
        frmNewTabela.setLocationRelativeTo(this);
        frmNewTabela.setVisible(true);

        BuscaTabelas();
        /*
         String resposta = JOptionPane.showInputDialog(this, "Digite o nome da nova tabela de exames", "Incluir nova Tabela de Exames", JOptionPane.INFORMATION_MESSAGE);

         System.out.println("Resposta: " + resposta);

         if (resposta == null || resposta.equals("")) {
         } else {
         TabelaPrecosDao tabDao = new TabelaPrecosDao();

         if (tabDao.AdicionaTabela(resposta.toUpperCase()) == 1) {
         BuscaTabelas();
         }
         }
         */
    }//GEN-LAST:event_btnNTabelaActionPerformed

    private void jTabExamesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabExamesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnAddOrcamentoActionPerformed(null);
        }
    }//GEN-LAST:event_jTabExamesKeyPressed

    private void btnNovoExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoExameActionPerformed
        FrmAddExame addExame = new FrmAddExame();

        if (jTabTabelas.getSelectedRow() >= 0) {
            addExame.setTabela(tabList.get(jTabTabelas.getSelectedRow()).getTexNome(), tabList);
            System.out.println(tabList.get(jTabTabelas.getSelectedRow()).getTexNome());
        }

        addExame.PreencherCombo(tabList);
        addExame.setCols(tabList.get(jTabTabelas.getSelectedRow()).getTexCol1(), tabList.get(jTabTabelas.getSelectedRow()).getTexCol2());
        addExame.setLocationRelativeTo(null);
        addExame.setVisible(true);
    }//GEN-LAST:event_btnNovoExameActionPerformed

    private void jTabOrcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabOrcaKeyReleased
        if (jTabOrca.getSelectedRow() >= 0) {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                btnXOrcamentoActionPerformed(null);
            }
        }
    }//GEN-LAST:event_jTabOrcaKeyReleased

    private void btnPrintCol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintCol1ActionPerformed
        try {
            JasperReport report = JasperCompileManager.compileReport("relatorios/ReportPrecos1.jrxml");
            JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(ExameList));
            //JasperExportManager.exportReportToPdfFile(print, "relatorios/RelatorioPrecos1.pdf");
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Erro ao compilar relatorio!" + ex.getMessage());
        }

    }//GEN-LAST:event_btnPrintCol1ActionPerformed

    private void btnPrintCol3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintCol3ActionPerformed
        
            Map parametros = new HashMap();
            
            parametros.put("col1", tabList.get(jTabTabelas.getSelectedRow()).getTexCol1() );
            parametros.put("col2", tabList.get(jTabTabelas.getSelectedRow()).getTexCol2());
        
        
        try {
            JasperReport report = JasperCompileManager.compileReport("relatorios/ReportPrecos3.jrxml");
            JasperPrint print = JasperFillManager.fillReport(report, parametros, new JRBeanCollectionDataSource(ExameList));
            //JasperExportManager.exportReportToPdfFile(print, "relatorios/RelatorioPrecos1.pdf");
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Erro ao compilar relatorio!" + ex.getMessage());
        }
    }//GEN-LAST:event_btnPrintCol3ActionPerformed

    private void btnPOrcamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPOrcamentoActionPerformed

        try {
            List<Orcamento> ListaOrca = new ArrayList<Orcamento>();

            for (int i = 0; i < jTabOrca.getRowCount(); i++) {
                Orcamento orc = new Orcamento();
                System.out.println(jTabOrca.getValueAt(i, 0));

                orc.setExNome((String) jTabOrca.getValueAt(i, 0));
                orc.setExPreco((String) jTabOrca.getValueAt(i, 1));

                ListaOrca.add(orc);
            }

            Map total = new HashMap();
            total.put("total", lblOrcamento.getText());

            JasperReport report = JasperCompileManager.compileReport("relatorios/ReportOrcamento.jrxml");
            JasperPrint print = JasperFillManager.fillReport(report, total, new JRBeanCollectionDataSource(ListaOrca));
            JasperViewer view = new JasperViewer(print, false);
            view.setVisible(true);

        } catch (JRException ex) {
            System.out.println("Erro ao imprimir orcamento: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnPOrcamentoActionPerformed

    private void btnEditTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTabelaActionPerformed

        FrmNewTabelaExame frmNewTabelaExame = new FrmNewTabelaExame();
        frmNewTabelaExame.RecebeTabela(this, tabList.get(jTabTabelas.getSelectedRow()));
        frmNewTabelaExame.setLocationRelativeTo(this);
        frmNewTabelaExame.setVisible(true);

        /*
         String novoNomeTab = JOptionPane.showInputDialog(this, "Digite o novo nome para a tabela.", jTabTabelas.getValueAt(jTabTabelas.getSelectedRow(), 0));

         if (novoNomeTab != null) {
         TabelaPrecosDao tabDao = new TabelaPrecosDao();

         if (tabDao.EditarTabela(novoNomeTab, tabList.get(jTabTabelas.getSelectedRow()).getTexID()) == 1) {
         jTabTabelas.setValueAt(novoNomeTab, jTabTabelas.getSelectedRow(), 0);
         }
         }
         */
    }//GEN-LAST:event_btnEditTabelaActionPerformed

    private void btnSaveExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveExameActionPerformed
        if( jTabExames.getSelectedRow() >= 0){
            ExameDao exDao = new ExameDao();

            //ExameList.get(jTabExames.getSelectedRow()).setExNome( jTabExames.getValueAt(jTabExames.getSelectedRow(), 1)) );
            
            
            
            ExameList.get(jTabExames.getSelectedRow()).setExNome(jTabExames.getValueAt(jTabExames.getSelectedRow(), 0).toString());
            ExameList.get(jTabExames.getSelectedRow()).setExCol1(Double.parseDouble(jTabExames.getValueAt(jTabExames.getSelectedRow(), 1).toString().replace(",", ".")));
            ExameList.get(jTabExames.getSelectedRow()).setExCol2(Double.parseDouble(jTabExames.getValueAt(jTabExames.getSelectedRow(), 2).toString().replace(",", ".")));
            ExameList.get(jTabExames.getSelectedRow()).setExPreco(Double.parseDouble(jTabExames.getValueAt(jTabExames.getSelectedRow(), 3).toString().replace(",", ".")));
            
            System.out.println( jTabExames.getValueAt(jTabExames.getSelectedRow(), 0) );
            
            if( exDao.AlterarExame(ExameList.get(jTabExames.getSelectedRow())) == 1){
                System.out.println("exame atualizado com sucesso!");
            } else {
                System.out.println("Erro ao alterar exame.");
            }
        }
        /*
         String novoNomeEx = JOptionPane.showInputDialog(this, "Digite o novo nome para a tabela.", jTabTabelas.getValueAt(jTabTabelas.getSelectedRow(), 0));

         if (novoNomeEx != null) {
         TabelaPrecosDao tabDao = new TabelaPrecosDao();

         if (tabDao.EditarTabela(novoNomeEx, tabList.get(jTabTabelas.getSelectedRow()).getTexID()) == 1) {
         jTabTabelas.setValueAt(novoNomeEx, jTabTabelas.getSelectedRow(), 0);
         }
         }
         */
    }//GEN-LAST:event_btnSaveExameActionPerformed

    private void btnXExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXExameActionPerformed
        if (jTabExames.getSelectedRow() >= 0) {
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir exame/procedimento selecionado?", "Excluir exame/procedimento", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
                ExameDao exDao = new ExameDao();

                if (exDao.ExcluirExame(ExameList.get(jTabExames.getSelectedRow()).getExID()) != 1) {
                    jTabExames.remove(jTabExames.getSelectedRow());
                    //jTabExames.removeRowSelectionInterval(jTabExames.getSelectedRow(), jTabExames.getSelectedRow());
                }
            }
        }
    }//GEN-LAST:event_btnXExameActionPerformed

    private void jTabExamesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTabExamesPropertyChange
        if( config.getNivel() == 1){
            btnSaveExame.setEnabled(true);
        }
    }//GEN-LAST:event_jTabExamesPropertyChange

    private void btnAddOrcamento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrcamento1ActionPerformed
        guis.setiPrecos(null);
        this.dispose();
    }//GEN-LAST:event_btnAddOrcamento1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrcamento;
    private javax.swing.JButton btnAddOrcamento1;
    private javax.swing.JButton btnEditTabela;
    private javax.swing.JButton btnLOrcamento;
    private javax.swing.JButton btnNTabela;
    private javax.swing.JButton btnNovoExame;
    private javax.swing.JButton btnPOrcamento;
    private javax.swing.JButton btnPrintCol1;
    private javax.swing.JButton btnPrintCol3;
    private javax.swing.JButton btnSaveExame;
    private javax.swing.JButton btnXExame;
    private javax.swing.JButton btnXOrcamento;
    private javax.swing.JButton btnXTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTabExames;
    private javax.swing.JTable jTabOrca;
    private javax.swing.JTable jTabTabelas;
    private javax.swing.JLabel lblOrcamento;
    private javax.swing.JLabel lblTotalLista;
    private clinica.util.JTextUpper txtBuscaExame;
    // End of variables declaration//GEN-END:variables

    private void CalculaOrcamento() {
        lblOrcamento.setText("R$ " + CalculaTotal());
    }

    private String CalculaTotal() {
        DecimalFormat formato = new DecimalFormat("##0.00");
        Double Orcamento = 0.00;

        for (int i = 0; i < jTabOrca.getRowCount(); i++) {
            String valor = (String) jTabOrca.getValueAt(i, 1);
            String replace = valor.replace(",", ".");
            Orcamento += Double.parseDouble(replace);
            // Orcamento += Double.parseDouble(jTabOrca.getValueAt(i, 1));
        }
        return formato.format(Orcamento);
    }

    private String FormataPreco(Double preco) {
        DecimalFormat formato = new DecimalFormat("##0.00");
        return formato.format(preco);
    }

    public void FiltrarExame(String text) {

        jTabExames.setRowSorter(sorter);
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

    private void VerifcarNivel() {
        if (config.getNivel() != 1) {
            btnNTabela.setEnabled(false);
            btnEditTabela.setEnabled(false);
            btnXTabela.setEnabled(false);
            btnNovoExame.setEnabled(false);
            btnSaveExame.setEnabled(false);
            btnXExame.setEnabled(false);

            jTabExames.setColumnSelectionAllowed(false);
            jTabExames.setCellSelectionEnabled(false);
        }
    }
}
