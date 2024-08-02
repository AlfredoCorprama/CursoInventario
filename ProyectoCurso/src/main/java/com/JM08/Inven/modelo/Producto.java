package com.JM08.Inven.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")  // Si el nombre de la columna en la BD es diferente
    private Integer idProducto;

    @NotNull
    @Column(name = "descripcion")  // Si el nombre de la columna en la BD es diferente
    private String descripcion;

    @NotNull
    @Column(name = "precio")  // Si el nombre de la columna en la BD es diferente
    private Double precio;

    @NotNull
    @Column(name = "existencia")  // Si el nombre de la columna en la BD es diferente
    private Integer existencia;

}
