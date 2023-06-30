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
import static unblib.Controle.checkAtraso;

public class ReturnBook extends javax.swing.JFrame {
    ArrayList<Book> listaEmprestimos = lerArquivoLivros("emprestimos.bin");
    ArrayList<Member> listaMembros = lerArquivo("usuarios.bin");
    ArrayList<Book> listaLivros = lerArquivoLivros("livros.bin");
    
    public ReturnBook() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<String>(){
            @Override
            public String toString(){
                return "Nome: ";
            }
        };
        
        for(Book livro : listaEmprestimos){
            String nome = livro.getName();
            modelo.addElement(nome);
        }
        
        cmbBooks.setModel(modelo);
    }
    
    public boolean procurarLivro(ArrayList<Book> listaLivros, Book livro) {
        for (Book livroLista : listaLivros) {
            if (livro.getName().equals(livroLista.getName())) {
                return true;
            }
        }
        return false;
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
        displayDAutor = new javax.swing.JLabel();
        displayDGenero = new javax.swing.JLabel();
        displayDQuantidade = new javax.swing.JLabel();
        displayDNomeLivro = new javax.swing.JLabel();
        pnlMembros = new javax.swing.JPanel();
        dadoTituloMembro = new javax.swing.JLabel();
        pnlLinhaMembro = new javax.swing.JPanel();
        dadoID = new javax.swing.JLabel();
        dadoNome = new javax.swing.JLabel();
        dadoEmail = new javax.swing.JLabel();
        dadoUsuario = new javax.swing.JLabel();
        displayDID = new javax.swing.JLabel();
        displayDNome = new javax.swing.JLabel();
        displayDEmail = new javax.swing.JLabel();
        displayDUsuario = new javax.swing.JLabel();
        pnlDevolucao = new javax.swing.JPanel();
        dadoTitulo = new javax.swing.JLabel();
        dadoLivro = new javax.swing.JLabel();
        dadoMembro = new javax.swing.JLabel();
        txtMembro = new javax.swing.JTextField();
        dadoDevolucao = new javax.swing.JLabel();
        dateDevolucao = new com.toedter.calendar.JDateChooser();
        btnDevolucao = new javax.swing.JButton();
        cmbBooks = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Devolução");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Return_Purchase_26px.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVoltar.setBackground(new java.awt.Color(0, 107, 0));
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

        pnlLivro.setBackground(new java.awt.Color(0, 0, 157));
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

        displayDAutor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayDAutor.setForeground(new java.awt.Color(255, 255, 255));
        pnlLivro.add(displayDAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 200, 30));

        displayDGenero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayDGenero.setForeground(new java.awt.Color(255, 255, 255));
        pnlLivro.add(displayDGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 180, 30));

        displayDQuantidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayDQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        pnlLivro.add(displayDQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 140, 30));

        displayDNomeLivro.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayDNomeLivro.setForeground(new java.awt.Color(255, 255, 255));
        pnlLivro.add(displayDNomeLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 140, 30));

        getContentPane().add(pnlLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 294, 712));

        pnlMembros.setBackground(new java.awt.Color(0, 107, 0));
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

        displayDID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayDID.setForeground(new java.awt.Color(255, 255, 255));
        pnlMembros.add(displayDID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 220, 30));

        displayDNome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayDNome.setForeground(new java.awt.Color(255, 255, 255));
        pnlMembros.add(displayDNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 190, 30));

        displayDEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayDEmail.setForeground(new java.awt.Color(255, 255, 255));
        pnlMembros.add(displayDEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 190, 30));

        displayDUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        displayDUsuario.setForeground(new java.awt.Color(255, 255, 255));
        pnlMembros.add(displayDUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 180, 30));

        getContentPane().add(pnlMembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 0, 294, 712));

        pnlDevolucao.setBackground(new java.awt.Color(255, 255, 255));
        pnlDevolucao.setPreferredSize(new java.awt.Dimension(294, 712));
        pnlDevolucao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoTitulo.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        dadoTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        dadoTitulo.setText("Devolução Livros");
        pnlDevolucao.add(dadoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 250, 50));

        dadoLivro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoLivro.setText("Nome do livro");
        pnlDevolucao.add(dadoLivro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 140, -1));

        dadoMembro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoMembro.setText("ID do membro");
        pnlDevolucao.add(dadoMembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 140, -1));

        txtMembro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMembro.setToolTipText("Insira o ID");
        txtMembro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMembro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMembroActionPerformed(evt);
            }
        });
        pnlDevolucao.add(txtMembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 240, 30));

        dadoDevolucao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoDevolucao.setText("Data da devolução");
        pnlDevolucao.add(dadoDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 180, -1));

        dateDevolucao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dateDevolucao.setDateFormatString("yyyy-MM-dd");
        pnlDevolucao.add(dateDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 240, 30));

        btnDevolucao.setBackground(new java.awt.Color(0, 102, 0));
        btnDevolucao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDevolucao.setForeground(new java.awt.Color(254, 254, 254));
        btnDevolucao.setText("Realizar devolução");
        btnDevolucao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnDevolucao.setBorderPainted(false);
        btnDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucaoActionPerformed(evt);
            }
        });
        pnlDevolucao.add(btnDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 240, 40));

        cmbBooks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbBooks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlDevolucao.add(cmbBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 240, 30));

        getContentPane().add(pnlDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 0, 294, 712));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMembroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMembroActionPerformed

    private void btnDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        String nomeLivro = cmbBooks.getSelectedItem().toString();
        String idMembro = txtMembro.getText();
        Date dataInformada = dateDevolucao.getDate();
        String dataSDF = sdf.format(dataInformada);
        boolean livroEncontrado = false;
        boolean membroEncontrado = false;
        Book livroDisplay = null;
        Member membroDisplay = null;
        
        if (dataSDF.length() == 10) {
            LocalDate dataDevolucao = LocalDate.parse(formatadorData(dataSDF));
           
            //Limpa campos de texto
            cmbBooks.setSelectedItem("");
            txtMembro.setText("");
            
            //Busca o livro e o membro desejados
            for (Book livro : listaEmprestimos) {
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
            
          
            //Realiza a devolução e mostra as infomações do livro e membro na tela
            if (membroEncontrado && livroEncontrado) {
                if(checkAtraso(dataDevolucao, livroDisplay.getDataDevolucao())){
                    JOptionPane.showMessageDialog(null, "Pague R$40,00 no guichê!", "Livro Atrasado", JOptionPane.PLAIN_MESSAGE);
                }
                
                // Retira livro da lista de emprestimos
                listaEmprestimos.remove(livroDisplay);
                try {
                    escreverArquivo(listaEmprestimos, "emprestimos.bin");
                } catch (IOException ex) {
                    Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                //Devolve livro ao catálogo
                if (procurarLivro(listaLivros, livroDisplay)) {
                    for (Book livroLista : listaLivros) {
                        if (livroDisplay.getName().equals(livroLista.getName())) {
                            Book livro = livroLista;
                            livro.setStock(livro.getStock()+1);
                            try {
                                escreverArquivo(listaLivros, "livros.bin");
                            } catch (IOException ex) {
                                Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            
                            JOptionPane.showMessageDialog(null, "Devolução realizada com sucesso!", "Devolução", JOptionPane.PLAIN_MESSAGE);
                            
                            //Informações livro
                            displayDNomeLivro.setText(livro.getName());
                            displayDAutor.setText(livro.getAuthor());
                            displayDGenero.setText(livro.getGenre());
                            displayDQuantidade.setText(String.valueOf(livro.getStock()));
                        }
                    }
                    
                } else {
                    livroDisplay.setDataDevolucao(null);
                    livroDisplay.setDataEmprestimo(null);
                    livroDisplay.setMember(null);
                    livroDisplay.setStock(livroDisplay.getStock()+1);
                    listaLivros.add(livroDisplay);
                    
                    try {
                        escreverArquivo(listaLivros, "livros.bin");
                    } catch (IOException ex) {
                        Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
                //Informações membro
                displayDID.setText(membroDisplay.getId());
                displayDNome.setText(membroDisplay.getName());
                displayDEmail.setText(membroDisplay.getEmail());
                displayDUsuario.setText(membroDisplay.getTipo());              
                
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
    }//GEN-LAST:event_btnDevolucaoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            AdminPage adminPage = new AdminPage();
            adminPage.setVisible(true);
            
        } catch (IOException ex) {
            Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                    new ReturnBook().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ReturnBook.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolucao;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbBooks;
    private javax.swing.JLabel dadoAutor;
    private javax.swing.JLabel dadoDevolucao;
    private javax.swing.JLabel dadoEmail;
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
    private com.toedter.calendar.JDateChooser dateDevolucao;
    private javax.swing.JLabel displayDAutor;
    private javax.swing.JLabel displayDEmail;
    private javax.swing.JLabel displayDGenero;
    private javax.swing.JLabel displayDID;
    private javax.swing.JLabel displayDNome;
    private javax.swing.JLabel displayDNomeLivro;
    private javax.swing.JLabel displayDQuantidade;
    private javax.swing.JLabel displayDUsuario;
    private javax.swing.JPanel pnlDevolucao;
    private javax.swing.JPanel pnlLinhaLivros;
    private javax.swing.JPanel pnlLinhaMembro;
    private javax.swing.JPanel pnlLivro;
    private javax.swing.JPanel pnlMembros;
    private javax.swing.JTextField txtMembro;
    // End of variables declaration//GEN-END:variables
}