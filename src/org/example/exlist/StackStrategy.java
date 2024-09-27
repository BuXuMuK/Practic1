package org.example.exlist;

public class StackStrategy<T> implements ListStrategy<T> {
    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newNode) {
        newNode.setNext(head);
        return newNode;
    }

    public void remove(MyNode<T> head) {


        MyNode<T> removed = head.next;
        head.setNext(null);

    }

}

