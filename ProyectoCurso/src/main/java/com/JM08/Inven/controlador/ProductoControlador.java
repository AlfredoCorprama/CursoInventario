package com.JM08.Inven.controlador;



import com.JM08.Inven.modelo.Producto;
import com.JM08.Inven.servicio.ProductoServicioImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
//http://localhost:8088/inventario-app
@RequestMapping("inventario-app")
@CrossOrigin
public class ProductoControlador {

    private static final Logger logger = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private ProductoServicioImpl productoServicio;

    //http://localhost:8088/inventario-app/productos
    @GetMapping("/productos")
    public List<Producto> obtenerProductos(){
        List<Producto> productos = productoServicio.listarProductos();
        logger.info("Productos Obtenidos");
        productos.forEach((producto -> logger.info(producto.toString())));
        return productos;
    }

    //http://localhost:8088/inventario-app/productos/id
    @GetMapping("productos/{idProducto}")
    public Producto obtenerProductoPorID(@PathVariable("idProducto") Integer idProducto){
        Producto producto = productoServicio.buscarProductoPorId(idProducto);
        logger.info("Producto: "+ producto);
        return producto;
    }

    //http://localhost:8088/inventario-app/productos
    @PostMapping("/productos")
    public void guardarProducto(@RequestBody Producto producto){
        productoServicio.guardarProducto(producto);
        logger.info("Se guardo el producto: " + producto.getDescripcion());
    }

    //http://localhost:8088/inventario-app/productos/3
    @DeleteMapping("/productos/{idProducto}")
    public void eliminarProductoPorId(@PathVariable("idProducto") Integer idProducto){
        productoServicio.eliminarProductoPorId(idProducto);
        logger.info("Se elimino el producto con id:" + idProducto );
    }



}
