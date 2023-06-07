package com.example.hibernate.service;

import com.example.hibernate.model.Autobus;

import java.util.List;

public interface IAutobusService {
    //crud
    List<Autobus> getAutobuses();
    Autobus insertBus(Autobus b);
    Autobus getBusById(int id);
    Autobus modifyBus(Autobus b);
    void eliminaBus(Autobus b);
}
