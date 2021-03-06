package com.example.demo.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "ORGAN")
@Data
public class Organ {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long pid;
}
