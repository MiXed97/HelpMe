/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn.kaizhi;

import assgn.DMHome;
import assgn.DeliveryMen;
import assgn.Delivery;
import assgn.Turn;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import listLink.ListLink;
import listLink.ListLinkInt;
import listLink.store;

/**
 *
 * @author KaiZhi
 */
public class DeliveryMenCheckAddress extends javax.swing.JFrame {

    /**
     * Creates new form DeliveryMenScreen
     */
    Delivery deli = new assgn.Delivery();
    DefaultTableModel model;
    DeliveryMen staff;
    ClockInClockOut cico;
    store save;

    public DeliveryMenCheckAddress() {
        initComponents();
    }

    public DeliveryMenCheckAddress(store save) {
        this.setLocationRelativeTo(null);
        this.setTitle("Check Address");
        this.save = save;
        initComponents();
        this.staff = save.getCurDelMen();
        this.cico = cico;
        jlblThatguy.setText("Name : " + staff.getName());
        display();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jtfDeliveryID = new javax.swing.JTextField();
        jbtSearchAddress = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnBack = new javax.swing.JButton();
        jlblThatguy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery ID", "Customer Name", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jtfDeliveryID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDeliveryIDActionPerformed(evt);
            }
        });

        jbtSearchAddress.setText("Search ID");
        jbtSearchAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchAddressActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Delivery ID:");

        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        jlblThatguy.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblThatguy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtSearchAddress)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfDeliveryID, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBack)
                    .addComponent(jlblThatguy))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDeliveryID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtSearchAddress)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDeliveryIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDeliveryIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDeliveryIDActionPerformed

    private void jbtSearchAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchAddressActionPerformed
        // TODO add your handling code here:

        if (deli.checkDeliveryID(save.getDel(), jtfDeliveryID.getText())) {
            JOptionPane.showMessageDialog(null, save.getDel().get(deli.getIndex()).getCustomer().getAddress());
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Delivery Id", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtSearchAddressActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        // TODO add your handling code here:

        DMHome next = new DMHome(save);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Confirm to go to main menu?");
        panel.add(label);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "The title",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        if (option == JOptionPane.OK_OPTION) {
            this.setVisible(false);
            next.setVisible(true);
        }
    }//GEN-LAST:event_jbtnBackActionPerformed

    public void display() {
        model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[3];
        for (int i = 0; i < save.getDel().getSize(); i++) {
            if (save.getDel().get(i).getDeliveryMen().equals(save.getCurDelMen())&&!save.getDel().get(i).getOrder().getOrderStatus().equals("Delivered")) {
                row[0] = save.getDel().get(i).getOrder().getOrderID();
                row[1] = save.getDel().get(i).getCustomer().getName();
                row[2] = save.getDel().get(i).getCustomer().getAddress();
                model.addRow(row);
            }
        }
    }

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
            java.util.logging.Logger.getLogger(DeliveryMenCheckAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliveryMenCheckAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliveryMenCheckAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliveryMenCheckAddress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliveryMenCheckAddress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtSearchAddress;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JLabel jlblThatguy;
    private javax.swing.JTextField jtfDeliveryID;
    // End of variables declaration//GEN-END:variables
}
