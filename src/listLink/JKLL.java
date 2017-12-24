package listLink;

public class JKLL<T> implements JKLLI<T>{

    node<T> firstNode;
    int size = 0;
    
    @Override
    public boolean add(T newNode) {
        node<T> currNode = new node(newNode);
        if(isEmpty()){
            firstNode = currNode;
        }
        else{
            node<T> lastNode = getLatest();
            lastNode.setNext(currNode);
        }
        size++;
        return true;
    }
    
    public boolean add(int newPosition, T newEntry) {
        
        boolean updatetry = true;
        
        if (newPosition > 0) {
            node thefirst = firstNode;
            for (int i = 1; i < newPosition ; i++) {
                thefirst = thefirst.getNext();
            }
            thefirst.setData(newEntry);
        }
        else
        {
            updatetry = false;
        }
        
        return updatetry;
    }
    
    public node getIndex(int index){
        node n = firstNode;
        for(int i =1; i < index;i++){
            n = n.getNext();
        }
        return n;
    }

    @Override
    public boolean remove(int index) {
        if(firstNode != null){
            node<T> be4Node = getBefore(index);
            node<T> currNode = getElement(index);
            if(currNode== firstNode){
                firstNode = currNode.getNext();
            }
            else{
                be4Node.setNext(currNode.getNext());
            }
        
            size--;
        }
        return true;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0)
            return true;
        else 
            return false;
    }
    
    public void clear() {
        firstNode = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        T result;
        result = getElement(index).getData();
        
        return result;
    }
     
    public node<T> getLatest() {
       
        node<T> c = firstNode;
        
        for(int i =0;i<size-1;i++){
           c = c.getNext();
        }
        return c;
    }
    
    public node<T> getBefore(int index){
        node<T> c = firstNode;
        for(int i = 0; i < index-2;i++){
            c = c.getNext();
        }
        return c;
    }
    
    public node<T> getElement(int index){
        node<T> c = firstNode;
        
        for(int i=1;i<index;i++)
        {
            c = c.getNext();
        }
        return c;
    }

    @Override
    public int getSize() {
        return size;
    }
}
