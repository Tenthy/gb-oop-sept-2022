package ru.kmetha.oop.homework1.task3;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        doSomething(square);
    }

    private static void doSomething(Shape shape) {
        shape.draw();
        shape.delete();
    }
}
