package assgn.hooi;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import listLink.ListLink;
import listLink.ListLinkInt;
import listLink.store;
import validate.validate;

/**
 *
 * @author User
 */
public class cancelOrder extends javax.swing.JFrame {
    store save;
    DefaultTableModel model;
    validate val = new validate();
    LinkQueueInt<Order1> order = new LinkQueue<>();
    ListLinkInt<Cart> cartHi = new ListLink<>();
    public cancelOrder() {
        initComponents();
        save = new store(1);
        setup();
    }
    
    public cancelOrder(store save) {
        initComponents();
        this.save = save;
        setup();
    }
    
    private void setup(){
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Cancel Order");
        refreshTable();
    }
    private void refreshTable(){
        
        model = (DefaultTableModel)orderTable.getModel();
        orderTable.setModel(model);
        order = save.getOrder();
        for (int a = orderTable.getRowCount() - 1; a >= 0; a--) {
            model.removeRow(a);
        }
        for(int a = 0;a<order.size();a++){
            System.out.println(order.size());
            if(order.get(a).getCusEmail().equals(save.getCurCus().getEmail())){
                model.addRow(new Object[]{order.get(a).getOrderID(),order.get(a).getOrderDate(),order.get(a).getOrderStatus()});
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        cancelOrderBtn = new javax.swing.JButton();
        orderIDTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Order Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderTable);
        if (orderTable.getColumnModel().getColumnCount() > 0) {
            orderTable.getColumnModel().getColumn(0).setResizable(false);
            orderTable.getColumnModel().getColumn(1).setResizable(false);
            orderTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel2.setText("Cancel order while \"Order Placed\" or \"Accepted\" status only");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        cancelOrderBtn.setText("Cancel Order");
        cancelOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelOrderBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Order ID :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 94, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(orderIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelOrderBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(cancelOrderBtn)
                    .addComponent(orderIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        customerMenu cm = new customerMenu(save);
    }//GEN-LAST:event_backBtnActionPerformed

    private void cancelOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelOrderBtnActionPerformed
        // Cancel order
        cartHi = save.getCartHi();
        String cartID = "";
        int del = 0;
        if(val.isEmpty(orderIDTxt.getText()))
            JOptionPane.showMessageDialog(this, "Please enter cart ID");
        else{
            for(int a = 0; a<orderTable.getRowCount();a++){
                if(orderIDTxt.getText().toUpperCase().equals(orderTable.getModel().getValueAt(a, 0).toString())){
                    String temp = orderTable.getModel().getValueAt(a, 2).toString();
                    if(temp.equals("Accepted") || temp.equals("Order Placed")){
                        for(int n =0;n<order.size();n++){
                            if(orderIDTxt.getText().toUpperCase().equals(order.get(n).getOrderID())){
                                cartID = order.get(n).getCartID();
                                del = n;
                            }
                        }
                        System.out.println(cartID);
                        for(int b =1; b<cartHi.getSize()+1;b++){
                            if(cartHi.get(b).getCartID().equals(cartID)){
                                System.out.println("Remove:"+ cartHi.get(b).getCartID()+", include: "+cartHi.get(b).getItemName());
                                cartHi.remove(b);
                            }
                        }
                        order.remove(del);
                        
                        JOptionPane.showMessageDialog(this, "Order cancelled successfully");
                        refreshTable();
                        save.setOrder(order);
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Current state not able to cancel");
                        break;
                    }
                }else if(a == orderTable.getRowCount()-1 )
                    JOptionPane.showMessageDialog(this, "Incorrect Order ID");
                
            }
        }
        
    }//GEN-LAST:event_cancelOrderBtnActionPerformed

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
            java.util.logging.Logger.getLogger(cancelOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cancelOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cancelOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cancelOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cancelOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton cancelOrderBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orderIDTxt;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables
}
