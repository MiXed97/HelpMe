package listLink;

import assgn.Customer;
import assgn.Delivery;
import assgn.DeliveryMen;
import assgn.JianKai.MenuClass;
import assgn.JianKai.aff;
import assgn.hooi.Cart;
import assgn.hooi.LinkQueue;
import assgn.hooi.LinkQueueInt;
import assgn.hooi.LinkStack;
import assgn.hooi.LinkStackInt;
import assgn.hooi.Order1;
import assgn.humanResource;
import assgn.kaizhi.ClockInClockOut;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class store {

    JKLLI<aff> aff = new JKLL<>();
    ListLinkInt<DeliveryMen> delMen = new ListLink<>();
    JKLLI<MenuClass> menu = new JKLL<>();
    ListLinkInt<Customer> customer = new ListLink<>();
    ListLinkInt<Delivery> del = new ListLink<>();
    ListLinkInt<humanResource> hr = new ListLink<>();
    ListLinkInt<Cart> cart = new ListLink<>();
    ListLinkInt<Cart> cartHi = new ListLink<>();
    LinkQueueInt<Order1> order = new LinkQueue<>();
    LinkStackInt<ClockInClockOut> cico = new LinkStack<>();

    // keep track user
    Customer curCus = null;
    aff curAff = null;
    DeliveryMen curDelMen = null;
    humanResource curHR = null;
    JKLLI<MenuClass> curMenu = new JKLL<>();
    MenuClass curMenuForUpdate = new MenuClass();
    String selectedRes = null;

    //dont remove(KaiZhi)
    static int hi;

    public store() {
    }

    public store(int i) {

        addDeliMen();
        addCust();
        addMenu();
        addHR();
        addAff();
        addDelivery();

    }

    public void findAff(String email, String pass) {
        for (int i = 1; i <= aff.getSize(); i++) {
            if (aff.get(i).getEmail().equals(email) && aff.get(i).getPassword().equals(pass)) {
                curAff = aff.get(i);
                break;
            }
        }
    }

    public void findCus(String email, String pass) {
        for (int i = 1; i <= customer.getSize(); i++) {
            if (customer.get(i).getEmail().equals(email) && customer.get(i).getPassword().equals(pass)) {
                curCus = customer.get(i);
                break;
            }
        }

    }

    public void findDeliMen(String email, String pass) {
        for (int i = 1; i <= delMen.getSize(); i++) {
            if (delMen.get(i).getStaffID().equals(email) && delMen.get(i).getPassword().equals(pass) && !delMen.get(i).getStatus().equals("Retired")) {
                curDelMen = delMen.get(i);
                break;
            }
        }
    }

    public void findHr(String email, String pass) {
        for (int i = 1; i <= hr.getSize(); i++) {
            if (hr.get(i).getId().equals(email) && hr.get(i).getPw().equals(pass)) {
                curHR = hr.get(i);
                break;
            }
        }
    }

    public int findStaff(String s) {
        for (int i = 1; i <= delMen.getSize(); i++) {
            if (delMen.get(i).getStaffID().equals(s)) {
                return i;
            }
        }

        return 0;
    }

    public int findCurMenu(String foodID) {

        for (int i = 1; i <= curMenu.getSize(); i++) {
            if (curMenu.get(i).getFoodid().equals(foodID)) {
                return i;
            }
        }

        return 0;
    }

    public int findMenu(String foodID) {

        for (int i = 1; i <= menu.getSize(); i++) {
            if (menu.get(i).getFoodid().equals(foodID)) {
                return i;
            }
        }

        return 0;
    }

    public int determineUser() {

        if (curAff != null) {
            return 1;
        } else if (curCus != null) {
            return 2;
        } else if (curDelMen != null) {
            return 3;
        } else if (curHR != null) {
            return 4;
        }

        return 0;
    }

    public boolean checkEmailCA(String email) {

        for (int i = 1; i <= customer.getSize(); i++) {
            if (customer.get(i).getEmail().equals(email)) {
                return false;
            }
        }
        for (int i = 1; i <= aff.getSize(); i++) {
            if (aff.get(i).getEmail().equals(email)) {
                return false;
            }
        }

        return true;
    }

    public void addAff() {
        aff a = new aff("A1", "Glaz", "123", "970802445566", "0123456789", "glaz@hotmail.com", "Yes Restaurant", "Somewhere", "53300", "Local Cuisine");
        aff b = new aff("A2", "Test2", "123", "970802445566", "0123456789", "test2@hotmail.com", "No Restaurant", "Somewhere else", "53330", "Fast food");
        aff.add(a);
        aff.add(b);
        //Add to do testing, can remove
        Cart abc = new Cart("CID01", "A1F01", "food 1", 2, 2.5, 5.0);
        Cart abc1 = new Cart("CID01", "A1F01", "food 1", 2, 2.5, 5.0);
        Cart abc2 = new Cart("CID01", "A1F01", "food 1", 2, 2.5, 5.0);
        Cart abc3 = new Cart("CID02", "A1F01", "foods 1", 2, 2.5, 5.0);
        Cart abc4 = new Cart("CID02", "A1F01", "food 2", 2, 2.5, 5.0);
        Cart abc5 = new Cart("CID02", "A1F01", "food 3", 2, 2.5, 5.0);

        cartHi.add(abc);
        cartHi.add(abc1);
        cartHi.add(abc2);
        cartHi.add(abc3);
        cartHi.add(abc4);
        cartHi.add(abc5);

        Order1 o1 = new Order1("OID01", "CID01", "2017/12/25 00:00:00", 2.50, "Delivered", "llol@hotmail.com", "A1");
        Order1 o2 = new Order1("OID02", "CID02", "2017/12/25 00:00:00", 25.50, "Delivered", "lol@hotmail.com", "A1");

        order.enqueue(o1);
        order.enqueue(o2);
//      Order1 o3 = new Order1("OID03", "CID03", "2017/12/26 00:00:00", 15.50, "Order Placed", "llol@hotmail.com","A1");
//        Order1 o4 = new Order1("OID04", "CID04", "2017/12/26 00:00:00", 12.50, "Order Placed", "lol@hotmail.com","A2");
//        order.enqueue(o3);
//        order.enqueue(o4);
    }

    public void addDeliMen() {
        DeliveryMen d1 = new DeliveryMen("Nicholas", "D1", "192", "Somewhere", "01234567", 123.00);
        d1.setPassword("123");
        d1.setStatus("On Delivery");
        DeliveryMen d2 = new DeliveryMen("Soon Jian Kai", "D2", "999", "No where", "01899997", 223.00);
        d2.setPassword("123");
        DeliveryMen d3 = new DeliveryMen("Ng Poh Hooi", "D3", "456", "LoL", "01934567", 323.00);
        d3.setPassword("123");
        DeliveryMen d4 = new DeliveryMen("Ong Kai Zhi", "D4", "789", "Wonder Land", "01134567", 423.00);
        d4.setPassword("123");

        delMen.add(d1);
        delMen.add(d2);
        delMen.add(d3);
        delMen.add(d4);
    }

    public void addCust() {
        Customer c = new Customer("Name", "HOO LAND", "012378999", "lol@hotmail.com", "123");
        Customer c1 = new Customer("Name1", "no MAN LAND", "014378999", "lol1@hotmail.com", "1234");

        customer.add(c);
        customer.add(c1);
    }

    public void addMenu() {
        MenuClass mc1 = new MenuClass("A1F1", "Burger ", "asd", "11", "Available", "A1", "Dec", "2017");
        MenuClass mc2 = new MenuClass("A1F2", "Caser Salad", "assd", "8", "Available", "A1", "Dec", "2017");
        MenuClass mc3 = new MenuClass("A1F3", "Goreng Mee", "axsd", "9", "Available", "A1", "Dec", "2017");
        MenuClass mc4 = new MenuClass("A2F1", "Test1 ", "asd", "11", "Available", "A2", "Dec", "2017");
        MenuClass mc5 = new MenuClass("A2F2", "T2", "assd", "8", "Available", "A2", "Dec", "2017");
        MenuClass mc6 = new MenuClass("A2F3", "t3", "axsd", "9", "Available", "A2", "Dec", "2017");

        menu.add(mc1);
        menu.add(mc2);
        menu.add(mc3);
        menu.add(mc4);
        menu.add(mc5);
        menu.add(mc6);
    }

    public void addHR() {
        humanResource hr1 = new humanResource("H1", "123");
        humanResource hr2 = new humanResource("H2", "123");

        hr.add(hr1);
        hr.add(hr2);
    }

    public void addDelivery() {
        //Delivery de1 = new Delivery("D1",customer.get(0),"Not Deliver",); Cart abc = new Cart("CID01", "A1F01", "food 1", 2, 2.5, 5.0);
        Cart abc1 = new Cart("CID01", "A1F01", "food 1", 2, 2.5, 5.0);
        Cart abc2 = new Cart("CID01", "A1F01", "food 1", 2, 2.5, 5.0);
        Cart abc3 = new Cart("CID02", "A1F01", "foods 1", 2, 2.5, 5.0);
        Cart abc4 = new Cart("CID02", "A1F01", "food 2", 2, 2.5, 5.0);
        Cart abc5 = new Cart("CID02", "A1F01", "food 3", 2, 2.5, 5.0);

        Order1 o1 = new Order1("OID01", "CID01", "2017/12/25 00:00:00", 2.50, "Delivered", "llol@hotmail.com", "A1");
        Order1 o2 = new Order1("OID02", "CID02", "2017/12/25 00:00:00", 25.50, "Order Placed", "lol@hotmail.com", "A1");
        Order1 o3 = new Order1("OID03", "CID03", "2017/12/25 00:00:00", 2.50, "Order Placed", "llol@hotmail.com", "A1");

        Customer c = new Customer("Name", "HOO LAND", "012378999", "lol@hotmail.com", "123");
        Delivery de2 = new Delivery(c, o1);
        Delivery de5 = new Delivery();
        Delivery de6 = new Delivery();
    }

    public void setAffMenu() {
        curMenu.clear();
        for (int i = 1; i <= menu.getSize(); i++) {
            if (menu.get(i).getAffID().equals(curAff.getAid())) {
                curMenu.add(menu.get(i));
            }
        }
    }

    public MenuClass getCurMenuForUpdate() {
        return curMenuForUpdate;
    }

    public void setCurMenuForUpdate(MenuClass curMenuForUpdate) {
        this.curMenuForUpdate = curMenuForUpdate;
    }

    public JKLLI<MenuClass> getCurMenu() {
        return curMenu;
    }

    public void setCurMenu(JKLLI<MenuClass> curMenu) {
        this.curMenu = curMenu;
    }

    public JKLLI<aff> getAff() {
        return aff;
    }

    public void setAff(JKLLI<aff> aff) {
        this.aff = aff;
    }

    public ListLinkInt<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(ListLinkInt<Customer> customer) {
        this.customer = customer;
    }

    public ListLinkInt<DeliveryMen> getDelMen() {
        return delMen;
    }

    public void setDelMen(ListLinkInt<DeliveryMen> delMen) {
        this.delMen = delMen;
    }

    public JKLLI<MenuClass> getMenu() {
        return menu;
    }

    public void setMenu(JKLLI<MenuClass> menu) {
        this.menu = menu;
    }

    public ListLinkInt<Delivery> getDel() {
        return del;
    }

    public void setDel(ListLinkInt<Delivery> del) {
        this.del = del;
    }

    public ListLinkInt<humanResource> getHr() {
        return hr;
    }

    public void setHr(ListLinkInt<humanResource> hr) {
        this.hr = hr;
    }

    public Customer getCurCus() {
        return curCus;
    }

    public void setCurCus(Customer curCus) {
        this.curCus = curCus;
    }

    public aff getCurAff() {
        return curAff;
    }

    public void setCurAff(aff curAff) {
        this.curAff = curAff;
    }

    public DeliveryMen getCurDelMen() {
        return curDelMen;
    }

    public void setCurDelMen(DeliveryMen curDelMen) {
        this.curDelMen = curDelMen;
    }

    public humanResource getCurHR() {
        return curHR;
    }

    public void setCurHR(humanResource curHR) {
        this.curHR = curHR;
    }

    public void setCartHi(ListLinkInt<Cart> cartHi) {
        this.cartHi = cartHi;
    }

    public ListLinkInt<Cart> getCartHi() {
        return cartHi;
    }

    public void setSelectedRes(String res) {
        this.selectedRes = res;
    }

    public String getSelectedRes() {
        return selectedRes;
    }

    public void setCart(ListLinkInt<Cart> cart) {
        this.cart = cart;
    }

    public ListLinkInt<Cart> getCart() {
        return cart;
    }

    public void setOrder(LinkQueueInt<Order1> order) {
        this.order = order;
    }

    public LinkQueueInt<Order1> getOrder() {
        return order;
    }

    public LinkStackInt<ClockInClockOut> getCico() {
        return cico;
    }

    public void setCico(LinkStackInt<ClockInClockOut> cico) {
        this.cico = cico;
    }

    public void resetUser() {
        curAff = null;
        curCus = null;
        curMenu.clear();
        curDelMen = null;
        curHR = null;
        selectedRes = null;
    }

    public void removeMenu(String foodID) {

        int index = findCurMenu(foodID);
        curMenu.remove(index);
        index = findMenu(foodID);
        menu.remove(index);

    }

    public void UpdateMenu(String foodID, MenuClass m) {
        int index = findCurMenu(foodID);
        curMenu.add(index, m);
        index = findMenu(foodID);
        menu.add(index, m);

    }

    public int getMenuCount(String foodID) {

        char c[] = foodID.toCharArray();
        int check = 0;
        String digit = "";
        for (char x : c) {
            if (x == 'F') {
                check = 1;
            } else if (check == 1) {
                digit += x;
            }
        }

        check = Integer.parseInt(digit);
        check++;

        return check;
    }

    public void sortPriceMenu() {
        //add getPrice()
        double small = Double.parseDouble(curMenu.get(1).getPrice());
        int remove = 0;
        JKLLI<MenuClass> temp = new JKLL<>();

        while (curMenu.getSize() != 0) {

            for (int i = 1; i <= curMenu.getSize(); i++) {
                if (small >= Double.parseDouble(curMenu.get(i).getPrice())) {
                    small = Double.parseDouble(curMenu.get(i).getPrice());
                    remove = i;
                }
            }
            temp.add(curMenu.get(remove));
            curMenu.remove(remove);
            if (curMenu.getSize() != 0) {
                small = Double.parseDouble(curMenu.get(1).getPrice());
            }
        }
        curMenu = temp;
    }

    public void sortNewestMenu() {
        JKLLI<MenuClass> temp = new JKLL<>();
        int num = getMenuNum(curMenu.get(1).getFoodid());
        int remove = 0;
        while (curMenu.getSize() != 0) {
            for (int i = 1; i <= curMenu.getSize(); i++) {
                if (num <= getMenuNum(curMenu.get(i).getFoodid())) {
                    num = getMenuNum(curMenu.get(i).getFoodid());
                    remove = i;
                }
            }
            temp.add(curMenu.get(remove));
            curMenu.remove(remove);

            if (curMenu.getSize() != 0) {
                num = getMenuNum(curMenu.get(1).getFoodid());
            }
        }
        curMenu = temp;
    }

    public void sortStaffNameAsc() {
        ListLinkInt<DeliveryMen> temp = new ListLink<>();
        String name = delMen.get(1).getName();
        int remove = 0;
        while (!delMen.isEmpty()) {
            for (int i = 1; i <= delMen.getSize(); i++) {
                if (name.compareTo(delMen.get(i).getName()) >= 0) {
                    name = delMen.get(i).getName();
                    remove = i;
                }
            }
            temp.add(delMen.get(remove));
            delMen.remove(remove);

            if (!delMen.isEmpty()) {
                name = delMen.get(1).getName();
            }
        }

        delMen = temp;
    }

    public void sortStaffIDDesc() {
        ListLinkInt<DeliveryMen> temp = new ListLink<>();
        String id = delMen.get(1).getStaffID();
        int remove = 0;
        while (!delMen.isEmpty()) {
            for (int i = 1; i <= delMen.getSize(); i++) {
                if (id.compareTo(delMen.get(i).getStaffID()) <= 0) {
                    id = delMen.get(i).getStaffID();
                    remove = i;
                }
            }
            temp.add(delMen.get(remove));
            delMen.remove(remove);

            if (!delMen.isEmpty()) {
                id = delMen.get(1).getStaffID();
            }
        }

        delMen = temp;

    }

    public int getMenuNum(String s) {
        int result = 0;

        char[] c = s.toCharArray();
        String num = "";
        int index = c.length - 1;
        while (c[index] != 'F') {

            num += c[index];
            index--;
        }
        num = new StringBuilder(num).reverse().toString();
        result = Integer.parseInt(num);
        return result;
    }

    public int findOrderIndex(String orderID) {
        int index = -1;
        for (int i = 0; i < order.size(); i++) {
            if (order.get(i).getOrderID().equals(orderID)) {
                index = i;
            }
        }
        // if cannot find match return -1
        return index;
    }

    public Customer findCustomer(String email) {
        Customer c = null;
        for (int i = 1; i <= customer.getSize(); i++) {
            if (customer.get(i).getEmail().equals(email)) {
                c = customer.get(i);
                break;
            }
        }
        return c;
    }

    public int findFreeDelMen() {
        //get the free deliveryMen

        try {
            for (int i = 1; i <= delMen.getSize(); i++) {
                if (delMen.get(i).getStatus().equals("Working") && !delMen.get(i).getCico().peek().noClockIn()) {
                    return i;
                }

        
        }}catch (Exception e) {
        }
        return 0;
    }

    public int findDelivery(String orderID) {
        //get delivery
        for (int i = 1; i <= del.getSize(); i++) {
            if (del.get(i).getOrder().getOrderID().equals(orderID)) {
                return i;
            }
        }

        return 0;
    }
    public int AvailableDeliveryMen() {
        try {
            for (int i = 1; i <= delMen.getSize(); i++) {

                if (!delMen.get(i).getCico().peek().noClockIn()) {
                    return i;
                }

            }
        } catch (Exception e) {
        }
        return -1;
    }

    public String getDateNow() {
        DateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd");
        Date date = new Date();
        return dateFormat.format(date).toString();
    }

    public int findAffByID(String affID) {
        for (int i = 1; i <= aff.getSize(); i++) {
            if (aff.get(i).getAid().equals(affID)) {
                return i;
            }
        }

        return 0;
    }

    public DeliveryMen delMenByTurn() {
        // get next active delivery men by turn
        ListLinkInt<DeliveryMen> temp = activeDelMen();
        // get last deliver delMen ID
        String lastDelMenID = del.get(del.getSize()).getDeliveryMen().getStaffID();
        int lastNum = extractInt(lastDelMenID);
        if (lastNum >= temp.getSize()) {
            //finding the front active delivery Men 
            int index = findDelMenByID(temp.get(1).getStaffID());
            return delMen.get(index);
        } else {
            return delMen.get(lastNum + 1);
        }
    }

    public ListLinkInt<DeliveryMen> activeDelMen() {
        ListLinkInt<DeliveryMen> temp = new ListLink<DeliveryMen>();
        try{
        for (int i = 1; i <= delMen.getSize(); i++) {
            if (!delMen.get(i).getCico().peek().noClockIn()) {
                temp.add(delMen.get(i));
            }
        }
        }catch(Exception e){}
        System.out.println(temp.getSize());
        return temp;
    }

    public int extractInt(String delID) {
        int result;
        String s = "";
        char c[] = delID.toCharArray();
        for (char x : c) {
            if (Character.isDigit(x)) {
                s += x;
            }
        }

        result = Integer.parseInt(s);

        return result;
    }

    public int findDelMenByID(String id) {
        int result = 0;

        for (int i = 1; i <= delMen.getSize(); i++) {
            if (delMen.get(i).getStaffID().equals(id)) {
                return i;
            }
        }

        return result;
    }

}
