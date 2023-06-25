package Frames;


public class AdminPage extends javax.swing.JFrame {

    public AdminPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUnBLib = new javax.swing.JPanel();
        txtUnBLib = new javax.swing.JLabel();
        pnlControle = new javax.swing.JPanel();
        txtControle = new javax.swing.JLabel();
        btnPaginaInicial = new javax.swing.JButton();
        btnAcervo = new javax.swing.JButton();
        btnMembros = new javax.swing.JButton();
        btnEmprestimo = new javax.swing.JButton();
        btnDevolucao = new javax.swing.JButton();
        btnRegistros = new javax.swing.JButton();
        btnEmitidos = new javax.swing.JButton();
        btnAtrasados = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        pnlDados = new javax.swing.JPanel();
        txtAtrasos = new javax.swing.JLabel();
        pnlAtrasos = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtAcervo = new javax.swing.JLabel();
        pnlAcervo = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtMembros = new javax.swing.JLabel();
        pnlMembros = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtEmprestimos = new javax.swing.JLabel();
        pnlEmprestimos = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        scrollBooks = new javax.swing.JScrollPane();
        tblBooks = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUnBLib.setBackground(new java.awt.Color(0, 0, 147));
        pnlUnBLib.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUnBLib.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        txtUnBLib.setForeground(new java.awt.Color(255, 255, 255));
        txtUnBLib.setText("UnB LIB");
        pnlUnBLib.add(txtUnBLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 110, 60));

        getContentPane().add(pnlUnBLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 60));

        pnlControle.setBackground(new java.awt.Color(0, 0, 50));
        pnlControle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtControle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtControle.setForeground(new java.awt.Color(255, 255, 255));
        txtControle.setText("Controle");
        pnlControle.add(txtControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        btnPaginaInicial.setBackground(new java.awt.Color(0, 102, 0));
        btnPaginaInicial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPaginaInicial.setForeground(new java.awt.Color(254, 254, 254));
        btnPaginaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/home_24px.png"))); // NOI18N
        btnPaginaInicial.setText("Página Inicial");
        btnPaginaInicial.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPaginaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaginaInicialActionPerformed(evt);
            }
        });
        pnlControle.add(btnPaginaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 210, 43));

        btnAcervo.setBackground(new java.awt.Color(0, 102, 0));
        btnAcervo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAcervo.setForeground(new java.awt.Color(254, 254, 254));
        btnAcervo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Book_26px.png"))); // NOI18N
        btnAcervo.setText("Acervo");
        btnAcervo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcervoActionPerformed(evt);
            }
        });
        pnlControle.add(btnAcervo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 210, 43));

        btnMembros.setBackground(new java.awt.Color(0, 102, 0));
        btnMembros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnMembros.setForeground(new java.awt.Color(254, 254, 254));
        btnMembros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        btnMembros.setText("Membros");
        btnMembros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMembrosActionPerformed(evt);
            }
        });
        pnlControle.add(btnMembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, 43));

        btnEmprestimo.setBackground(new java.awt.Color(0, 102, 0));
        btnEmprestimo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEmprestimo.setForeground(new java.awt.Color(254, 254, 254));
        btnEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        btnEmprestimo.setText("Empréstimo");
        btnEmprestimo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestimoActionPerformed(evt);
            }
        });
        pnlControle.add(btnEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 43));

        btnDevolucao.setBackground(new java.awt.Color(0, 102, 0));
        btnDevolucao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDevolucao.setForeground(new java.awt.Color(254, 254, 254));
        btnDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Return_Purchase_26px.png"))); // NOI18N
        btnDevolucao.setText("Devolução");
        btnDevolucao.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucaoActionPerformed(evt);
            }
        });
        pnlControle.add(btnDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 43));

        btnRegistros.setBackground(new java.awt.Color(0, 102, 0));
        btnRegistros.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistros.setForeground(new java.awt.Color(254, 254, 254));
        btnRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        btnRegistros.setText("Registros");
        btnRegistros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });
        pnlControle.add(btnRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 210, 43));

        btnEmitidos.setBackground(new java.awt.Color(0, 102, 0));
        btnEmitidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEmitidos.setForeground(new java.awt.Color(254, 254, 254));
        btnEmitidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Book_26px.png"))); // NOI18N
        btnEmitidos.setText("Emitidos");
        btnEmitidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmitidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitidosActionPerformed(evt);
            }
        });
        pnlControle.add(btnEmitidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 210, 43));

        btnAtrasados.setBackground(new java.awt.Color(0, 102, 0));
        btnAtrasados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAtrasados.setForeground(new java.awt.Color(254, 254, 254));
        btnAtrasados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Library_26px_1.png"))); // NOI18N
        btnAtrasados.setText("Atrasados");
        btnAtrasados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAtrasados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasadosActionPerformed(evt);
            }
        });
        pnlControle.add(btnAtrasados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 210, 43));

        btnLogout.setBackground(new java.awt.Color(0, 102, 0));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(254, 254, 254));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Exit_26px.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        pnlControle.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 210, 43));

        getContentPane().add(pnlControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 210, 960));

        pnlDados.setBackground(new java.awt.Color(254, 254, 254));
        pnlDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAtrasos.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtAtrasos.setText("Atrasos");
        pnlDados.add(txtAtrasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, 30));

        pnlAtrasos.setBackground(new java.awt.Color(227, 227, 227));
        pnlAtrasos.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 0, 157)));

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_List_of_Thumbnails_50px.png"))); // NOI18N
        jLabel17.setText("10");

        javax.swing.GroupLayout pnlAtrasosLayout = new javax.swing.GroupLayout(pnlAtrasos);
        pnlAtrasos.setLayout(pnlAtrasosLayout);
        pnlAtrasosLayout.setHorizontalGroup(
            pnlAtrasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtrasosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel17)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlAtrasosLayout.setVerticalGroup(
            pnlAtrasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtrasosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel17)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pnlDados.add(pnlAtrasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 160, 160));

        txtAcervo.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtAcervo.setText("Livros no Acervo");
        pnlDados.add(txtAcervo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 30));

        pnlAcervo.setBackground(new java.awt.Color(227, 227, 227));
        pnlAcervo.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 102, 0)));

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Book_Shelf_50px.png"))); // NOI18N
        jLabel18.setText("10");

        javax.swing.GroupLayout pnlAcervoLayout = new javax.swing.GroupLayout(pnlAcervo);
        pnlAcervo.setLayout(pnlAcervoLayout);
        pnlAcervoLayout.setHorizontalGroup(
            pnlAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAcervoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        pnlAcervoLayout.setVerticalGroup(
            pnlAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcervoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlDados.add(pnlAcervo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, 160));

        txtMembros.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtMembros.setText("Membros");
        pnlDados.add(txtMembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 30));

        pnlMembros.setBackground(new java.awt.Color(227, 227, 227));
        pnlMembros.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 0, 157)));

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_People_50px.png"))); // NOI18N
        jLabel20.setText("10");

        javax.swing.GroupLayout pnlMembrosLayout = new javax.swing.GroupLayout(pnlMembros);
        pnlMembros.setLayout(pnlMembrosLayout);
        pnlMembrosLayout.setHorizontalGroup(
            pnlMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMembrosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel20)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnlMembrosLayout.setVerticalGroup(
            pnlMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMembrosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel20)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlDados.add(pnlMembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 170, 160));

        txtEmprestimos.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtEmprestimos.setText("Empréstimos");
        pnlDados.add(txtEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, 30));

        pnlEmprestimos.setBackground(new java.awt.Color(227, 227, 227));
        pnlEmprestimos.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 102, 0)));

        jLabel22.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Sell_50px.png"))); // NOI18N
        jLabel22.setText("10");

        javax.swing.GroupLayout pnlEmprestimosLayout = new javax.swing.GroupLayout(pnlEmprestimos);
        pnlEmprestimos.setLayout(pnlEmprestimosLayout);
        pnlEmprestimosLayout.setHorizontalGroup(
            pnlEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmprestimosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel22)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlEmprestimosLayout.setVerticalGroup(
            pnlEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmprestimosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel22)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pnlDados.add(pnlEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Autor", "Gênero", "Quantidade"
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
        tblBooks.setColorBackgoundHead(new java.awt.Color(0, 0, 157));
        tblBooks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblBooks.setFuenteFilas(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblBooks.setFuenteFilasSelect(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblBooks.setFuenteHead(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        scrollBooks.setViewportView(tblBooks);

        pnlDados.add(scrollBooks, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 270, 830, 290));

        getContentPane().add(pnlDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 1000, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcervoActionPerformed
        new ManageBooks().setVisible(true);
    }//GEN-LAST:event_btnAcervoActionPerformed

    private void btnMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembrosActionPerformed
        new ManageMembers().setVisible(true);
    }//GEN-LAST:event_btnMembrosActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        new IssueBook().setVisible(true);
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void btnDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoActionPerformed
        new ReturnBook().setVisible(true);
    }//GEN-LAST:event_btnDevolucaoActionPerformed

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
        new TeacherPage().setVisible(true);
    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnEmitidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitidosActionPerformed
        new Records().setVisible(true);
    }//GEN-LAST:event_btnEmitidosActionPerformed

    private void btnAtrasadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasadosActionPerformed
        new LateIssues().setVisible(true);
    }//GEN-LAST:event_btnAtrasadosActionPerformed

    private void btnPaginaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaginaInicialActionPerformed
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_btnPaginaInicialActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcervo;
    private javax.swing.JButton btnAtrasados;
    private javax.swing.JButton btnDevolucao;
    private javax.swing.JButton btnEmitidos;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMembros;
    private javax.swing.JButton btnPaginaInicial;
    private javax.swing.JButton btnRegistros;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel pnlAcervo;
    private javax.swing.JPanel pnlAtrasos;
    private javax.swing.JPanel pnlControle;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlEmprestimos;
    private javax.swing.JPanel pnlMembros;
    private javax.swing.JPanel pnlUnBLib;
    private javax.swing.JScrollPane scrollBooks;
    private rojeru_san.complementos.RSTableMetro tblBooks;
    private javax.swing.JLabel txtAcervo;
    private javax.swing.JLabel txtAtrasos;
    private javax.swing.JLabel txtControle;
    private javax.swing.JLabel txtEmprestimos;
    private javax.swing.JLabel txtMembros;
    private javax.swing.JLabel txtUnBLib;
    // End of variables declaration//GEN-END:variables
}