package org.example.mvc.model;

import org.example.exlist.ListStrategy;
import org.example.exlist.MyList;

import java.util.Observable;

public class MyListModel extends Observable {
    private MyList<Integer> list;

    public MyListModel() {
        // TODO: 03.10.2024 CODE HERE
    }

    public void addAction(Integer element) {
        // TODO: 03.10.2024 CODE HERE
    }

    public void removeAction() {
        // TODO: 03.10.2024 CODE HERE
    }

    public void changeStrategy(ListStrategy strategy) {
        // TODO: 03.10.2024 CODE HERE
    }

    public String stringList() {
        // TODO: 03.10.2024 CODE HERE
        return null;
    }
}