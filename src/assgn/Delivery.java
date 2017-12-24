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
public class Delivery {

    //get info from customer
    Customer customer;
    Order1 order = new Order1();
    DeliveryMen deliveryMen;
    int index = 0;
    public Delivery() {
    }

    public Delivery(Customer customer, Order1 order, DeliveryMen deliveryMen) {
        this.customer = customer;
        this.order = order;
        this.deliveryMen = deliveryMen;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order1 getOrder() {
        return order;
    }

    public void setOrder(Order1 order) {
        this.order = order;
    }

    public DeliveryMen getDeliveryMen() {
        return deliveryMen;
    }

    public void setDeliveryMen(DeliveryMen deliveryMen) {
        this.deliveryMen = deliveryMen;
    }

    public int getIndex() {
        return index;
    }

    public boolean checkDeliveryID(ListLinkInt<Delivery> delivery, String deliveryID) {

        for (int i = 0; i < delivery.getSize(); i++) {
            if (delivery.get(i).getOrder().getOrderID().equals(deliveryID)) {
                index = i;
                return true;
            }
        }
        return false;
    }
}
