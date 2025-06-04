package com.example.student_management_system.service;

import com.example.student_management_system.entity.Student;
import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    void saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> searchByName(String name);
    List<Student> filterByClass(String studentClass);
}