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
public interface JKLLI<T> {
    
    public boolean add(T newNode);
    public boolean add(int newPosition, T newEntry);
    public boolean remove(int index);
    public boolean isEmpty();
    public T get(int index);
    public int getSize();
    public void clear();
    
}
