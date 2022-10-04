package ru.kmetha.oop.homework1.task3;

public class Triangle extends Shape {

    @Override
    void draw() {
        System.out.println("Draw a triangle");
    }

    @Override
    void delete() {
        System.out.println("Remove a triangle");
    }
}
