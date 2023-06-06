package com.example.demo.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;

import java.util.Date;


@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "users_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Column(name = "first_name")
    private String userName;

    @Email
    @Column(name = "email", unique = true)
    private String email;

    @Length()
    @Column(name = "password")
    private String password;

    @Column(name = "sex")
    private String gender;

    @Column(name = "date_of_birth")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateOfBirth;

    @Column(name = "creation_date", updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    private Date creationDate;

    public User() { }

    public User(Long Id, String userName, String email, String password, String gender,
                Date dateOfBirth, Date creationDate) {
        this.Id = Id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.creationDate = creationDate;
    }

    public Long getId() { return Id; }
    public void setId(Long Id) { this.Id = Id; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public Date getCreationDate() { return creationDate; }
    public void setCreationDate(Date creationDate) { this.creationDate = creationDate; }
}
