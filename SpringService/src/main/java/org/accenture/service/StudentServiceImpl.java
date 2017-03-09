package org.accenture.service;

import org.accenture.model.Student;
import org.accenture.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by antonio.meza.flores on 3/7/2017.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    @Transactional
    public Student save(Student student) {
        student = studentRepository.save(student);
        return student;
    }
}

