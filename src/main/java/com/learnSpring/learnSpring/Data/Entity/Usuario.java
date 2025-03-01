package com.learnSpring.learnSpring.Data.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Entity(name = "tb_users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.INTEGER)
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID id;
    public String name;
    public String lastname;
    public String email;
}