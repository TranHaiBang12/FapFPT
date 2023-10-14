/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all.service.impl;

import all.model.Student;
import all.repository.StudentRepository;
import all.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 *
 * @author acer
 */
@Service
public class StudentServiceImpl implements StudentService{
    
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Optional<Student> findByStudentID(int studentID) {
        return studentRepository.findByStudentID(studentID);
    }
    
}
