package com.example.hibernate.service;

import com.example.hibernate.model.Autobus;
import com.example.hibernate.repo.IAutobusRepo;
import com.example.hibernate.repo.IGenericRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutobusService extends BusquedasImpl<Autobus,Integer> implements IAutobusService{
    @Autowired
    IAutobusRepo repo;
    @Override
    public List<Autobus> getAutobuses() {
        return repo.findAll();
    }

    @Override
    public Autobus insertBus(Autobus b) {
        return repo.save(b);
    }

    @Override
    public Autobus getBusById(int id) {
        return repo.findAutobusById(id);
    }

    @Override
    public Autobus modifyBus(Autobus b) {
        return repo.saveAndFlush(b);
    }

    @Override
    public void eliminaBus(Autobus b) {
        repo.delete(b);
    }

    @Override
    protected IGenericRepo<Autobus, Integer> getRepo() {
        return (IGenericRepo<Autobus, Integer>) repo;
    }
}
