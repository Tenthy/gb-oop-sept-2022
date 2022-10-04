package ru.kmetha.oop.homework1.task3;

public class Square extends Shape {

    @Override
    void draw() {
        System.out.println("Draw a square");
    }

    @Override
    void delete() {
        System.out.println("Remove a square");
    }
}
