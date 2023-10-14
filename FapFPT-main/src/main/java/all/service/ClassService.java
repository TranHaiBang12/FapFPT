/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all.service;

import all.model.Clss;

import java.util.Optional;

/**
 *
 * @author acer
 */
public interface ClassService {
    public Optional<Clss> findById(int classID);
}
