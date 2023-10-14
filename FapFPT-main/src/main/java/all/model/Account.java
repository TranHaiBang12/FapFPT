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
@Table(name="accounts")
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @JsonView(View.Public.class)
    @Column(name="account_id")
    private int accountID;

    @JsonView(View.Public.class)
    @Column(name="username")
    private String username;
    
    @JsonView(View.Public.class)
    @Column(name="password")
    private String password;
    
    @JsonView(View.Public.class)
    @Column(name="role")
    private String role;

    @ManyToOne
    @JsonView(View.Public.class)
    @JoinColumn(name = "user_id")
    private Teacher teacher;

    public Account(String role, Teacher teacher) {
        this.role = role;
        this.teacher = teacher;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
