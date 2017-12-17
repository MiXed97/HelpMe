
package assgn.hooi;

/**
 *
 * @author Aphro97
 */
public class Cart {
    String item = null;
    String itemName = null;
    int qty;
    double price;
    double total;
    public Cart(){}
    
    public Cart(String item,String itemName, int qty, double price){
        this.item = item;
        this.itemName = itemName;
        this.qty = qty;
        this.price = price;
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
    
}
