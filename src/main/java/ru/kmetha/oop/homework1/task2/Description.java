package ru.kmetha.oop.homework1.task2;

/**
 * Описать ошибки в коде и предложить варианты оптимизации:
 */
public class Description {

    /*
    interface Moveable {
        void move();
    }
    interface Stopable {
        void stop();
    }
    //Два интерфейса можно объединить в один:
    interface Moveable {
        void move();
        void stop();
    }
     */


    /*
    //Соотвественно в классе LightWeightCar нужно так же реализовать метод stop()
    class LightWeightCar extends Car implements Moveable {
        @Override
        void open() {
            System.out.println("Car is open");
        }

        @Override
        public void move() {
            System.out.println("Car is moving");
        }

        @Override
        public void stop() {
            System.out.println("Car is stopped");
        }
    }
    */


    /*
    //В Java нет множественного наследования + интерфейсы не наследуются, а реализуются
    class Lorry extends Car, Moveable, Stopable {
        public void move(){
            System.out.println("Car is moving");
        }
        public void stop(){
            System.out.println("Car is stop");
        }
    }
     */
}
