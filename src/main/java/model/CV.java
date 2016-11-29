package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
@Table(name = "cv")
public class CV {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "cv_id_sequence"
    )
    @SequenceGenerator(name = "cv_id_sequence",
            sequenceName = "cv_id_sequence", allocationSize = 1)
    private Long id;

    @Column(name = "title")
    private String title;
    @Column(name = "text")
    private String text;
    @Column(name = "education")
    private String education;
    @Column(name = "experience")
    private String experience;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToMany
    @JoinTable(name = "cv_category", joinColumns = @JoinColumn(name = "cv_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;

    public CV() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return categories;
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