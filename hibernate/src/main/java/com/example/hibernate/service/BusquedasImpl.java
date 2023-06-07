package com.example.hibernate.service;

import com.example.hibernate.repo.IGenericRepo;

import java.util.List;

public abstract class BusquedasImpl<T,ID> {
    protected abstract IGenericRepo<T,ID> getRepo();

    public List<T> listAll(){
        return getRepo().findAll();
    }

    public T findObject(int id){
        return getRepo().getReferenceById(id);
    }
}
