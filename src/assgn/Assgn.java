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
public class Assgn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayListInterface<DeliveryMen> delivery = new ArrList<>();
        ArrayListInterface<Menu> menu = new ArrList<>();
        ArrayListInterface<Customer> customer = new ArrList<>();
        
        
        DeliveryMen d1 = new DeliveryMen("Nicholas","666","Somewhere","01234567",123.00);
        DeliveryMen d2 = new DeliveryMen("Soon Jian Kai","999","No where","01899997",223.00);
        DeliveryMen d3 = new DeliveryMen("Ng Poh Hooi","555","LoL","01934567",323.00);
        DeliveryMen d4 = new DeliveryMen("Ong Kai Zhi","777","Wonder Land","01134567",423.00);
        
        Customer c = new Customer("Name", "HOO LAND", "012378999","email","hello");
        Customer c1 = new Customer("Name1", "no MAN LAND", "014378999","email1","hello1");
        
        Menu m = new Menu("1","Burger",12.3);
        Menu m1 = new Menu("2", "hotdog",10.5);
        Menu m2 = new Menu("3","fries",5.0);
        
        delivery.add(d1);
        delivery.add(d2);
        delivery.add(d3);
        delivery.add(d4);
        
        menu.add(m);
        menu.add(m1);
        menu.add(m2);
        
        customer.add(c);
        customer.add(c1);
        
        
        
        Login l = new Login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        l.setTitle("Log in");
        l.setCustomer(customer);
        l.setMenu(menu);
        l.setDeliveryMen(delivery);
        
    }
    
}
