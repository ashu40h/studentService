package com.student.service.studentService.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


@Entity
@Table(name = "Student") // Adjust table name if needed
public class Student {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "STUDENT_ID")
        private Long studentId;

        @Column(name = "FIRST_NAME")
        private String firstName;

        @Column(name = "LAST_NAME")
        private String lastName;

        @Column(name = "MOBILE_NO")
        private String mobileNumber;

        @Column(name = "EMAIL")
        private String email;

        @Column(name = "PASSWORD")
        private String password;

        @Column(name = "USERNAME")
        private String username;

    @JsonIgnore
    private transient Object hibernateLazyInitializer;

        // Constructors, getters, and setters

        // Constructor with fields
//        public Student(String firstName, String lastName, String mobileNumber,
//                       String email, String password, String username) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.mobileNumber = mobileNumber;
//            this.email = email;
//            this.password = password;
//            this.username = username;
//        }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

