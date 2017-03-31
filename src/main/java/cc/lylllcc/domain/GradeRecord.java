package cc.lylllcc.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by lylllcc on 2017/3/30.
 */
@Entity
@Table(name = "grade_record")
@JsonIgnoreProperties(value = {"id"})
public class GradeRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;
    private String detail;
    private int year,month,day,hour,min,second;
    private double changes;

    public GradeRecord(){}

    public GradeRecord(String username, String detail,double changes) {
        this.username = username;
        this.detail = detail;
        this.changes = changes;
        LocalDateTime localDateTime = LocalDateTime.now();
        year = localDateTime.getYear();
        month = localDateTime.getMonthValue();
        day = localDateTime.getDayOfMonth();
        hour = localDateTime.getHour();
        min = localDateTime.getMinute();
        second = localDateTime.getSecond();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getChanges() {
        return changes;
    }

    public void setChanges(double changes) {
        this.changes = changes;
    }
}
