package ru.tsc.srb;

import java.util.HashSet;
import java.util.Set;

public class HasSetSample {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add(null);
        System.out.println(set.size());
    }
}
