package ru.kmetha.oop.homework5.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import ru.kmetha.oop.homework5.dao.StudentDaoImpl;
import ru.kmetha.oop.homework5.entity.Student;

import java.util.List;

@NoArgsConstructor
public class StudentService {

    private final StudentDaoImpl studentDaoImpl = new StudentDaoImpl();

    public Student findById(int id) {
        return studentDaoImpl.findById(id);
    }

    public List<Student> findAll() {
        return studentDaoImpl.findAll();
    }

    public void save(Student student) {
        studentDaoImpl.save(student);
    }

    public void update(Student student) {
        studentDaoImpl.update(student);
    }

    public void delete(Student student) {
        studentDaoImpl.delete(student);
    }
}
