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
public class DeliveryMen implements DeliveryMenInterface {
    
    String name;
    String staffID;
    String password;
    String ic;
    String address;
    String contactNo;
    double salary;
    String tempSalary;
    String status;
    
    public DeliveryMen(){}
    
    public DeliveryMen(String name, String staffID, String ic, String address, String contactNo, String tempSalary) {
        this.name = name;
        this.staffID = staffID;
        this.ic = ic;
        this.password = ic;
        this.address = address;
        this.contactNo = contactNo;
        this.tempSalary = tempSalary;
        this.salary= Double.parseDouble(tempSalary);
        this.status = "Working";
    }
    
    public DeliveryMen(String name, String staffID, String ic, String address, String contactNo, double salary) {
        this.name = name;
        this.staffID = staffID;
        this.ic = ic;
        this.password = ic;
        this.address = address;
        this.contactNo = contactNo;
        this.tempSalary = String.valueOf(salary);
        this.salary = salary;
        this.status = "Working";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }
    
    @Override
    public String toString() {
        return "DeliveryMen{" + "name=" + name + ", staffID=" + staffID + ", address=" + address + ", contactNo=" + contactNo + ", salary=" + salary + '}';
    }
    
    public String checkName(){
        
        char c[] = name.toCharArray();
        String result = "";
        
        if(name.isEmpty())
            return "• Please don't left name empty\n";
        
        for(char x:c){
            if(!Character.isLetter(x) && !Character.isSpace(x)){
                result+="• Please enter all letter in Name\n";
                break;
            }
        }
        
        return result;
    }
    public String checkContact(){
        char c[] = contactNo.toCharArray();
        String result = "";
        if(c.length < 10)
            return "• Contact number length is too short\n";
        
        if(contactNo.isEmpty())
            return "• Please don't left contact empty\n";
        
        for(char x:c){
             if(!Character.isDigit(x)){
                result+="• Please enter all digit in Contact No\n";
                break;
             }
        }
        
        return result;
    }
    public String checkIC(){
         char c[] = ic.toCharArray();
        String result = "";
        if(c.length < 12)
            return "• IC length is too short\n";
        
        else if(ic.isEmpty())
            return "• Please don't left ic empty\n";
        
        for(char x:c){
             if(!Character.isDigit(x)){
                result+="• Please enter all digit in IC\n";
                break;
             }
        }
        
        return result;
    }
    public String checkSalary(){
        String result = "";
        
        try{
        salary = Double.parseDouble(tempSalary);
        }catch(Exception E){
            return "• Please enter salary in a correct format\n";
        }
        return result;
    }
    public String checkAddress(){
        String result ="";
        
        if(address.isEmpty())
            return "• Please don't left the address empty";
        
        return result;
    }
    
    @Override
    public String check() {
        
        String result = "";
        
        result+= checkName();
        result+=checkContact();
        result+= checkIC();
        result+=checkSalary();
        result+=checkAddress();
        
        return result;
    }
    
}
