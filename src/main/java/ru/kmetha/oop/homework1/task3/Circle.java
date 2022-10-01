package ru.kmetha.oop.homework1.task3;

public class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Draw a circle");
    }

    @Override
    void delete() {
        System.out.println("Remove a circle");
    }
}
