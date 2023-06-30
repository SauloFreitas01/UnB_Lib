package Frames;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import unblib.Book;
import static unblib.Controle.escreverArquivo;
import static unblib.Controle.formatadorData;
import static unblib.Controle.lerArquivo;
import static unblib.Controle.lerArquivoLivros;
import unblib.Member;

public class RequestBook extends javax.swing.JFrame {
    ArrayList<Book> listaLivros = lerArquivoLivros("livros.bin");
    ArrayList<Member> listaMembros = lerArquivo("usuarios.bin");
    ArrayList<Book> listaEmprestimos = lerArquivoLivros("emprestimos.bin");
    
    public RequestBook() throws IOException, FileNotFoundException, ClassNotFoundException, ClassNotFoundException, ClassNotFoundException {
        initComponents();
        
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>(){
            @Override
            public String toString(){
                return "Nome: ";
            }
        };
        
        for(Book livro : listaLivros){
            String nome = livro.getName();
            modelo.addElement(nome);
        }
        
        cmbBooks.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVoltar = new javax.swing.JButton();
        pnlLivro = new javax.swing.JPanel();
        dadoTituloLivro = new javax.swing.JLabel();
        pnlLinhaLivros = new javax.swing.JPanel();
        dadoNomeLivro = new javax.swing.JLabel();
        dadoAutor = new javax.swing.JLabel();
        dadoGenero = new javax.swing.JLabel();
        dadoQtd = new javax.swing.JLabel();
        displayQuantidade = new javax.swing.JLabel();
        displayNomeLivro = new javax.swing.JLabel();
        displayName = new javax.swing.JLabel();
        displayGenero = new javax.swing.JLabel();
        pnlMembros = new javax.swing.JPanel();
        dadoTituloMembro = new javax.swing.JLabel();
        pnlLinhaMembro = new javax.swing.JPanel();
        dadoID = new javax.swing.JLabel();
        dadoNome = new javax.swing.JLabel();
        dadoEmail = new javax.swing.JLabel();
        dadoUsuario = new javax.swing.JLabel();
        displayID = new javax.swing.JLabel();
        displayNome = new javax.swing.JLabel();
        displayEmail = new javax.swing.JLabel();
        displayUsuario = new javax.swing.JLabel();
        pnlEmprestimo = new javax.swing.JPanel();
        dadoTitulo = new javax.swing.JLabel();
        dadoLivro = new javax.swing.JLabel();
        dadoMembro = new javax.swing.JLabel();
        txtMembro = new javax.swing.JTextField();
        dadoEmprestimo = new javax.swing.JLabel();
        dateEmprestimo = new com.toedter.calendar.JDateChooser();
        btnEmprestimo = new javax.swing.JButton();
        cmbBooks = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empréstimo");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Sell_26px.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        pnlLivro.setBackground(new java.awt.Color(0, 102, 0));
        pnlLivro.setPreferredSize(new java.awt.Dimension(294, 712));
        pnlLivro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoTituloLivro.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        dadoTituloLivro.setForeground(new java.awt.Color(255, 255, 255));
        dadoTituloLivro.setText("Detalhes do Livro");
        pnlLivro.add(dadoTituloLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        pnlLinhaLivros.setBackground(new java.awt.Color(255, 255, 255));
        pnlLinhaLivros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlLivro.add(pnlLinhaLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 116, 290, 10));

        dadoNomeLivro.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dadoNomeLivro.setForeground(new java.awt.Color(255, 255, 255));
        dadoNomeLivro.setText("Nome do Livro: ");
        pnlLivro.add(dadoNomeLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 253, -1, -1));

        dadoAutor.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dadoAutor.setForeground(new java.awt.Color(255, 255, 255));
        dadoAutor.setText("Autor:");
        pnlLivro.add(dadoAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 303, -1, -1));

        dadoGenero.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dadoGenero.setForeground(new java.awt.Color(255, 255, 255));
        dadoGenero.setText("Gênero:");
        pnlLivro.add(dadoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 353, -1, -1));

        dadoQtd.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dadoQtd.setForeground(new java.awt.Color(255, 255, 255));
        dadoQtd.setText("Quantidade:");
        pnlLivro.add(dadoQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 403, -1, -1));

        displayQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        pnlLivro.add(displayQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 130, 30));

        displayNomeLivro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayNomeLivro.setForeground(new java.awt.Color(255, 255, 255));
        pnlLivro.add(displayNomeLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 140, 30));

        displayName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayName.setForeground(new java.awt.Color(255, 255, 255));
        pnlLivro.add(displayName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 190, 30));

        displayGenero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayGenero.setForeground(new java.awt.Color(255, 255, 255));
        pnlLivro.add(displayGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 180, 30));

        getContentPane().add(pnlLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 294, 712));

        pnlMembros.setBackground(new java.awt.Color(0, 0, 157));
        pnlMembros.setPreferredSize(new java.awt.Dimension(294, 712));
        pnlMembros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoTituloMembro.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        dadoTituloMembro.setForeground(new java.awt.Color(255, 255, 255));
        dadoTituloMembro.setText("Detalhes do Membro");
        pnlMembros.add(dadoTituloMembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        pnlLinhaMembro.setBackground(new java.awt.Color(255, 255, 255));
        pnlLinhaMembro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlMembros.add(pnlLinhaMembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 116, 290, 10));

        dadoID.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dadoID.setForeground(new java.awt.Color(255, 255, 255));
        dadoID.setText("ID:");
        pnlMembros.add(dadoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 253, -1, -1));

        dadoNome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dadoNome.setForeground(new java.awt.Color(255, 255, 255));
        dadoNome.setText("Nome:");
        pnlMembros.add(dadoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 303, -1, -1));

        dadoEmail.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dadoEmail.setForeground(new java.awt.Color(255, 255, 255));
        dadoEmail.setText("Email:");
        pnlMembros.add(dadoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 353, -1, -1));

        dadoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dadoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        dadoUsuario.setText("Usuário:");
        pnlMembros.add(dadoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 403, -1, -1));

        displayID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayID.setForeground(new java.awt.Color(255, 255, 255));
        pnlMembros.add(displayID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 220, 30));

        displayNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayNome.setForeground(new java.awt.Color(255, 255, 255));
        pnlMembros.add(displayNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 190, 30));

        displayEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayEmail.setForeground(new java.awt.Color(255, 255, 255));
        pnlMembros.add(displayEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 190, 30));

        displayUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayUsuario.setForeground(new java.awt.Color(255, 255, 255));
        pnlMembros.add(displayUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 180, 30));

        getContentPane().add(pnlMembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 0, 294, 712));

        pnlEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        pnlEmprestimo.setPreferredSize(new java.awt.Dimension(294, 712));
        pnlEmprestimo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        dadoTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        dadoTitulo.setText("Empréstimo Livros");
        pnlEmprestimo.add(dadoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 250, 50));

        dadoLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoLivro.setText("Nome do livro");
        pnlEmprestimo.add(dadoLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, -1));

        dadoMembro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoMembro.setText("ID do membro");
        pnlEmprestimo.add(dadoMembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, -1));

        txtMembro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMembro.setToolTipText("Insira o ID");
        txtMembro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMembro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMembroActionPerformed(evt);
            }
        });
        pnlEmprestimo.add(txtMembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 240, 30));

        dadoEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoEmprestimo.setText("Data do empréstimo");
        pnlEmprestimo.add(dadoEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, -1));

        dateEmprestimo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dateEmprestimo.setDateFormatString("yyyy-MM-dd");
        pnlEmprestimo.add(dateEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 240, 30));

        btnEmprestimo.setBackground(new java.awt.Color(0, 102, 0));
        btnEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmprestimo.setForeground(new java.awt.Color(254, 254, 254));
        btnEmprestimo.setText("Realizar empréstimo");
        btnEmprestimo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnEmprestimo.setBorderPainted(false);
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });
        pnlEmprestimo.add(btnEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 240, 40));

        cmbBooks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlEmprestimo.add(cmbBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 240, 30));

        getContentPane().add(pnlEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 0, 294, 712));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMembroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMembroActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String nomeLivro = cmbBooks.getSelectedItem().toString();
        String idMembro = txtMembro.getText();
        Date dataInformada = dateEmprestimo.getDate();
        String dataSDF = sdf.format(dataInformada);
        boolean livroEncontrado = false;
        boolean membroEncontrado = false;
        Book livroDisplay = null;
        Member membroDisplay = null;
        
        if (dataSDF.length() == 10) {
            LocalDate dataEmprestimo = LocalDate.parse(formatadorData(dataSDF));
            LocalDate dataDevolucaoCriada = dataEmprestimo.plusDays(7);
           
            // Limpa campos de texto
            cmbBooks.setSelectedItem("");
            txtMembro.setText("");
            
            // Busca o livro e o membro desejados
            for (Book livro : listaLivros) {
                if (livro.getName().equals(nomeLivro)) {
                    livroEncontrado = true;
                    livroDisplay = livro;
                    break;
                }
            }
            
            for (Member membro : listaMembros) {
                if (membro.getId().equals(idMembro)) {
                    membroEncontrado = true;
                    membroDisplay = membro;
                    break;
                }
            }
            
          
            //Realiza emprestimo e mostras as infomaçoes do livro e membro na tela
            if (membroEncontrado && livroEncontrado ) {
                // Retira 1 livro do estoque e atualiza a lista de livros
                livroDisplay.setStock(livroDisplay.getStock()-1);
                try {
                    escreverArquivo(listaLivros, "livros.bin");
                } catch (IOException ex) {
                    Logger.getLogger(RequestBook.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //Adiciona livro na lista de livros emprestados
                Book livroEmprestado = new Book(nomeLivro, membroDisplay, dataEmprestimo, dataDevolucaoCriada);
                listaEmprestimos.add(livroEmprestado);
                try {
                    escreverArquivo(listaEmprestimos, "emprestimos.bin");
                } catch (IOException ex) {
                    Logger.getLogger(RequestBook.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!", "Empréstimo", JOptionPane.PLAIN_MESSAGE);
                
                //Informacoes livro
                displayNomeLivro.setText(livroDisplay.getName());
                displayName.setText(livroDisplay.getAuthor());
                displayGenero.setText(livroDisplay.getGenre());
                displayQuantidade.setText(String.valueOf(livroDisplay.getStock()));
                
                //Informacoes membro
                displayID.setText(membroDisplay.getId());
                displayNome.setText(membroDisplay.getName());
                displayEmail.setText(membroDisplay.getEmail());
                displayUsuario.setText(membroDisplay.getTipo());
            } else if(!membroEncontrado && livroEncontrado) {
                JOptionPane.showMessageDialog(null, "ID do usuário não encontrado", "ID Inválido", JOptionPane.ERROR_MESSAGE);
            } else if (membroEncontrado && !livroEncontrado) {
                JOptionPane.showMessageDialog(null, "Livro não encontrado", "Nome Inválido", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Informações inválidas", "Registro Inválido", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Formato de data inválido", "Data Inválida", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            AdminPage adminPage = new AdminPage();
            adminPage.setVisible(true);
            
        } catch (IOException ex) {
            Logger.getLogger(RequestBook.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(RequestBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                try {
                    new RequestBook().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(RequestBook.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(RequestBook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbBooks;
    private javax.swing.JLabel dadoAutor;
    private javax.swing.JLabel dadoEmail;
    private javax.swing.JLabel dadoEmprestimo;
    private javax.swing.JLabel dadoGenero;
    private javax.swing.JLabel dadoID;
    private javax.swing.JLabel dadoLivro;
    private javax.swing.JLabel dadoMembro;
    private javax.swing.JLabel dadoNome;
    private javax.swing.JLabel dadoNomeLivro;
    private javax.swing.JLabel dadoQtd;
    private javax.swing.JLabel dadoTitulo;
    private javax.swing.JLabel dadoTituloLivro;
    private javax.swing.JLabel dadoTituloMembro;
    private javax.swing.JLabel dadoUsuario;
    private com.toedter.calendar.JDateChooser dateEmprestimo;
    private javax.swing.JLabel displayEmail;
    private javax.swing.JLabel displayGenero;
    private javax.swing.JLabel displayID;
    private javax.swing.JLabel displayName;
    private javax.swing.JLabel displayNome;
    private javax.swing.JLabel displayNomeLivro;
    private javax.swing.JLabel displayQuantidade;
    private javax.swing.JLabel displayUsuario;
    private javax.swing.JPanel pnlEmprestimo;
    private javax.swing.JPanel pnlLinhaLivros;
    private javax.swing.JPanel pnlLinhaMembro;
    private javax.swing.JPanel pnlLivro;
    private javax.swing.JPanel pnlMembros;
    private javax.swing.JTextField txtMembro;
    // End of variables declaration//GEN-END:variables
}