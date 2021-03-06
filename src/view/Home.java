/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
/**
 *
 * @author Dinuja pinto
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nCus = new javax.swing.JButton();
        uCus = new javax.swing.JButton();
        dCus = new javax.swing.JButton();
        DelCus = new javax.swing.JButton();
        Bill = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        closeApp = new javax.swing.JButton();
        btnVoucher = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnItem = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnFinance = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        btnEmp = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        btnStock = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnSup = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(120, 50));
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/new buyer.png"))); // NOI18N
        nCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nCusActionPerformed(evt);
            }
        });
        getContentPane().add(nCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, 83, -1));

        uCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Update buyer.png"))); // NOI18N
        uCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uCus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        uCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uCusActionPerformed(evt);
            }
        });
        getContentPane().add(uCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 11, -1, -1));

        dCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/buyer Details.png"))); // NOI18N
        dCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dCusActionPerformed(evt);
            }
        });
        getContentPane().add(dCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 11, -1, -1));

        DelCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete buyer.png"))); // NOI18N
        DelCus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DelCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelCusActionPerformed(evt);
            }
        });
        getContentPane().add(DelCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 11, -1, -1));

        Bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/billing.png"))); // NOI18N
        Bill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillActionPerformed(evt);
            }
        });
        getContentPane().add(Bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 11, -1, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 11, -1, -1));

        closeApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Close.png"))); // NOI18N
        closeApp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeAppActionPerformed(evt);
            }
        });
        getContentPane().add(closeApp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1256, 11, 98, -1));

        btnVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/new product.png"))); // NOI18N
        btnVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoucherActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, 70));

        btnReport.setText("report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });
        getContentPane().add(btnReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 80, 70));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("New Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 86, 94, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update Customer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 86, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Customer Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 86, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Delete Customer");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 86, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Billing");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 86, 94, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LogOut");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1144, 86, 94, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Close Application");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1256, 86, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("Sale Report");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 80, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Issue Voucher");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 80, 90, 30));

        btnItem.setText("jButton1");
        btnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemActionPerformed(evt);
            }
        });
        getContentPane().add(btnItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel11.setText("Item Managment");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        btnFinance.setText("jButton2");
        btnFinance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinance, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel12.setText("Finance ");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        btnEmp.setText("jButton3");
        btnEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel13.setText("Employee");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel14.setText("Order");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        btnOrder.setText("jButton4");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        btnUser.setText("jButton5");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        getContentPane().add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel15.setText("User & Payroll");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));

        btnStock.setText("jButton6");
        btnStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStockActionPerformed(evt);
            }
        });
        getContentPane().add(btnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel16.setText("Stock");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        btnSup.setText("jButton7");
        btnSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel17.setText("supplier");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 670, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/home.PNG"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nCusActionPerformed
        // TODO add your handling code here:
        
        new newCustomer().setVisible(true);
    }//GEN-LAST:event_nCusActionPerformed

    private void uCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uCusActionPerformed
        // TODO add your handling code here:
        new updateCustomer().setVisible(true);
    }//GEN-LAST:event_uCusActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do You Want to Logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void closeAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeAppActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do You Want to Close Application","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeAppActionPerformed

    private void dCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dCusActionPerformed
        // TODO add your handling code here:
        new customerDetails().setVisible(true);
    }//GEN-LAST:event_dCusActionPerformed

    private void DelCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelCusActionPerformed
        // TODO add your handling code here:
        new deleteCustomer().setVisible(true);
    }//GEN-LAST:event_DelCusActionPerformed

    private void BillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillActionPerformed
        // TODO add your handling code here:
        new Billing().setVisible(true);
    }//GEN-LAST:event_BillActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        new saleReport().setVisible(true);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoucherActionPerformed
        // TODO add your handling code here:
        new Voucher().setVisible(true);
    }//GEN-LAST:event_btnVoucherActionPerformed

    private void btnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemActionPerformed
        // TODO add your handling code here:
        //new ItemHome().setVisible(true);
    }//GEN-LAST:event_btnItemActionPerformed

    private void btnFinanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceActionPerformed
        // TODO add your handling code here:
        //new FinanceHome().setVisible(true);
    }//GEN-LAST:event_btnFinanceActionPerformed

    private void btnEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpActionPerformed
        // TODO add your handling code here:
       // new EmpDashBoard().setVisible(true);
    }//GEN-LAST:event_btnEmpActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        //new AddOrderHomePage().setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        //new home().setVisible(true);
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStockActionPerformed
        // TODO add your handling code here:
        //new StockHome().setVisible(true);
    }//GEN-LAST:event_btnStockActionPerformed

    private void btnSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupActionPerformed
        // TODO add your handling code here:
        //new SupplierHome().setVisible(true);
    }//GEN-LAST:event_btnSupActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bill;
    private javax.swing.JButton DelCus;
    private javax.swing.JButton btnEmp;
    private javax.swing.JButton btnFinance;
    private javax.swing.JButton btnItem;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnStock;
    private javax.swing.JButton btnSup;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnVoucher;
    private javax.swing.JButton closeApp;
    private javax.swing.JButton dCus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logout;
    private javax.swing.JButton nCus;
    private javax.swing.JButton uCus;
    // End of variables declaration//GEN-END:variables
}
