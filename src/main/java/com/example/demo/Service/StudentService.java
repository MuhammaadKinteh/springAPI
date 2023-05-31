package com.example.demo.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collection;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public Collection<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Optional<Student> getStudent(@PathVariable Integer id){
        return studentRepository.findById(id);
    }
    public String addStudent(@RequestBody Student student){
        studentRepository.save(student);
        return "student added succesfuly";
    }

}
