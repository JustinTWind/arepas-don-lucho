package com.example.arepas_don_lucho.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data//Creacion de getters and setters
@AllArgsConstructor //Creacion de constructor
@NoArgsConstructor
@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codigo;
    private LocalDate fechaCreacion;
    private Boolean estado;
    private Integer totalItems;
    private BigDecimal valorTotal;
    //relacion 1:m
    @OneToMany(mappedBy = "pedido")
    private Set<Repartidor> repartidor = new HashSet<>();
    //repacion 1:1
    @OneToOne(mappedBy = "pedido")
    private DetalleEntrega detalleEntrega;
}
