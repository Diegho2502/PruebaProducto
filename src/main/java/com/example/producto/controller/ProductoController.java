package com.example.producto.controller;

import com.example.producto.model.Producto;
import com.example.producto.service.impl.ProductoServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/producto")
public class ProductoController extends GeneralControllerImpl<Producto, ProductoServiceImpl>{
}
