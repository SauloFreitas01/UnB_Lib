/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author saulo
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form SignUpPage
     */
    public LoginPage() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        formularioLoginEmail = new javax.swing.JTextField();
        formularioLoginSenha = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        formularioLoginParaTelaRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(254, 254, 254));
        setPreferredSize(new java.awt.Dimension(882, 710));
        setSize(new java.awt.Dimension(600, 710));

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 204));
        jLabel2.setFont(new java.awt.Font("JetBrains Mono NL Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText(" UnB");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 40));

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("JetBrains Mono NL Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Lib");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, -1, 40));

        jLabel5.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Bem vindo à Biblioteca da UnB");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 52, -1, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/library-3.png.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(800, 810));
        jLabel6.setMinimumSize(new java.awt.Dimension(800, 810));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 580, 540));

        jPanel3.setBackground(new java.awt.Color(0, 0, 147));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Sitka Display", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Login");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 245, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Acesse sua Conta");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Email");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(254, 254, 254));
        jLabel12.setText("Senha");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 120, -1));

        loginButton.setBackground(new java.awt.Color(0, 102, 0));
        loginButton.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(254, 254, 254));
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel3.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 200, 50));

        formularioLoginEmail.setBackground(new java.awt.Color(0, 0, 107));
        formularioLoginEmail.setForeground(new java.awt.Color(255, 255, 255));
        formularioLoginEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioLoginEmailActionPerformed(evt);
            }
        });
        jPanel3.add(formularioLoginEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 30));

        formularioLoginSenha.setBackground(new java.awt.Color(0, 0, 107));
        formularioLoginSenha.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(formularioLoginSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 200, 30));

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(254, 254, 254));
        jLabel13.setText("Já é usuário ?");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, -1));

        formularioLoginParaTelaRegistro.setBackground(new java.awt.Color(0, 102, 0));
        formularioLoginParaTelaRegistro.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        formularioLoginParaTelaRegistro.setForeground(new java.awt.Color(254, 254, 254));
        formularioLoginParaTelaRegistro.setText("Clique Aqui");
        formularioLoginParaTelaRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        formularioLoginParaTelaRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formularioLoginParaTelaRegistroActionPerformed(evt);
            }
        });
        jPanel3.add(formularioLoginParaTelaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 200, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, -10, 270, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Metodo para extrair os inputs email e senha do usuario na tela LoginPage
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String email;
        String senha;
        String senhaFormatada;
        
        // CONSTANTE APENAS PARA TESTES:
        String adminEmail = "docente";
        String adminSenha = "12345";
        
         // Metodo para extrair os inputs email e senha do usuario na tela LoginPage
        email = formularioLoginEmail.getText();
        formularioLoginEmail.setText("");
        
        /* A senha é formatada pois o input senha é entregue pela biblioteca como
        um array de chars.
        */
        senhaFormatada = String.valueOf(formularioLoginSenha.getPassword());
        formularioLoginSenha.setText("");
        
        /* Metodo para mudar para a tela de admin caso o usuario e senha estejam corretos
        AVISO: FALTA ADICIONAR FORMATAÇÃO DE EMAIL
        */
        
        if (email.equals(adminEmail) && senhaFormatada.equals(adminSenha)) {
            AdminPage trocaTelaAdmin = new AdminPage();
            this.dispose();
            trocaTelaAdmin.setVisible(true);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void formularioLoginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioLoginEmailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formularioLoginEmailActionPerformed

    private void formularioLoginParaTelaRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formularioLoginParaTelaRegistroActionPerformed
        // TODO add your handling code here:
        SignUpPage trocaTelaRegistro = new SignUpPage();
        this.dispose();
        trocaTelaRegistro.setVisible(true);
    }//GEN-LAST:event_formularioLoginParaTelaRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField formularioLoginEmail;
    private javax.swing.JButton formularioLoginParaTelaRegistro;
    private javax.swing.JPasswordField formularioLoginSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables
}
