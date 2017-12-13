/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listLink;

import java.sql.*;

/**
 *
 * @author Mixed_97
 */
public class test {
    
    public static void main(String args[]) throws SQLException{
        student s1 = new student("Nicholas", "123");
        student s2 = new student("Ng Poh hooi", "456");
        student s3 = new student("Soon Jian Kai","789");
        ListLinkInt<student> s = new ListLink<>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        
       store sto = new store();
       
       sto.setStud(s);
       
       System.out.println(sto.getStud().get(1).getName());
        
    }
    
    
    
    
}
