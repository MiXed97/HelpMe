package assgn.JianKai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import listLink.ListLink;
import listLink.ListLinkInt;
import listLink.store;


public class AddMenu extends javax.swing.JFrame {
    
    MenuClass mc1 = new MenuClass("M1","Fried Chicken","AmadShop","Nice Fried Chicken","2.50","Available");
    MenuClass mc2 = new MenuClass("M2","Fried Vegetable","VegShop","Nice Vegetable","1.50","Available");
    MenuClass mc3 = new MenuClass("M3","Steam Chicken","Mamak","Nice Steam Chicken","22.50","Available");
    MenuClass mc4 = new MenuClass("M4","Bah kut teh","Peki","BahKutTeh sedap","12.50","Available");
    ListLinkInt<MenuClass>mArray = new ListLink<>();
   
    public AddMenu() {
        initComponents();
        mArray.add(mc1);
        mArray.add(mc2);
        mArray.add(mc3);
        mArray.add(mc4);
                int a = mArray.getSize();
        a++;
        String currentFoodID = "M" +a;
        FoodID.setText(currentFoodID);
        FoodID.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Foodname = new javax.swing.JTextField();
        RestaurantName = new javax.swing.JTextField();
        FoodDescription = new javax.swing.JTextField();
        FoodPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        FoodID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add Menu");

        jLabel2.setText("Food Name");

        jLabel3.setText("Restaurant Name");

        jLabel4.setText("Food Description");

        jLabel5.setText("Price (RM)");

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Foodname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodnameActionPerformed(evt);
            }
        });

        jLabel6.setText("Food Status");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available","Not available" }));

        jLabel7.setText("Food ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jButton1)
                        .addGap(57, 57, 57)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Foodname)
                            .addComponent(jLabel1)
                            .addComponent(FoodDescription)
                            .addComponent(FoodPrice)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RestaurantName, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(FoodID))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(FoodID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Foodname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RestaurantName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FoodDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(FoodPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FoodnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FoodnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Foodname.setText("");
        RestaurantName.setText("");
        FoodDescription.setText("");
        FoodPrice.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        MenuClass mc = new MenuClass(FoodID.getText(),Foodname.getText(),RestaurantName.getText(),FoodDescription.getText(),FoodPrice.getText(),jComboBox1.getSelectedItem().toString());
        AddMenuInterface p = mc;
        
        if (p.checkfn()  && p.checkdesc() && p.checkprice()) 
        {
            
            mArray.add(mc);
            String user = "umi";
                String pass = "umi";
                String host = "jdbc:derby://localhost:1527/Affiliates";
            int count=0;
                try {
                Connection con = DriverManager.getConnection( host, user, pass );
                String query = "Insert into Menu values(?,?,?,?,?,?)";
                String query2 = "SELECT foodid FROM MENU order by foodid desc";
                PreparedStatement ps;
                
                ps= con.prepareStatement(query2);
                ResultSet rs = ps.executeQuery();
                rs.next();
                String theid = rs.getString(1);
                
                
                String theID = "F" +getdigit(theid);
                
                ps = con.prepareStatement(query);
                ps.setString(1,Foodname.getText());
                ps.setString(2,RestaurantName.getText());
                ps.setString(3,FoodDescription.getText());
                ps.setString(4,FoodPrice.getText());
                ps.setString(5,jComboBox1.getSelectedItem().toString());
                ps.setString(6,theID);
                ps.execute();
                con.close();
                JOptionPane.showMessageDialog(this, "Add successful");
            }catch(Exception e)
            {
                
            }
             
            
        }
        else
        {
             JOptionPane.showMessageDialog(this, "" + p.toString());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMenu().setVisible(true);
            }
        });
    }
    
    public int getdigit(String s)
    {
        int result = 0;
        String anyname = "";
        char c[] = s.toCharArray();
        for(char x:c){
            if (Character.isDigit(x)) {
                anyname+=x;
            }
        }
        result = Integer.parseInt(anyname);
        result++;
        return result;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FoodDescription;
    private javax.swing.JTextField FoodID;
    private javax.swing.JTextField FoodPrice;
    private javax.swing.JTextField Foodname;
    private javax.swing.JTextField RestaurantName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
