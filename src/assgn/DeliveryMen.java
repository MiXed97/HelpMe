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
public class DeliveryMen {
    
    String name;
    String staffID;
    String address;
    String contactNo;
    double salary;
    
    public DeliveryMen(){}
    
    public DeliveryMen(String name, String staffID, String address, String contactNo, double salary) {
        this.name = name;
        this.staffID = staffID;
        this.address = address;
        this.contactNo = contactNo;
        this.salary = salary;
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
    
    

    @Override
    public String toString() {
        return "DeliveryMen{" + "name=" + name + ", staffID=" + staffID + ", address=" + address + ", contactNo=" + contactNo + ", salary=" + salary + '}';
    }
    
    
    
}
