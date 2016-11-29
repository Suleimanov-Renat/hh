package model;

import javax.persistence.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    @SequenceGenerator(name = "user_id_sequence",
            sequenceName = "user_id_sequence", allocationSize = 1)
    private Long id;
    @Column(name = "fullName")
    private String fullName;
    @Column(name = "city")
    private String city;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "salt")
    private String salt;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<CV> resumeList;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return fullName;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public List<CV> getResume() {
        return resumeList;
    }

    public void setResume(List<CV> resume) {
        this.resumeList = resume;
    }

    public static void USER_ROW_MAPPER(ResultSet rs, HashMap<Long, User> userMap) throws SQLException {
        //TODO: 9. realize user row mapper
    }
}