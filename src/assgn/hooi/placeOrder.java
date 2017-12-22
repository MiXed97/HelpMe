
package assgn.hooi;
import assgn.JianKai.MenuClass;
import assgn.JianKai.aff;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import listLink.ListLinkInt;
import listLink.store;
import listLink.ListLink;
import validate.validate;
import validate.validateInt;
/**
 *
 * @author Aphro97
 */

public class placeOrder extends javax.swing.JFrame {
    store save;
    Cart cart;
    DefaultTableModel model;
    String cartID = "CID";
    ListLinkInt<MenuClass> menu = new ListLink();
    ListLinkInt<Cart> cartList = new ListLink();
//    JButton[] addCart;
    validateInt val = new validate();
    ListLinkInt<aff> restaurant = new ListLink();
    ListLinkInt<Cart> cartHi = new ListLink<>();
    
    public placeOrder() {
        initComponents();
        save = new store(1);
        setup();
    }
    public placeOrder(store save) {
        initComponents();
        this.save = save;
        setup();
    }
    private void setup(){
        this.setTitle("Place Order");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        ((javax.swing.JSpinner.DefaultEditor)jSpinner1.getEditor()).getTextField().setEditable(false);
        model = (DefaultTableModel)menuTable.getModel();
        menuTable.setModel(model);
        menu = save.getMenu();
        cartHi = save.getCartHi();
        cartList = save.getCart();
        restaurant = save.getAff();
        String selectedAID = "";
        String temp = "";
        String res = save.getSelectedRes();
        
        //Get selectedAID to display correct restaurant menu
        for(int a = 1;a<restaurant.getSize()+1;a++){
            if(restaurant.get(a).getName().equals(res))
                selectedAID = restaurant.get(a).getAid();
        }
        //display menu
        for(int a = 1;a<menu.getSize()+1;a++){
            if(menu.get(a).getStatus().equals("Available") && menu.get(a).getAffID().equals(selectedAID)){
                model.addRow(new Object[]{menu.get(a).getFoodid(),menu.get(a).getFoodname(),menu.get(a).getDesc(),menu.get(a).getPrice()});
                
            }
        }
        if(cartHi.getSize()==0)
            cartID += "1";
        else{
            temp = cartHi.get(cartHi.getSize()).getCartID();
            temp = temp.substring(3, temp.length());
            int a = Integer.parseInt(temp);
            if(a < 10)
                cartID+="0"+(a+1);
            else
                cartID+=(a+1);
            System.out.println(cartID);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        addCartBtn = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        checkCart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orderBtn.setText("Order");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food ID", "Menu", "Description", "Price (RM)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTable);
        if (menuTable.getColumnModel().getColumnCount() > 0) {
            menuTable.getColumnModel().getColumn(0).setResizable(false);
            menuTable.getColumnModel().getColumn(1).setResizable(false);
            menuTable.getColumnModel().getColumn(2).setResizable(false);
            menuTable.getColumnModel().getColumn(3).setResizable(false);
        }

        addCartBtn.setText("Add Cart");
        addCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCartBtnActionPerformed(evt);
            }
        });

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        jSpinner1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Food ID :");

        checkCart.setText("Cart");
        checkCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkCart)
                .addGap(4, 4, 4)
                .addComponent(addCartBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkCart)
                    .addComponent(addCartBtn)
                    .addComponent(orderBtn))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartBtnActionPerformed
        boolean checker = true;
        for(int a = 0;a<menuTable.getRowCount();a++){
            if(val.isEmpty(jTextField1.getText())){ 
                JOptionPane.showMessageDialog(this, "Please enter Food ID");
                break;
            }
            else if(menuTable.getModel().getValueAt(a, 0).equals(jTextField1.getText().toUpperCase())){
                for(int b = 1; b<cartList.getSize()+1;b++){
                    if(cartList.get(b).getItem().equals(jTextField1.getText().toUpperCase())){
                        cartList.get(b).setQty((Integer)jSpinner1.getValue()+cartList.get(b).getQty());
                        cartList.get(b).setTotal((Integer)jSpinner1.getValue()*Double.parseDouble(menuTable.getModel().getValueAt(a, 3).toString())+cartList.get(b).getTotal());
                        JOptionPane.showMessageDialog(this, "Update successfully");
                        checker = false;
                        break;
                    }
                }
                if(checker){
                    cart = new Cart(cartID,menuTable.getModel().getValueAt(a, 0).toString(),menuTable.getModel().getValueAt(a,1).toString(),(Integer)jSpinner1.getValue(),Double.parseDouble(menuTable.getModel().getValueAt(a, 3).toString()),(Integer)jSpinner1.getValue()*Double.parseDouble(menuTable.getModel().getValueAt(a, 3).toString()));
                    cartList.add(cart);
                    save.setCart(cartList);
                    JOptionPane.showMessageDialog(this, "Added successfully");
                    break;
                }
            }else if(a==menuTable.getRowCount()-1)
                if(checker)
                    JOptionPane.showMessageDialog(this, "Incorrect Food ID");
        }
        
            
        
    }//GEN-LAST:event_addCartBtnActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        this.setVisible(false);
        confirmOrder co = new confirmOrder(save);
    }//GEN-LAST:event_orderBtnActionPerformed

    private void checkCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCartActionPerformed
        save.setCart(cartList);
//        System.out.println(cartList.getSize());//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@PRINT LINE HERE @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//        for(int a = 1;a<cartList.getSize()+1;a++)
//            System.out.println(cartList.get(a).getItem());
        this.setVisible(false);
        showCart sc = new showCart(save);
    }//GEN-LAST:event_checkCartActionPerformed

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
            java.util.logging.Logger.getLogger(placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(placeOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new placeOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartBtn;
    private javax.swing.JButton checkCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton orderBtn;
    // End of variables declaration//GEN-END:variables
}
