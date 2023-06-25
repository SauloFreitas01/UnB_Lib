package Frames;

import javax.swing.JOptionPane;
import unblib.Book;
import java.util.*;
import javax.swing.table.DefaultTableModel;


public class ManageBooks extends javax.swing.JFrame{

    static ArrayList<Book> listaBooks;
    
    String botao;
    
    public ManageBooks(){
        initComponents();
        
        listaBooks = new ArrayList();
        
        
        //Habilitar ou desabilitar botões
        btnNovo.setEnabled(true);
        btnAtualizar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(false);


        //Habilitar ou desabilitar os textos
        txtNome.setEnabled(false);
        txtGenero.setEnabled(false);
        txtAutor.setEnabled(false);
        txtQtd.setEnabled(false);
    }
    
    
    public void carregarTabelaBooks(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome livro", "Gênero", "Autor", "Quantidade"}, 0);
        
        for(int i=0; i<listaBooks.size(); i++){
            Object linha[] = new Object[]{listaBooks.get(i).getName(),
                                        listaBooks.get(i).getGenre(),
                                        listaBooks.get(i).getAuthor(),
                                        listaBooks.get(i).getStock()};
            
            modelo.addRow(linha);
        }
        
        
        //Tabela recebe modelo
        tblBooks.setModel(modelo);
        
        tblBooks.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblBooks.getColumnModel().getColumn(1).setPreferredWidth(5);
        tblBooks.getColumnModel().getColumn(2).setPreferredWidth(5);
        tblBooks.getColumnModel().getColumn(3).setPreferredWidth(5);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDados = new javax.swing.JPanel();
        dadoNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        dadoGenero = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        dadoAutor = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        dadoQtd = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        pnlBooks = new javax.swing.JPanel();
        dadoLivros = new javax.swing.JLabel();
        scrBooks = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ManageBooks");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDados.setBackground(new java.awt.Color(0, 0, 157));
        pnlDados.setPreferredSize(new java.awt.Dimension(320, 712));
        pnlDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoNome.setForeground(new java.awt.Color(254, 254, 254));
        dadoNome.setText("Nome do livro:");
        pnlDados.add(dadoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, -1));

        txtNome.setBackground(new java.awt.Color(0, 0, 107));
        txtNome.setForeground(new java.awt.Color(255, 255, 255));
        txtNome.setToolTipText("Insira o nome do livro");
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlDados.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 240, 30));

        dadoGenero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoGenero.setForeground(new java.awt.Color(254, 254, 254));
        dadoGenero.setText("Gênero:");
        pnlDados.add(dadoGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, -1));

        txtGenero.setBackground(new java.awt.Color(0, 0, 107));
        txtGenero.setForeground(new java.awt.Color(255, 255, 255));
        txtGenero.setToolTipText("Insira o gênero do livro");
        pnlDados.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 30));

        dadoAutor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoAutor.setForeground(new java.awt.Color(254, 254, 254));
        dadoAutor.setText("Nome do autor:");
        pnlDados.add(dadoAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 120, -1));

        txtAutor.setBackground(new java.awt.Color(0, 0, 107));
        txtAutor.setForeground(new java.awt.Color(255, 255, 255));
        txtAutor.setToolTipText("Insira o autor do livro");
        pnlDados.add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 240, 30));

        dadoQtd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoQtd.setForeground(new java.awt.Color(254, 254, 254));
        dadoQtd.setText("Quantidade:");
        pnlDados.add(dadoQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, -1));

        txtQtd.setBackground(new java.awt.Color(0, 0, 107));
        txtQtd.setForeground(new java.awt.Color(255, 255, 255));
        txtQtd.setToolTipText("Insira o estoque do livro");
        pnlDados.add(txtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 240, 30));

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
        pnlDados.add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 80, 40));

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
        pnlDados.add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 80, 40));

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
        pnlDados.add(btnAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 80, 40));

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
        pnlDados.add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 80, 40));

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

        pnlBooks.setBackground(new java.awt.Color(254, 254, 254));
        pnlBooks.setAlignmentX(0.0F);
        pnlBooks.setAlignmentY(0.0F);
        pnlBooks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoLivros.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        dadoLivros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoLivros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddNewBookIcons/icons8_Books_52px_1.png"))); // NOI18N
        dadoLivros.setText("Administrar Livros");
        pnlBooks.add(dadoLivros, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 89, 400, 52));

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Livro", "Gênero", "Autor", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        tblBooks.setGridColor(new java.awt.Color(0, 0, 0));
        tblBooks.setSelectionBackground(new java.awt.Color(80, 80, 80));
        tblBooks.setShowGrid(true);
        tblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBooksMouseClicked(evt);
            }
        });
        scrBooks.setViewportView(tblBooks);

        pnlBooks.add(scrBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 206, 550, 300));

        getContentPane().add(pnlBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 562, 712));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int index = tblBooks.getSelectedRow();
        
        if(index >= 0 && index < listaBooks.size()){
            listaBooks.remove(index);
        }
        
        carregarTabelaBooks();
        
        
        //Limpar campos
        txtNome.setText("");
        txtGenero.setText("");
        txtAutor.setText("");
        txtQtd.setText("");


        //Habilitar ou desabilitar botões
        btnNovo.setEnabled(true);
        btnAtualizar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(false);


        //Habilitar ou desabilitar os textos
        txtNome.setEnabled(false);
        txtGenero.setEnabled(false);
        txtAutor.setEnabled(false);
        txtQtd.setEnabled(false);
        
        JOptionPane.showMessageDialog(null, "Livro excluído com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtNome.getText().equals("") || txtGenero.getText().equals("") ||
                txtAutor.getText().equals("") || txtQtd.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }else{
            String nome = txtNome.getText();
            String genero = txtGenero.getText();
            String autor = txtAutor.getText();
            int qtd = Integer.parseInt(txtQtd.getText());
            
            
            if(botao.equals("novo")){
                Book book = new Book(nome, genero, autor, qtd);
                
                listaBooks.add(book);
                
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            
            }else if(botao.equals("atualizar")){
                int index = tblBooks.getSelectedRow();
                
                listaBooks.get(index).setName(nome);
                listaBooks.get(index).setGenre(genero);
                listaBooks.get(index).setAuthor(autor);
                listaBooks.get(index).setStock(qtd);
                
                JOptionPane.showMessageDialog(null, "Livro atualizado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            
            //Carregar os dados na tabela
            carregarTabelaBooks();
            
            
            //Limpar campos
            txtNome.setText("");
            txtGenero.setText("");
            txtAutor.setText("");
            txtQtd.setText("");


            //Habilitar ou desabilitar botões
            btnNovo.setEnabled(true);
            btnAtualizar.setEnabled(false);
            btnDeletar.setEnabled(false);
            btnSalvar.setEnabled(false);


            //Habilitar ou desabilitar os textos
            txtNome.setEnabled(false);
            txtGenero.setEnabled(false);
            txtAutor.setEnabled(false);
            txtQtd.setEnabled(false);
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
        txtNome.setEnabled(true);
        txtGenero.setEnabled(true);
        txtAutor.setEnabled(true);
        txtQtd.setEnabled(true);
        
        txtNome.requestFocus();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        botao = "novo";
        
        
        //Limpar campos
        txtNome.setText("");
        txtGenero.setText("");
        txtAutor.setText("");
        txtQtd.setText("");
        
        
        //Habilitar ou desabilitar botões
        btnNovo.setEnabled(false);
        btnAtualizar.setEnabled(false);
        btnDeletar.setEnabled(false);
        btnSalvar.setEnabled(true);
        
        
        //Habilitar ou desabilitar os textos
        txtNome.setEnabled(true);
        txtGenero.setEnabled(true);
        txtAutor.setEnabled(true);
        txtQtd.setEnabled(true);
        
        txtNome.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void tblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBooksMouseClicked
        int i = tblBooks.getSelectedRow();
        
        if(i >= 0 && i < listaBooks.size()){
            Book liv = listaBooks.get(i);
            txtNome.setText(liv.getName());
            txtGenero.setText(liv.getGenre());
            txtAutor.setText(liv.getAuthor());
            txtQtd.setText(String.valueOf(liv.getStock()));
        }
        
        //Habilitar ou desabilitar botões
        btnNovo.setEnabled(true);
        btnAtualizar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnSalvar.setEnabled(false);


        //Habilitar ou desabilitar os textos
        txtNome.setEnabled(false);
        txtGenero.setEnabled(false);
        txtAutor.setEnabled(false);
        txtQtd.setEnabled(false);
    }//GEN-LAST:event_tblBooksMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex){
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex){
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new ManageBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel dadoAutor;
    private javax.swing.JLabel dadoGenero;
    private javax.swing.JLabel dadoLivros;
    private javax.swing.JLabel dadoNome;
    private javax.swing.JLabel dadoQtd;
    private javax.swing.JPanel pnlBooks;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JScrollPane scrBooks;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}