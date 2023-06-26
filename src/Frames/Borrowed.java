package Frames;

import java.util.*;
import java.text.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import unblib.Book;
import static unblib.Controle.checkAtraso;
import static unblib.Controle.escreverArquivo;
import static unblib.Controle.formatadorData;
import static unblib.Controle.lerArquivo;
import static unblib.Controle.lerArquivoLivros;
import unblib.Member;

public class Borrowed extends javax.swing.JFrame {
    static ArrayList<Book> listaEmprestimos;
    static ArrayList<Book> listaBusca;

    public Borrowed() throws IOException, FileNotFoundException, ClassNotFoundException, ClassNotFoundException, ClassNotFoundException {
        initComponents();
        
        listaEmprestimos = lerArquivoLivros("emprestimos.bin");
        listaBusca = new ArrayList<>();
        carregarTabelaEmprestimos();
    }

    
    public void carregarTabelaEmprestimos(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Livro", "Membro", "Empréstimo", "Devolução", "Status"}, 0);
        
        for (Book livro : listaEmprestimos) {
            livro.setStatus("Em dia");
            
            if (checkAtraso(livro.getDataRetorno())) {
                livro.setStatus("Atrasado");
            }
            
            Object linha[] = new Object[]{livro.getMember().getId(),
                                        livro.getName(),
                                        livro.getMember().getName(),
                                        livro.getDataEmprestimo(),
                                        livro.getDataRetorno(),
                                        livro.getStatus()};
            
            modelo.addRow(linha);
        }
        
        
        //Tabela recebe modelo
        tblEmprestimos.setModel(modelo);
        
        tblEmprestimos.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblEmprestimos.getColumnModel().getColumn(1).setPreferredWidth(5);
        tblEmprestimos.getColumnModel().getColumn(2).setPreferredWidth(5);
        tblEmprestimos.getColumnModel().getColumn(3).setPreferredWidth(5);
        tblEmprestimos.getColumnModel().getColumn(3).setPreferredWidth(5);
    }
    
    public void carregarTabelaBusca(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Livro", "Membro", "Empréstimo", "Devolução", "Status"}, 0);
        
        for (Book livro : listaBusca) {
            livro.setStatus("Em dia");
            
            if (checkAtraso(livro.getDataRetorno())) {
                livro.setStatus("Atrasado");
            }
            
            Object linha[] = new Object[]{livro.getMember().getId(),
                                        livro.getName(),
                                        livro.getMember().getName(),
                                        livro.getDataEmprestimo(),
                                        livro.getDataRetorno(),
                                        livro.getStatus()};
            
            modelo.addRow(linha);
        }
        
        
        //Tabela recebe modelo
        tblEmprestimos.setModel(modelo);
        
        tblEmprestimos.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblEmprestimos.getColumnModel().getColumn(1).setPreferredWidth(5);
        tblEmprestimos.getColumnModel().getColumn(2).setPreferredWidth(5);
        tblEmprestimos.getColumnModel().getColumn(3).setPreferredWidth(5);
        tblEmprestimos.getColumnModel().getColumn(3).setPreferredWidth(5);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistros = new javax.swing.JPanel();
        dadoRegistros = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        pnlEmprestimos = new javax.swing.JPanel();
        dadoNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        scrEmprestimos = new javax.swing.JScrollPane();
        tblEmprestimos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registros de Empréstimos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlRegistros.setBackground(new java.awt.Color(0, 0, 147));
        pnlRegistros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoRegistros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadoRegistros.setForeground(new java.awt.Color(255, 255, 255));
        dadoRegistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Library_32px.png"))); // NOI18N
        dadoRegistros.setText("Registro de Empréstimos");
        pnlRegistros.add(dadoRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 260, 40));

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
        pnlRegistros.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        getContentPane().add(pnlRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        pnlEmprestimos.setBackground(new java.awt.Color(254, 254, 254));
        pnlEmprestimos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dadoNome.setText("Nome do membro:");
        pnlEmprestimos.add(dadoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 20, 210, 30));

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNome.setToolTipText("Insira nome do membro");
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlEmprestimos.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 50, 210, 30));

        btnBuscar.setBackground(new java.awt.Color(0, 102, 0));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(254, 254, 254));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        pnlEmprestimos.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 100, 210, 40));

        tblEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Livro", "Membro", "Empréstimo", "Devolução", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmprestimos.setGridColor(new java.awt.Color(0, 0, 0));
        tblEmprestimos.setSelectionBackground(new java.awt.Color(80, 80, 80));
        tblEmprestimos.setShowGrid(true);
        tblEmprestimos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmprestimosMouseClicked(evt);
            }
        });
        scrEmprestimos.setViewportView(tblEmprestimos);
        if (tblEmprestimos.getColumnModel().getColumnCount() > 0) {
            tblEmprestimos.getColumnModel().getColumn(0).setResizable(false);
            tblEmprestimos.getColumnModel().getColumn(1).setResizable(false);
            tblEmprestimos.getColumnModel().getColumn(2).setResizable(false);
            tblEmprestimos.getColumnModel().getColumn(3).setResizable(false);
            tblEmprestimos.getColumnModel().getColumn(4).setResizable(false);
            tblEmprestimos.getColumnModel().getColumn(5).setResizable(false);
        }

        pnlEmprestimos.add(scrEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 226, 650, 350));

        getContentPane().add(pnlEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1200, 672));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(txtNome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Nome inválido", JOptionPane.PLAIN_MESSAGE);
        
        }else{
            String nomeMembro = txtNome.getText();

            for(Book livro : listaEmprestimos){
                if(livro.getMember().getName().equals(nomeMembro)){
                    listaBusca.add(livro);
                }
            }
            
            carregarTabelaBusca();
            
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblEmprestimosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmprestimosMouseClicked
        
    }//GEN-LAST:event_tblEmprestimosMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        try {
            AdminPage adminPage = new AdminPage();
            adminPage.setVisible(true);

        } catch (IOException ex) {
            Logger.getLogger(Borrowed.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

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
            java.util.logging.Logger.getLogger(Borrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Borrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Borrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Borrowed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Borrowed().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Borrowed.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Borrowed.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel dadoNome;
    private javax.swing.JLabel dadoRegistros;
    private javax.swing.JPanel pnlEmprestimos;
    private javax.swing.JPanel pnlRegistros;
    private javax.swing.JScrollPane scrEmprestimos;
    private javax.swing.JTable tblEmprestimos;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}