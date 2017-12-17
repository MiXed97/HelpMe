package listLink;

import assgn.Customer;
import assgn.Delivery;
import assgn.DeliveryMen;
import assgn.JianKai.MenuClass;
import assgn.JianKai.aff;
import assgn.Menu;
import assgn.humanResource;

public class store {
    
    ListLinkInt<student> stud = new ListLink<>();
    ListLinkInt<aff> aff = new ListLink<>();
    ListLinkInt<DeliveryMen> delMen = new ListLink<>();
    ListLinkInt<MenuClass> menu = new ListLink<>();
    ListLinkInt<Customer> customer = new ListLink<>();
    ListLinkInt<Delivery> del = new ListLink<>();
    ListLinkInt<humanResource> hr = new ListLink<>();
    
    
    // keep track user
    Customer curCus = null;
    aff curAff = null;
    DeliveryMen curDelMen = null;
    humanResource curHR = null;
    ListLinkInt<MenuClass> curMenu = new ListLink<>();
    public store(){}
    
    public store(int i){
        
        addDeliMen();
        addCust();
        addMenu();
        addHR();
        addAff();

    }
    
    public void findAff(String email, String pass){
        for(int i = 1;i<= aff.getSize();i++)
            if(aff.get(i).getEmail().equals(email) && aff.get(i).getPassword().equals(pass)){
                curAff = aff.get(i);
                break;
            }
    }  

    public void findCus(String email,String pass){
        for(int i = 1; i <= customer.getSize();i++)
            if(customer.get(i).getEmail().equals(email) && customer.get(i).getPassword().equals(pass)){
                curCus = customer.get(i);
                break;
            }
                
    }
    
    public void findDeliMen(String email, String pass){
        for(int i =1; i<= delMen.getSize();i++)
            if(delMen.get(i).getStaffID().equals(email) && delMen.get(i).getPassword().equals(pass) && delMen.get(i).getStatus().equals("Working")){
                curDelMen = delMen.get(i);
                break;
            }
    }
    
    public void findHr(String email, String pass){
        for(int i =1; i<= hr.getSize();i++)
            if(hr.get(i).getId().equals(email) && hr.get(i).getPw().equals(pass)){
                curHR = hr.get(i);
                break;
            }
    }
    
     public int findStaff(String s){
        for(int i =1; i<= delMen.getSize();i++)
            if(delMen.get(i).getStaffID().equals(s))
                return i;
            
        return 0;
    }
     
    public int determineUser(){
        
        if(curAff != null)
            return 1;
        else if(curCus!= null)
            return 2;
        else if(curDelMen!=null)
            return 3;
        else if (curHR != null)
            return 4;
        
        return 0;
    }
    
    public boolean checkEmailCA(String email){
        
        for(int i =1;i <= customer.getSize();i++)
            if(customer.get(i).getEmail().equals(email))
                return false;
         for(int i=1;i <= aff.getSize();i++)
             if(aff.get(i).getEmail().equals(email))
                 return false;
        
        return true;
    }
    
    public void addAff(){
        aff a = new aff("A1","Glaz","123","970802445566","0123456789","glaz@hotmail.com","Yes Restaurant","Somewhere","53300","Local Cuisine");
        aff.add(a);
    }
    
    public void addDeliMen(){
        DeliveryMen d1 = new DeliveryMen("Nicholas","D1","192","Somewhere","01234567",123.00);
        DeliveryMen d2 = new DeliveryMen("Soon Jian Kai","D2","999","No where","01899997",223.00);
        DeliveryMen d3 = new DeliveryMen("Ng Poh Hooi","D3","456","LoL","01934567",323.00);
        DeliveryMen d4 = new DeliveryMen("Ong Kai Zhi","D4","789","Wonder Land","01134567",423.00);
        
        delMen.add(d1);
        delMen.add(d2);
        delMen.add(d3);
        delMen.add(d4);
    }
    
    public void addCust(){
        Customer c = new Customer("Name", "HOO LAND", "012378999","lol@hotmail.com","123");
        Customer c1 = new Customer("Name1", "no MAN LAND", "014378999","lol1@hotmail.com","1234");
        
        customer.add(c);
        customer.add(c1);
    }
    
    
    public void addMenu(){
        MenuClass mc1 = new MenuClass("A1F1","asd","asd","asd","11","Available","A1");
        MenuClass mc2 = new MenuClass("A1F2","asdas","asasd","assd","1111","Available","A1");
        MenuClass mc3 = new MenuClass("A1F3","asxzd","asxd","axsd","11x","Available","A1");
        
        menu.add(mc1);
        menu.add(mc2);
        menu.add(mc3);
    }

    public void addHR(){
        humanResource hr1 = new humanResource("H1","123");
        humanResource hr2 = new humanResource("H2","123");
        
        hr.add(hr1);
        hr.add(hr2);
    }
    
    public void setAffMenu(){
        
        for(int i = 1;i <= menu.getSize();i++){
            if(menu.get(i).getAffID().equals(curAff.getAid())){
                curMenu.add(menu.get(i));
            }
        }
    }

    public ListLinkInt<MenuClass> getCurMenu() {
        return curMenu;
    }

    public void setCurMenu(ListLinkInt<MenuClass> curMenu) {
        this.curMenu = curMenu;
    }
    
    public ListLinkInt<student> getStud() {
        return stud;
    }

    public void setStud(ListLinkInt<student> stud) {
        this.stud = stud;
    }

    public ListLinkInt<aff> getAff() {
        return aff;
    }

    public void setAff(ListLinkInt<aff> aff) {
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

    public ListLinkInt<MenuClass> getMenu() {
        return menu;
    }

    public void setMenu(ListLinkInt<MenuClass> menu) {
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
    
    
    
    public void resetUser(){
        curAff= null;
        curCus=null;
        curDelMen=null;
        curHR=null;
    }
    
}
