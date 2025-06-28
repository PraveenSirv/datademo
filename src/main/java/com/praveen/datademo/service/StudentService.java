package com.praveen.datademo.service;

import com.praveen.datademo.model.Student;
import com.praveen.datademo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;


    public List<Student> getStudents() {
        return studentRepo.findAll();
    }

    public Student getStudent(int sId) {
        return studentRepo.findById(sId).orElse(new Student());
    }

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public void updateStudent(Student student) {
        studentRepo.save(student);
    }

    public void deleteStudent(int sId) {
        studentRepo.deleteById(sId);
    }
}

//@Service is a Spring annotation used to mark a class as a service layer
// component — a class that contains business logic.
//Purpose:
//Identifies a class as part of the service layer (sits between controller and DAO/repository).
//Helps Spring auto-detect and manage it as a bean via component scanning.
//Makes the class eligible for features like:
//Dependency injection
//Transactional support (@Transactional)
//AOP (aspect-oriented programming, e.g., logging, security)