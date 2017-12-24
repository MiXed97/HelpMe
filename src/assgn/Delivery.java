/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

import assgn.hooi.Order1;
import javax.swing.table.DefaultTableModel;
import listLink.ListLink;
import listLink.ListLinkInt;

/**
 *
 * @author Mixed_97
 */
public class Delivery{

    //get info from customer
    String deliveryID;
    Customer customer;
    String status;
    ListLinkInt<Order1> order = new ListLink<>();
    DeliveryMen deliveryMen;
    int index;

    public Delivery(){}
    
    public Delivery(String deliveryID, Customer customer, String status, ListLinkInt<Order1> order, DeliveryMen deliveryMen){
        this.deliveryID = deliveryID;
        this.customer= customer;
        this.status = status;
        this.order = order;
        this.deliveryMen = deliveryMen;
    }
    
    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListLinkInt<Order1> getOrder() {
        return order;
    }

    public void setOrder(ListLinkInt<Order1> order) {
        this.order = order;
    }
    
    public DeliveryMen getDeliveryMen() {
        return deliveryMen;
    }

    public void setDeliveryMen(DeliveryMen deliveryMen) {
        this.deliveryMen = deliveryMen;
    }
    
     
    public void displayTable(DefaultTableModel model, ListLinkInt<Delivery> delivery){
        
        Object row[] = new Object[7];
        for(int i = 0; i < delivery.getSize();i++)
        {
            row[0] = delivery.get(i).getCustomer().getName();
            row[1] = delivery.get(i).getCustomer().getAddress();
            row[2] = delivery.get(i).getCustomer().getContactNo();
            row[3] = delivery.get(i).getDeliveryID();
            row[4] = delivery.get(i).getStatus();
            row[5] = delivery.get(i).getDeliveryMen().getStaffID();
            row[6] = delivery.get(i).getDeliveryMen().getName();
            model.addRow(row);
        }
    }

     
    public boolean checkDeliveryID(ListLinkInt<Delivery> delivery,String deliveryID) {
            

        for(int i = 0; i < delivery.getSize();i++)
            if(delivery.get(i).getDeliveryID().equals(deliveryID)){
                index =i;
                return true;
            }
        return false;
    }

     
    public void removeDisplay(DefaultTableModel model) {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
    }

     
    public int getIndex() {
        return index;
    }
    
}
