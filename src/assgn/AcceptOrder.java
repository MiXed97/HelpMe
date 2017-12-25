/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

import assgn.JianKai.AllAffiliatePage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import listLink.store;

/**
 *
 * @author Mixed_97
 */
public class AcceptOrder extends javax.swing.JFrame {

    /**
     * Creates new form AcceptOrder
     */
    store save;

    public AcceptOrder() {
        initComponents();
    }

    public AcceptOrder(store save) {
        this.setLocationRelativeTo(null);
        this.setTitle("Accept Order");
        this.setVisible(true);
        this.save = save;
        initComponents();
        addOID();
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
        table = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        orderID = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderID", "CartID", "FoodID", "Food name", "Quantity", "Status"
            }
        ));
        jScrollPane1.setViewportView(table);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Order ID :");

        jButton1.setText("Completed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(orderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AllAffiliatePage a = new AllAffiliatePage(save);
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(orderID.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "Please select a OrderID","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            // complete the task 
            JOptionPane.showMessageDialog(null, "Order "+orderID.getSelectedItem().toString()+ " has Completed");
            int index = save.findOrderIndex(orderID.getSelectedItem().toString());
            // index is to find the correct Order (done)
            save.getOrder().get(index).setOrderStatus("Completed");
            // get the customer with the order -> email (done)
            String email = save.getOrder().get(index).getCusEmail();
            Customer c = save.findCustomer(email);
            // nid a method to assign delivery Men (done)
            Delivery d = new Delivery(c, save.getOrder().get(index), save.getDelMen().get(save.findFreeDelMen()));
            // done added into delivery
            save.getDel().add(d);
            orderID.removeAllItems();
            addOID();
            removeDisplay();
            display();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AcceptOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcceptOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcceptOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcceptOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcceptOrder().setVisible(true);
            }
        });
    }

    public void display() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        Object[] row = new Object[6];
        for (int x = 0; x < save.getOrder().size(); x++) {
            for (int i = 1; i <= save.getCartHi().getSize(); i++) {
                // find the same cart ID and also same 
                if (save.getOrder().get(x).getCartID().equals(save.getCartHi().get(i).getCartID()) 
                        && save.getOrder().get(x).getAffID().equals(save.getCurAff().getAid())
                            && save.getOrder().get(x).getOrderStatus().equals("Order Placed")) {
                    row[0] = save.getOrder().get(x).getOrderID();
                    row[1] = save.getCartHi().get(i).getCartID();
                    row[2] = save.getCartHi().get(i).getItem();
                    row[3] = save.getCartHi().get(i).getItemName();
                    row[4] = save.getCartHi().get(i).getQty();
                    row[5] = save.getOrder().get(x).getOrderStatus();
                    model.addRow(row);
                }
            }
        }
    }
    
    public void removeDisplay() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
    }
    
    public void addOID(){
        orderID.addItem("----");
        for (int x = 0; x < save.getOrder().size(); x++) {
            if(save.getOrder().get(x).getAffID().equals(save.getCurAff().getAid()) 
                    && save.getOrder().get(x).getOrderStatus().equals("Order Placed")){
                orderID.addItem(save.getOrder().get(x).getOrderID());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> orderID;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
