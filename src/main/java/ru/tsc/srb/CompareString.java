package ru.tsc.srb;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CompareString {

    public static void main(String[] args) {

        Comparator<Person> personComparator = (o1, o2) -> {
            int resultCompare = o1.getFirstName().compareTo(o2.getFirstName());
            if (resultCompare == 0) {
                return o1.getLastName().compareTo(o2.getLastName());
            } else {
                return resultCompare;
            }
        };

        Set<Person> set = new TreeSet<>(personComparator);

        set.add(new Person("Vasya", "Ivanov"));
        set.add(new Person("Petr", "Volnov"));
        set.add(new Person("Aleksandr", "Kirov"));
        set.add(new Person("Petr", "Vetrov"));
        set.add(new Person("Aleksandr", "Bokov"));

        System.out.println(set);
    }
}