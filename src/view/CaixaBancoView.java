/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import util.DataProvider;

/**
 *
 * @author Cássio Ritse
 */
public class CaixaBancoView extends javax.swing.JFrame {

    ImageIcon iconBanco = new ImageIcon(getToolkit().createImage(getClass().getResource("/images/blackberry.png")));

    public CaixaBancoView() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/blackberry.png")));;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnMediaCCorrente = new javax.swing.JButton();
        btnMaiorSaldo = new javax.swing.JButton();
        btnMediaCPoupaca = new javax.swing.JButton();
        btnMenorSaldo = new javax.swing.JButton();
        btnCards = new javax.swing.JButton();
        btnSaldoMedio = new javax.swing.JButton();
        mainCard = new javax.swing.JPanel();
        cardIndex = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cardContas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblContas = new javax.swing.JTable();
        cardClientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        pnlTitulo = new javax.swing.JPanel();
        lblNomeBanco = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnMediaCCorrente.setBackground(new java.awt.Color(102, 0, 153));
        btnMediaCCorrente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMediaCCorrente.setForeground(new java.awt.Color(255, 255, 255));
        btnMediaCCorrente.setText("Saldo Medio C. Corrente\n");
        btnMediaCCorrente.setBorderPainted(false);

        btnMaiorSaldo.setBackground(new java.awt.Color(102, 0, 153));
        btnMaiorSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMaiorSaldo.setForeground(new java.awt.Color(255, 255, 255));
        btnMaiorSaldo.setText("Maior Saldo");
        btnMaiorSaldo.setBorderPainted(false);

        btnMediaCPoupaca.setBackground(new java.awt.Color(102, 0, 153));
        btnMediaCPoupaca.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMediaCPoupaca.setForeground(new java.awt.Color(255, 255, 255));
        btnMediaCPoupaca.setText("Saldo Médio C. Poupaça");
        btnMediaCPoupaca.setBorderPainted(false);

        btnMenorSaldo.setBackground(new java.awt.Color(102, 0, 153));
        btnMenorSaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMenorSaldo.setForeground(new java.awt.Color(255, 255, 255));
        btnMenorSaldo.setText("Menor Saldo");
        btnMenorSaldo.setBorderPainted(false);

        btnCards.setBackground(new java.awt.Color(102, 0, 153));
        btnCards.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCards.setForeground(new java.awt.Color(255, 255, 255));
        btnCards.setText("Clientes");
        btnCards.setBorderPainted(false);

        btnSaldoMedio.setBackground(new java.awt.Color(102, 0, 153));
        btnSaldoMedio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSaldoMedio.setForeground(new java.awt.Color(255, 255, 255));
        btnSaldoMedio.setText("Saldo Medio");
        btnSaldoMedio.setBorderPainted(false);

        mainCard.setForeground(new java.awt.Color(255, 255, 255));
        mainCard.setLayout(new java.awt.CardLayout());

        cardIndex.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 153));
        jLabel4.setText("em um só lugar.");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 153));
        jLabel5.setText("Tudo que você precisa");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 153));
        jLabel6.setText("Facil de usar, gratuito e Brasileiro.");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backgroundM.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blackberry.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 153));
        jLabel7.setText("BBB");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 153));
        jLabel8.setText("Feito para você!");

        javax.swing.GroupLayout cardIndexLayout = new javax.swing.GroupLayout(cardIndex);
        cardIndex.setLayout(cardIndexLayout);
        cardIndexLayout.setHorizontalGroup(
            cardIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 524, Short.MAX_VALUE)
            .addGroup(cardIndexLayout.createSequentialGroup()
                .addGroup(cardIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardIndexLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(cardIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)))
                    .addGroup(cardIndexLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(cardIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardIndexLayout.setVerticalGroup(
            cardIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardIndexLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(62, 62, 62)
                .addGroup(cardIndexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(cardIndexLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        mainCard.add(cardIndex, "index");

        cardContas.setBackground(new java.awt.Color(255, 255, 255));
        cardContas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cardContas.setForeground(new java.awt.Color(102, 0, 153));

        jLabel3.setBackground(new java.awt.Color(102, 0, 153));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 153));
        jLabel3.setText("Contas Ativas");

        tblContas.setBackground(new java.awt.Color(255, 255, 255));
        tblContas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblContas.setForeground(new java.awt.Color(153, 0, 255));
        tblContas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Conta", "Tipo", "Titular", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblContas.setSelectionBackground(new java.awt.Color(102, 0, 153));
        tblContas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tblContas);
        if (tblContas.getColumnModel().getColumnCount() > 0) {
            tblContas.getColumnModel().getColumn(0).setMaxWidth(60);
            tblContas.getColumnModel().getColumn(1).setMaxWidth(60);
            tblContas.getColumnModel().getColumn(2).setMinWidth(120);
            tblContas.getColumnModel().getColumn(3).setMinWidth(70);
        }

        javax.swing.GroupLayout cardContasLayout = new javax.swing.GroupLayout(cardContas);
        cardContas.setLayout(cardContasLayout);
        cardContasLayout.setHorizontalGroup(
            cardContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardContasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardContasLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
                .addContainerGap())
        );
        cardContasLayout.setVerticalGroup(
            cardContasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardContasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        mainCard.add(cardContas, "contas");

        cardClientes.setBackground(new java.awt.Color(255, 255, 255));
        cardClientes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cardClientes.setForeground(new java.awt.Color(102, 0, 153));

        tblClientes.setBackground(new java.awt.Color(255, 255, 255));
        tblClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblClientes.setForeground(new java.awt.Color(153, 0, 255));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Nome", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClientes.setSelectionBackground(new java.awt.Color(102, 0, 153));
        tblClientes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(60);
            tblClientes.getColumnModel().getColumn(1).setMinWidth(120);
            tblClientes.getColumnModel().getColumn(2).setMinWidth(70);
        }

        jLabel2.setBackground(new java.awt.Color(102, 0, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("Nossos clientes!");

        javax.swing.GroupLayout cardClientesLayout = new javax.swing.GroupLayout(cardClientes);
        cardClientes.setLayout(cardClientesLayout);
        cardClientesLayout.setHorizontalGroup(
            cardClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(cardClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addGroup(cardClientesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        cardClientesLayout.setVerticalGroup(
            cardClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardClientesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        mainCard.add(cardClientes, "clientes");

        pnlTitulo.setBackground(new java.awt.Color(255, 255, 255));

        lblNomeBanco.setBackground(new java.awt.Color(255, 255, 255));
        lblNomeBanco.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        lblNomeBanco.setForeground(new java.awt.Color(102, 0, 153));
        lblNomeBanco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeBanco.setText("Nome do Banco");
        lblNomeBanco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNomeBancoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 42, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnMaiorSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCards, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMenorSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mainCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaldoMedio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMediaCCorrente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMediaCPoupaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCards, btnMaiorSaldo, btnMediaCCorrente, btnMediaCPoupaca, btnMenorSaldo, btnSaldoMedio});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnCards, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(btnMaiorSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(btnMenorSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSaldoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(btnMediaCCorrente, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(btnMediaCPoupaca, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mainCard, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCards, btnMaiorSaldo, btnMediaCCorrente, btnMediaCPoupaca, btnMenorSaldo, btnSaldoMedio});

        mainCard.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNomeBancoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNomeBancoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNomeBancoMouseClicked

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
            java.util.logging.Logger.getLogger(CaixaBancoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaixaBancoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaixaBancoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaBancoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaixaBancoView().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCards;
    private javax.swing.JButton btnMaiorSaldo;
    private javax.swing.JButton btnMediaCCorrente;
    private javax.swing.JButton btnMediaCPoupaca;
    private javax.swing.JButton btnMenorSaldo;
    private javax.swing.JButton btnSaldoMedio;
    private javax.swing.JPanel cardClientes;
    private javax.swing.JPanel cardContas;
    private javax.swing.JPanel cardIndex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNomeBanco;
    private javax.swing.JPanel mainCard;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblContas;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBtnCard() {
        return btnCards;
    }

    public javax.swing.JButton getBtnMaiorSaldo() {
        return btnMaiorSaldo;
    }

    public javax.swing.JButton getBtnMenorSaldo() {
        return btnMenorSaldo;
    }

    public javax.swing.JButton getBtnSaldoMedio() {
        return btnSaldoMedio;
    }

    public javax.swing.JButton getBtnMediaCCorrente() {
        return btnMediaCCorrente;
    }

    public javax.swing.JButton getBtnMediaCPoupaca() {
        return btnMediaCPoupaca;
    }
    
    public javax.swing.JTable getTblClientes(){
        return tblClientes;
    }
    
    public javax.swing.JTable getTblContas(){
        return tblContas;
    }
    
    public javax.swing.JPanel getMainCard(){
        return mainCard;
    }
    
    public javax.swing.JLabel getLblNomeBanco(){
        return lblNomeBanco;
    }
   
    public void setNomeBanco(String nome){
        lblNomeBanco.setText(nome);
    }
    
    public ImageIcon getIconBanco(){
        return iconBanco;
    }
    
}
