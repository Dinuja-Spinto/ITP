/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


/**
 *
 * @author Dinuja pinto
 */
public class updateCustomer extends javax.swing.JFrame {

    /**
     * Creates new form updateCustomer
     */
    public updateCustomer() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        SearchNic = new javax.swing.JTextField();
        btnUSechCus = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Uname = new javax.swing.JTextField();
        Uemail = new javax.swing.JTextField();
        Uphone = new javax.swing.JTextField();
        Uaddress = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnUpdate = new javax.swing.JButton();
        btnUreset = new javax.swing.JButton();
        btnUclose = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 220));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setText("Update Customer");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 21, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Update buyer.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 12, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 84, 576, 10));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("NIC No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        SearchNic.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(SearchNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 193, 30));

        btnUSechCus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUSechCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search.png"))); // NOI18N
        btnUSechCus.setText("Search");
        btnUSechCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUSechCusActionPerformed(evt);
            }
        });
        getContentPane().add(btnUSechCus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, 30));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 155, 576, 10));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Phone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        Uname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(Uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 250, 29));

        Uemail.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Uemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UemailActionPerformed(evt);
            }
        });
        getContentPane().add(Uemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 250, 29));

        Uphone.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        getContentPane().add(Uphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 250, 29));

        Uaddress.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Uaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UaddressActionPerformed(evt);
            }
        });
        getContentPane().add(Uaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 250, 29));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 366, 576, 11));

        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/save.png"))); // NOI18N
        btnUpdate.setText("Update");
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 389, -1, 42));

        btnUreset.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUreset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Reset.png"))); // NOI18N
        btnUreset.setText("Reset");
        btnUreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnUreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 389, -1, 42));

        btnUclose.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnUclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/close Jframe.png"))); // NOI18N
        btnUclose.setText("Close");
        btnUclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUcloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnUclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 389, -1, 42));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/all page background image.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUSechCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUSechCusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUSechCusActionPerformed

    private void UemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UemailActionPerformed

    private void UaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UaddressActionPerformed

    private void btnUcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUcloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnUcloseActionPerformed

    private void btnUresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUresetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateCustomer().setVisible(true);
    }//GEN-LAST:event_btnUresetActionPerformed

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
            java.util.logging.Logger.getLogger(updateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchNic;
    private javax.swing.JTextField Uaddress;
    private javax.swing.JTextField Uemail;
    private javax.swing.JTextField Uname;
    private javax.swing.JTextField Uphone;
    private javax.swing.JButton btnUSechCus;
    private javax.swing.JButton btnUclose;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUreset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}