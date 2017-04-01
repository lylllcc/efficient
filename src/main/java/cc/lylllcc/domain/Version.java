package cc.lylllcc.domain;

import javax.persistence.*;

/**
 * Created by lylllcc on 2017/4/1.
 */
@Entity
@Table(name = "version")
public class Version {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String versionName;
    private String versionCode;

    public Version(String versionName, String versionCode) {
        this.versionName = versionName;
        this.versionCode = versionCode;
    }

    public Version(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(String versionCode) {
        this.versionCode = versionCode;
    }
}
