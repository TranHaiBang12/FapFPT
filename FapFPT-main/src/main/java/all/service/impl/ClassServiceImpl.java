/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all.service.impl;

import all.model.Clss;
import all.repository.ClassRepository;
import all.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 *
 * @author acer
 */
@Service
public class ClassServiceImpl implements ClassService{
    
    @Autowired
    ClassRepository classRepository;

    @Override
    public Optional<Clss> findById(int classID) {
        return classRepository.findById(classID);
    }
    
}
