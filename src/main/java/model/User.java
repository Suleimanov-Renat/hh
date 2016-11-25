package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TODO: 1. add new fields to models (Category, CV, User)
//TODO: 2. add hibernate annotations to fields
public class User {

    private Long id;

    private String fullName;
    private String city;
    private String phone;
    private String email;
    private String password;
    private String salt;

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

    public static void USER_ROW_MAPPER(ResultSet rs, HashMap<Long, User> userMap) throws SQLException {
        //TODO: 9. realize user row mapper
    }
}