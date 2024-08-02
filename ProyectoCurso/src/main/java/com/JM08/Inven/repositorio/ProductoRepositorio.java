package com.JM08.Inven.repositorio;

import com.JM08.Inven.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.config.RepositoryConfigurationExtension;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {
}
