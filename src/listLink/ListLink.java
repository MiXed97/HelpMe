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
public class ListLink<T> implements ListLinkInt<T>{

    node firstNode;
    node lastNode;
    int size = -1;

    @Override
    public boolean add(T newEntry) {
        node n = new node(newEntry);
        if(size == -1){
            firstNode = n;
            lastNode = n;
        }else{

            node pre = getPre();
            n.setPre(pre);
            pre.setNext(n);
            lastNode = n;
            
        }
        
        size++;
        return true;
    }

    @Override
    public boolean add(int newPosition, T newEntry) {
        
        node entry = new node(newEntry);
        node cur = getIndex(newPosition);
        
        node pre = cur.getPre();
        node next = cur.getNext();
        
        if(pre!= null){
        pre.setNext(entry);
        entry.setPre(pre);
        }
        
        if(next != null){
        next.setPre(entry);
        entry.setNext(next);
        }
        
        return true;
    }

    @Override
    public T remove(int givenPosition) {
        
        node n = firstNode;
        node next;
        node pre;
        
        if(size >= 0){
        
        if(givenPosition == 1){
            next = n.getNext();
            firstNode = next;
        }
        else{
        int avg = (size+1)/2;
            if(avg <= givenPosition){
                for(int i = 0; i< givenPosition-1;i++){
                    n = n.getNext();
                }
            }
            else{
                n = lastNode;
                for(int i = 0; i< givenPosition-1;i++){
                    n = n.getPre();
                }
            }
            next = n.getNext();
            pre = n.getPre();
            
            pre.setNext(next);
            if(next != null)
                next.setPre(pre);
        }
        
        size--;
        return (T)n.getData();
        }
        else{
            System.out.println("No more element");
        }
        
        return null;
    }

    @Override
    public T get(int index) {
        
        node n = firstNode;
        
        
        for(int i = 0; i< index-1;i++){
            n = n.getNext();
        }
        
        return (T)n.getData();
    }

    @Override
    public int getSize() {
        return size+1;
    }

    @Override
    public node getPre(){
        node cur = firstNode;
                           //1
        for(int i = 0; i < size;i++)
            cur = cur.getNext();
        
        return cur;
    }

    @Override
    public node getNode(int index) {
        node n = firstNode;
        for(int i =0; i < index-1;i++){
            n = n.getNext();
        }
        return n;
    }
    
    @Override
    public node getLastNode(){
        return lastNode;
    }
    
    @Override
    public node getFirstNode(){
        return firstNode;
    }
    
    public node getIndex(int index){
        node n = firstNode;
        for(int i =0; i < index-1;i++){
            n = n.getNext();
        }
        return n;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = -1;
    }
}
