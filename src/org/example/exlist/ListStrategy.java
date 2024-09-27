package org.example.exlist;

public interface ListStrategy<T> {
    MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode);
    void remove(MyNode<T> head);

}
