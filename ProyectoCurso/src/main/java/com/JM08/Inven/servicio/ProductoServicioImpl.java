package com.JM08.Inven.servicio;

import com.JM08.Inven.modelo.Producto;
import com.JM08.Inven.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicioImpl implements IProductoServicio{

    @Autowired
    private ProductoRepositorio productoRepositorio;


    @Override
    public List<Producto> listarProductos() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        Producto producto = productoRepositorio.findById(idProducto).orElse(null);
        return  producto;
    }

    @Override
    public void guardarProducto(Producto producto) {
        productoRepositorio.save(producto);

    }

    @Override
     public void eliminarProductoPorId(Integer idProducto) {
        productoRepositorio.deleteById(idProducto);
    }
}
