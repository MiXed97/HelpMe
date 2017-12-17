
package assgn.hooi;

/**
 *
 * @author Aphro97
 */
public class LinkStack<T> implements LinkStackInt<T> {
    
    node topNode;
    int entry;
    
    public LinkStack(){
        topNode = null;
        entry = 0;
    }
    @Override
    public boolean push(T newData) {
        node newNode = new node(newData);
        if(isEmpty()){
            topNode = newNode;
        }else{
            newNode.next = topNode;
            topNode = newNode;
        }
        entry++;
        return true;
    }

    @Override
    public T peek() {
        T result = null;
        if(!isEmpty()){
            result = (T)topNode.data;
        }
        return result;
    }

    @Override
    public T pop() {
        T result = null;
        if(!isEmpty()){
            result = peek();
            topNode = topNode.next;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return entry == 0;
    }

    @Override
    public boolean clear() {
        topNode = null;
        entry = 0;
        return true;
    }

    @Override
    public int size() {
        return 1;
    }
//    public static void main(String args[]){
//        LinkStack<String> l = new LinkStack();
//        l.push("First");
//        l.push("Second");
//        l.push("3");
//        l.push("4");
//        l.push("5");
//        System.out.println(l.peek());
//        System.out.println(l.isEmpty());
//        System.out.println(l.pop());
//        System.out.println(l.pop());
//        System.out.println(l.peek());
//        System.out.println(l.peek());
//    }
}
