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
public interface ArrayListInterface <T>{
    
    public boolean add(T element);
    public boolean remove(T element);
    public boolean isEmpty(T element);
    public void doubleArray();
    public int size();
    public T get(int index);
    public String toString();
}
