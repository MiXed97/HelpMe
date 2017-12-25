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
public interface ListLinkInt<T> {
    
public boolean add(T newEntry);
  
  public boolean add(int newPosition, T newEntry);
  
  public T remove(int givenPosition);

  public T get(int index);
  
  public int getSize();
   
   public void clear();
   
   public boolean isEmpty();
   
   public void inBetween(int index, T newEntry);
}
