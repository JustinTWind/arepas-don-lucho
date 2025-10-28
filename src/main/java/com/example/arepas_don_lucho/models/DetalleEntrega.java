package com.example.arepas_don_lucho.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "detalle_entrega")
public class DetalleEntrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalTime horaSalidaCocina;
    private LocalTime horaEntregaCliente;
    private Boolean estado;
    private String fotoPrueba;
    private Byte intentoFallido;

    @OneToOne
    @JoinColumn(name = "fk_id",referencedColumnName = "id")

    private Pedido pedido;

}
