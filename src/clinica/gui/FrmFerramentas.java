/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinica.gui;

import static clinica.Clinica.config;
import clinica.bean.Usuario;
import clinica.dao.UsuarioDao;
import clinica.util.Md5;
import clinica.util.guis;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author celso
 */
public final class FrmFerramentas extends javax.swing.JInternalFrame {

    Path origem = Paths.get(config.getHost());
    Path destino = Paths.get("clinica_backup.db");

    /**
     * Creates new form FrmAdmFerramentas
     */
    public FrmFerramentas() {
        initComponents();
        BuscaUnidade();
        BuscaLogins();
        BuscaLocal();
        BuscaBanco();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnRestaura = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnBackup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnAlterarSenha = new javax.swing.JButton();
        cmbUser = new javax.swing.JComboBox();
        btnExcluirUser = new javax.swing.JButton();
        btnNovoUser = new javax.swing.JButton();
        btnRefreshUser = new javax.swing.JButton();
        lblMsg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnLocalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblLocalizacao = new javax.swing.JTextArea();
        cmbDriveBackup = new javax.swing.JComboBox();
        File[] Roots = File.listRoots();

        for (File file : Roots) {
            cmbDriveBackup.addItem(file);
            System.out.println(file);
        }
        jLabel7 = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("Ferramentas");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true), "Restaurar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DejaVu Sans", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(264, 87));

        btnRestaura.setToolTipText("Restaura banco de dados de um dispositivo selecionado.");
        btnRestaura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestaura.setLabel("Restauração"); // NOI18N
        btnRestaura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRestaura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestauraActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Restaurar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnRestaura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(btnRestaura)
                .addGap(24, 24, 24))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true), "Backup", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DejaVu Sans", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(264, 87));

        btnBackup.setText("Executar Backup");
        btnBackup.setToolTipText("Realiza cópia de segurança do banco de dados do sistema.");
        btnBackup.setPreferredSize(new java.awt.Dimension(124, 25));
        btnBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackupActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Backup.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true), "Usuários", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DejaVu Sans", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(264, 87));

        btnAlterarSenha.setText("Alterar senha");
        btnAlterarSenha.setToolTipText("Modifica a senha para o usuário selecionado.");
        btnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarSenhaActionPerformed(evt);
            }
        });

        btnExcluirUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/DeleteUser.png"))); // NOI18N
        btnExcluirUser.setToolTipText("Excluir usuário selecionado.");
        btnExcluirUser.setBorderPainted(false);
        btnExcluirUser.setContentAreaFilled(false);
        btnExcluirUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUserActionPerformed(evt);
            }
        });

        btnNovoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/novoUser.png"))); // NOI18N
        btnNovoUser.setToolTipText("Cadastrar novo usuário para o sistema.");
        btnNovoUser.setBorderPainted(false);
        btnNovoUser.setContentAreaFilled(false);
        btnNovoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUserActionPerformed(evt);
            }
        });

        btnRefreshUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Refresh.png"))); // NOI18N
        btnRefreshUser.setBorder(null);
        btnRefreshUser.setBorderPainted(false);
        btnRefreshUser.setContentAreaFilled(false);
        btnRefreshUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefreshUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNovoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcluirUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefreshUser))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefreshUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnAlterarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirUser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(btnNovoUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 255), 2, true), "Configurações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("DejaVu Sans", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel2.setText("Localização do banco:");

        btnLocalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clinica/imagens/Localizar.png"))); // NOI18N
        btnLocalizar.setText("Selecionar outro local");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        lblLocalizacao.setEditable(false);
        lblLocalizacao.setBackground(new java.awt.Color(238, 238, 238));
        lblLocalizacao.setColumns(20);
        lblLocalizacao.setLineWrap(true);
        lblLocalizacao.setRows(5);
        lblLocalizacao.setWrapStyleWord(true);
        lblLocalizacao.setBorder(null);
        lblLocalizacao.setFocusable(false);
        lblLocalizacao.setMargin(new java.awt.Insets(5, 5, 5, 5));
        lblLocalizacao.setName(""); // NOI18N
        jScrollPane1.setViewportView(lblLocalizacao);

        cmbDriveBackup.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDriveBackupItemStateChanged(evt);
            }
        });
        cmbDriveBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDriveBackupActionPerformed(evt);
            }
        });

        jLabel7.setText("Unidade de Destino:");

        lblDestino.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDestino.setForeground(new java.awt.Color(204, 0, 0));

        btnSair.setText("Sair");
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(btnLocalizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbDriveBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLocalizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDriveBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(12, 12, 12)
                .addComponent(btnSair))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackupActionPerformed
        btnBackup.setEnabled(false);
        // perguntar se deseja realizar backup
        if (JOptionPane.showConfirmDialog(this, "Deseja realizar backup do banco de dados?", "Backup", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            ExecutaBackup(origem, destino);
        }

        btnBackup.setEnabled(true);
    }//GEN-LAST:event_btnBackupActionPerformed

    private void btnRestauraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestauraActionPerformed
        btnRestaura.setEnabled(false);
        // perguntar se deseja realizar restauracao
        if (JOptionPane.showConfirmDialog(this, "Deseja realizar restauração do banco de dados?", "Restauração", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            ExecutaRestauracao(origem, destino);
        }
        btnRestaura.setEnabled(true);
    }//GEN-LAST:event_btnRestauraActionPerformed

    private void btnRefreshUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshUserActionPerformed
        cmbUser.removeAllItems();
        BuscaLogins();
    }//GEN-LAST:event_btnRefreshUserActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        JFileChooser file = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Arquivo de dados", "db");
        file.setFileFilter(filtro);

        int result = file.showOpenDialog(null);
        if (result != JFileChooser.CANCEL_OPTION) {
            String path = file.getSelectedFile().getAbsolutePath();

            lblLocalizacao.setText(path);

            config.setHost(path);
            XStream xml = new XStream(new DomDriver());

            String doc = xml.toXML(config);

            config.salvarConfig(doc);
        }
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnNovoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUserActionPerformed
        FrmAddUsuario frmUser = new FrmAddUsuario();

        frmUser.setLocationRelativeTo(this);
        frmUser.setVisible(true);
    }//GEN-LAST:event_btnNovoUserActionPerformed

    private void btnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarSenhaActionPerformed
        String novaSenha = JOptionPane.showInputDialog(this, "Digite a nova senha para o usuário selecionado.", "Nova Senha", JOptionPane.INFORMATION_MESSAGE);
        if (!novaSenha.isEmpty()) {
            Md5 t = new Md5();

            UsuarioDao user = new UsuarioDao();

            if (user.AlterarSenha(cmbUser.getSelectedItem().toString(), t.crypt(novaSenha)) == 0) {
                JOptionPane.showMessageDialog(this, "Erro ao alterar senha do usuário: " + cmbUser.getSelectedItem().toString());
            } else {
                lblMsg.setText("Senha alterada com sucesso!");
            }
        }
        System.out.println(novaSenha);
    }//GEN-LAST:event_btnAlterarSenhaActionPerformed

    private void btnExcluirUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUserActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Deseja realmente excluir usuário " + cmbUser.getSelectedItem().toString() + "?", "ATENÇÃO", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.OK_OPTION) {

            UsuarioDao user = new UsuarioDao();

            if (user.ExcluirUsuario(cmbUser.getSelectedItem().toString()) == 0) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir usuário selecionado!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                cmbUser.removeItemAt(cmbUser.getSelectedIndex());
            }
        }


    }//GEN-LAST:event_btnExcluirUserActionPerformed

    private void cmbDriveBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDriveBackupActionPerformed
        //System.out.println("Selecionado: " + cmbDriveBackup.getSelectedItem().toString());
        //config.setLocal(cmbDriveBackup.getSelectedItem().toString());
        //SalvarConfigBackup();
        //lblDestino.setText(config.getLocal());
    }//GEN-LAST:event_cmbDriveBackupActionPerformed

    private void cmbDriveBackupItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDriveBackupItemStateChanged
        System.out.println("Alterado item: " + cmbDriveBackup.getSelectedItem().toString());
        config.setLocal(cmbDriveBackup.getSelectedItem().toString());
        SalvarConfigBackup();
        lblDestino.setText(config.getLocal());
    }//GEN-LAST:event_cmbDriveBackupItemStateChanged

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        guis.setiFerr(null);
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarSenha;
    private javax.swing.JButton btnBackup;
    private javax.swing.JButton btnExcluirUser;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JButton btnNovoUser;
    private javax.swing.JButton btnRefreshUser;
    private javax.swing.JButton btnRestaura;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox cmbDriveBackup;
    private javax.swing.JComboBox cmbUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JTextArea lblLocalizacao;
    private javax.swing.JLabel lblMsg;
    // End of variables declaration//GEN-END:variables

    private void ExecutaBackup(Path origem, Path destino) {

        try {
            System.out.println("Realizando backup de origem: " + origem + " para destino: " + config.getLocal() + destino);
            System.out.println("Destino gravado xml: " + config.getLocal());

            Path destino2 = Paths.get(config.getLocal() + destino);

            Files.copy(origem, destino2, REPLACE_EXISTING);
            lblMsg.setForeground(Color.blue);
            lblMsg.setText("Cópia de segurança do Banco de Dados realizada com sucesso!");
            // SalvarConfigBackup();
        } catch (IOException ex) {
            lblMsg.setForeground(Color.red);
            lblMsg.setText("Erro ao copiar arquivo!");

            System.out.println("Erro ao copiar arquivo: " + ex.getMessage());
        }
    }

    private void ExecutaRestauracao(Path origem, Path destino) {
        try {
            System.out.println("Realizando restauracao de: " + destino + " para: " + origem);

            Path destino2 = Paths.get(cmbDriveBackup.getSelectedItem().toString() + destino);

            Files.copy(destino2, origem, REPLACE_EXISTING);
            lblMsg.setForeground(Color.blue);
            lblMsg.setText("Restauração do Banco de Dados realizada com sucesso!");
            // SalvarConfigBackup();
        } catch (IOException ex) {
            lblMsg.setForeground(Color.red);
            lblMsg.setText("Erro ao restaurar arquivo!");
            System.out.println("Erro ao restaurar arquivo: " + ex.getMessage());
        }
    }

    private void BuscaUnidades() {
        File[] Roots = File.listRoots();

        for (File file : Roots) {
            cmbDriveBackup.addItem(file);
            System.out.println(file);
        }
    }

    private void BuscaLogins() {
        UsuarioDao user = new UsuarioDao();
        List<Usuario> users = user.ListarUsuarios();

        for (Usuario user1 : users) {
            System.out.println("Usuario encontrado: " + user1.getUsrLogin());
            cmbUser.addItem(user1.getUsrLogin());
        }
    }

    private void SalvarConfigBackup() {
        //config.setLocal(cmbDriveBackup.getSelectedItem().toString());

        XStream xml = new XStream(new DomDriver());
        String doc = xml.toXML(config);

        config.salvarConfig(doc);
    }

    private void BuscaLocal() {
        lblDestino.setText(config.getLocal());
    }

    private void BuscaBanco() {
        System.out.println("Buscando host: " + config.getHost());
        lblLocalizacao.setText(config.getHost());
    }

    private void BuscaUnidade() {
        cmbDriveBackup.setSelectedItem(config.getLocal());
    }
}
