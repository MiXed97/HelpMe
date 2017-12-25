
package assgn.hooi;

import assgn.Delivery;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import listLink.ListLink;
import listLink.ListLinkInt;
import listLink.store;

/**
 *
 * @author Aphro97
 */
public class displayOrder extends javax.swing.JFrame {
    store save;
    Order1 o;
    String cartID = "CID";
    ListLinkInt<Cart> cartHi = new ListLink<>();
    ListLinkInt<Cart> cart = new ListLink<>();
    LinkQueueInt<Order1> order = new LinkQueue<>();
    /**
     * Creates new form displayOrder
     */
    public displayOrder() {
        initComponents();
        save = new store(1);
        setup();
    }

    public displayOrder(store save) {
        initComponents();
        this.save = save;
        setup();
    }
    
    private void setup(){
        System.out.println(save.getCurAff().getAid());
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Order Placed");
        jTextArea1.setEditable(false);
        cartHi = save.getCartHi();
        order = save.getOrder();
        cart = save.getCart();
        double total=0.0;
        String orderID="OID";
        String temp="";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        //System.out.println(dateFormat.format(date));
        //make OrderID
        if(order.size()==0)
            orderID += "01";
        else{
            temp = order.getOID();
            temp = temp.substring(3, temp.length());
            int a = Integer.parseInt(temp);
            if(a < 10)
                orderID+="0"+(a+1);
            else
                orderID+=(a+1);
        }
        //System.out.println(cart.get(1).getCartID());
        //move temp card into carthi and make order class
        for(int a=1;a<cart.getSize()+1;a++){
            cartHi.add(cart.get(a));
            total += cart.get(a).getTotal();
        }
        o = new Order1(orderID,cart.get(cart.getSize()).getCartID(),dateFormat.format(date),total,"Order Placed",save.getCurCus().getEmail(), save.getCurAff().getAid());
        //System.out.println(cart.get(cart.getSize()).getCartID());
        //System.out.println(o.getCartID()+"@"+o.getOrderID()+"@"+o.getTotalAmount());
        temp = "";
        temp += "Order ID: "+orderID;
        temp += "\nOrder date: "+dateFormat.format(date);
        temp += "\nOrder status: "+o.getOrderStatus();
        jTextArea1.setText(temp);
        //order.enqueue(o);
        order.enqueue(o);
        save.setOrder(order);
        Delivery de = new Delivery(save.getCurCus(),o);
        save.getDel().add(de);
        cart.clear();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Order placed successfully");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        customerMenu cm = new customerMenu(save);
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
            java.util.logging.Logger.getLogger(displayOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(displayOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(displayOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(displayOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new displayOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
