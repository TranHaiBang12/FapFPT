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
@Table(name = "attendance")
public class Attendance {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JsonView(View.Public.class)
    @Column(name="attendance_id")
    private int attendanceID;

    @ManyToOne
    @JsonView(View.Public.class)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JsonView(View.Public.class)
    @JoinColumn(name = "timetable_id")
    private Timetable timetable;

    @JsonView(View.Public.class)
    @Column(name = "status")
    private boolean status;


    public Attendance() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

   

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }

    public int getAttendanceID() {
        return attendanceID;
    }

    public void setAttendanceID(int attendanceID) {
        this.attendanceID = attendanceID;
    }

    

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
}
