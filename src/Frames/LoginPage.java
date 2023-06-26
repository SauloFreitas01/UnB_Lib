package Frames;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import unblib.Book;
import static unblib.Controle.escreverArquivo;
import static unblib.Controle.lerArquivo;
import static unblib.Controle.validadorEmail;
import static unblib.Controle.verificarCredenciaisLogin;
import unblib.Member;


public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlWelcome = new javax.swing.JPanel();
        dadoUnB = new javax.swing.JLabel();
        dadoLib = new javax.swing.JLabel();
        dadoWelcome = new javax.swing.JLabel();
        dadoImagem = new javax.swing.JLabel();
        pnlLogin = new javax.swing.JPanel();
        dadoLogin = new javax.swing.JLabel();
        dadoAcesso = new javax.swing.JLabel();
        dadoEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        dadoSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        dadoConta = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(254, 254, 254));
        setSize(new java.awt.Dimension(882, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlWelcome.setBackground(new java.awt.Color(254, 254, 254));
        pnlWelcome.setPreferredSize(new java.awt.Dimension(588, 712));
        pnlWelcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoUnB.setBackground(new java.awt.Color(0, 0, 204));
        dadoUnB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadoUnB.setForeground(new java.awt.Color(0, 0, 204));
        dadoUnB.setText(" UnB");
        pnlWelcome.add(dadoUnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 40));

        dadoLib.setBackground(new java.awt.Color(0, 0, 204));
        dadoLib.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadoLib.setForeground(new java.awt.Color(0, 102, 0));
        dadoLib.setText("Lib");
        pnlWelcome.add(dadoLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, -1, 40));

        dadoWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dadoWelcome.setForeground(new java.awt.Color(0, 0, 204));
        dadoWelcome.setText("Bem vindo à Biblioteca da UnB");
        pnlWelcome.add(dadoWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 52, -1, -1));

        dadoImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/library-3.png.png"))); // NOI18N
        dadoImagem.setText("jLabel6");
        dadoImagem.setMaximumSize(new java.awt.Dimension(800, 810));
        dadoImagem.setMinimumSize(new java.awt.Dimension(800, 810));
        pnlWelcome.add(dadoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 580, 540));

        getContentPane().add(pnlWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 588, 712));

        pnlLogin.setBackground(new java.awt.Color(0, 0, 147));
        pnlLogin.setForeground(new java.awt.Color(255, 255, 255));
        pnlLogin.setPreferredSize(new java.awt.Dimension(294, 712));
        pnlLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dadoLogin.setForeground(new java.awt.Color(254, 254, 254));
        dadoLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoLogin.setText("Login");
        pnlLogin.add(dadoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 245, -1));

        dadoAcesso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoAcesso.setForeground(new java.awt.Color(254, 254, 254));
        dadoAcesso.setText("Acesse sua Conta");
        pnlLogin.add(dadoAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        dadoEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoEmail.setForeground(new java.awt.Color(254, 254, 254));
        dadoEmail.setText("Email:");
        pnlLogin.add(dadoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 120, -1));

        txtEmail.setBackground(new java.awt.Color(0, 0, 107));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setToolTipText("Insira seu email");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        pnlLogin.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 234, 30));

        dadoSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoSenha.setForeground(new java.awt.Color(254, 254, 254));
        dadoSenha.setText("Senha:");
        pnlLogin.add(dadoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 120, -1));

        txtSenha.setBackground(new java.awt.Color(0, 0, 107));
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setToolTipText("Insira sua senha");
        txtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlLogin.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 234, 30));

        btnLogin.setBackground(new java.awt.Color(0, 102, 0));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(254, 254, 254));
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLogin.setBorderPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 510, 200, 50));

        dadoConta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadoConta.setForeground(new java.awt.Color(254, 254, 254));
        dadoConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoConta.setText("Não possui conta?");
        dadoConta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnlLogin.add(dadoConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 580, 200, -1));

        btnCadastro.setBackground(new java.awt.Color(0, 102, 0));
        btnCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(254, 254, 254));
        btnCadastro.setText("Cadastre-se");
        btnCadastro.setToolTipText("");
        btnCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnCadastro.setBorderPainted(false);
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        pnlLogin.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 620, 200, 50));

        getContentPane().add(pnlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 0, 294, 712));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // Metodo para extrair os inputs email e senha do usuario na tela LoginPage
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String email;
        String senha;
        String senhaFormatada;
        
        // CONSTANTE APENAS PARA TESTES:
        String adminEmail = "docente@gmail.com";
        String adminSenha = "12345";
        
         // Metodo para extrair os inputs email e senha do usuario na tela LoginPage
        email = txtEmail.getText();
        txtEmail.setText("");
        
        /* A senha é formatada pois o input senha é entregue pela biblioteca como
        um array de chars.
        */
        senhaFormatada = String.valueOf(txtSenha.getPassword());
        txtSenha.setText("");
        
        /* Metodo para mudar para a tela de admin caso o usuario e senha estejam corretos
        AVISO: FALTA ADICIONAR FORMATAÇÃO DE EMAIL
        */
        
        // VALIDACAO EMAIL
        if (validadorEmail(email)) {
            try {
                ArrayList<Member> listaUsuarios = lerArquivo("usuarios.bin");
                if (verificarCredenciaisLogin(email, senhaFormatada, listaUsuarios)) {
                    AdminPage trocaTelaAdmin = new AdminPage();
                    this.dispose();
                    trocaTelaAdmin.setVisible(true);
                } else {
                     JOptionPane.showMessageDialog(null,  "Email ou senha inválidos", "Informações inválidas", JOptionPane.ERROR_MESSAGE);
                }
            } catch (IOException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginPage.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        } else {
            JOptionPane.showMessageDialog(null,  "Formato de email inválido", "Email inválido", JOptionPane.ERROR_MESSAGE );
        }
      
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtEmailActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        SignUpPage trocaTelaRegistro = new SignUpPage();
        this.dispose(); 
        trocaTelaRegistro.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException {
        File usuarios = new File("usuarios.bin");
        File emprestimos = new File("emprestimos.bin");
        
        if (!usuarios.isFile()) {
            ArrayList<Member> listaUsers = new ArrayList<>();
            escreverArquivo(listaUsers, "usuarios.bin");


            Member membroTeste = new Member();
            membroTeste.setEmail("docente@gmail.com");
            membroTeste.setPassword("12345");
            membroTeste.setId("15264654564");
            membroTeste.setName("docente");
            membroTeste.setTipo("Docente");

            ArrayList<Member> listaUsuarios = lerArquivo("usuarios.bin");
            listaUsuarios.add(membroTeste);
            escreverArquivo(listaUsuarios, "usuarios.bin");
        }
        
        if (!emprestimos.isFile()) {
            ArrayList<Book> listaEmprestimos = new ArrayList<>();
            escreverArquivo(listaEmprestimos, "emprestimos.bin");
        }
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
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel dadoAcesso;
    private javax.swing.JLabel dadoConta;
    private javax.swing.JLabel dadoEmail;
    private javax.swing.JLabel dadoImagem;
    private javax.swing.JLabel dadoLib;
    private javax.swing.JLabel dadoLogin;
    private javax.swing.JLabel dadoSenha;
    private javax.swing.JLabel dadoUnB;
    private javax.swing.JLabel dadoWelcome;
    private javax.swing.JPanel pnlLogin;
    private javax.swing.JPanel pnlWelcome;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
