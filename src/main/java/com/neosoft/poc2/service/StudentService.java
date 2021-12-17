package com.neosoft.poc2.service;

import com.neosoft.poc2.exception.StudentNotFoundException;
import com.neosoft.poc2.model.Student;
import com.neosoft.poc2.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Transactional
    public Student create(Student student) {
        return studentRepo.save(student);
    }

    @Transactional
    public Student getStudent(Integer id) {
        return studentRepo.findById(id).orElseThrow(() ->
                new StudentNotFoundException("User with id " + id + " does not exist"));
    }

    @Transactional
    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

}
