package com.learnSpring.learnSpring.Data.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_student")
@NoArgsConstructor
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "lastname", nullable = false, length = 50)
    private String lastname;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "email", nullable = false, length = 50, unique = true)
    private String email;

    @Column(name = "password", nullable = false, length = 50)
    private String password;

    public Student(String name, String lastname, int age, String email, String password) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
        this.password = password;
    }
}