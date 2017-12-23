
package assgn.hooi;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import listLink.ListLink;
import listLink.ListLinkInt;
import listLink.store;
import validate.validate;

/**
 *
 * @author Aphro97
 */
public class orderHistory extends javax.swing.JFrame {
    store save;
    validate val = new validate();
    DefaultTableModel model;
    LinkQueueInt<Order1> order = new LinkQueue<>();
    ListLinkInt<Cart> cartHi = new ListLink<>();
    ListLinkInt<Cart> cart = new ListLink<>();
    Order1 o;
    Cart ca;
    
    public orderHistory() {
        initComponents();
        save = new store(1);
        setup();
    }
    public orderHistory(store save) {
        initComponents();
        this.save = save;
        setup();
    }
    private void setup(){
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        model = (DefaultTableModel)orderTable.getModel();
        orderTable.setModel(model);
        cartHi = save.getCartHi();
        order = save.getOrder();
        String cart ="";
        boolean checker = false;
        for(int a = 0; a<order.size();a++){
            if(order.get(a).getCusEmail().equals(save.getCurCus().getEmail()) && order.get(a).getOrderStatus().equals("Delivered")){
                o = order.get(a);
                for(int b=1;b<cartHi.getSize()+1;b++){
                    if(cartHi.get(b).getCartID().equals(o.getCartID())){
                        //System.out.println("Checking: "+cartHi.get(b).getCartID()+"@"+o.getCartID()+"@"+o.getOrderID());
                        cart+=cartHi.get(b).getItemName()+" x "+cartHi.get(b).getQty()+"";
                        break;
                    }
                }
                model.addRow(new Object[]{o.getOrderID(),cart,o.getOrderDate(),o.getTotalAmount()});
                cart="";
                for(int c=1;c<cartHi.getSize()+1;c++){
                    if(cartHi.get(c).getCartID().equals(o.getCartID()))
                        if(checker)
                            //cart+=cartHi.get(a).getItemName()+" x "+cartHi.get(a).getQty()+"\n";
                            model.addRow(new Object[]{"",cartHi.get(c).getItemName()+" x "+cartHi.get(c).getQty(),"",""});
                        else
                            checker = true;
                }
                checker = false;
            }
            
        }
//        while(!order.isEmpty()){
//            if(order.getFront().getCusEmail().equals(save.getCurCus().getEmail()) && order.getFront().getOrderStatus().equals("Delivered")){
//                o = order.dequeue();
//                for(int a=1;a<cartHi.getSize()+1;a++){
//                    if(cartHi.get(a).getCartID().equals(o.getCartID())){
//                        cart+=cartHi.get(a).getItemName()+" x "+cartHi.get(a).getQty()+"";
//                        break;
//                    }
//                }
//                model.addRow(new Object[]{o.getOrderID(),cart,o.getOrderDate(),o.getTotalAmount()});
//                for(int a=1;a<cartHi.getSize()+1;a++){
//                    if(cartHi.get(a).getCartID().equals(o.getCartID()))
//                        if(checker)
//                            //cart+=cartHi.get(a).getItemName()+" x "+cartHi.get(a).getQty()+"\n";
//                            model.addRow(new Object[]{"",cartHi.get(a).getItemName()+" x "+cartHi.get(a).getQty(),"",""});
//                        else
//                            checker = true;
//                }
//                checker = false;
//                
//                
//            }else
//                order.dequeue();
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        orderIDTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Order History");

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Food", "Order Date", "Total (RM)"
            }
        ));
        jScrollPane1.setViewportView(orderTable);

        jButton1.setText("Reorder");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Order ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(closeBtn)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.setVisible(false);
        customerMenu cm = new customerMenu(save);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // customer reorder here
        order = save.getOrder();
        String cartID = "CID";
        String temp = "";
        temp = cartHi.get(cartHi.getSize()).getCartID();
        temp = temp.substring(3, temp.length());
        int n = Integer.parseInt(temp);
        boolean checker = false;
        if(n < 10)
            cartID+="0"+(n+1);
        else
            cartID+=(n+1);
        System.out.println(cartID);
        if(val.isEmpty(orderIDTxt.getText()))
            JOptionPane.showMessageDialog(this, "Please enter cart ID");
        else{
            for(int a = 0; a<orderTable.getRowCount();a++){
                if(orderIDTxt.getText().toUpperCase().equals(orderTable.getModel().getValueAt(a, 0).toString())){
                    for(int b=0;b<order.size();b++){
                        if(order.get(b).getOrderID().equals(orderIDTxt.getText().toUpperCase())){    
                            System.out.println("Order ID same");
                            for(int c=1;c<cartHi.getSize()+1;c++){
                                if(cartHi.get(c).getCartID().equals(order.get(b).getCartID())){
                                    ca = new Cart(cartID,cartHi.get(c).getItem(),cartHi.get(c).getItemName(),cartHi.get(c).getQty(),cartHi.get(c).getPrice(),cartHi.get(c).getTotal());
                                    cart.add(ca);
                                    System.out.println(cartHi.get(c).getItemName());
                                }
                            }
                            save.setCart(cart);
                            checker = true;
                            this.setVisible(false);
                            confirmOrder co = new confirmOrder(save);
                            break;

                        }
                    }
                }else if(a == orderTable.getRowCount()-1 && checker==false)
                    JOptionPane.showMessageDialog(this, "Incorrect Order ID");
                
            }
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
            java.util.logging.Logger.getLogger(orderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(orderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(orderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(orderHistory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new orderHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField orderIDTxt;
    private javax.swing.JTable orderTable;
    // End of variables declaration//GEN-END:variables
}
