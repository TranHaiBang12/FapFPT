/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all.service.impl;

import all.model.Clss;
import all.model.StudentClass;
import all.repository.StudentClassRepository;
import all.service.StudentClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author acer
 */
@Service
public class StudentClassServiceImpl implements StudentClassService{
    
    @Autowired
    StudentClassRepository scr;



    @Override
    public Iterable<StudentClass> findByClss(Clss clss) {
        return scr.findByClss(clss);
    }
    
    
}
