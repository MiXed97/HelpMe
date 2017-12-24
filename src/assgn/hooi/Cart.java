
package assgn.hooi;

/**
 *
 * @author Aphro97
 */
public class Cart {
    String cartID = null;
    String item = null;
    String itemName = null;
    int qty;
    double price;
    double total;
    public Cart(){}
    
    public Cart(String item,String itemName, int qty, double price,double total){
        this.item = item;
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }
    public Cart(String cartID,String item,String itemName, int qty, double price,double total){
        this.cartID = cartID;
        this.item = item;
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
        this.total = total;
    }
    public void setCartID(String cartID){
        this.cartID = cartID;
    }
    public String getCartID(){
        return cartID;
    }
    public void setItem(String item){
        this.item = item;
    }
    public String getItem(){
        return item;
    }
    public void setItemName(String itemName){
        this.itemName = itemName;
    }
    public String getItemName(){
        return itemName;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public int getQty(){
        return qty;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public void setTotal(double total){
        this.total = total;
    }
    public double getTotal(){
        return total;
    }

    @Override
    public String toString() {
        return "Cart{" + "cartID=" + cartID + ", item=" + item + ", itemName=" + itemName + ", qty=" + qty + ", price=" + price + ", total=" + total + '}';
    }
    
}
