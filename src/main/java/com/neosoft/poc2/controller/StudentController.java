package com.neosoft.poc2.controller;

import com.neosoft.poc2.model.Student;
import com.neosoft.poc2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/create")
    public ResponseEntity<Student> create(@Valid @RequestBody Student student) {
        return new ResponseEntity<Student>(studentService.create(student), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id){
        return new ResponseEntity<Student>(studentService.getStudent(id), HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<List<Student>>(studentService.getAllStudents(), HttpStatus.OK);
    }


}
