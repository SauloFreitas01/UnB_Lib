package Frames;

import javax.swing.JOptionPane;
import unblib.Member;
import java.util.*;
import javax.swing.table.DefaultTableModel;


public class ManageMembers extends javax.swing.JFrame {

    public ArrayList<Member> listaMembers;
            
    String botao;
    
    public ManageMembers() {
        initComponents();
        
        listaMembers = new ArrayList();
        
        
        //Habilitar ou desabilitar botões
        btnNovo.setEnabled(true);
        btnAtualizar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(false);


        //Habilitar ou desabilitar os textos
        cmbUser.setEnabled(false);
        txtNome.setEnabled(false);
        txtID.setEnabled(false);
        txtEmail.setEnabled(false);
    }
    
    
    public void carregarTabelaMembers(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Tipo usuário", "Nome", "ID", "Email"}, 0);
        
        String sel = (String) cmbUser.getSelectedItem();
        
        //Adicionar combobox
        for(int i=0; i<listaMembers.size(); i++){
            Object linha[] = new Object[]{sel,
                                        listaMembers.get(i).getName(),
                                        listaMembers.get(i).getId(),
                                        listaMembers.get(i).getEmail()};
            
            modelo.addRow(linha);
        }
        
        
        //Tabela recebe modelo
        tblMembers.setModel(modelo);
        
        tblMembers.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblMembers.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblMembers.getColumnModel().getColumn(1).setPreferredWidth(5);
        tblMembers.getColumnModel().getColumn(2).setPreferredWidth(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDados = new javax.swing.JPanel();
        dadoUser = new javax.swing.JLabel();
        cmbUser = new javax.swing.JComboBox<>();
        dadoNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        dadoID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        dadoEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        pnlMembers = new javax.swing.JPanel();
        dadoMembros = new javax.swing.JLabel();
        scrMembers = new javax.swing.JScrollPane();
        tblMembers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDados.setBackground(new java.awt.Color(0, 0, 157));
        pnlDados.setPreferredSize(new java.awt.Dimension(320, 712));
        pnlDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoUser.setForeground(new java.awt.Color(254, 254, 254));
        dadoUser.setText("Usuário:");
        pnlDados.add(dadoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, -1));

        cmbUser.setBackground(new java.awt.Color(0, 0, 107));
        cmbUser.setForeground(new java.awt.Color(254, 254, 254));
        cmbUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Discente", "Docente" }));
        cmbUser.setToolTipText("Selecione o tipo de usuário");
        cmbUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserActionPerformed(evt);
            }
        });
        pnlDados.add(cmbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 240, 30));

        dadoNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoNome.setForeground(new java.awt.Color(254, 254, 254));
        dadoNome.setText("Nome:");
        pnlDados.add(dadoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, -1));

        txtNome.setBackground(new java.awt.Color(0, 0, 107));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setToolTipText("Insira o nome");
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlDados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 240, 30));

        dadoID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoID.setForeground(new java.awt.Color(254, 254, 254));
        dadoID.setText("ID:");
        pnlDados.add(dadoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, -1));

        txtID.setBackground(new java.awt.Color(0, 0, 107));
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setToolTipText("Insira o ID");
        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlDados.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 30));

        dadoEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoEmail.setForeground(new java.awt.Color(254, 254, 254));
        dadoEmail.setText("Email:");
        pnlDados.add(dadoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, -1));

        txtEmail.setBackground(new java.awt.Color(0, 0, 107));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setToolTipText("Insira o email");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlDados.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 240, 30));

        btnDeletar.setBackground(new java.awt.Color(255, 0, 0));
        btnDeletar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(254, 254, 254));
        btnDeletar.setText("Deletar");
        btnDeletar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnDeletar.setBorderPainted(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        pnlDados.add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 80, 40));

        btnSalvar.setBackground(new java.awt.Color(0, 102, 0));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(254, 254, 254));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnSalvar.setBorderPainted(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        pnlDados.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 80, 40));

        btnAtualizar.setBackground(new java.awt.Color(0, 102, 0));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(254, 254, 254));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnAtualizar.setBorderPainted(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        pnlDados.add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 80, 40));

        btnNovo.setBackground(new java.awt.Color(0, 102, 0));
        btnNovo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(254, 254, 254));
        btnNovo.setText("Novo");
        btnNovo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnNovo.setBorderPainted(false);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        pnlDados.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, 40));

        btnVoltar.setBackground(new java.awt.Color(0, 102, 0));
        btnVoltar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(254, 254, 254));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon-return.png"))); // NOI18N
        btnVoltar.setText("Voltar");
        btnVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVoltar.setBorderPainted(false);
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        pnlDados.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        getContentPane().add(pnlDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 712));

        pnlMembers.setBackground(new java.awt.Color(254, 254, 254));
        pnlMembers.setPreferredSize(new java.awt.Dimension(882, 712));
        pnlMembers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoMembros.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        dadoMembros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoMembros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Contact_52px.png"))); // NOI18N
        dadoMembros.setText("Administrar Membros");
        pnlMembers.add(dadoMembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 89, 400, 52));

        tblMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo usuário", "Nome ", "ID", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMembers.setGridColor(new java.awt.Color(0, 0, 0));
        tblMembers.setSelectionBackground(new java.awt.Color(80, 80, 80));
        tblMembers.setShowGrid(true);
        tblMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMembersMouseClicked(evt);
            }
        });
        scrMembers.setViewportView(tblMembers);

        pnlMembers.add(scrMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 206, 550, 300));

        getContentPane().add(pnlMembers, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 562, 712));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int index = tblMembers.getSelectedRow();
        
        if(index >= 0 && index < listaMembers.size()){
            listaMembers.remove(index);
        }
        
        carregarTabelaMembers();
        
        
        //Limpar campos
        txtNome.setText("");
        txtID.setText("");
        txtEmail.setText("");


        //Habilitar ou desabilitar botões
        btnNovo.setEnabled(true);
        btnAtualizar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(false);


        //Habilitar ou desabilitar os textos
        cmbUser.setEnabled(false);
        txtNome.setEnabled(false);
        txtID.setEnabled(false);
        txtEmail.setEnabled(false);
        
        JOptionPane.showMessageDialog(null, "Membro excluído com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtNome.getText().equals("") || txtID.getText().equals("") ||
                txtEmail.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }else{
            String tipo = (String) cmbUser.getSelectedItem();
            String nome = txtNome.getText();
            String id = txtID.getText();
            String email = txtEmail.getText();
            
            
            if(botao.equals("novo")){
                Member member = new Member(nome, id, email);
                
                listaMembers.add(member);
                
                JOptionPane.showMessageDialog(null, "Membro cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            
            }else if(botao.equals("atualizar")){
                int index = tblMembers.getSelectedRow();
                
                listaMembers.get(index).setTipo(tipo);
                listaMembers.get(index).setName(nome);
                listaMembers.get(index).setName(nome);
                listaMembers.get(index).setId(id);
                listaMembers.get(index).setEmail(email);
                
                JOptionPane.showMessageDialog(null, "Membro atualizado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            
            //Carregar os dados na tabela
            carregarTabelaMembers();
            
            
            //Limpar campos
            txtNome.setText("");
            txtID.setText("");
            txtEmail.setText("");


            //Habilitar ou desabilitar botões
            btnNovo.setEnabled(true);
            btnAtualizar.setEnabled(false);
            btnDeletar.setEnabled(false);
            btnSalvar.setEnabled(false);


            //Habilitar ou desabilitar os textos
            cmbUser.setEnabled(false);
            txtNome.setEnabled(false);
            txtID.setEnabled(false);
            txtEmail.setEnabled(false);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        botao = "atualizar";
        
        
        //Habilitar ou desabilitar botões
        btnNovo.setEnabled(false);
        btnAtualizar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(true);
        
        
        //Habilitar ou desabilitar os textos
        cmbUser.setEnabled(true);
        txtNome.setEnabled(true);
        txtID.setEnabled(true);
        txtEmail.setEnabled(true);
        
        txtNome.requestFocus();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void cmbUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUserActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        botao = "novo";
        
        
        //Limpar campos
        txtNome.setText("");
        txtID.setText("");
        txtEmail.setText("");
        
        
        //Habilitar ou desabilitar botões
        btnNovo.setEnabled(false);
        btnAtualizar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(true);
        
        
        //Habilitar ou desabilitar os textos
        cmbUser.setEnabled(true);
        txtNome.setEnabled(true);
        txtID.setEnabled(true);
        txtEmail.setEnabled(true);
        
        txtNome.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tblMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMembersMouseClicked
        int i = tblMembers.getSelectedRow();
        
        if(i >= 0 && i < listaMembers.size()){
            Member mem = listaMembers.get(i);
            txtNome.setText(mem.getName());
            txtID.setText(mem.getId());
            txtEmail.setText(mem.getEmail());
        }
        
        //Habilitar ou desabilitar botões
        btnNovo.setEnabled(true);
        btnAtualizar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnSalvar.setEnabled(false);


        //Habilitar ou desabilitar os textos
        cmbUser.setEnabled(false);
        txtNome.setEnabled(false);
        txtID.setEnabled(false);
        txtEmail.setEnabled(false);
    }//GEN-LAST:event_tblMembersMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageMembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageMembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbUser;
    private javax.swing.JLabel dadoEmail;
    private javax.swing.JLabel dadoID;
    private javax.swing.JLabel dadoMembros;
    private javax.swing.JLabel dadoNome;
    private javax.swing.JLabel dadoUser;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlMembers;
    private javax.swing.JScrollPane scrMembers;
    private javax.swing.JTable tblMembers;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}