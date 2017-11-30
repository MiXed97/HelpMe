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
public interface CustomerInterface {
    public String getName();
    public void setName(String name);
    public String getAddress();
    public void setAddress(String address);
    public String getContactNo();
    public void setContactNo(String contactNo);
    public String getEmail();
    public void setEmail(String email);
    public String getPassword();
    public void setPassword(String password);
    public boolean logIn(String email, String password);
}
