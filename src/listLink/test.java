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
         ListLinkInt<String> temp = new ListLink<>();
         temp.add("123");
         temp.add("456");
   //      temp.add("789");
     //    temp.add("753");
      //   temp.add("159");
       //  temp.add("852");
        
        temp.remove(2);
        temp.add("hello");
        for(int i = 1;i<= temp.getSize();i++){
            System.out.println(temp.get(i));
        }
        
        
        
         System.out.println(temp.getSize());
        
    }
    
    public static ListLinkInt<String> sortPrice(ListLinkInt<String> s){
        ListLinkInt<String> a = s;
        ListLinkInt<String> temp = new ListLink<>();
        //add getPrice()
        double small = Double.parseDouble(a.get(1));
        int remove = 0;
        while(a.getSize()!=0){
            
            for(int i = 1;i <= a.getSize();i++){
                if(small >= Double.parseDouble(a.get(i))){
                    small = Double.parseDouble(a.get(i));
                    remove = i;
                }
            }
            
            
            temp.add(a.get(remove));
            a.remove(remove);
            if(a.getSize()!=0)
                small = Double.parseDouble(a.get(1));
        }
        return temp;
    }
    
    public static void sortMenu(){
        
    }
    
    
    public static int getMenuNum(String s){
        int result = 0;
        
        char []c = s.toCharArray();
        String num = "";
        int index = c.length-1;
        while(c[index] != 'F'){
            
            num+=c[index];
            index--;
        }
        num = new StringBuilder(num).reverse().toString();
        result = Integer.parseInt(num);
        return result;
    }   
    
    
    
    
}
