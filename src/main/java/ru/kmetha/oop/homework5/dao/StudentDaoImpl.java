package ru.kmetha.oop.homework5.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import ru.kmetha.oop.homework5.entity.Student;
import ru.kmetha.oop.homework5.factory.HibernateSessionFactoryUtil;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public Student findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Student.class, id);
    }

    @Override
    public List<Student> findAll() {
        return (List<Student>) HibernateSessionFactoryUtil.getSessionFactory().openSession()
                .createQuery("FROM Student").list();
    }

    @Override
    public void save(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(student);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(Student student) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(student);
        transaction.commit();
        session.close();
    }
}
