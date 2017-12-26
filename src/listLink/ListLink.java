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
public class ListLink<T> implements ListLinkInt<T> {

    node firstNode;
    node lastNode;
    int size = -1;

    @Override
    public boolean add(T newEntry) {
        node n = new node(newEntry);
        if (size == -1) {
            firstNode = n;
            lastNode = n;
        } else {

            node pre = lastNode;
            n.setPre(pre);
            pre.setNext(n);
            lastNode = n;

        }

        size++;
        return true;
    }

    @Override
    public boolean add(int position, T newEntry) {
        if (position >= 1 && position <= getSize()) {

            node entry = new node(newEntry);
            node cur = getNode(position);

            node pre = cur.getPre();
            node next = cur.getNext();

            if (pre != null) {
                pre.setNext(entry);
                entry.setPre(pre);
            }

            if (next != null) {
                next.setPre(entry);
                entry.setNext(next);
            }

            if (position == 1) {
                firstNode = entry;
            } else if (position == getSize()) {
                lastNode = entry;
            }
        } else {
            return false;
        }
        return true;
    }

    @Override
    public T remove(int position) {

        node n = firstNode;
        node next;
        node pre;

        if (size >= 0 && position <= getSize() && position >= 1) {

            if (position == 1) {
                next = n.getNext();
                firstNode = next;
            } else {
                int avg = (size + 1) / 2;
                if (avg >= position) {
                    for (int i = 0; i < position - 1; i++) {
                        n = n.getNext();
                    }
                } else {
                    n = lastNode;
                    position = (size+1)- position;
                    for (int i = 0; i < position; i++) {
                        n = n.getPre();
                    }
                }
                next = n.getNext();
                pre = n.getPre();

                pre.setNext(next);
                if (next != null) {
                    next.setPre(pre);
                }
            }

            size--;
            return (T) n.getData();
        } else {
            System.out.println("Element doesn't exist");
        }

        return null;
    }

    @Override
    public T get(int index) {

        if (size >= 0 && index >= 1 && index <= getSize()) {
            node n = firstNode;

            for (int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }

            return (T) n.getData();
        }
        return null;
    }

    @Override
    public int getSize() {
        return size + 1;
    }

    public node getNode(int index) {
        node n = firstNode;
        for (int i = 0; i < index - 1; i++) {
            n = n.getNext();
        }
        return n;
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
        size = -1;
    }

    @Override
    public boolean isEmpty() {
        if (size == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void inBetween(int index, T newEntry) {

        node next = getNode(index);
        node entry = new node(newEntry);
        node pre = next.getPre();
        pre.setNext(entry);
        next.setPre(entry);
        entry.setNext(next);
        entry.setPre(pre);

        size++;
    }
}
