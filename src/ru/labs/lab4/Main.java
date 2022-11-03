package ru.labs.lab4;

abstract class Figure {
    int x1;
    int y1;

    public Figure(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public abstract String toString();
}

class Circle extends Figure {
    int radius;

    public Circle(int x1, int y1, int radius) {
        super(x1, y1);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: (" + x1 + ", " + y1 + "), " + radius;
    }
}

class Rectangle extends Figure {
    int x2;
    int y2;

    public Rectangle(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "Rectangle (" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")";
    }
}

class Annotation {
    String sign;
    Figure figure;

    public Annotation(String sign, Figure figure) {
        this.sign = sign;
        this.figure = figure;
    }

    @Override
    public String toString() {
        return figure.toString() + ": " + sign;
    }
}

class AnnotatedImage {
    private final String imagePath;
    private final Annotation[] annotations;

    public AnnotatedImage(String imagePath, Annotation[] annotations) {
        this.imagePath = imagePath;
        this.annotations = annotations;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Annotation[] getAnnotations() {
        return annotations;
    }

    @Override
    public String toString() {
        String result = "Image: " + imagePath + "\n" + "Annotations:\n";
        for (Annotation annotation : annotations) {
            result += "\t" + annotation.toString() + "\n";
        }
        return result;
    }
}

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(1, 2, 3);
        Rectangle rectangle = new Rectangle(1, 2, 3, 4);

        Annotation annotation1 = new Annotation("Loh", circle);
        Annotation annotation2 = new Annotation("Ne loh", rectangle);
        Annotation[] annotations = {annotation1, annotation2};
        AnnotatedImage im = new AnnotatedImage("C:/Games", annotations);
        
        System.out.println(im.toString());
    }

}
