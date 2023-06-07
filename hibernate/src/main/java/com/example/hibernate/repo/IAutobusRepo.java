package com.example.hibernate.repo;

import com.example.hibernate.model.Autobus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutobusRepo extends JpaRepository<Autobus,Integer> {
    Autobus findAutobusById(int id);
}
