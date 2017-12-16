package assgn.JianKai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import listLink.ListLink;
import listLink.ListLinkInt;

public class removeMenu extends javax.swing.JFrame {

    ListLinkInt<removeMenuIMP> menuArray3 = new ListLink<>();
    removeMenuIMP current;
    
    public removeMenu() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Remove Menu");
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Food ID :");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                String user = "umi";
                String pass = "umi";
                String host = "jdbc:derby://localhost:1527/Affiliates";
        try {
                Connection con = DriverManager.getConnection( host, user, pass );
                String query = "Select * from MENU";
                PreparedStatement ps = con.prepareStatement(query);
                ResultSet rs =ps.executeQuery();
                while(rs.next())
                {
                    String fn = rs.getString(1);
                    String rn = rs.getString(2);
                    String fd = rs.getString(3);
                    String pr = rs.getString(4);
                    String fs = rs.getString(5);
                    String id = rs.getString(6);

                    current =  new removeMenuIMP(fn,rn,fd,pr,fs,id);
                    menuArray3.add(current);
                }
                String theenteredfoodID = jTextField2.getText();
                int something = 0;
                for (int i = 0; i < menuArray3.getSize(); i++) {
                    String loopfn = menuArray3.get(i).getID();
                    
                    if (current.deletefood(theenteredfoodID,loopfn)) {
                       something =1;
                    }                
                }
                
                if(something == 1){
                    JOptionPane.showMessageDialog(this, "Delete successful");
                    String query2 = "Delete from MENU where FOODID = ?";
                    PreparedStatement pss = con.prepareStatement(query2);
                    pss.setString(1,theenteredfoodID);
                    pss.execute();
                }
                else{
                    JOptionPane.showMessageDialog(this, "No record found ! Please reenter !");
                }
                
            
                
                con.close();
            }catch(Exception e)
            {
                
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
            java.util.logging.Logger.getLogger(removeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(removeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(removeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(removeMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new removeMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
