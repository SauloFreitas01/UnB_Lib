package Frames;


public class TeacherPage extends javax.swing.JFrame {

    public TeacherPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPapers = new javax.swing.JPanel();
        dadoSub = new javax.swing.JLabel();
        dadoNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        dadoAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        dadoGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        dadoArtigo = new javax.swing.JLabel();
        txtArtigo = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        dadoLogo = new javax.swing.JLabel();
        dadoUnB = new javax.swing.JLabel();
        dadoImagem = new javax.swing.JLabel();
        pnlAzul = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Professor");
        setSize(new java.awt.Dimension(882, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlPapers.setBackground(new java.awt.Color(254, 254, 254));
        pnlPapers.setAlignmentX(0.0F);
        pnlPapers.setAlignmentY(0.0F);
        pnlPapers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoSub.setBackground(new java.awt.Color(255, 255, 255));
        dadoSub.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dadoSub.setForeground(new java.awt.Color(0, 107, 0));
        dadoSub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoSub.setText("Submissão de Papers");
        pnlPapers.add(dadoSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 0, 450, 40));

        dadoNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoNome.setForeground(new java.awt.Color(0, 0, 157));
        dadoNome.setText("Nome:");
        pnlPapers.add(dadoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 200, 30));

        txtNome.setToolTipText("Digite seu nome");
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlPapers.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 200, -1));

        dadoAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoAutor.setForeground(new java.awt.Color(0, 0, 157));
        dadoAutor.setText("Autor:");
        pnlPapers.add(dadoAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 200, 30));

        txtAutor.setToolTipText("Digite seu email");
        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });
        pnlPapers.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 200, -1));

        dadoGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoGenero.setForeground(new java.awt.Color(0, 0, 157));
        dadoGenero.setText("Gênero:");
        pnlPapers.add(dadoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 200, 30));

        txtGenero.setToolTipText("Digite seu nome");
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });
        pnlPapers.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 200, -1));

        dadoArtigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoArtigo.setForeground(new java.awt.Color(0, 0, 157));
        dadoArtigo.setText("Artigos:");
        pnlPapers.add(dadoArtigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 200, 30));

        txtArtigo.setToolTipText("Digite seu nome");
        txtArtigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtigoActionPerformed(evt);
            }
        });
        pnlPapers.add(txtArtigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 200, -1));

        btnInserir.setBackground(new java.awt.Color(0, 102, 0));
        btnInserir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(254, 254, 254));
        btnInserir.setText("Inserir");
        btnInserir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnInserir.setBorderPainted(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        pnlPapers.add(btnInserir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 200, 50));

        dadoLogo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dadoLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/unb-icon.png"))); // NOI18N
        pnlPapers.add(dadoLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 280, 110));

        dadoUnB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dadoUnB.setForeground(new java.awt.Color(19, 62, 121));
        dadoUnB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoUnB.setText("UnB Lib");
        pnlPapers.add(dadoUnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 120, -1));

        dadoImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/library-icon-teacher.png"))); // NOI18N
        pnlPapers.add(dadoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 360, 270));

        getContentPane().add(pnlPapers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 588, 712));

        pnlAzul.setBackground(new java.awt.Color(0, 0, 157));
        pnlAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 0, 294, 712));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtArtigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArtigoActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        
    }//GEN-LAST:event_btnInserirActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInserir;
    private javax.swing.JLabel dadoArtigo;
    private javax.swing.JLabel dadoAutor;
    private javax.swing.JLabel dadoGenero;
    private javax.swing.JLabel dadoImagem;
    private javax.swing.JLabel dadoLogo;
    private javax.swing.JLabel dadoNome;
    private javax.swing.JLabel dadoSub;
    private javax.swing.JLabel dadoUnB;
    private javax.swing.JPanel pnlAzul;
    private javax.swing.JPanel pnlPapers;
    private javax.swing.JTextField txtArtigo;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
