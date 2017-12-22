
package assgn.hooi;
/**
 *
 * @author Aphro97
 */
public class LinkQueue<T> implements LinkQueueInt<T>{
    
    private node firstNode;
    private node lastNode;
    private int entry;
    
    public LinkQueue(){
        firstNode = null;
        lastNode = null;
        entry = 0;
    }
    @Override
    public boolean enqueue(T newData) {
        node newNode = new node(newData);
        if(isEmpty()){
            firstNode = newNode;
            lastNode = newNode;
        }else{
            lastNode.next = newNode;
            lastNode = newNode;
        }
        entry++;
        return true;
    }

    @Override
    public T dequeue() {
        T result = null;
        if(!isEmpty()){
            result = getFront();
            firstNode = firstNode.next;
            entry--;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return firstNode == null; 
    }

    @Override
    public boolean clear() {
        firstNode = null;
        lastNode = null;
        entry = 0;
        return true;
    }

    @Override
    public int size() {
        return entry;
    }

    @Override
    public T getFront() {
        T result = null;
        if(!isEmpty()){
            result = (T)firstNode.data;
        }
        return result;
    }
    public static void main(String args[]){
        LinkQueue<String> l = new LinkQueue();
        l.enqueue("1");
        l.enqueue("2");
        l.enqueue("3");
        l.enqueue("4");
        l.enqueue("5");
        l.enqueue("6");
        l.enqueue("7");
        l.enqueue("8");
        l.enqueue("9");
        l.remove(4);
        System.out.println("Size"+l.size());
        System.out.println("Last "+l.getLast());
        System.out.println("Getting :"+l.get(3));
        while(l.size()!=0){
            System.out.println(l.dequeue());
        }
        
        
    }

    @Override
    public T remove(int position) {
        T result = (T)firstNode.data;
        node currentNode = firstNode;
        if(position == 0){
            firstNode = firstNode.next;
        }else{
            for(int a = 0; a<position-1;a++){
                currentNode = currentNode.next;
            }
        }
        result = (T)currentNode.next.data;
        currentNode.next = currentNode.next.next;
        entry--;
        return result;
    }

    @Override
    public T getLast() {
        T result = null;
        node currentNode = firstNode;
        for(int a = 0; a<size()-1;a++){
            currentNode = currentNode.next;
        }
        result = (T)currentNode.data;
        return result;
    }

    @Override
    public T get(int position) {
        T result = null;
        node currentNode = firstNode;
        
        
        for(int a = 0; a< position;a++){
            currentNode = currentNode.next;
        }
        result = (T)currentNode.data;
        return result;
    }
    
    
}
