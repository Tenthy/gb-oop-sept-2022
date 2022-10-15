package ru.kmetha.oop.homework5.dao;

import ru.kmetha.oop.homework5.entity.Student;

import java.util.List;

public interface StudentDao {

    Student findById(int id);

    List<Student> findAll();

    void save(Student student);

    void update(Student student);

    void delete(Student student);
}
