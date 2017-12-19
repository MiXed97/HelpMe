/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

import assgn.JianKai.MenuClass;

/**
 *
 * @author Mixed_97
 */
public class Order extends MenuClass{
    
    int quantity;
    double total;
    
    public Order(){}
    
    public Order(MenuClass m){
        this.setFoodid(m.getFoodid());
        this.setFoodname(m.getFoodname());
        this.setPrice(m.getPrice());
        this.quantity = 1;
        double price;
        price = Double.parseDouble(m.getPrice());
        this.setTotal(quantity * price ) ;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void setTotal() {
        this.total = quantity* Double.parseDouble(this.getPrice());
    }

    
    @Override
    public String toString() {
        return "Order{" + "quantity=" + quantity + ", total=" + total + '}';
    }
    
    
    
}
