/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listLink;

/**
 *
 * @author Mixed_97
 */
public class sort {
    
    static ListLinkInt<String> a = new ListLink<>();
    ListLinkInt<String> c = new ListLink<>();
     
    public void sort(ListLinkInt<String> b){
        
        double temp;
        double leftValue;
        double rightValue;
        if(b.getSize()!=1){
        // only one  no nid sort
            if(findEven(b)){
                //Even  
                int left = b.getSize()/2;
                int right = left+1;
                
                do{
                    // keep minus left side since both side is even jor
                    
                    if(Double.parseDouble(b.get(left)) > Double.parseDouble(b.get(right)))
                        
                    
                    
                    //keep out the code below
                    left--;
                }while(left > 1);
            }
            else{
                //ODD
            }
        }
        else{
            //do sort only for 1 item;
            c = a;
        }
    }
    
    public static boolean findEven(ListLinkInt<String> b){
        return b.getSize()%2 == 0;
    }
    
    
    public static void main(String args[]){
     
        a.add("4.5");
        a.add("6.5");
        a.add("45.3");
        a.add("8.8");
        
       
        System.out.println();
        
        
        
    }
}
