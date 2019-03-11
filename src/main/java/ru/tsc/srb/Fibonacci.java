package ru.tsc.srb;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(fib(n));
    }

    public static int fib(int i) {
        if (i == 1) {
            return 1;
        } else if (i == 2) {
            return 1;
        } else {
            return fib(i - 1) + fib(i - 2);
        }
    }
}
