
package assgn.hooi;

/**
 *
 * @author Aphro97
 */
public interface LinkStackInt<T> {
    public boolean push(T newData);
    public T peek();
    public T pop();
    public boolean isEmpty();
    public boolean clear();
    public int size();
}
