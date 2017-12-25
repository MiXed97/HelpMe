/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

import assgn.JianKai.AllAffiliatePage;
import javax.swing.table.DefaultTableModel;
import listLink.store;

/**
 *
 * @author Mixed_97
 */
public class MonthlyDelRep extends javax.swing.JFrame {

    /**
     * Creates new form MonthlyDelRep
     */
    store save;
    double total = 0;
    int cash = 0;
    int card = 0;

    public MonthlyDelRep() {
        initComponents();
    }

    public MonthlyDelRep(store save) {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Monthly Delivery Report");
        this.save = save;
        initComponents();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sort = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery ID", "Customer Name", "DeliveryMen ID", "DeliveryMen Name", "Pay Type", "Total Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setText("Sort By:");

        sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "Descending Delivery ID", "Ascending Price", "Descending Price" }));
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        HrHome h = new HrHome(save);
    }//GEN-LAST:event_backActionPerformed

    private void sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortActionPerformed
        // TODO add your handling code here:
        card = 0;
        cash = 0;
        total = 0;
        if (sort.getSelectedIndex() == 0) {
            save.sortDescDeliveryID();
            removeDisplay();
            Redisplay();
        } else if (sort.getSelectedIndex() == 1) {
            save.sortDescDeliveryID();
            removeDisplay();
            display();
        } else if (sort.getSelectedIndex() == 2) {
            save.sortAcsDelPrice();
            removeDisplay();
            display();
        } else if (sort.getSelectedIndex() == 3) {
            save.sortAcsDelPrice();
            removeDisplay();
            Redisplay();
        }

    }//GEN-LAST:event_sortActionPerformed

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
            java.util.logging.Logger.getLogger(MonthlyDelRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonthlyDelRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonthlyDelRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonthlyDelRep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonthlyDelRep().setVisible(true);
            }
        });
    }

    public void display() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object[] row = new Object[6];
        for (int i = 1; i <= save.getDel().getSize(); i++) {
            if (save.getDel().get(i).getOrder().getOrderDate().substring(0, 7).equals(save.getDateNow())) {
                row[0] = save.getDel().get(i).getOrder().getOrderID();
                row[1] = save.getDel().get(i).getCustomer().getName();
                row[2] = save.getDel().get(i).getDeliveryMen().getStaffID();
                row[3] = save.getDel().get(i).getDeliveryMen().getName();
                row[4] = save.getDel().get(i).getOrder().getPaymentType();
                row[5] = save.getDel().get(i).getOrder().getTotalAmount();
                total += save.getDel().get(i).getOrder().getTotalAmount();
                if (save.getDel().get(i).getOrder().getPaymentType().equals("cash")) {
                    cash++;
                } else {
                    card++;
                }
                model.addRow(row);
            }
        }

        row[0] = "";
        row[1] = "";
        row[2] = "";
        row[3] = "";
        row[4] = "No. of cash:";
        row[5] = cash;
        model.addRow(row);

        row[0] = "";
        row[1] = "";
        row[2] = "";
        row[3] = "";
        row[4] = "No. of Credit Card:";
        row[5] = card;
        model.addRow(row);

        row[0] = "";
        row[1] = "";
        row[2] = "";
        row[3] = "";
        row[4] = "Total:";
        row[5] = String.format("RM %.2f", total);
        model.addRow(row);

    }

    public void Redisplay() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object[] row = new Object[6];
        for (int i = save.getDel().getSize(); i >= 1; i--) {
            row[0] = save.getDel().get(i).getOrder().getOrderID();
            row[1] = save.getDel().get(i).getCustomer().getName();
            row[2] = save.getDel().get(i).getDeliveryMen().getStaffID();
            row[3] = save.getDel().get(i).getDeliveryMen().getName();
            row[4] = save.getDel().get(i).getOrder().getPaymentType();
            row[5] = save.getDel().get(i).getOrder().getTotalAmount();
            total += save.getDel().get(i).getOrder().getTotalAmount();
            if (save.getDel().get(i).getOrder().getPaymentType().equals("cash")) {
                cash++;
            } else {
                card++;
            }

            model.addRow(row);
        }
        row[0] = "";
        row[1] = "";
        row[2] = "";
        row[3] = "";
        row[4] = "No. of cash:";
        row[5] = cash;
        model.addRow(row);

        row[0] = "";
        row[1] = "";
        row[2] = "";
        row[3] = "";
        row[4] = "No. of Credit Card:";
        row[5] = card;
        model.addRow(row);

        row[0] = "";
        row[1] = "";
        row[2] = "";
        row[3] = "";
        row[4] = "Total:";
        row[5] = String.format("RM %.2f", total);
        model.addRow(row);
    }

    public void removeDisplay() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> sort;
    // End of variables declaration//GEN-END:variables
}