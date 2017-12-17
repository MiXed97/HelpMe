
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
        l.enqueue("First");
        l.enqueue("Second");
        l.enqueue("3");
        l.enqueue("4");
        l.enqueue("5");
        l.enqueue("6");
        l.enqueue("7");
        l.enqueue("8");
        System.out.println(l.getFront());
        l.enqueue("First2");
        while(l.size()!=0){
            System.out.println(l.dequeue());
        }
    }
}
