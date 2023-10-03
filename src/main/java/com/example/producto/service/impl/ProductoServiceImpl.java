package com.example.producto.service.impl;

import com.example.producto.model.Producto;
import com.example.producto.repository.IGeneralRepository;
import com.example.producto.repository.IProductoRepository;
import com.example.producto.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl  extends GeneralServiceImpl<Producto, Integer> implements IProductoService{

    @Autowired
    private IProductoRepository employeeRepo;

    public ProductoServiceImpl(IGeneralRepository<Producto, Integer> generalRepository) {
        super(generalRepository);
    }
}
