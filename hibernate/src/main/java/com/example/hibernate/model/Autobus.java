package com.example.hibernate.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "autobuses")
public class Autobus {

    @Id
    private String matricula;
    private Integer a_fabricacion;

    @OneToMany(mappedBy = "matricula", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Visita> visistas;
}
