package Frames;

import unblib.Alert;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import unblib.Book;
import static unblib.Controle.checkAtraso;
import static unblib.Controle.lerArquivoLivros;

public class AlertPage extends javax.swing.JFrame {
    static ArrayList<Book> listaEmprestimos;
    
    public AlertPage() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        
        listaEmprestimos = lerArquivoLivros("emprestimos.bin");
        carregarTabelaAtrasos();
    }

    public void carregarTabelaAtrasos() {
        String statusEmprestimo;
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"ID", "Livro", "Membro", "Empréstimo", "Devolução", "Status"}, 0);
        
        for (Book livro : listaEmprestimos) {
            if (checkAtraso(livro.getDataRetorno())) {
                statusEmprestimo = "Atrasado";
                
                Object linha[] = new Object[]{livro.getMember().getId(),
                                        livro.getName(),
                                        livro.getMember().getName(),
                                        livro.getDataEmprestimo(),
                                        livro.getDataRetorno(),
                                        statusEmprestimo};
            
                modelo.addRow(linha);
            }
        }
        
        
        //Tabela recebe modelo
        tblAtrasos.setModel(modelo);
        
        tblAtrasos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tblAtrasos.getColumnModel().getColumn(1).setPreferredWidth(5);
        tblAtrasos.getColumnModel().getColumn(2).setPreferredWidth(5);
        tblAtrasos.getColumnModel().getColumn(3).setPreferredWidth(5);
        tblAtrasos.getColumnModel().getColumn(3).setPreferredWidth(5);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAtrasos = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        dadoRegistro = new javax.swing.JLabel();
        pnlTabela = new javax.swing.JPanel();
        dadoMulta = new javax.swing.JLabel();
        dadoPagamento = new javax.swing.JLabel();
        btnDevolucao = new javax.swing.JButton();
        scrAtrasos = new javax.swing.JScrollPane();
        tblAtrasos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMulta = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlAtrasos.setBackground(new java.awt.Color(0, 0, 147));
        pnlAtrasos.setPreferredSize(new java.awt.Dimension(880, 60));
        pnlAtrasos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlAtrasos.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        dadoRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dadoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        dadoRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Library_32px.png"))); // NOI18N
        dadoRegistro.setText("Registro de Atrasos");
        pnlAtrasos.add(dadoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 0, 220, 40));

        getContentPane().add(pnlAtrasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 882, 40));

        pnlTabela.setBackground(new java.awt.Color(254, 254, 254));
        pnlTabela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadoMulta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        dadoMulta.setText("Multa de atraso:  ");
        pnlTabela.add(dadoMulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, -1, -1));

        dadoPagamento.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        dadoPagamento.setText("Pague a multa ao realizar a devolução para normalizar seu estado");
        pnlTabela.add(dadoPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 470, -1, -1));

        btnDevolucao.setBackground(new java.awt.Color(0, 102, 0));
        btnDevolucao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDevolucao.setForeground(new java.awt.Color(254, 254, 254));
        btnDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Return_Purchase_26px.png"))); // NOI18N
        btnDevolucao.setText("Realizar devolução");
        btnDevolucao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucaoActionPerformed(evt);
            }
        });
        pnlTabela.add(btnDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 240, 40));

        scrAtrasos.setPreferredSize(new java.awt.Dimension(650, 300));

        tblAtrasos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Livro", "Membro", "Empréstimo", "Devolução", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblAtrasos.setGridColor(new java.awt.Color(0, 0, 0));
        tblAtrasos.setSelectionBackground(new java.awt.Color(80, 80, 80));
        tblAtrasos.setShowGrid(true);
        tblAtrasos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAtrasosMouseClicked(evt);
            }
        });
        scrAtrasos.setViewportView(tblAtrasos);

        pnlTabela.add(scrAtrasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 86, 650, 300));

        jScrollPane1.setViewportView(txtMulta);

        pnlTabela.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 190, 30));

        getContentPane().add(pnlTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 882, 652));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDevolucaoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void tblAtrasosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAtrasosMouseClicked
        
    }//GEN-LAST:event_tblAtrasosMouseClicked

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
            java.util.logging.Logger.getLogger(AlertPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlertPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlertPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlertPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AlertPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(LateIssues.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LateIssues.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevolucao;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel dadoMulta;
    private javax.swing.JLabel dadoPagamento;
    private javax.swing.JLabel dadoRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlAtrasos;
    private javax.swing.JPanel pnlTabela;
    private javax.swing.JScrollPane scrAtrasos;
    private javax.swing.JTable tblAtrasos;
    private javax.swing.JTextPane txtMulta;
    // End of variables declaration//GEN-END:variables
}
