
package assgn.hooi;

/**
 *
 * @author Aphro97
 */
public class Order {
    private String orderID;
    private String cartID;
    private String orderDate;
    private double totalAmount;
    private String orderStatus;
    
    public Order(){}
    public Order(String orderID,String cartID,String orderDate,double totalAmount,String orderStatus){
        this.orderID = orderID;
        this.cartID = cartID;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
    }
    
    public void setOrderID(String orderID){
        this.orderID = orderID;
    }
    public String getOrderID(){
        return orderID;
    }
    public void setCartID(String cartID){
        this.cartID = cartID;
    }
    public String getCartID(){
        return cartID;
    }
    public void setOrderDate(String orderDate){
        this.orderDate = orderDate;
    }
    public String getOrderDate(){
        return orderDate;
    }
    public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }
    public double getTotalAmount(){
        return totalAmount;
    }
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }
    public String getOrderStatus(){
        return orderStatus;
    }
}
