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
@Table(name = "classes")
public class Clss {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(View.Public.class)
    @Column(name = "class_id")
    private int classID;

    @JsonView(View.Public.class)
    @Column(name = "class_name")
    private String className;

    @ManyToOne
    @JsonView(View.Public.class)
    @JoinColumn(name = "subject_id")
    private Subject subject;




    public Clss() {
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
