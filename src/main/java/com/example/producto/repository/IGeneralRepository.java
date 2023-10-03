package com.example.producto.repository;

import com.example.producto.model.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGeneralRepository<T extends Base,ID> extends JpaRepository<T, ID> {
}
