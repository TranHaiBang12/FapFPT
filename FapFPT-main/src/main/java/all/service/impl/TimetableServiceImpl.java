/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all.service.impl;

import all.model.Timetable;
import all.repository.TimetableRepository;
import all.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Optional;

/**
 *
 * @author acer
 */
@Service
public class TimetableServiceImpl implements TimetableService{
    
    @Autowired
    TimetableRepository ttbRepository;

    @Override
    public Iterable<Timetable> findByWeek(Date d, Date s, int lecture) {
        return ttbRepository.findByWeek(d, s, lecture);
    }

    @Override
    public Optional<Timetable> findById(int id) {
        return ttbRepository.findById(id);
    }

    @Override
    public Iterable<Timetable> findAll() {
        return ttbRepository.findAll();
    }

    @Override
    public Timetable save(Timetable t) {
        return ttbRepository.save(t);
    }

    
}
