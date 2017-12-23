/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

import assgn.kaizhi.ClockInClockOut;
import assgn.kaizhi.DeliveryMenCheckAddress;
import assgn.kaizhi.DeliveryMenUpdateScreen;
import javax.swing.JOptionPane;
import listLink.store;

/**
 *
 * @author Mixed_97
 */
public class DMHome extends javax.swing.JFrame {

    /**
     * Creates new form DMHome
     */
    store save;

    public DMHome() {
        initComponents();
    }

    public DMHome(store save) {
        this.save = save;
        this.setVisible(true);
        this.setTitle("Delivery Men Hompage");
        this.setLocationRelativeTo(null);
        initComponents();
        if (!checkClock()) {
            clockStaff.setSelected(true);
            clockStaff.setText("Clock Out");
        }
        if (!save.getCurDelMen().getCico().peek().noClockOut()) {
            clockStaff.setEnabled(false);
        }
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
        logOut = new javax.swing.JButton();
        updateDetails = new javax.swing.JButton();
        clockStaff = new javax.swing.JToggleButton();
        jbtnStatus = new javax.swing.JButton();
        jbtnCheckAddress = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setText("Delivery Men Homepage");

        logOut.setText("Log out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        updateDetails.setText("Personal Details");
        updateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDetailsActionPerformed(evt);
            }
        });

        clockStaff.setText("Clock In");
        clockStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clockStaffActionPerformed(evt);
            }
        });

        jbtnStatus.setText("Udpate Delivery Status");
        jbtnStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnStatusActionPerformed(evt);
            }
        });

        jbtnCheckAddress.setText("Check Delivery Address");
        jbtnCheckAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCheckAddressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(logOut))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clockStaff)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCheckAddress)
                    .addComponent(jbtnStatus)
                    .addComponent(updateDetails))
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(logOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clockStaff)
                .addGap(26, 26, 26)
                .addComponent(updateDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnCheckAddress)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginStaff a = new LoginStaff(save);
    }//GEN-LAST:event_logOutActionPerformed

    private void updateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDetailsActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        updateDeliveryMen a = new updateDeliveryMen(save);

    }//GEN-LAST:event_updateDetailsActionPerformed

    private void clockStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clockStaffActionPerformed
        // TODO add your handling code here:

        if (clockStaff.isSelected()) {
            clockStaff.setText("Clock Out");
            save.getCurDelMen().getCico().peek().clockIn();

        } else {
            save.getCurDelMen().getCico().peek().clockOut();
            JOptionPane.showMessageDialog(null, "clock in : " + save.getCurDelMen().getCico().peek().getClock_in() + "\nclock out : " + save.getCurDelMen().getCico().peek().getClock_out());
            clockStaff.setEnabled(false);

        }

    }//GEN-LAST:event_clockStaffActionPerformed

    private void jbtnStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnStatusActionPerformed
        // TODO add your handling code here:

        if (!save.getCurDelMen().getCico().peek().noClockIn() && save.getCurDelMen().getCico().peek().noClockOut()) {
            DeliveryMenUpdateScreen next = new DeliveryMenUpdateScreen(save);
            this.setVisible(false);
            next.setVisible(true);
        } else if (save.getCurDelMen().getCico().peek().noClockIn()) {
            JOptionPane.showMessageDialog(null, "Clock in first");
        } else {
            JOptionPane.showMessageDialog(null, "Already clock out");
        }
    }//GEN-LAST:event_jbtnStatusActionPerformed

    private void jbtnCheckAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCheckAddressActionPerformed
        // TODO add your handling code here:
        if (!save.getCurDelMen().getCico().peek().noClockIn() && save.getCurDelMen().getCico().peek().noClockOut()) {
            DeliveryMenCheckAddress next = new DeliveryMenCheckAddress(save);
            this.setVisible(false);
            next.setVisible(true);
        } else if (save.getCurDelMen().getCico().peek().noClockIn()) {
            JOptionPane.showMessageDialog(null, "Clock in first");
        } else {
            JOptionPane.showMessageDialog(null, "Already clock out");
        }
    }//GEN-LAST:event_jbtnCheckAddressActionPerformed

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
            java.util.logging.Logger.getLogger(DMHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DMHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DMHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DMHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DMHome().setVisible(true);

            }
        });
    }

    private boolean checkClock() {
        boolean result = false;

        try {
            if (save.getCurDelMen().getCico().peek().noClockIn()) {

                ClockInClockOut c = new ClockInClockOut();
                save.getCurDelMen().getCico().push(c);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            result = true;
            ClockInClockOut c = new ClockInClockOut();
            save.getCurDelMen().getCico().push(c);
        }
        return result;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton clockStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtnCheckAddress;
    private javax.swing.JButton jbtnStatus;
    private javax.swing.JButton logOut;
    private javax.swing.JButton updateDetails;
    // End of variables declaration//GEN-END:variables
}
