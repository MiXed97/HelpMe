
package assgn.hooi;
import assgn.JianKai.MenuClass;
import assgn.JianKai.aff;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import listLink.ListLinkInt;
import listLink.store;
import listLink.ListLink;
/**
 *
 * @author Aphro97
 */

public class placeOrder extends javax.swing.JFrame {
    store save;
    Cart cart;
    DefaultTableModel model;
    String cartID = "CID";
  //  ListLinkInt<MenuClass> menu = new ListLink();
    ListLinkInt<Cart> cartList = new ListLink();
//    JButton[] addCart;

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
        save.setAffMenu();
        cartHi = save.getCartHi();
        cartList = save.getCart();
        String selectedAID = save.getCurAff().getAid();
        String temp = "";
        String res = save.getSelectedRes();
        //Get selectedAID to display correct restaurant menu
       // for(int a = 1;a<restaurant.getSize()+1;a++){
           // if(restaurant.get(a).getResname().equals(res))
          //      selectedAID = restaurant.get(a).getAid();
        //}
        //display menu
        for(int a = 1;a<save.getCurMenu().getSize()+1;a++){
            if(save.getCurMenu().get(a).getStatus().equals("Available")){
                model.addRow(new Object[]{save.getCurMenu().get(a).getFoodid(),save.getCurMenu().get(a).getFoodname(),save.getCurMenu().get(a).getDesc(),save.getCurMenu().get(a).getPrice()});
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
        jLabel2 = new javax.swing.JLabel();
        sortBy = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

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

        jLabel2.setText("Sort by :");

        sortBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- None -", "Newest", "Lowest Price", "Highest Price" }));
        sortBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByActionPerformed(evt);
            }
        });

        jButton1.setText("Cancel");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(addCartBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(orderBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sortBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkCart)
                    .addComponent(addCartBtn)
                    .addComponent(orderBtn)
                    .addComponent(jButton1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCartBtnActionPerformed
        boolean checker = true;
        for(int a = 0;a<menuTable.getRowCount();a++){
            if(jTextField1.getText().isEmpty()){ 
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
        if(cartList.isEmpty())
            JOptionPane.showMessageDialog(rootPane, "Your cart is empty");
        else{
            this.setVisible(false);
            confirmOrder co = new confirmOrder(save);
        }
    }//GEN-LAST:event_orderBtnActionPerformed

    private void checkCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCartActionPerformed
        save.setCart(cartList);
//        System.out.println(cartList.getSize());//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@PRINT LINE HERE @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//        for(int a = 1;a<cartList.getSize()+1;a++)
//            System.out.println(cartList.get(a).getItem());
        this.setVisible(false);
        showCart sc = new showCart(save);
    }//GEN-LAST:event_checkCartActionPerformed

    private void sortByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByActionPerformed
        // TODO add your handling code here:
        String sort = sortBy.getSelectedItem().toString();
        if(sort.equals("Lowest Price")){
            
            removeDisplay();
            save.sortPriceMenu();
            displayMenu(1);
        }
        else if(sort.equals("Highest Price")){
            removeDisplay();
            save.sortPriceMenu();
            displayMenu(0);
        }
        else if(sort.equals("Newest")){
            removeDisplay();
            save.sortNewestMenu();
            displayMenu(1);
        }
        else{
            removeDisplay();
            save.sortNewestMenu();
            displayMenu(0);
        }
    }//GEN-LAST:event_sortByActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        cartList.clear();
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
    
    public void removeDisplay(){
        DefaultTableModel model = (DefaultTableModel)menuTable.getModel();
        
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
    }
    
    public void displayMenu(int x){
        DefaultTableModel model = (DefaultTableModel)menuTable.getModel();
        
        Object [] row = new Object[4];
        
        if(x == 1){
        for(int i =1; i <= save.getCurMenu().getSize();i++){
            row[0] = save.getCurMenu().get(i).getFoodid();
            row[1]= save.getCurMenu().get(i).getFoodname();
            row[2] = save.getCurMenu().get(i).getDesc();
            row[3] = String.format("%.2f", Double.parseDouble(save.getCurMenu().get(i).getPrice()));
            
            model.addRow(row);
        }
        }
        else{
            for(int i =save.getCurMenu().getSize(); i > 0;i--){
            row[0] = save.getCurMenu().get(i).getFoodid();
            row[1]= save.getCurMenu().get(i).getFoodname();
            row[2] = save.getCurMenu().get(i).getDesc();
            row[3] = String.format("%.2f", Double.parseDouble(save.getCurMenu().get(i).getPrice()));
            
            model.addRow(row);
        }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCartBtn;
    private javax.swing.JButton checkCart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable menuTable;
    private javax.swing.JButton orderBtn;
    private javax.swing.JComboBox<String> sortBy;
    // End of variables declaration//GEN-END:variables
}
