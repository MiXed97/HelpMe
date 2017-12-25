
package assgn.hooi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aphro97
 */
public class LinkQueue<T> implements LinkQueueInt<T>{
    
    private node firstNode;
    //private node lastNode;
    private int entry;
    
    public LinkQueue(){
        firstNode = null;
        //lastNode = null;
        entry = 0;
    }
    @Override
    public boolean enqueue(T newData) {
        node newNode = new node(newData);
        if(isEmpty()){
            firstNode = newNode;
            //lastNode = newNode;
        }else{
            node currentNode = firstNode;
//            lastNode.next = newNode;
//            lastNode = newNode;
            while(currentNode.next!=null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        entry++;
        return true;
    }

    @Override
    public T dequeue() {
        T result = null;
        if(!isEmpty()){
            result = getFront();
            firstNode = firstNode.next;
            entry--;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null; 
    }

    @Override
    public boolean clear() {
        firstNode = null;
        //lastNode = null;
        entry = 0;
        return true;
    }

    @Override
    public int size() {
        return entry;
    }

    @Override
    public T getFront() {
        T result = null;
        if(!isEmpty()){
            result = (T)firstNode.data;
        }
        return result;
    }
    public static void main(String args[]) throws ParseException{
        LinkQueue<Order1> l = new LinkQueue();
        Order1 o;
        Order1 o1 = new Order1("OID01", "CID01", "2017/12/26 00:00:00", 2.50, "Delivered", "llol@hotmail.com", "A1");
        Order1 o2 = new Order1("OID02", "CID02", "2017/12/26 00:00:00", 25.50, "Delivered", "lol@hotmail.com", "A1");
        l.enqueue(o1);
        l.enqueue(o2);
        Order1 o3 = new Order1("OID03", "CID03", "2017/12/26 00:00:00", 15.50, "Order Placed", "llol@hotmail.com","A1");
        Order1 o4 = new Order1("OID04", "CID04", "2017/12/26 00:00:00", 12.50, "Order Placed", "lol@hotmail.com","A2");
        l.enqueue(o3);
        l.enqueue(o4);
        o = new Order1("oid05","cid05","2017/12/24 17:51:07",11.0,"Order Placed","1ol@hotmail.com","A1");
        l.sortedEnqueue(o);
//        o = new Order1("oid03","cid04","2017/12/24 17:52:46",8.0,"Order Placed","1ol@hotmail.com","A1");
//        l.sortedEnqueue(o);
//        o = new Order1("oid01","cid01","2017/12/25 00:00:00",2.5,"Order Placed","1ol@hotmail.com","A1");
//        l.sortedEnqueue(o);
//        o = new Order1("oid02","cid02","2017/12/25 00:00:00",25.5,"Order Placed","1ol@hotmail.com","A1");
//        l.sortedEnqueue(o);
        System.out.println("Size: "+l.size());
        o = l.get(0);
        System.out.println("First: "+o.getOrderID()+" , "+o.getCartID());
        o = l.get(1);
        System.out.println("Second: "+o.getOrderID()+" , "+o.getCartID());
        o = l.get(2);
        System.out.println("Third: "+o.getOrderID()+" , "+o.getCartID());
        o = l.get(3);
        System.out.println("Fourth: "+o.getOrderID()+" , "+o.getCartID());
        System.out.println(l.getOID());
        
        
    }

    @Override
    public T remove(int position) {
        T result = (T)firstNode.data;
        node currentNode = firstNode;
        if(position == 0){
            firstNode = firstNode.next;
        }else{
            for(int a = 0; a<position-1;a++){
                currentNode = currentNode.next;
            }
        }
        result = (T)currentNode.next.data;
        currentNode.next = currentNode.next.next;
        entry--;
        return result;
    }

    @Override
    public T getLast() {
        T result = null;
        node currentNode = firstNode;
        for(int a = 0; a<size()-1;a++){
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
        result = (T)currentNode.data;
        return result;
    }

    @Override
    public T get(int position) {
        T result = null;
        node currentNode = firstNode;
        
        
        for(int a = 0; a< position;a++){
            currentNode = currentNode.next;
        }
        result = (T)currentNode.data;
        return result;
    }

    @Override
    public boolean sortedEnqueue(Order1 newData) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date entryDate = dateFormat.parse(newData.getOrderDate());
            Date tempDate;
            node currentNode = firstNode;
            node newNode = new node(newData);
            Order1 order;
            boolean checker = false;
            //for(int a=0;a<entry;a++){
            if(isEmpty()){
                firstNode = newNode;
                entry++;
            }
            else{
                for(int a=0;a<entry;a++){
                    order = (Order1)currentNode.data;
                    tempDate = dateFormat.parse(order.getOrderDate());
                    if(entryDate.before(tempDate)){
                        if(a==0){
                            newNode.next = currentNode;
                            firstNode = newNode;
                            entry++;
                            checker = true;
                            break;
                        }else{
                            node preNode = firstNode;
                            for(int b=0;b<a-1;b++){
                                preNode = preNode.next;
                            }
                            newNode.next = currentNode;
                            preNode.next = newNode;
                            entry++;
                            checker = true;
                            break;
                        }                        
                    }else{
                        if(!checker && a==(entry-1)){
                            currentNode.next = newNode;
                            entry++;
                            break;
                        }
                        currentNode = currentNode.next;
                        
                    }
                }
            }
            
        } catch (ParseException ex) {
            
        }
        return true;
    }
    public String getOID(){
        String id = "";
        String oid = "OID";
        node currentNode = firstNode;
        Order1 o;
        o = (Order1)currentNode.data;
        id = o.getOrderID();
        int highest = Integer.parseInt(id.substring(3, id.length()));
        int temp = 0;
        while(currentNode.next != null){
            currentNode = currentNode.next;
            o = (Order1)currentNode.data;
            id = o.getOrderID();
            temp = Integer.parseInt(id.substring(3, id.length()));
            if(temp>highest)
                highest = temp;
        }
        if(highest < 10)
            oid+="0"+highest;
        else
            oid+=highest;
        return oid;
    }
    
}
