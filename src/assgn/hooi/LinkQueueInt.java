
package assgn.hooi;

import java.util.Date;

/**
 *
 * @author Aphro97
 */
public interface LinkQueueInt<T> {
    public boolean enqueue(T newData);
    public T dequeue();
    public T remove(int position);
    public T get(int position);
    public boolean isEmpty();
    public boolean clear();
    public int size();
    public T getLast();
    public T getFront();
    public boolean sortedEnqueue(Order1 newData);
}
