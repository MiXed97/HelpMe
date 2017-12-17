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
  
  public node getPre();
  
  public node getNode(int index);
  
   public node getLastNode();
   
   public node getFirstNode();
   
   public void clear();
}
