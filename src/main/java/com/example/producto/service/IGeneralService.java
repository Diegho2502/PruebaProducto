package com.example.producto.service;

import com.example.producto.model.Base;

import java.util.List;

public interface IGeneralService <T extends Base, ID>{
    List<T> list() throws Exception;

    T save(T t) throws Exception;

    T update(T t, ID id) throws Exception;

    boolean delete(ID id) throws Exception;

    T listById(ID id) throws Exception;
}
