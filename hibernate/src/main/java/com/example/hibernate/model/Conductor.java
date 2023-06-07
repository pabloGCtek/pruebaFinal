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
@Table(name = "conductores")
public class Conductor {
    @Id
    private String dni;
    private String nombre;

    @OneToMany(mappedBy = "dni", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Visita> visistas;
}
