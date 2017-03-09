package org.accenture.service;

import org.accenture.model.Student;

import java.util.List;

/**
 * Created by antonio.meza.flores on 3/7/2017.
 */
public interface StudentService {
    List<Student> findAll();
    Student save(Student student);
}
