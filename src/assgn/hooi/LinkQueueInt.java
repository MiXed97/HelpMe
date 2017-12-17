
package assgn.hooi;
/**
 *
 * @author Aphro97
 */
public interface LinkQueueInt<T> {
    public boolean enqueue(T newData);
    public T dequeue();
    public boolean isEmpty();
    public boolean clear();
    public int size();
    public T getFront();
    
}
