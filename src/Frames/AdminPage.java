package Frames;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import unblib.Book;
import static unblib.Controle.checkAtraso;
import static unblib.Controle.escreverArquivo;
import static unblib.Controle.inicializarListaLivros;
import static unblib.Controle.lerArquivo;
import static unblib.Controle.lerArquivoLivros;
import unblib.Member;
import Frames.LoginPage;
import java.time.LocalDate;


public class AdminPage extends javax.swing.JFrame {

    public AdminPage() throws IOException {
        initComponents();
        
        File livros = new File("livros.bin");
        
        adminButtons(LoginPage.isAdmin);
                
        /* Verifica se o arquivo livros.bin já foi criado, caso já tenha sido criado ele simplesmente pega a lista e
        caso contrário ele cria uma nova lista com os valores predefinidos do metodo inicializarListaLivros().
        */
        if (livros.isFile()) {
            try {
                ArrayList<Book> listaLivros = lerArquivoLivros("livros.bin");
                ArrayList<Member> listaMembers = lerArquivo("usuarios.bin");
                ArrayList<Book> listaEmprestimos = lerArquivoLivros("emprestimos.bin");
                this.escreverListaLivros(listaLivros);
                this.qtdLivrosAcervo(listaLivros);
                this.qtdMembrosAtivos(listaMembers);
                this.qtdEmprestimos(listaEmprestimos);
                this.qtdAtrasos(listaEmprestimos);
            } catch (IOException ex) {
                Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
        } else {
            ArrayList<Book> listaLivros = inicializarListaLivros();
            this.escreverListaLivros(listaLivros);
            this.qtdLivrosAcervo(listaLivros);
            escreverArquivo(listaLivros, "livros.bin");
        }
    }
    
    //Verifica se é admin
    public void adminButtons(boolean isAdmin){
        if(isAdmin == true){
            btnAcervo.setVisible(true);
            btnMembros.setVisible(true);
            btnEmprestimo.setVisible(true);
            btnDevolucao.setVisible(true);
            btnArtigos.setVisible(true);
            btnEmprestados.setVisible(true);
        
        }else{
            btnAcervo.setVisible(false);
            btnMembros.setVisible(false);
            btnEmprestimo.setVisible(true);
            btnDevolucao.setVisible(true);
            btnArtigos.setVisible(true);
            btnEmprestados.setVisible(true);
        }
    }
    
    // Escreve lista de livros na tabela
    public void escreverListaLivros(ArrayList<Book> listaLivros) {
        DefaultTableModel modelo = (DefaultTableModel) tblBooks.getModel();
        
        for(Book livro : listaLivros) {
            modelo.addRow(new Object[]{livro.getName(), livro.getAuthor(), livro.getGenre(), livro.getStock()});
        }
    }
    
    public void qtdLivrosAcervo(ArrayList<Book> listaLivros) {
        int qtdLivros = 0;
        for (Book livro : listaLivros) {
            qtdLivros += livro.getStock();
        }
        qtdLivrosAcervo.setText(String.valueOf(qtdLivros));
    }
    
    public void qtdEmprestimos(ArrayList<Book> listaAtrasos) {
        qtdEmprestimos.setText(String.valueOf(listaAtrasos.size()));
    }
    
    public void qtdAtrasos(ArrayList<Book> listaAtrasos) {
        int contadorAtrasos = 0;
        
        for (Book livro : listaAtrasos) {
            if (checkAtraso(LocalDate.now(), livro.getDataDevolucao())) {
                contadorAtrasos += 1;
            }
        }
        
        qtdAtrasos.setText(String.valueOf(contadorAtrasos));
    }
    
    public void qtdMembrosAtivos(ArrayList<Member> listaMembers) {
        qtdMembrosAtivos.setText(String.valueOf(listaMembers.size()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlUnBLib = new javax.swing.JPanel();
        txtUnBLib = new javax.swing.JLabel();
        pnlControle = new javax.swing.JPanel();
        txtControle = new javax.swing.JLabel();
        btnAcervo = new javax.swing.JButton();
        btnMembros = new javax.swing.JButton();
        btnEmprestimo = new javax.swing.JButton();
        btnDevolucao = new javax.swing.JButton();
        btnArtigos = new javax.swing.JButton();
        btnEmprestados = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        pnlDados = new javax.swing.JPanel();
        txtAtrasos = new javax.swing.JLabel();
        pnlAtrasos = new javax.swing.JPanel();
        qtdAtrasos = new javax.swing.JLabel();
        txtAcervo = new javax.swing.JLabel();
        pnlAcervo = new javax.swing.JPanel();
        qtdLivrosAcervo = new javax.swing.JLabel();
        txtMembros = new javax.swing.JLabel();
        pnlMembros = new javax.swing.JPanel();
        qtdMembrosAtivos = new javax.swing.JLabel();
        txtEmprestimos = new javax.swing.JLabel();
        pnlEmprestimos = new javax.swing.JPanel();
        qtdEmprestimos = new javax.swing.JLabel();
        scrollBooks = new javax.swing.JScrollPane();
        tblBooks = new rojeru_san.complementos.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão UnB Lib");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Library_26px_1.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlUnBLib.setBackground(new java.awt.Color(0, 0, 147));
        pnlUnBLib.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUnBLib.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        txtUnBLib.setForeground(new java.awt.Color(255, 255, 255));
        txtUnBLib.setText("UnB Lib");
        pnlUnBLib.add(txtUnBLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 110, 40));

        getContentPane().add(pnlUnBLib, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        pnlControle.setBackground(new java.awt.Color(0, 0, 50));
        pnlControle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtControle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtControle.setForeground(new java.awt.Color(255, 255, 255));
        txtControle.setText("Controle");
        pnlControle.add(txtControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        btnAcervo.setBackground(new java.awt.Color(0, 102, 0));
        btnAcervo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAcervo.setForeground(new java.awt.Color(254, 254, 254));
        btnAcervo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Books_26px.png"))); // NOI18N
        btnAcervo.setText("Acervo");
        btnAcervo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAcervo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcervoActionPerformed(evt);
            }
        });
        pnlControle.add(btnAcervo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 210, 40));

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
        pnlControle.add(btnMembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 210, 40));

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
        pnlControle.add(btnEmprestimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 40));

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
        pnlControle.add(btnDevolucao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 210, 40));

        btnArtigos.setBackground(new java.awt.Color(0, 102, 0));
        btnArtigos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnArtigos.setForeground(new java.awt.Color(254, 254, 254));
        btnArtigos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        btnArtigos.setText("Artigos");
        btnArtigos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnArtigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtigosActionPerformed(evt);
            }
        });
        pnlControle.add(btnArtigos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 210, 40));

        btnEmprestados.setBackground(new java.awt.Color(0, 102, 0));
        btnEmprestados.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEmprestados.setForeground(new java.awt.Color(254, 254, 254));
        btnEmprestados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Book_26px.png"))); // NOI18N
        btnEmprestados.setText("Emprestados");
        btnEmprestados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmprestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmprestadosActionPerformed(evt);
            }
        });
        pnlControle.add(btnEmprestados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 210, 40));

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
        pnlControle.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 592, 210, 40));

        getContentPane().add(pnlControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 210, 672));

        pnlDados.setBackground(new java.awt.Color(254, 254, 254));
        pnlDados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAtrasos.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtAtrasos.setText("Atrasos");
        pnlDados.add(txtAtrasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 70, -1, 30));

        pnlAtrasos.setBackground(new java.awt.Color(227, 227, 227));
        pnlAtrasos.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 0, 157)));

        qtdAtrasos.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        qtdAtrasos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_List_of_Thumbnails_50px.png"))); // NOI18N
        qtdAtrasos.setText("10");

        javax.swing.GroupLayout pnlAtrasosLayout = new javax.swing.GroupLayout(pnlAtrasos);
        pnlAtrasos.setLayout(pnlAtrasosLayout);
        pnlAtrasosLayout.setHorizontalGroup(
            pnlAtrasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtrasosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(qtdAtrasos)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlAtrasosLayout.setVerticalGroup(
            pnlAtrasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtrasosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(qtdAtrasos)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pnlDados.add(pnlAtrasos, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 160, 160));

        txtAcervo.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtAcervo.setText("Livros no Acervo");
        pnlDados.add(txtAcervo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 30));

        pnlAcervo.setBackground(new java.awt.Color(227, 227, 227));
        pnlAcervo.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 102, 0)));

        qtdLivrosAcervo.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        qtdLivrosAcervo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Book_Shelf_50px.png"))); // NOI18N
        qtdLivrosAcervo.setText("10");

        javax.swing.GroupLayout pnlAcervoLayout = new javax.swing.GroupLayout(pnlAcervo);
        pnlAcervo.setLayout(pnlAcervoLayout);
        pnlAcervoLayout.setHorizontalGroup(
            pnlAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAcervoLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(qtdLivrosAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        pnlAcervoLayout.setVerticalGroup(
            pnlAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAcervoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(qtdLivrosAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlDados.add(pnlAcervo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 180, 160));

        txtMembros.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtMembros.setText("Membros");
        pnlDados.add(txtMembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 30));

        pnlMembros.setBackground(new java.awt.Color(227, 227, 227));
        pnlMembros.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 0, 157)));

        qtdMembrosAtivos.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        qtdMembrosAtivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_People_50px.png"))); // NOI18N
        qtdMembrosAtivos.setText("10");

        javax.swing.GroupLayout pnlMembrosLayout = new javax.swing.GroupLayout(pnlMembros);
        pnlMembros.setLayout(pnlMembrosLayout);
        pnlMembrosLayout.setHorizontalGroup(
            pnlMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMembrosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qtdMembrosAtivos)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        pnlMembrosLayout.setVerticalGroup(
            pnlMembrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMembrosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(qtdMembrosAtivos)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlDados.add(pnlMembros, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 170, 160));

        txtEmprestimos.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        txtEmprestimos.setText("Empréstimos");
        pnlDados.add(txtEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, 30));

        pnlEmprestimos.setBackground(new java.awt.Color(227, 227, 227));
        pnlEmprestimos.setBorder(javax.swing.BorderFactory.createMatteBorder(15, 0, 0, 0, new java.awt.Color(0, 102, 0)));

        qtdEmprestimos.setFont(new java.awt.Font("Monospaced", 1, 48)); // NOI18N
        qtdEmprestimos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminIcons/icons8_Sell_50px.png"))); // NOI18N
        qtdEmprestimos.setText("10");

        javax.swing.GroupLayout pnlEmprestimosLayout = new javax.swing.GroupLayout(pnlEmprestimos);
        pnlEmprestimos.setLayout(pnlEmprestimosLayout);
        pnlEmprestimosLayout.setHorizontalGroup(
            pnlEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmprestimosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(qtdEmprestimos)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlEmprestimosLayout.setVerticalGroup(
            pnlEmprestimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmprestimosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(qtdEmprestimos)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pnlDados.add(pnlEmprestimos, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        getContentPane().add(pnlDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 990, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        new LoginPage().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnAcervoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcervoActionPerformed
        this.dispose();
        try {
            new ManageBooks().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAcervoActionPerformed

    private void btnMembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMembrosActionPerformed
        this.dispose();
        try {
            new ManageMembers().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMembrosActionPerformed

    private void btnEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestimoActionPerformed
        this.dispose();
        try {
            new RequestBook().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEmprestimoActionPerformed

    private void btnDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucaoActionPerformed
        this.dispose();
        try {
            new ReturnBook().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDevolucaoActionPerformed

    private void btnEmprestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmprestadosActionPerformed
        this.dispose();
        try {
            new Requested().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEmprestadosActionPerformed

    private void btnArtigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtigosActionPerformed
        this.dispose();
        try {
            new PapersPage().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnArtigosActionPerformed

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
                try {
                    new AdminPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcervo;
    private javax.swing.JButton btnArtigos;
    private javax.swing.JButton btnDevolucao;
    private javax.swing.JButton btnEmprestados;
    private javax.swing.JButton btnEmprestimo;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMembros;
    private javax.swing.JPanel pnlAcervo;
    private javax.swing.JPanel pnlAtrasos;
    private javax.swing.JPanel pnlControle;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlEmprestimos;
    private javax.swing.JPanel pnlMembros;
    private javax.swing.JPanel pnlUnBLib;
    private javax.swing.JLabel qtdAtrasos;
    private javax.swing.JLabel qtdEmprestimos;
    private javax.swing.JLabel qtdLivrosAcervo;
    private javax.swing.JLabel qtdMembrosAtivos;
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