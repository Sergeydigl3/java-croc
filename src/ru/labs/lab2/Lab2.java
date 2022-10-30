package ru.labs.lab2;

public class Lab2{

    public static void main(String[] args) {
        // read the input as ints
        int start_from = Integer.parseInt(args[0]);
        int difference = Integer.parseInt(args[1]);
        int count = Integer.parseInt(args[2]);

        int result = 0;
        int x = start_from;
        for (int i = 0; i < count; i++) {
            result += x;
            x += difference;
        }

        System.out.println(result);
    }

}