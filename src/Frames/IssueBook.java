package Frames;


import javax.swing.JOptionPane;
import unblib.Library;
import java.time.LocalDate;


public class IssueBook extends javax.swing.JFrame{

    public IssueBook(){
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLivro = new javax.swing.JPanel();
        dadoDetalhesLivro = new javax.swing.JLabel();
        pnlLinhaLivro = new javax.swing.JPanel();
        dadoNomeLivro = new javax.swing.JLabel();
        dadoAutor = new javax.swing.JLabel();
        dadoGenero = new javax.swing.JLabel();
        dadoQtd = new javax.swing.JLabel();
        pnlMembro = new javax.swing.JPanel();
        pnlDetalhesMembro = new javax.swing.JLabel();
        pnlLinhaMembro = new javax.swing.JPanel();
        dadoIDMembro = new javax.swing.JLabel();
        dadoNomeMebro = new javax.swing.JLabel();
        dadoEmail = new javax.swing.JLabel();
        dadoUsuario = new javax.swing.JLabel();
        pnlEmprestimo = new javax.swing.JPanel();
        dadoEmprestimoLivros = new javax.swing.JLabel();
        dadoNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        dadoID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        dadoEmprestimo = new javax.swing.JLabel();
        txtDataEmprestimo = new javax.swing.JFormattedTextField();
        dadoDevolucao = new javax.swing.JLabel();
        txtDataDevolucao = new javax.swing.JFormattedTextField();
        btnEmprestimo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(882, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLivro.setBackground(new java.awt.Color(0, 102, 0));
        pnlLivro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoDetalhesLivro.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        dadoDetalhesLivro.setForeground(new java.awt.Color(255, 255, 255));
        dadoDetalhesLivro.setText("Detalhes do Livro");
        pnlLivro.add(dadoDetalhesLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        pnlLinhaLivro.setBackground(new java.awt.Color(255, 255, 255));
        pnlLinhaLivro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlLivro.add(pnlLinhaLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 120, 250, 10));

        dadoNomeLivro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dadoNomeLivro.setForeground(new java.awt.Color(255, 255, 255));
        dadoNomeLivro.setText("Nome do Livro: ");
        pnlLivro.add(dadoNomeLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 253, -1, -1));

        dadoAutor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dadoAutor.setForeground(new java.awt.Color(255, 255, 255));
        dadoAutor.setText("Autor:");
        pnlLivro.add(dadoAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 303, -1, -1));

        dadoGenero.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dadoGenero.setForeground(new java.awt.Color(255, 255, 255));
        dadoGenero.setText("Gênero:");
        pnlLivro.add(dadoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 353, -1, -1));

        dadoQtd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dadoQtd.setForeground(new java.awt.Color(255, 255, 255));
        dadoQtd.setText("Quantidade:");
        pnlLivro.add(dadoQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 403, -1, -1));

        getContentPane().add(pnlLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 294, 712));

        pnlMembro.setBackground(new java.awt.Color(0, 0, 157));
        pnlMembro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDetalhesMembro.setFont(new java.awt.Font("Verdana", 0, 25)); // NOI18N
        pnlDetalhesMembro.setForeground(new java.awt.Color(255, 255, 255));
        pnlDetalhesMembro.setText("Detalhes do Membro");
        pnlMembro.add(pnlDetalhesMembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        pnlLinhaMembro.setBackground(new java.awt.Color(255, 255, 255));
        pnlLinhaMembro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlMembro.add(pnlLinhaMembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 120, 264, 10));

        dadoIDMembro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dadoIDMembro.setForeground(new java.awt.Color(255, 255, 255));
        dadoIDMembro.setText("Id:");
        pnlMembro.add(dadoIDMembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 253, -1, -1));

        dadoNomeMebro.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dadoNomeMebro.setForeground(new java.awt.Color(255, 255, 255));
        dadoNomeMebro.setText("Nome:");
        pnlMembro.add(dadoNomeMebro, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 303, -1, -1));

        dadoEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dadoEmail.setForeground(new java.awt.Color(255, 255, 255));
        dadoEmail.setText("Email:");
        pnlMembro.add(dadoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 353, -1, -1));

        dadoUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dadoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        dadoUsuario.setText("Usuário:");
        pnlMembro.add(dadoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 403, -1, -1));

        getContentPane().add(pnlMembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 0, 294, 712));

        pnlEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        pnlEmprestimo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoEmprestimoLivros.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        dadoEmprestimoLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        dadoEmprestimoLivros.setText("Empréstimo Livros");
        pnlEmprestimo.add(dadoEmprestimoLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 250, 50));

        dadoNome.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        dadoNome.setText("Nome do livro");
        pnlEmprestimo.add(dadoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, -1));

        txtNome.setBackground(new java.awt.Color(0, 0, 157));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlEmprestimo.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 240, 30));

        dadoID.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        dadoID.setText("Id do membro");
        pnlEmprestimo.add(dadoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 140, -1));

        txtID.setBackground(new java.awt.Color(0, 0, 157));
        txtID.setForeground(new java.awt.Color(255, 255, 255));
        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtID.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        pnlEmprestimo.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 240, 30));

        dadoEmprestimo.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        dadoEmprestimo.setText("Data do empréstimo");
        pnlEmprestimo.add(dadoEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 180, -1));

        txtDataEmprestimo.setBackground(new java.awt.Color(0, 0, 157));
        txtDataEmprestimo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDataEmprestimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtDataEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataEmprestimoActionPerformed(evt);
            }
        });
        pnlEmprestimo.add(txtDataEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 240, 30));

        dadoDevolucao.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        dadoDevolucao.setText("Data de devolução");
        pnlEmprestimo.add(dadoDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 180, -1));

        txtDataDevolucao.setBackground(new java.awt.Color(0, 0, 157));
        txtDataDevolucao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtDataDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataDevolucaoActionPerformed(evt);
            }
        });
        pnlEmprestimo.add(txtDataDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 240, 30));

        btnEmprestimo.setBackground(new java.awt.Color(0, 102, 0));
        btnEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmprestimo.setForeground(new java.awt.Color(254, 254, 254));
        btnEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        btnEmprestimo.setText("Realizar empréstimo");
        btnEmprestimo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });
        pnlEmprestimo.add(btnEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 240, 40));

        getContentPane().add(pnlEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 0, 294, 712));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        if(txtNome.getText().equals("") || txtID.getText().equals("") ||
                txtDataEmprestimo.getText().equals("") || txtDataDevolucao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }else{
            String nome = txtNome.getText();
            String id = txtNome.getText();
            String dataEmprestimo = txtDataEmprestimo.getText();
            String dataDevolucao = txtDataDevolucao.getText();
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void txtDataDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataDevolucaoActionPerformed
        
    }//GEN-LAST:event_txtDataDevolucaoActionPerformed

    private void txtDataEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataEmprestimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataEmprestimoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try{
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if ("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex){
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex){
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JLabel dadoAutor;
    private javax.swing.JLabel dadoDetalhesLivro;
    private javax.swing.JLabel dadoDevolucao;
    private javax.swing.JLabel dadoEmail;
    private javax.swing.JLabel dadoEmprestimo;
    private javax.swing.JLabel dadoEmprestimoLivros;
    private javax.swing.JLabel dadoGenero;
    private javax.swing.JLabel dadoID;
    private javax.swing.JLabel dadoIDMembro;
    private javax.swing.JLabel dadoNome;
    private javax.swing.JLabel dadoNomeLivro;
    private javax.swing.JLabel dadoNomeMebro;
    private javax.swing.JLabel dadoQtd;
    private javax.swing.JLabel dadoUsuario;
    private javax.swing.JLabel pnlDetalhesMembro;
    private javax.swing.JPanel pnlEmprestimo;
    private javax.swing.JPanel pnlLinhaLivro;
    private javax.swing.JPanel pnlLinhaMembro;
    private javax.swing.JPanel pnlLivro;
    private javax.swing.JPanel pnlMembro;
    private javax.swing.JFormattedTextField txtDataDevolucao;
    private javax.swing.JFormattedTextField txtDataEmprestimo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
