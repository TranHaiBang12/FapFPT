/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all.service;

import all.model.Clss;
import all.model.StudentClass;

/**
 *
 * @author acer
 */
public interface StudentClassService {
    public Iterable<StudentClass> findByClss(Clss clss);
}
