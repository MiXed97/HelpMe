
package assgn.hooi;

/**
 *
 * @author Aphro97
 */
public class Order1 {
    private String orderID;
    private String cartID;
    private String cusEmail;
    private String orderDate;
    private String orderStatus;
    private double totalAmount;
    private String affID;
    public Order1(){}
    
    public Order1(String orderID,String cartID,String orderDate,double totalAmount,String orderStatus,String cusEmail, String affID){
        this.orderID = orderID;
        this.cartID = cartID;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.totalAmount = totalAmount;
        this.cusEmail = cusEmail;
        this.affID= affID;
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
    public void setOrderStatus(String orderStatus){
        this.orderStatus = orderStatus;
    }
    public String getOrderStatus(){
        return orderStatus;
    }
    public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }
    public double getTotalAmount(){
        return totalAmount;
    }
    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }
    public String getCusEmail() {
        return cusEmail;
    }

    public String getAffID() {
        return affID;
    }

    public void setAffID(String affID) {
        this.affID = affID;
    }

    @Override
    public String toString() {
        return "Order1{" + "orderID=" + orderID + ", cartID=" + cartID + ", cusEmail=" + cusEmail + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", totalAmount=" + totalAmount + ", affID=" + affID + '}';
    }
    
    
    
}
