package cc.lylllcc.domain;

import javax.persistence.*;

/**
 * Created by lylllcc on 2017/4/1.
 */
@Entity
@Table(name = "feedback")
public class FeedBack {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String username;
    private String type;
    private String detail;
    private String contact;

    public FeedBack(){

    }

    public FeedBack(String username, String type, String detail, String contact) {
        this.username = username;
        this.type = type;
        this.detail = detail;
        this.contact = contact;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
