/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn.JianKai;

/**
 *
 * @author USER
 */
public class removeMenuIMP implements removeInterface {
    
    public String foodname;
    public String resname;
    public String desc;
    public String price;
    public String status;
    public String ID;
    
    public removeMenuIMP(){}
    
    public removeMenuIMP(String foodname, String resname, String desc,String price,String status,String ID)
    {
        this.foodname = foodname;
        this.resname = resname;
        this.desc = desc;
        this.price = price;
        this.status = status;
        this.ID = ID;
    }
    
    public boolean deletefood(String enteredfoodname , String loopfn)
    {
        boolean foodavailable = true;
        
        if (!enteredfoodname.equals(loopfn)) {
            foodavailable = false;
            
        }
        
        return foodavailable;
    }

    public String getFoodname() {
        return foodname;
    }

    public void setFoodname(String foodname) {
        this.foodname = foodname;
    }
    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
