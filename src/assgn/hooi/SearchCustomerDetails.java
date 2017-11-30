
package assgn.hooi;

import assgn.ArrList;
import assgn.ArrayListInterface;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class SearchCustomerDetails extends JFrame{
    
    private JButton searchBtn = new JButton("Search");
    private JTextField phoneTxt = new JTextField();
    private JLabel space = new JLabel();
    private JLabel phoneLbl = new JLabel("Enter customer's phone number:  ");
    private ProfileInterface p1;
    private ArrayListInterface<ProfileInterface> userList = new ArrList();
           
    public SearchCustomerDetails(){
        startUp();
        JPanel inputPanel = new JPanel(new GridLayout(1,2));
        JPanel btnPanel = new JPanel();
        
        inputPanel.add(phoneLbl);
        inputPanel.add(phoneTxt);
        SubmitListener submitL = new SubmitListener();
        searchBtn.addActionListener(submitL);
        btnPanel.add(searchBtn);
        
        add(inputPanel,BorderLayout.CENTER);
        add(btnPanel,BorderLayout.SOUTH);
        
        
        setSize(450, 100);
        setTitle("Search Customer Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void startUp(){
        p1 = new Profile("Tester 1","0123456789","pv16","tester01@gmail.com");
        userList.add(p1);
        p1 = new Profile("Tester 2","0123456788","pv15","tester02@gmail.com");
        userList.add(p1);
        p1 = new Profile("Tester 3","0123456787","pv14","tester03@gmail.com");
        userList.add(p1);
        p1 = new Profile("Tester 4","0123456786","pv13","tester04@gmail.com");
        userList.add(p1);
    }
    
    private class SubmitListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        JFrame detailsFrame = new JFrame();
        
        detailsFrame.setSize(500, 300);
        detailsFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        detailsFrame.setLocationRelativeTo(null);
        
        JTextArea detailsTA = new JTextArea(50, 200);;

        String cusDetails = String.format("%70s\n", "Customer Details");
        
        cusDetails += String.format("%-20s %-20s %-50s %-20s\n------------------------------------------------------------------------------------------------------------------------" , 
                "Name","Phone number","Address","Email");
        p1=userList.get(0);
        
        for(int a = 0; a<userList.size();a++){
            p1 = userList.get(a);
            
            if(p1.matchPhone(phoneTxt.getText())){
                cusDetails += String.format("\n%-20s %-20s %-50s %-20s\n",p1.getName(),p1.getPhone(),p1.getAddress(),p1.getEmail());
                detailsFrame.setVisible(true);
                break;
            }
            System.out.println(userList.size());
            System.out.println(a);
            if(a+1 == userList.size() && !p1.matchPhone(phoneTxt.getText())){
                detailsFrame.setVisible(false);
                JOptionPane.showMessageDialog(null, "Unable to find customer with the number "+phoneTxt.getText(), "Searching Customer Details", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        detailsTA.setText(cusDetails);
        detailsTA.setEditable(false);
          
        detailsFrame.add(detailsTA);

        }
  }
    
    public static void main(String args[]){
       new SearchCustomerDetails();
    }
    
}
