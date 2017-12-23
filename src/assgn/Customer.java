/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgn;

import java.util.regex.Pattern;

/**
 *
 * @author Mixed_97
 */
public class Customer{
    
    String name;
    String address;
    String contactNo;
    String email;
    String password;
    String tempPass;
    public Customer(){}
    
    public Customer(String name, String address, String contactNo, String email, String password, String tempPass) {
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.email = email;
        this.password = password;
        this.tempPass = tempPass;
    }
    
    public Customer(String name, String address, String contactNo, String email, String password) {
        this.name = name;
        this.address = address;
        this.contactNo = contactNo;
        this.email = email;
        this.password = password;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean logIn(String email, String password){
        
        if(this.email.equals(email) && this.password.equals(password))
            return true;
        return false;
    }
    
    public String check(){
        String result ="";
        result += checkName();
        result += checkEmail();
        result += checkPassword();
        result += checkContactNo();
        return result;
    }
    
    public String checkName(){
        String result = "";
        char []c = name.toCharArray();
        if(name.isEmpty())
            result+="• Please don't left the name field empty\n";
        else
        for(char x: c){
            if(!Character.isAlphabetic(x) && !Character.isWhitespace(x))
                result+="• Please enter only alphabets for Name \n";
        }
        return result;
    }
    
    public String checkEmail(){
        String result = "";
        if (email.isEmpty()) {
            result += "• Please enter email \n";
        }
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email))) 
        {
            result += "• Please enter valid email \n";
        }
        
        return result;
    }
    
    public String checkPassword(){
        String result = "";
        
        if(password.isEmpty() || tempPass.isEmpty())
            result+= "• Please do not left the both of the password field empty\n";
        else if(!password.equals(tempPass))
            result+= "• Password and re enter Password was not the same\n";
            
        
        return result;
    }
    
    public String checkContactNo(){
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
}
