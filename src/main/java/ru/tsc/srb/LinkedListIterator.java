package ru.tsc.srb;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListIterator {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }

        ListIterator<Integer> it = list.listIterator(list.size());

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
