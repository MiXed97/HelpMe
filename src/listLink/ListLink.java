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

    node<T> firstNode;
    int size = 0;
    
    @Override
    public boolean add(T newNode) {
        node<T> currNode = new node(newNode);
        if(isEmpty()){
            firstNode = currNode;
        }
        else{
            node<T> lastNode = getLatest();
            lastNode.setNext(currNode);
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(int index) {
        if(firstNode != null){
            node<T> be4Node = getBefore(index);
            node<T> currNode = getElement(index);
            if(currNode== firstNode){
                firstNode = currNode.getNext();
            }
            else{
                be4Node.setNext(currNode.getNext());
            }
        
            size--;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0)
            return true;
        else 
            return false;
    }

    @Override
    public T get(int index) {
        T result;
        result = getElement(index).getData();
        
        return result;
    }
     
    public node<T> getLatest() {
       
        node<T> c = firstNode;
        
        for(int i =0;i<size-1;i++){
           c = c.getNext();
        }
        return c;
    }
    
    public node<T> getBefore(int index){
        node<T> c = firstNode;
        for(int i = 0; i < index-2;i++){
            c = c.getNext();
        }
        return c;
    }
    
    public node<T> getElement(int index){
        node<T> c = firstNode;
        
        for(int i=1;i< index;i++)
        {
            c = c.getNext();
        }
        return c;
    }
    
    public int getSize(){
        return size;
    }
}
