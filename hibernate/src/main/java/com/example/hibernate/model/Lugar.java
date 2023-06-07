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
@Table(name = "lugares")
public class Lugar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)private Long id_lugar;
    private String nombre;

    @OneToMany(mappedBy = "id_lugar", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Visita> visistas;
}
