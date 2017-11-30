/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

/**
 *
 * @author Mixed_97
 */
public class Order extends Menu{
    
    int quantity;
    double total;
    
    public Order(){}
    
    public Order(Menu m){
        this.menuID = m.menuID;
        this.menuName = m.menuName;
        this.price = m.price;
        this.quantity = 1;
        this.total= quantity*price;
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
        this.total = quantity*price;
    }

    
    @Override
    public String toString() {
        return "Order{" + "quantity=" + quantity + ", total=" + total + '}';
    }
    
    
    
}
