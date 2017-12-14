/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listLink;

import assgn.JianKai.MenuClass;
import assgn.JianKai.aff;
import java.sql.*;

/**
 *
 * @author Mixed_97
 */
public class test {
    
    public static void main(String args[]) throws SQLException{
        student s1 = new student("Nicholas", "123");
        student s2 = new student("Ng Poh hooi", "456");
        student s3 = new student("Kurumi","789");
        ListLinkInt<student> s = new ListLink<>();
        //s.add(s1);
        //s.add(s2);
        //s.add(s3);
        
        ListLinkInt<aff> affiliate = new ListLink<>();
        aff a1 = new aff("A1","Namess", "Password","IC", "0122222222","email@","mamak", "pv setapak","41200","Local Cuisine");
        aff a2 = new aff("A2","Namezz", "Password","IC", "0122222222","email@","momok", "pv setapak","41200","Local Cuisine");
        aff a3 = new aff("A3","Namejj", "Password","IC", "0122222222","email@","mumuk", "pv setapak","41200","Local Cuisine");
        affiliate.add(a1);
        affiliate.add(a2);
        affiliate.add(a3);

       store sto = new store();
       store stoaff = new store();
       
       sto.setResname(affiliate);
       stoaff.setAffID(affiliate);

       System.out.println(sto.getResname().get(2).getResname());
       System.out.println(stoaff.getAffID().get(1).getAID());
    } 
}
