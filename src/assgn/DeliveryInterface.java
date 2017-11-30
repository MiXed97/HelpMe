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
public interface DeliveryInterface {
    public boolean checkDeliveryID(ArrayListInterface<Delivery> delivery,String deliveryID);
    public void removeDisplay(DefaultTableModel model);
    public void displayTable(DefaultTableModel model, ArrayListInterface<Delivery> delivery);
    public int getIndex();
    
    public String getDeliveryID();
    public void setDeliveryID(String deliveryID);
    public Customer getCustomer();
    public void setCustomer(Customer customer);
    public String getStatus();
    public void setStatus(String status);
    public ArrayListInterface<Order> getOrder();
    public void setOrder(ArrayListInterface<Order> order);
    public DeliveryMen getDeliveryMen();
    public void setDeliveryMen(DeliveryMen deliveryMen);
}
