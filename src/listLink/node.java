/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listLink;

/**
 *
 * @author Mixed_97
 */
public class node<T> {
    T data;
    node next;
    node pre;

    public node(){}
    
    public node(T data){
        this.data= data;
        this.next = null;
        this.pre = null;
    }
    
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public node getNext() {
        return next;
    }

    public void setNext(node next) {
        this.next = next;
    }

    public node getPre() {
        return pre;
    }

    public void setPre(node pre) {
        this.pre = pre;
    }
    
}
