package listLink;

public interface JKLLI<T> {
    
    public boolean add(T newNode);
    public boolean add(int newPosition, T newEntry);
    public boolean remove(int index);
    public boolean isEmpty();
    public T get(int index);
    public int getSize();
    public void clear();
    
}
