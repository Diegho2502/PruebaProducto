package com.example.producto.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="producto")
public class Producto extends Base{

    @Column(name="pro_nombre", nullable = false)
    private String name;

    @Column(name="pro_descripcion", nullable = false)
    private String descripcion;

    @Column(name="pro_precio", nullable = false)
    private float precio;
}
