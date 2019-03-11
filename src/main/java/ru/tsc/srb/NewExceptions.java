package ru.tsc.srb;

public class NewExceptions {

    public static void main(String[] args) {
        System.out.println(getNumber());
    }

    public static int getNumber() {
        int i = 6;

        try {
            if (i == 6) {
                throw new Exception();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
        return i;
    }
}
