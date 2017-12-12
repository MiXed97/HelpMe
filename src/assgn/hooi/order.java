
package assgn.hooi;


public class order {
    private String orderID;
    private String orderDate;
    private String customerID;
    private int Fqty;
    private int Dqty;
    private String drinks;
    private String food;
    public order(String orderID,String orderDate,String customerID,String food,String drinks,int Fqty,int Dqty){
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.customerID = customerID;
        this.Fqty = Fqty;
        this.Dqty = Dqty;
        this.drinks = drinks;
        this.food = food;
    }
    public void setOrderID(String orderID){
        this.orderID = orderID;
    }
    public void setOrderDate(String orderDate){
        this.orderDate = orderDate;
    }
    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }
    public String getOrderID(){
        return orderID;
    }
    public String getOrderDate(){
        return orderDate;
    }
    public String getCustomerID(){
        return customerID;
    }
    public String getFood(){
        return food;
    }
    public String getDrinks(){
        return drinks;
    }
    public int getFqty(){
        return Fqty;
    }
    public int getDqty(){
        return Dqty;
    }
    
}
