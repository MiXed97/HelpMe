/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

import javax.swing.JOptionPane;
import listLink.ListLink;
import listLink.ListLinkInt;
import listLink.store;

/**
 *
 * @author Mixed_97
 */
public class updateStaffStatus extends javax.swing.JFrame {

    /**
     * Creates new form updateStaffStatus
     */
    ListLinkInt<DeliveryMen> l = new ListLink<>();
    int result;// this the index of the selected delivery men
    store save;

    public updateStaffStatus() {

        DeliveryMen d1 = new DeliveryMen("Nicholas", "D1", "192", "Somewhere", "01234567", 123.00);
        DeliveryMen d2 = new DeliveryMen("Soon Jian Kai", "D2", "999", "No where", "01899997", 223.00);
        DeliveryMen d3 = new DeliveryMen("Ng Poh Hooi", "D3", "456", "LoL", "01934567", 323.00);

        l.add(d1);
        l.add(d2);
        l.add(d3);

    }

    public updateStaffStatus(store save) {
        this.save = save;

        this.setVisible(true);
        this.setTitle("Update staff status");
        this.setLocationRelativeTo(null);

        initComponents();
        status.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        staffID = new javax.swing.JTextField();
        select = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        status = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setText("Update Staff Status");

        jLabel2.setText("Enter staff ID :");

        select.setText("Select");
        select.setToolTipText("");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });

        jLabel3.setText("current Status :");

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Working", "Retired" }));
        status.setToolTipText("");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(select)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(update))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(back))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(staffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select)
                    .addComponent(update))
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        // TODO add your handling code here:
        result = save.findStaff(staffID.getText());
        if (result > 0) {
            status.setVisible(true);

            if (save.getDelMen().get(result).getStatus().equals("Retired")) {
                status.setSelectedIndex(1);// retired
            } else {
                status.setSelectedIndex(0);// working
            }

        } else {
            JOptionPane.showMessageDialog(null, "Staff id not found", "404 ERROR", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_selectActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        if (!staffID.getText().isEmpty()) {
            //make sure the text field is the same id as the selected staff else dispaly error
            if (staffID.getText().equals(save.getDelMen().get(result).getStaffID())) {
                if (save.getDelMen().get(result).getStatus().equals("On Delivery")) {
                    JOptionPane.showMessageDialog(null, "Staff is still on a delivery", "ERROR", JOptionPane.ERROR_MESSAGE);
                    if (save.getDelMen().get(result).getStatus().equals("Working") 
                            || save.getDelMen().get(result).getStatus().equals("On Delivery")) {
                        status.setSelectedIndex(0);
                    } else {
                        status.setSelectedIndex(1);
                    }
                } else if (!status.getSelectedItem().toString().equals(save.getDelMen().get(result).getStatus())) {
                    //if the status is different then it able to sent it 
                    save.getDelMen().get(result).setStatus(status.getSelectedItem().toString());
                    JOptionPane.showMessageDialog(null, "Sucessfully updated staff " + staffID.getText() + " status to " + status.getSelectedItem().toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Staff status is same as what you want", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, staffID.getText() + " this staff id in the field is not selected yet", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Staff id is empty", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HrHome a = new HrHome(save);

    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(updateStaffStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateStaffStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateStaffStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateStaffStatus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateStaffStatus().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton select;
    private javax.swing.JTextField staffID;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
