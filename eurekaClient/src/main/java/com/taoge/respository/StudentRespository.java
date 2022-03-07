package com.taoge.respository;

import com.taoge.entity.Student;

import java.util.Collection;

public interface StudentRespository {
    Collection<Student> findAll();
    Student findById(Integer id);
    void deleteById(Integer id);
    void saveOrUpdate(Student student);
}
