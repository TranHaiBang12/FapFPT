/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package all.model;

import com.fasterxml.jackson.annotation.JsonView;
import all.json.View;
import jakarta.persistence.*;

/**
 *
 * @author acer
 */
@Entity
@IdClass(StudentClass.class)
@Table(name="student_class")
public class StudentClass {
    @ManyToOne
    @Id
    @JsonView(View.Public.class)
    @JoinColumn(name="student_id")
    private Student student;
    
    @ManyToOne
    @Id
    @JsonView(View.Public.class)
    @JoinColumn(name="class_id")
    private Clss clss;

    public StudentClass() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Clss getClss() {
        return clss;
    }

    public void setClss(Clss clss) {
        this.clss = clss;
    }

    
    
    
    
}
