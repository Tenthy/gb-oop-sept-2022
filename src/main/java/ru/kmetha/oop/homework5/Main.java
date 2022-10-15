package ru.kmetha.oop.homework5;

import ru.kmetha.oop.homework5.entity.Student;
import ru.kmetha.oop.homework5.service.StudentService;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        StudentService studentService = new StudentService();

        Student student1 = Student.builder().name("Pavel").mark(4).build();
        Student student2 = Student.builder().name("Andrey").mark(4).build();
        Student student3 = Student.builder().name("Mikhail").mark(3).build();
        Student student4 = Student.builder().name("Ekaterina").mark(5).build();
        Student student5 = Student.builder().name("Dariya").mark(4).build();

        studentService.save(student1);
        studentService.save(student2);
        studentService.save(student3);
        studentService.save(student4);
        studentService.save(student5);

        student2.setMark(5);
        studentService.update(student2);
        student4.setMark(4);
        studentService.update(student4);
    }
}
