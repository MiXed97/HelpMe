package assgn.JianKai;

import javax.swing.JOptionPane;

public class MenuClass implements AddMenuInterface{
    
    String foodname;
    String resname;
    String desc;
    String price;
    String status;
    
    private String theerror="";

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public MenuClass(){}

    public MenuClass(String foodname, String resname, String desc, String price,String status) {
        this.foodname = foodname;
        this.resname = resname;
        this.desc = desc;
        this.price = price;
        this.status = status;
    }

    @Override
    public boolean checkfn() {
        boolean result = true;
        char c[] = foodname.toCharArray();
        int namelength = c.length;
        for(int i=0;i<namelength;i++)
        {
            if (Character.isDigit(c[i])) {
                theerror += "Do not enter digit as food name \n";
                return false;
            }
        }
        
        if (foodname.isEmpty()) {
            theerror += "Please enter food name \n";
            return false;
            
        }
        return result;
        
    }

    @Override
    public boolean checkdesc() {
        boolean result = true;
        if (desc.isEmpty()) {
            theerror += "Please enter your food description \n";
            return false;
        }
        
        return result;
        
    }

    @Override
    public boolean checkprice() {
        boolean result = true;
        if (price.isEmpty()) {
            theerror += "Please enter your food price \n";
            return false;
        }
        
        char f[] = price.toCharArray();
        int pricelength = f.length;
        for (int v = 0; v < pricelength; v++) {
            if (Character.isLetter(f[v])) {
                theerror += "Please enter only digit in price\n";
                return false;
            }
        }
        
        return result;
    }

    
    public String toString(){
        return theerror;
    }

    
}
