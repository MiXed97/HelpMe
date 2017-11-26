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
public class Customer implements CustomerInterface{
    
    String name;
    String address;
    String contactNo;
    String email;
    String password;

    public Customer(){}
    
    public Customer(String name, String address, String contactNo, String email, String password) {
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.email = email;
        this.password = password;
    }
    @Override
    public String getName() {
        return name;
    }
@Override
    public void setName(String name) {
        this.name = name;
    }
@Override
    public String getAddress() {
        return address;
    }
@Override
    public void setAddress(String address) {
        this.address = address;
    }
@Override
    public String getContactNo() {
        return contactNo;
    }
@Override
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
@Override
    public String getEmail() {
        return email;
    }
@Override
    public void setEmail(String email) {
        this.email = email;
    }
@Override
    public String getPassword() {
        return password;
    }
@Override
    public void setPassword(String password) {
        this.password = password;
    }
 @Override   
    public boolean logIn(String email, String password){
        
        if(this.email.equals(email) && this.password.equals(password))
            return true;
        return false;
    }
    
}
