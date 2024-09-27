package org.example.exlist;

public class MyNode<T> {
    private final T value;

    public T getValue() {
        return value;
    }
    public void setValue(MyNode<T> next){
        this.next=next;
    }
    public void setNext(MyNode<T> next) {
     this.next=next;
    }

    MyNode<T> next;
    public MyNode(T value){
        this.value = value;
    }
}
