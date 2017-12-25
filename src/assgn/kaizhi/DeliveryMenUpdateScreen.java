/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn.kaizhi;

import assgn.Customer;
import assgn.DMHome;
import assgn.Delivery;
import assgn.DeliveryMen;
import assgn.JianKai.MenuClass;
import assgn.JianKai.aff;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import listLink.store;

/**
 *
 * @author KaiZhi
 */
public class DeliveryMenUpdateScreen extends javax.swing.JFrame {

    /**
     * Creates new form DeliveryMenUpdateScreen
     */
    Delivery deli = new assgn.Delivery();
    DefaultTableModel model;
    DeliveryMen staff;
    store save;

    public DeliveryMenUpdateScreen() {
        initComponents();

    }

    public DeliveryMenUpdateScreen(store save) {
        this.setLocationRelativeTo(null);
        this.setTitle("Update Deliver Status");
        initComponents();
        this.save = save;
        addOID();
        display();
        this.staff = save.getCurDelMen();

        //table content
        // only the staff responsible can take in
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
        update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbtnBack = new javax.swing.JButton();
        orderID = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery ID", "DeliveryMen ID", "Customer Name", "Address", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        update.setText("Update Status");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Delivery ID:");

        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jbtnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnBack)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        //only can update to one status cannot return back to previous state
        //set it ur self with a method if can
        String oID = orderID.getSelectedItem().toString();
        int index = save.findOrderIndex(oID);
        String status = save.getOrder().get(index).getOrderStatus();
        String affID = save.getOrder().get(index).getAffID();
        int affIndex = save.findAffByID(affID);
        if (status.equals("Completed")) {
            save.getOrder().get(index).setOrderStatus("Delivering");
            // find aff distance exist a not 
            if (save.getAff().get(affIndex).getDistance() <= 0) {
                //answer how many km/h it take to deliver the order
            }

            //change staff status
            // change del
            save.getDel().get(save.findDelivery(oID)).setOrder(save.getOrder().get(index));
            save.getDelMen().get(save.findDelMenByID(save.getCurDelMen().getStaffID())).setStatus("On Delivery");

        } else if (status.equals("Delivering")) {
            save.getOrder().get(index).setOrderStatus("Delivered");
            // find customer distance from our shop 

            save.getDel().get(save.findDelivery(oID)).setOrder(save.getOrder().get(index));
            save.getDelMen().get(save.findDelMenByID(save.getCurDelMen().getStaffID())).setStatus("Working");
        }

        removeDisplay();
        display();


    }//GEN-LAST:event_updateActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        // TODO add your handling code here:
        //back button
        DMHome next = new DMHome(save);
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Confirm to go to main menu?");
        panel.add(label);
        String[] options = new String[]{"OK", "Cancel"};
        int option = JOptionPane.showOptionDialog(null, panel, "The title",
                JOptionPane.NO_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[1]);
        if (option == 0) {
            this.setVisible(false);
            next.setVisible(true);
        }
    }//GEN-LAST:event_jbtnBackActionPerformed

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
            java.util.logging.Logger.getLogger(DeliveryMenUpdateScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliveryMenUpdateScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliveryMenUpdateScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliveryMenUpdateScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliveryMenUpdateScreen().setVisible(true);
            }
        });
    }

    public void addOID() {
        for (int i = 1; i <= save.getDel().getSize(); i++) {
            if (save.getDel().get(i).getDeliveryMen().getStaffID().equals(save.getCurDelMen().getStaffID())) {
                orderID.addItem(save.getDel().get(i).getOrder().getOrderID());
            }

        }

    }

    public void display() {
        model = (DefaultTableModel) jTable1.getModel();
        Object row[] = new Object[5];
        for (int i = 1; i <= save.getDel().getSize(); i++) {
            row[0] = save.getDel().get(i).getOrder().getOrderID();
            row[1] = save.getDel().get(i).getDeliveryMen().getStaffID();
            row[2] = save.getDel().get(i).getCustomer().getName();
            row[3] = save.getDel().get(i).getCustomer().getAddress();
            row[4] = save.getDel().get(i).getOrder().getOrderStatus();
            model.addRow(row);
        }
    }

    public void removeDisplay() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JComboBox<String> orderID;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
