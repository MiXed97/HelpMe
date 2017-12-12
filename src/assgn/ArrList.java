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
public class ArrList<T> implements ArrayListInterface{

    T[] List;
    int length = -1;
    static int initializeSize = 25;
    
    
    
    public ArrList(){
        this.List = (T[]) new Object[initializeSize];
    }
    
    
    @Override
    public boolean add(Object element) {
       if(List.length == (length+1))
           doubleArray();
       length++;
       List[length] =(T) element;
       return true;
    }

    @Override
    public boolean remove(Object element) {
        
        int delete;
        for(int i = 0; i <= length;i++){
        if(element.equals(List[i])){
            delete = i;
            fillGap(delete);
            length--;
            break;
            }
        }
        return true;
    }

    @Override
    public boolean isEmpty(Object element) {
        if(length == -1)
            return true;
        return false;
    }

    @Override
    public void doubleArray() {
        
        T[] curr = List;
        List = (T[])new Object[2*curr.length];
        List = curr;
    }

    @Override
    public int size() {
        return (length +1);
    }

    @Override
    public T get(int index) {
            return List[index];
    }


    public void fillGap(int delete) {
        
        for(int i=delete;i <= length;i++){
            List[i]= List[i+1];
        }
            
        
    }
    
}
