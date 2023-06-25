package Frames;

import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.text.*;

public class Records extends javax.swing.JFrame {

    public Records() {
        initComponents();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRegistros = new javax.swing.JPanel();
        dadoRegistros = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        pnlEmprestimos = new javax.swing.JPanel();
        dadoEmprestimo = new javax.swing.JLabel();
        dateEmprestimo = new com.toedter.calendar.JDateChooser();
        dadoDevolucao = new javax.swing.JLabel();
        dateDevolucao = new com.toedter.calendar.JDateChooser();
        btnBuscar = new javax.swing.JButton();
        scrEmprestimos = new javax.swing.JScrollPane();
        tblEmprestimos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 712));
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

        dadoEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoEmprestimo.setText("Data do empréstimo:");
        pnlEmprestimos.add(dadoEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 180, 30));

        dateEmprestimo.setDateFormatString("dd/MM/yyyy");
        dateEmprestimo.setName("dataEmprestimo"); // NOI18N
        pnlEmprestimos.add(dateEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 234, 30));

        dadoDevolucao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dadoDevolucao.setText("Data de devolução:");
        pnlEmprestimos.add(dadoDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 180, 30));

        dateDevolucao.setDateFormatString("dd/MM/yyyy");
        dateDevolucao.setName("dataEmprestimo"); // NOI18N
        pnlEmprestimos.add(dateDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 234, 30));

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
                false, false, false, false, true, false
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

        pnlEmprestimos.add(scrEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 226, 650, 350));

        getContentPane().add(pnlEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1200, 672));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblEmprestimosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmprestimosMouseClicked

    }//GEN-LAST:event_tblEmprestimosMouseClicked

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
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
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel dadoDevolucao;
    private javax.swing.JLabel dadoEmprestimo;
    private javax.swing.JLabel dadoRegistros;
    private com.toedter.calendar.JDateChooser dateDevolucao;
    private com.toedter.calendar.JDateChooser dateEmprestimo;
    private javax.swing.JPanel pnlEmprestimos;
    private javax.swing.JPanel pnlRegistros;
    private javax.swing.JScrollPane scrEmprestimos;
    private javax.swing.JTable tblEmprestimos;
    // End of variables declaration//GEN-END:variables
}
