/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.gui;

import static clinica.Clinica.config;
import clinica.util.guis;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author celso
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/clinica/imagens/medicina.png")).getImage());
        VerificaNivel();
    }

    private void sairSistema() {
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente sair do Sistema?", "Sair do sistema.", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnMedicos = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        btnPrecos = new javax.swing.JButton();
        btnFuncionarios = new javax.swing.JButton();
        btnEstoque = new javax.swing.JButton();
        btnFerramentas = new javax.swing.JButton();
        btnDentistas = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Policlínica de Exemplo");
        setName("frmPrincipal"); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Funções"));

        btnMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/doctor.png"))); // NOI18N
        btnMedicos.setMnemonic('m');
        btnMedicos.setText("Médicos");
        btnMedicos.setToolTipText("Cadastro, Alteração e Manutenção de Pacientes Médicos");
        btnMedicos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicosActionPerformed(evt);
            }
        });

        btnAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Vista (160).png"))); // NOI18N
        btnAgenda.setMnemonic('a');
        btnAgenda.setText("Agenda");
        btnAgenda.setToolTipText("Agenda de contatos importantes");
        btnAgenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });

        btnPrecos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/tabela_precos.png"))); // NOI18N
        btnPrecos.setMnemonic('r');
        btnPrecos.setText("Preços");
        btnPrecos.setToolTipText("Tabela de preços de exames e procedimentos");
        btnPrecos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrecosActionPerformed(evt);
            }
        });

        btnFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Vista (308).png"))); // NOI18N
        btnFuncionarios.setMnemonic('o');
        btnFuncionarios.setText("Funcionários");
        btnFuncionarios.setToolTipText("Cadastro, Alteração e Manutenção de Funcionários");
        btnFuncionarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Vista (215).png"))); // NOI18N
        btnEstoque.setMnemonic('e');
        btnEstoque.setText("Estoque");
        btnEstoque.setToolTipText("Controle de Estoque de Materiais");
        btnEstoque.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        btnFerramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Vista (17).png"))); // NOI18N
        btnFerramentas.setMnemonic('f');
        btnFerramentas.setText("Ferramentas");
        btnFerramentas.setToolTipText("Backups Restaurações");
        btnFerramentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFerramentasActionPerformed(evt);
            }
        });

        btnDentistas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/surgeon.png"))); // NOI18N
        btnDentistas.setMnemonic('d');
        btnDentistas.setText("Dentistas");
        btnDentistas.setToolTipText("Cadastro, Alteração e Manutenção de Pacientes Odontológicos");
        btnDentistas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDentistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDentistasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDentistas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMedicos, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(btnAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPrecos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFuncionarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFerramentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAgenda, btnEstoque, btnFerramentas, btnFuncionarios, btnMedicos, btnPrecos});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDentistas, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrecos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFuncionarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFerramentas)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAgenda, btnDentistas, btnEstoque, btnFerramentas, btnFuncionarios, btnMedicos, btnPrecos});

        desktop.setBackground(new java.awt.Color(238, 238, 238));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/fundo.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desktop)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicosActionPerformed
        if (guis.getiMed() != null) {
            try {
                System.out.println("Janela ja criada Medicos");
                guis.getiMed().moveToFront();
                guis.getiMed().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiMed(new FrmPacientesMedico());
                this.desktop.add(guis.getiMed());
                guis.getiMed().setMaximum(true);
               // guis.getiMed().setTipo("Medico");
               // guis.getiMed().setTitle("Controle de paciente médicos");
                guis.getiMed().setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnMedicosActionPerformed

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        if (guis.getiAgenda() != null) {
            try {
                System.out.println("Janela ja criada Agenda de contatos");
                guis.getiAgenda().moveToFront();
                guis.getiAgenda().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiAgenda(new FrmAgenda());
                this.desktop.add(guis.getiAgenda());
                guis.getiAgenda().setMaximum(true);
                guis.getiAgenda().setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnPrecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrecosActionPerformed
        if (guis.getiPrecos() != null) {
            try {
                System.out.println("Janela ja criada Precos");
                guis.getiPrecos().moveToFront();
                guis.getiPrecos().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiPrecos(new FrmPrecos());
                this.desktop.add(guis.getiPrecos());
                guis.getiPrecos().setMaximum(true);
                guis.getiPrecos().setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPrecosActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        if (guis.getiFunc() != null) {
            try {
                System.out.println("Janela ja criada Funcionario");
                guis.getiFunc().moveToFront();
                guis.getiFunc().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiFunc(new FrmFuncionarios());
                this.desktop.add(guis.getiFunc());
                guis.getiFunc().setMaximum(true);
                guis.getiFunc().setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        if (guis.getiEstoque() != null) {
            try {
                System.out.println("Janela ja criada Estoque");
                guis.getiEstoque().moveToFront();
                guis.getiEstoque().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiEstoque(new FrmEstoque());
                this.desktop.add(guis.getiEstoque());
                guis.getiEstoque().setMaximum(true);
                guis.getiEstoque().setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnFerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFerramentasActionPerformed
        if (guis.getiFerr() != null) {
            try {
                System.out.println("Janela ja criada Ferramentas");
                guis.getiFerr().moveToFront();
                guis.getiFerr().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiFerr(new FrmFerramentas());
                this.desktop.add(guis.getiFerr());
                guis.getiFerr().setMaximum(true);
                guis.getiFerr().setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnFerramentasActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        sairSistema();
    }//GEN-LAST:event_formWindowClosing

    private void btnDentistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDentistasActionPerformed
        if (guis.getiDent() != null) {
            try {
                System.out.println("Janela ja criada Odonto");
                guis.getiDent().moveToFront();
                guis.getiDent().setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                guis.setiDent(new FrmPacientesOdonto());
                this.desktop.add(guis.getiDent());
                guis.getiDent().setMaximum(true);
                //guis.getiDent().setTipo("Odonto");
                //guis.getiDent().setTitle("Controle de paciente odontológicos");
                guis.getiDent().setVisible(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(FrmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDentistasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnDentistas;
    private javax.swing.JButton btnEstoque;
    private javax.swing.JButton btnFerramentas;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnMedicos;
    private javax.swing.JButton btnPrecos;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void VerificaNivel() {
        System.out.println(config.getNivel());

        if( config.getNivel() == 1){
            HabilitaBotoes();
        } else {
            DesabilitaBotoes();
        }
    }

    private void DesabilitaBotoes() {
        btnFuncionarios.setEnabled(false);
        btnEstoque.setEnabled(false);
        btnFerramentas.setEnabled(false);
    }

    private void HabilitaBotoes() {
        btnFuncionarios.setEnabled(true);
        btnEstoque.setEnabled(true);
        btnFerramentas.setEnabled(true);
    }
}
