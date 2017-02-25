package cc.lylllcc.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by lylllcc on 2017/2/25.
 */
@Entity
@Table(name = "record")
@JsonIgnoreProperties(value = {"id"})
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String startTime;
    private String lastTime;
    private String title;
    private String detail;
    private String species;
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Record(String startTime, String lastTime, String title, String detail, String species, String username) {
        this.startTime = startTime;
        this.lastTime = lastTime;
        this.title = title;
        this.detail = detail;
        this.species = species;
        this.username = username;
    }

    public Record() {

    }
}
