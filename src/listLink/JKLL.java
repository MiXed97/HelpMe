package listLink;

public class JKLL<T> implements JKLLI<T>{

    node firstNode;
    int size = 0;
    
    @Override
    public boolean add(T newNode) {
        node currNode = new node(newNode);
        if(isEmpty()){
            firstNode = currNode;
        }
        else{
            node lastNode = getLatest();
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
    

    @Override
    public boolean remove(int index) {
        if(firstNode != null){
            node be4Node = getBefore(index);
            node currNode = getElement(index);
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
        result = (T) getElement(index).getData();
        
        return result;
    }
     
    public node getLatest() {
       
        node c = firstNode;
        
        for(int i =0;i<size-1;i++){
           c = c.getNext();
        }
        return c;
    }
    
    public node getBefore(int index){
        node c = firstNode;
        for(int i = 0; i < index-2;i++){
            c = c.getNext();
        }
        return c;
    }
    
    public node getElement(int index){
        node c = firstNode;
        
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
