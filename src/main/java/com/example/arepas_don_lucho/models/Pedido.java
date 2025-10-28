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
    @Column(length = 100, nullable = false)
    private String codigo;
    @Column(nullable = false)
    private LocalDate fechaCreacion;
    @Column(nullable = false)
    private Boolean estado;
    @Column(nullable = false)
    private Integer totalItems;
    @Column(nullable = false)
    private BigDecimal valorTotal;
    //relacion 1:m
    @ManyToOne
    @JoinColumn(name = "repartidor_id", referencedColumnName = "id")
    private Repartidor repartidor;
    //repacion 1:1
    @OneToOne(mappedBy = "pedido")
    private DetalleEntrega detalleEntrega;
}
