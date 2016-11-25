package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TODO: 1. add new fields to models (Category, CV, User)
//TODO: 2. add hibernate annotations to fields
public class CV {

    private Long id;

    private String title;

    private String text;

    private String education;

    private String experience;

    public CV() {
    }

    public CV(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "CV{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        CV cv = (CV) obj;
        return id.equals(cv.getId());
    }

    public static void CV_ROW_MAPPER(ResultSet rs, HashMap<Long, CV> cvMap) throws SQLException {
        //TODO: 6. realize cv row mapper
    }

}