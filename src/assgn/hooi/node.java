package assgn.hooi;

/**
 *
 * @author Aphro97
 */
public class node<T> {

    T data;
    node next;

    public node() {}
    public node(T data) {
        this.data = data;
        this.next = null;
    }
}
