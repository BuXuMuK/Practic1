package org.example.exlist;

public class MyList<T> {
    private MyNode<T> head;
    private int size;

    private final ListStrategy<T> strategy;

    public MyList(ListStrategy<T> strategy) {
        this.strategy = strategy;
    }

    public void add(T element){
        MyNode<T> newNode = new MyNode<>(element);
        if (head != null) {
            head = strategy.add(head, newNode);
        } else {
            head = newNode;
        }
        size++;

    }
    public void remove(){

        if (head != null) {
            strategy.remove(head);
        }
        size--;

    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        MyNode<T> inter = head;
        while (inter != null) {
            sb.append(inter.getValue());
            sb.append(" ");
            inter = inter.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}