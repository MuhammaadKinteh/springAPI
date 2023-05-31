package com.example.demo.Controller;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }


    @GetMapping("/student/{id}")
    public Optional<Student> getStudent(@PathVariable Integer id){
        return studentService.getStudent(id);
    }


    @PostMapping("/student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

}
