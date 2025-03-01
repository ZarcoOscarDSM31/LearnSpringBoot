package com.learnSpring.learnSpring.Data.Entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;


@Entity
@DiscriminatorValue("2")
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor

public class Administrativo extends Usuario {
    private Double salary;

}