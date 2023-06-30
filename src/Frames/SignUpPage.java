package Frames;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static unblib.Controle.escreverArquivo;
import static unblib.Controle.lerArquivo;
import static unblib.Controle.validadorEmail;
import static unblib.Controle.validadorMatricula;
import static unblib.Controle.validadorNome;
import unblib.Member;
//import unblib.Book;


public class SignUpPage extends javax.swing.JFrame {

    public SignUpPage() throws IOException, FileNotFoundException, ClassNotFoundException, ClassNotFoundException, ClassNotFoundException {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlWelcome = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        dadoUnB = new javax.swing.JLabel();
        dadoLib = new javax.swing.JLabel();
        dadoWelcome = new javax.swing.JLabel();
        dadoImagem = new javax.swing.JLabel();
        pnlCadastro = new javax.swing.JPanel();
        dadoCadastro = new javax.swing.JLabel();
        dadoConta = new javax.swing.JLabel();
        dadoUsuario = new javax.swing.JLabel();
        cmbUser = new javax.swing.JComboBox<>();
        dadoEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        dadoMatricula = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        dadoNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        dadoSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        bntCadastro = new javax.swing.JButton();
        dadoPergunta = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UnB Lib");
        setBackground(new java.awt.Color(254, 254, 254));
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/Logo_UnB.png")).getImage());
        setMinimumSize(new java.awt.Dimension(800, 700));
        setSize(new java.awt.Dimension(882, 712));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlWelcome.setBackground(new java.awt.Color(254, 254, 254));
        pnlWelcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setBackground(new java.awt.Color(0, 0, 157));
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
        pnlWelcome.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        dadoUnB.setBackground(new java.awt.Color(0, 0, 204));
        dadoUnB.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadoUnB.setForeground(new java.awt.Color(0, 0, 204));
        dadoUnB.setText(" UnB");
        pnlWelcome.add(dadoUnB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 40));

        dadoLib.setBackground(new java.awt.Color(0, 0, 204));
        dadoLib.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadoLib.setForeground(new java.awt.Color(0, 102, 0));
        dadoLib.setText("Lib");
        pnlWelcome.add(dadoLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, 40));

        dadoWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dadoWelcome.setForeground(new java.awt.Color(0, 0, 204));
        dadoWelcome.setText("Bem vindo à Biblioteca da UnB");
        pnlWelcome.add(dadoWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 52, -1, -1));

        dadoImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/signup-library-icon.png"))); // NOI18N
        dadoImagem.setText("jLabel6");
        dadoImagem.setMaximumSize(new java.awt.Dimension(800, 810));
        dadoImagem.setMinimumSize(new java.awt.Dimension(800, 810));
        pnlWelcome.add(dadoImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 550, 580));

        getContentPane().add(pnlWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 588, 712));

        pnlCadastro.setBackground(new java.awt.Color(0, 0, 157));
        pnlCadastro.setForeground(new java.awt.Color(255, 255, 255));
        pnlCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        dadoCadastro.setForeground(new java.awt.Color(254, 254, 254));
        dadoCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoCadastro.setText("Cadastro");
        pnlCadastro.add(dadoCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 245, -1));

        dadoConta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoConta.setForeground(new java.awt.Color(254, 254, 254));
        dadoConta.setText("Crie sua conta aqui");
        pnlCadastro.add(dadoConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        dadoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoUsuario.setForeground(new java.awt.Color(254, 254, 254));
        dadoUsuario.setText("Usuário:");
        pnlCadastro.add(dadoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 80, -1));

        cmbUser.setBackground(new java.awt.Color(0, 0, 107));
        cmbUser.setForeground(new java.awt.Color(255, 255, 255));
        cmbUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Discente", "Docente" }));
        cmbUser.setToolTipText("Selecione o tipo de usuário");
        cmbUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUserActionPerformed(evt);
            }
        });
        pnlCadastro.add(cmbUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 234, 30));

        dadoEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoEmail.setForeground(new java.awt.Color(254, 254, 254));
        dadoEmail.setText("Email:");
        pnlCadastro.add(dadoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 120, -1));

        txtEmail.setBackground(new java.awt.Color(0, 0, 107));
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setToolTipText("Insira seu email");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlCadastro.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 234, 30));

        dadoMatricula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoMatricula.setForeground(new java.awt.Color(254, 254, 254));
        dadoMatricula.setText("Matrícula:");
        pnlCadastro.add(dadoMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, -1));

        txtMatricula.setBackground(new java.awt.Color(0, 0, 107));
        txtMatricula.setForeground(new java.awt.Color(255, 255, 255));
        txtMatricula.setToolTipText("Insira sua matrícula");
        txtMatricula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlCadastro.add(txtMatricula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 234, 30));

        dadoNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoNome.setForeground(new java.awt.Color(254, 254, 254));
        dadoNome.setText("Nome Completo:");
        pnlCadastro.add(dadoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, -1));

        txtNome.setBackground(new java.awt.Color(0, 0, 107));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setToolTipText("Insira seu nome completo");
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlCadastro.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 234, 30));

        dadoSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoSenha.setForeground(new java.awt.Color(254, 254, 254));
        dadoSenha.setText("Senha:");
        pnlCadastro.add(dadoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, -1));

        txtSenha.setBackground(new java.awt.Color(0, 0, 107));
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setToolTipText("Insira sua senha");
        txtSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnlCadastro.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 234, 30));

        bntCadastro.setBackground(new java.awt.Color(0, 102, 0));
        bntCadastro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bntCadastro.setForeground(new java.awt.Color(254, 254, 254));
        bntCadastro.setText("Cadastrar");
        bntCadastro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        bntCadastro.setBorderPainted(false);
        bntCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastroActionPerformed(evt);
            }
        });
        pnlCadastro.add(bntCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 460, 200, 50));

        dadoPergunta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadoPergunta.setForeground(new java.awt.Color(254, 254, 254));
        dadoPergunta.setText("Já é usuário ?");
        pnlCadastro.add(dadoPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, -1));

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
        pnlCadastro.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 580, 200, 50));

        getContentPane().add(pnlCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 0, 294, 712));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUserActionPerformed

    //Função do botão Login
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //Direciona para a tela de Login
        LoginPage trocaTelaLogin = new LoginPage();
        this.dispose();
        trocaTelaLogin.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    //Função do botão Cadatro
    private void bntCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastroActionPerformed
        //Cadastra um novo membro
        String tipoUsuario = cmbUser.getSelectedItem().toString();
        String matricula = txtMatricula.getText();
        String nome = txtNome.getText();
        String email = txtEmail.getText();
        String senha = String.valueOf(txtSenha.getPassword());
        
        
        //Limpar os campos de texto
        txtMatricula.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        
        //Validação do registro
        if (validadorNome(nome) && validadorMatricula(matricula) && validadorEmail(email)) {
            Member membroTeste = new Member();
            membroTeste.setName(nome);
            membroTeste.setId(matricula);
            membroTeste.setEmail(email);
            membroTeste.setPassword(senha);
            membroTeste.setTipo(tipoUsuario);
            
            //Escreve membro registrado no arquivo usuarios.bin
            try {
                ArrayList<Member> listaUsuarios = lerArquivo("usuarios.bin");
                
                listaUsuarios.add(membroTeste);
                escreverArquivo(listaUsuarios, "usuarios.bin");
               
            } catch (IOException ex) {
                Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso", "Cadastro concluído", JOptionPane.INFORMATION_MESSAGE);
            this.setVisible(false);
            new LoginPage().setVisible(true);
            
            
        } else {
            JOptionPane.showMessageDialog(null, "Informações inválidas", "Erro Cadastro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bntCadastroActionPerformed

    //Função do botão Voltar
    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        //Volta para a tela de Login
        this.setVisible(false);
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException, IOException {
        //Criação dos arquivos ".bin"
        /*ArrayList<Member> listaUsuarios = new ArrayList<>();
        ArrayList<Book> listaLivros = new ArrayList<>();
        ArrayList<Book> listaEmprestimos = new ArrayList<>();
        
        escreverArquivo(listaUsuarios, "usuarios.bin");
        escreverArquivo(listaLivros, "livros.bin");
        escreverArquivo(listaEmprestimos, "emprestimos.bin");*/
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
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SignUpPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SignUpPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastro;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbUser;
    private javax.swing.JLabel dadoCadastro;
    private javax.swing.JLabel dadoConta;
    private javax.swing.JLabel dadoEmail;
    private javax.swing.JLabel dadoImagem;
    private javax.swing.JLabel dadoLib;
    private javax.swing.JLabel dadoMatricula;
    private javax.swing.JLabel dadoNome;
    private javax.swing.JLabel dadoPergunta;
    private javax.swing.JLabel dadoSenha;
    private javax.swing.JLabel dadoUnB;
    private javax.swing.JLabel dadoUsuario;
    private javax.swing.JLabel dadoWelcome;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlWelcome;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}