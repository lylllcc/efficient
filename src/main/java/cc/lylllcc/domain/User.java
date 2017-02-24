package cc.lylllcc.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by lylllcc on 2017/2/23.
 */

@Entity
@Table(name = "user")
@JsonIgnoreProperties(value = {"password", "studentId", "id"})
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String password;
    private String username;
    private double grate;
    private String studentId;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getGrate() {
        return grate;
    }

    public void setGrate(double grate) {
        this.grate = grate;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User(String password, String username, String email) {
        this.password = password;
        this.username = username;
        this.email = email;
    }

    public User() {
    }
}
