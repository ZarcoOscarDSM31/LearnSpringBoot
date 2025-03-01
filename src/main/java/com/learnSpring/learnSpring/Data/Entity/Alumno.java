package com.learnSpring.learnSpring.Data.Entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;




@Entity
@DiscriminatorValue("1")
@EqualsAndHashCode(callSuper = true)
public class Alumno extends Usuario {
}