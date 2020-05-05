/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.gui;

import clinica.bean.Paciente;
import clinica.dao.PacienteMedicoDao;
import clinica.dao.PacienteOdontoDao;
import clinica.util.Utils;
import static clinica.util.Utils.validaCpf;
import clinica.util.guis;
import clinica.util.WebServiceCep;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author celso
 */
public class FrmPacientesOdonto extends javax.swing.JInternalFrame {

    //private String Tipo;
    private Boolean NovoPaciente = null;
    private Paciente PacSelecionado;

    /**
     * Creates new form FrmAdmPacientes
     */
    public FrmPacientesOdonto() {
        initComponents();
    }

    FrmResultBusca frb = new FrmResultBusca();

    /*
     public void setTipo(String tipo) {
     this.Tipo = tipo;
     }
     */
    public void recebeSelecionado(Paciente pac) {

        List<Paciente> lista = new ArrayList<Paciente>();

        lista.add(pac);
        preencheCampos(lista);

        this.PacSelecionado = pac;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtPesquisaPacienteMed = new javax.swing.JTextField();
        btnPesquisaPacMed = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblIdade = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();
        cmbSexo = new javax.swing.JComboBox();
        txtNasc = new javax.swing.JFormattedTextField();
        cmbDeclara = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTel1 = new javax.swing.JTextField();
        txtTel2 = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        txtFax = new javax.swing.JTextField();
        txtTel3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtEndereco = new clinica.util.JTextUpper();
        txtComplemento = new clinica.util.JTextUpper();
        txtBairro = new clinica.util.JTextUpper();
        txtCidade = new clinica.util.JTextUpper();
        txtUF = new clinica.util.JTextUpper();
        jLabel22 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtParticularidade = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        txtOp1 = new clinica.util.JTextUpper();
        txtOp2 = new clinica.util.JTextUpper();
        jLabel19 = new javax.swing.JLabel();
        lblLastVisita = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblErroCpf = new javax.swing.JLabel();
        txtNome = new clinica.util.JTextUpper();
        jPanel4 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnNavOdontoFirst = new javax.swing.JButton();
        btnNavOdontoPrev = new javax.swing.JButton();
        btnNavOdontoNext = new javax.swing.JButton();
        btnNavOdontoLast = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("Controle de Pacientes Odontológicos");
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa"));

        txtPesquisaPacienteMed.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPesquisaPacienteMed.setToolTipText("Digite uma matrícula, cpf ou nome para pesquisa");
        txtPesquisaPacienteMed.setName(""); // NOI18N
        txtPesquisaPacienteMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaPacienteMedKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaPacienteMedKeyReleased(evt);
            }
        });

        btnPesquisaPacMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Find.png"))); // NOI18N
        btnPesquisaPacMed.setText("Pesquisar");
        btnPesquisaPacMed.setEnabled(false);
        btnPesquisaPacMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaPacMedActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("( CPF / Matrícula / Nome )");

        lblMsg.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPesquisaPacienteMed)
                            .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)))
                .addComponent(btnPesquisaPacMed, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisaPacienteMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisaPacMed, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel3.setText("Nome do paciente");

        jLabel4.setText("CPF");

        jLabel5.setText("Declarante");

        jLabel6.setText("Sexo");

        jLabel7.setText("Data Nascimento");

        jLabel8.setText("Idade");

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setToolTipText("CPF do paciente");
        txtCPF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCPFFocusLost(evt);
            }
        });
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCPFKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCPFKeyReleased(evt);
            }
        });

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FEMININO", "MASCULINO", " " }));
        cmbSexo.setToolTipText("Selecione o sexo do paciente");

        try {
            txtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNasc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNasc.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNasc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNascFocusLost(evt);
            }
        });
        txtNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNascKeyReleased(evt);
            }
        });

        cmbDeclara.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ND", "D" }));
        cmbDeclara.setToolTipText("Declarente ou Não Declarante");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Localização"));

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCep.setToolTipText("Cep do endereço");
        txtCep.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCepFocusLost(evt);
            }
        });
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCepKeyPressed(evt);
            }
        });

        jLabel1.setText("CEP");

        jLabel9.setText("Endereço");

        txtTel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTel1.setToolTipText("Telefone residencial ( Principal )");

        txtTel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTel2.setToolTipText("Telefone comercial ou secudário do paciente");

        txtCel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCel.setToolTipText("Telefone celular do paciente");

        txtFax.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtFax.setToolTipText("Numero do Fax do paciente caso possua");

        txtTel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtTel3.setToolTipText("Telefone extra ( recado e etc )");

        txtObs.setColumns(20);
        txtObs.setLineWrap(true);
        txtObs.setRows(5);
        txtObs.setToolTipText("Observações sobre o paciente");
        txtObs.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtObs);

        jLabel10.setText("Bairro");

        jLabel11.setText("Cidade");

        jLabel12.setText("UF");

        jLabel13.setText("Residencial");

        jLabel14.setText("Comercial");

        jLabel17.setText("Outros");

        jLabel18.setText("Observações");

        jLabel20.setText("Complemento");

        txtEndereco.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtComplemento.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N

        txtBairro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtCidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtUF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel22.setText("Nº");

        txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNumero.setToolTipText("Numero");
        txtNumero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtParticularidade.setColumns(20);
        txtParticularidade.setLineWrap(true);
        txtParticularidade.setRows(5);
        txtParticularidade.setToolTipText("Informações particulares e alertas");
        txtParticularidade.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtParticularidade);

        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("Alertar Particularidade");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtOp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtOp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTel1)
                            .addComponent(txtTel2)
                            .addComponent(txtCel)
                            .addComponent(txtFax)
                            .addComponent(txtTel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel19.setText("Ultima consulta:");

        lblLastVisita.setForeground(new java.awt.Color(255, 0, 51));
        lblLastVisita.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        lblId.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 0, 0));
        lblId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel21.setText("Matrícula");

        lblErroCpf.setForeground(new java.awt.Color(255, 0, 0));
        lblErroCpf.setToolTipText("");

        txtNome.setToolTipText("Nome Completo do Paciente");
        txtNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNasc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel21))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbDeclara, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblErroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLastVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDeclara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addComponent(lblErroCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(lblLastVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Tips.png"))); // NOI18N
        btnSalvar.setMnemonic('s');
        btnSalvar.setText("Salvar");
        btnSalvar.setToolTipText("Gravar paciente no sistema");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Delete.png"))); // NOI18N
        btnExcluir.setMnemonic('x');
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("Apaga paciente do sistema");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Favourite1.png"))); // NOI18N
        btnNovo.setMnemonic('n');
        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Cadastra novo paciente");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/sair.png"))); // NOI18N
        btnSalvar1.setMnemonic('s');
        btnSalvar1.setText("Sair");
        btnSalvar1.setToolTipText("Gravar paciente no sistema");
        btnSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvar1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Navegação");

        btnNavOdontoFirst.setText("|<");
        btnNavOdontoFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavOdontoFirstActionPerformed(evt);
            }
        });

        btnNavOdontoPrev.setText("<");
        btnNavOdontoPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavOdontoPrevActionPerformed(evt);
            }
        });

        btnNavOdontoNext.setText(">");
        btnNavOdontoNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavOdontoNextActionPerformed(evt);
            }
        });

        btnNavOdontoLast.setText(">|");
        btnNavOdontoLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavOdontoLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnNavOdontoFirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNavOdontoPrev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNavOdontoNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNavOdontoLast))
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar1))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExcluir, btnNovo, btnSalvar, btnSalvar1});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNavOdontoFirst)
                    .addComponent(btnNavOdontoPrev)
                    .addComponent(btnNavOdontoNext)
                    .addComponent(btnNavOdontoLast))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnExcluir, btnNovo, btnSalvar, btnSalvar1});

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void preencheCampos(List<Paciente> pac) {
        // Preenche campos com dados do paciente
        txtNome.setText(pac.get(0).getPacNome());
        txtCPF.setText(pac.get(0).getPacCpf());
        cmbSexo.setSelectedItem(pac.get(0).getPacSexo());
        txtNasc.setText(pac.get(0).getPacNasc());
        lblId.setText(String.valueOf(pac.get(0).getPacID()));
        cmbDeclara.setSelectedItem(pac.get(0).getPacDeclara());

        if (pac.get(0).getPacCep() > 0) {
            txtCep.setText(String.valueOf(pac.get(0).getPacCep()));
        } else {
            txtCep.setText("");
        }
        txtEndereco.setText(pac.get(0).getPacEnd());
        if (pac.get(0).getPacNum() > 0) {
            txtNumero.setText(String.valueOf(pac.get(0).getPacNum()));
        } else {
            txtNumero.setText("");
        }

        txtComplemento.setText(pac.get(0).getPacComplemento());
        txtBairro.setText(pac.get(0).getPacBairro());
        txtCidade.setText(pac.get(0).getPacCidade());
        txtUF.setText(pac.get(0).getPacUf());
        txtObs.setText(pac.get(0).getPacObs());
        txtTel1.setText(pac.get(0).getPacTelRes());
        txtTel2.setText(pac.get(0).getPacTelCom());
        txtOp1.setText(pac.get(0).getPacOp1());
        txtCel.setText(pac.get(0).getPacTelCel());
        txtOp2.setText(pac.get(0).getPacOp2());
        txtFax.setText(pac.get(0).getPacTelFax());
        txtTel3.setText(pac.get(0).getPacTelOutro());
        txtParticularidade.setText(pac.get(0).getPacAlert());
        lblLastVisita.setText(pac.get(0).getPacDtUpdate());

        // habilita os botaoes excluir e salvar
        //HabilitarBotoes();
        // Forca o campo texto a calcular a idade do paciente
        txtNascFocusLost(null);

        // Desabilita compos para edicao
        //DesabilitarCampos();
        // Desabilitar somente o botao salvar
        //btnSalvar.setEnabled(false);
        NovoPaciente = false;

        this.PacSelecionado = pac.get(0);
    }

    private void btnPesquisaPacMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaPacMedActionPerformed
        System.out.println("Digitado na pesquisa: " + txtPesquisaPacienteMed.getText());

        // Verifica se ta o camp pesquisa ta vazio ...
        if (!txtPesquisaPacienteMed.getText().isEmpty()) {

            // Verifica se digitado e somante numero
            if (Utils.soNumero(txtPesquisaPacienteMed.getText())) {
                System.out.println("Somente numeros");

                // Se for digitado 11 digitos procura por CPF
                if (txtPesquisaPacienteMed.getText().length() == 11) {
                    System.out.println("Buscando por CPF");

                    PacienteOdontoDao pac = new PacienteOdontoDao();
                    List<Paciente> lista = pac.buscaPacCpf(txtPesquisaPacienteMed.getText());
                    if (lista.size() == 1) {
                        preencheCampos(lista);
                    } else if (lista.size() > 1) {
                        System.out.println("Encontrei mais de um paciente com este cpf abrindo janela de selecao");
                        if (frb == null) {
                            frb = new FrmResultBusca();
                            frb.setLocationRelativeTo(this);
                            frb.setVisible(true);
                        } else {
                            frb.setLocationRelativeTo(this);
                            frb.setVisible(true);
                        }
                        frb.recebePacienteOdonto(this, lista);
                    } else {
                        lblMsg.setText("Nenhum paciente encontrado!");
                    }
                    System.out.println("Tamanho da lista: " + lista.size());

                } else {
                    // Se for digitado outro numero procura por Matricula
                    System.out.println("Buscando por Matricula");
                    PacienteOdontoDao pac = new PacienteOdontoDao();
                    List<Paciente> lista = pac.buscaPacId(txtPesquisaPacienteMed.getText());
                    if (lista.size() == 1) {
                        preencheCampos(lista);
                        lblMsg.setText(null);
                    } else if (lista.size() > 1) {
                        System.out.println("Encontrado mais de uma matricula abriando janela de selecao");
                        if (frb == null) {
                            frb = new FrmResultBusca();
                            frb.setLocationRelativeTo(this);
                            frb.setVisible(true);
                        } else {
                            frb.setLocationRelativeTo(this);
                            frb.setVisible(true);
                        }
                        frb.recebePacienteOdonto(this, lista);
                        lblMsg.setText(null);
                    } else if (lista.size() <= 0) {
                        lblMsg.setText("Nenhum paciente encontrado!");
                        LimparCampos();
                        System.out.println("nenhuma paciente encontrado");
                    }
                    System.out.println("Tamanho da lista: " + lista.size());
                }
            } else {
                // Caso seja digitado nome ou parte do nome realiza busca por nome do paciente
                System.out.println("Buscando por nome: " + txtPesquisaPacienteMed.getText());
                PacienteOdontoDao pac = new PacienteOdontoDao();
                List<Paciente> lista = pac.buscaPacNome(txtPesquisaPacienteMed.getText());

                if (lista.size() == 1) {
                    preencheCampos(lista);
                    lblMsg.setText(null);
                } else if (lista.size() > 1) {

                    System.out.println("Encontrado mais de uma paciente abrindo janela de selecao");

                    if (frb == null) {
                        frb = new FrmResultBusca();
                        frb.setLocationRelativeTo(this);
                        frb.setVisible(true);
                    } else {
                        frb.setLocationRelativeTo(this);
                        frb.setVisible(true);
                    }
                    frb.recebePacienteOdonto(this, lista);
                } else {

                    System.out.println("Nenhum paciente encontrado!");
                    lblMsg.setText("Nenhum paciente encontrado!");
                    LimparCampos();
                }
                System.out.println("Tamanho da lista: " + lista.size());
            }
        }
    }//GEN-LAST:event_btnPesquisaPacMedActionPerformed

    private void txtNascFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNascFocusLost
        if (!txtNasc.getText().equals("  /  /    ") || txtNasc.getText().length() != 10) {
            Integer idade;
            try {
                idade = Utils.getIdate(txtNasc.getText());
                lblIdade.setText(idade.toString());
            } catch (ParseException ex) {
                Logger.getLogger(FrmPacientesOdonto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txtNascFocusLost

    private void txtCepFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCepFocusLost
        System.out.println("Key released... buscando endereco pelo CEP:");

        if (!(txtCep.getText().equals("     -   ")) || (txtCep.getText().length() != 9)) {
            WebServiceCep buscaCep = WebServiceCep.searchCep(txtCep.getText());

            if (buscaCep.wasSuccessful()) {
                txtEndereco.setText(buscaCep.getLogradouroFull());
                txtBairro.setText(buscaCep.getBairro());
                txtCidade.setText(buscaCep.getCidade());
                txtUF.setText(buscaCep.getUf());
                txtNumero.requestFocus();
            } else {
                txtEndereco.requestFocus();
            }
        }
    }//GEN-LAST:event_txtCepFocusLost

    private void txtCPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCPFFocusLost
        if (!txtCPF.getText().equals("   .   .   -  ")) {
            PacienteOdontoDao pac = new PacienteOdontoDao();

            if (!validaCpf(txtCPF.getText())) {
                System.out.println("CPF Incorreto");
                lblErroCpf.setText("CPF Inválido");
            } else {
                if (pac.verificaCpf(txtCPF.getText())) {
                    System.out.println("CPF ja existe");
                    JOptionPane.showMessageDialog(this, "CPF Já cadastrado para outro paciente!", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        System.out.println("CPF Correto: " + txtCPF.getText());
    }//GEN-LAST:event_txtCPFFocusLost

    private void txtCPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyReleased
        lblErroCpf.setText(null);
    }//GEN-LAST:event_txtCPFKeyReleased

    private void txtCepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!(txtCep.getText().equals("     -   ")) || (txtCep.getText().length() != 9)) {
                txtCepFocusLost(null);
            }
        }
    }//GEN-LAST:event_txtCepKeyPressed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!(txtCPF.getText().equals("   .   .   -  ")) || (txtCPF.getText().length() != 14)) {
                txtCPFFocusLost(null);
            }
        }
    }//GEN-LAST:event_txtCPFKeyPressed

    private void txtPesquisaPacienteMedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaPacienteMedKeyReleased
        if (!txtPesquisaPacienteMed.getText().isEmpty()) {
            btnPesquisaPacMed.setEnabled(true);
        } else {
            btnPesquisaPacMed.setEnabled(false);
        }
    }//GEN-LAST:event_txtPesquisaPacienteMedKeyReleased

    private void txtPesquisaPacienteMedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaPacienteMedKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtPesquisaPacienteMed.getText().equals("")) {
                btnPesquisaPacMedActionPerformed(null);
            }
        }
    }//GEN-LAST:event_txtPesquisaPacienteMedKeyPressed

    private void txtNascKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNascKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtNasc.getText().length() == 10) {
                txtNascFocusLost(null);
            }
        }
    }//GEN-LAST:event_txtNascKeyReleased

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        this.NovoPaciente = false;
        guis.setiMed(null);
        this.dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvar1ActionPerformed
        this.NovoPaciente = false;
        guis.setiMed(null);
        this.dispose();
    }//GEN-LAST:event_btnSalvar1ActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.NovoPaciente = true;
        this.PacSelecionado = null;

        // Limpa campos para insersao dos dados do paciente
        LimparCampos();

        // Coloca o foco no campo paciente
        txtNome.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (this.PacSelecionado != null) {
            if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir paciente " + PacSelecionado.getPacNome() + " do sistema?", "Excluir Paciente", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

                System.out.println("Excluindo paciente " + txtNome.getText());

                PacienteOdontoDao pacienteDao = new PacienteOdontoDao();

                if (pacienteDao.ExcluirPaciente(PacSelecionado) == 1) {
                    lblMsg.setText("Paciente " + PacSelecionado.getPacNome() + " excluido com sucesso!");
                    PacSelecionado = null;
                    LimparCampos();
                } else {
                    lblMsg.setText("Erro ao tentar excluir paciente " + PacSelecionado.getPacNome());
                }

            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        this.setEnabled(false);

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "ATENÇÃO - Campo [ NOME DO PACIENTE ] Não pode ser vazio.", "ATENÇÃO", JOptionPane.ERROR_MESSAGE);
        } else {

            Paciente pac = new Paciente();

            if (!NovoPaciente) {
                pac.setPacID(Integer.valueOf(lblId.getText()));
            }

            pac.setPacNome(txtNome.getText());
            pac.setPacCpf(txtCPF.getText());
            pac.setPacDeclara(cmbDeclara.getSelectedItem().toString());
            pac.setPacSexo(cmbSexo.getSelectedItem().toString());
            pac.setPacNasc(txtNasc.getText());
            if (!txtCep.getText().equals("     -   ")) {
                String cep = txtCep.getText();
                String cepReplace = cep.replace("-", "");
                pac.setPacCep(Integer.parseInt(cepReplace));
            }
            pac.setPacEnd(txtEndereco.getText());
            if (!txtNumero.getText().equals("")) {
                pac.setPacNum(Integer.parseInt(txtNumero.getText()));
            }
            pac.setPacComplemento(txtComplemento.getText());
            pac.setPacCidade(txtCidade.getText());
            pac.setPacBairro(txtBairro.getText());
            pac.setPacUf(txtUF.getText());
            pac.setPacTelRes(txtTel1.getText());
            pac.setPacTelCom(txtTel2.getText());
            pac.setPacOp1(txtOp1.getText());
            pac.setPacTelCel(txtCel.getText());
            pac.setPacOp2(txtOp2.getText());
            pac.setPacTelFax(txtFax.getText());
            pac.setPacTelOutro(txtTel3.getText());
            pac.setPacObs(txtObs.getText());
            pac.setPacAlert(txtParticularidade.getText());
            if (NovoPaciente) {
                pac.setPacDtCadastro(DataAtual());
            }
            pac.setPacDtUpdate(DataAtual());

            PacienteOdontoDao pacDao = new PacienteOdontoDao();

            if (NovoPaciente) {
                int lastID = pacDao.AdicionarPaciente(pac);

                if (lastID >= 1) {
                    lblMsg.setText("Paciente gravado com sucesso!");
                    lblId.setText(String.valueOf(lastID));
                } else {
                    lblMsg.setForeground(Color.red);
                    lblMsg.setText("Erro ao gravar Paciente!");
                    txtNome.requestFocus();
                }
            } else {
                if (pacDao.AlterarPaciente(pac) == 1) {
                    lblMsg.setText("Paciente gravado com sucesso!");
                } else {
                    lblMsg.setForeground(Color.red);
                    lblMsg.setText("Erro ao gravar Paciente!");
                    txtNome.requestFocus();
                }
            }
        }
        this.setEnabled(true);
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNavOdontoFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavOdontoFirstActionPerformed
        PacienteOdontoDao pDao = new PacienteOdontoDao();
        recebeSelecionado(pDao.PrimeiroRegistro());
    }//GEN-LAST:event_btnNavOdontoFirstActionPerformed

    private void btnNavOdontoPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavOdontoPrevActionPerformed
        if ( this.PacSelecionado != null ) {
                PacienteOdontoDao pDao = new PacienteOdontoDao();
                recebeSelecionado(pDao.RegistroAnterior(this.PacSelecionado.getPacID()));
        } else {
            btnNavOdontoFirstActionPerformed(null);
        }
    }//GEN-LAST:event_btnNavOdontoPrevActionPerformed

    private void btnNavOdontoNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavOdontoNextActionPerformed
        PacienteOdontoDao pDao = new PacienteOdontoDao();
        
        if ( this.PacSelecionado != null ) {
                recebeSelecionado(pDao.ProximoRegistro(this.PacSelecionado.getPacID()));
        } else {
            btnNavOdontoLastActionPerformed(null);
        }
    }//GEN-LAST:event_btnNavOdontoNextActionPerformed

    private void btnNavOdontoLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavOdontoLastActionPerformed
        PacienteOdontoDao pDao = new PacienteOdontoDao();
        recebeSelecionado(pDao.UltimoRegistro());
    }//GEN-LAST:event_btnNavOdontoLastActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNavOdontoFirst;
    private javax.swing.JButton btnNavOdontoLast;
    private javax.swing.JButton btnNavOdontoNext;
    private javax.swing.JButton btnNavOdontoPrev;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisaPacMed;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnSalvar1;
    private javax.swing.JComboBox cmbDeclara;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblErroCpf;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblLastVisita;
    private javax.swing.JLabel lblMsg;
    private clinica.util.JTextUpper txtBairro;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCel;
    private javax.swing.JFormattedTextField txtCep;
    private clinica.util.JTextUpper txtCidade;
    private clinica.util.JTextUpper txtComplemento;
    private clinica.util.JTextUpper txtEndereco;
    private javax.swing.JTextField txtFax;
    private javax.swing.JFormattedTextField txtNasc;
    private clinica.util.JTextUpper txtNome;
    private javax.swing.JFormattedTextField txtNumero;
    private javax.swing.JTextArea txtObs;
    private clinica.util.JTextUpper txtOp1;
    private clinica.util.JTextUpper txtOp2;
    private javax.swing.JTextArea txtParticularidade;
    private javax.swing.JTextField txtPesquisaPacienteMed;
    private javax.swing.JTextField txtTel1;
    private javax.swing.JTextField txtTel2;
    private javax.swing.JTextField txtTel3;
    private clinica.util.JTextUpper txtUF;
    // End of variables declaration//GEN-END:variables

    private void LimparCampos() {
        txtPesquisaPacienteMed.setText(null);
        txtNome.setText(null);
        txtCPF.setText(null);
        cmbDeclara.setSelectedIndex(0);
        cmbSexo.setSelectedIndex(0);
        txtNasc.setText(null);
        lblIdade.setText(null);
        lblId.setText(null);
        txtCep.setText(null);
        txtEndereco.setText(null);
        txtNumero.setText(null);
        txtComplemento.setText(null);
        txtBairro.setText(null);
        txtCidade.setText(null);
        txtUF.setText(null);
        txtObs.setText(null);
        txtParticularidade.setText(null);
        txtTel1.setText(null);
        txtTel2.setText(null);
        txtTel3.setText(null);
        txtCel.setText(null);
        txtFax.setText(null);
        lblLastVisita.setText(null);
    }

    private String DataAtual() {
        Date hoje = new Date(System.currentTimeMillis());
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        return formato.format(hoje);
    }
}
