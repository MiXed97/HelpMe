/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mixed_97
 */
public class Delivery implements DeliveryInterface{

    //get info from customer
    String deliveryID;
    Customer customer;
    String status;
    ArrayListInterface<Order> order = new ArrList<>();
    DeliveryMen deliveryMen;
    int index;

    public Delivery(){}
    
    public Delivery(String deliveryID, Customer customer, String status, ArrayListInterface<Order> order, DeliveryMen deliveryMen){
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

    public ArrayListInterface<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayListInterface<Order> order) {
        this.order = order;
    }
    
    public DeliveryMen getDeliveryMen() {
        return deliveryMen;
    }

    public void setDeliveryMen(DeliveryMen deliveryMen) {
        this.deliveryMen = deliveryMen;
    }
    
    @Override
    public void displayTable(DefaultTableModel model, ArrayListInterface<Delivery> delivery){
        
        Object row[] = new Object[7];
        for(int i = 0; i < delivery.size();i++)
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

    @Override
    public boolean checkDeliveryID(ArrayListInterface<Delivery> delivery,String deliveryID) {
            

        for(int i = 0; i < delivery.size();i++)
            if(delivery.get(i).getDeliveryID().equals(deliveryID)){
                index =i;
                return true;
            }
        return false;
    }

    @Override
    public void removeDisplay(DefaultTableModel model) {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
    }

    @Override
    public int getIndex() {
        return index;
    }
    
}
