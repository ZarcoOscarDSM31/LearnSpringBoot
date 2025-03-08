package com.learnSpring.learnSpring.Data.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="tb_players")

public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer ranking;

    @Column(nullable = false, length = 100)
    private String fullname;

    @Column(nullable = false, length = 50)
    private String team;

    @Column(nullable = false, length = 10)
    private String position;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private Double drtg;

    public Player() {
    }

    public Player(Long id, Integer ranking, String fullname, String team, String position, Integer age, Double drtg) {
        this.id = id;
        this.ranking = ranking;
        this.fullname = fullname;
        this.team = team;
        this.position = position;
        this.age = age;
        this.drtg = drtg;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getDrtg() {
        return drtg;
    }

    public void setDrtg(Double drtg) {
        this.drtg = drtg;
    }
}
