package ru.labs.Lab3;

public class Lab3{

    static class Point {
        double x;
        double y;
    }

    public static void main(String[] args) {
        // read the input as ints
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        p1.x = Double.parseDouble(args[0]);
        p1.y = Double.parseDouble(args[1]);
        p2.x = Double.parseDouble(args[2]);
        p2.y = Double.parseDouble(args[3]);
        p3.x = Double.parseDouble(args[4]);
        p3.y = Double.parseDouble(args[5]);

        // calculate the area by Geron's formula
        double a = Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
        double b = Math.sqrt(Math.pow(p2.x - p3.x, 2) + Math.pow(p2.y - p3.y, 2));
        double c = Math.sqrt(Math.pow(p3.x - p1.x, 2) + Math.pow(p3.y - p1.y, 2));
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        double p = (a + b + c) / 2;
        System.out.println(p);
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(area);
    }
}