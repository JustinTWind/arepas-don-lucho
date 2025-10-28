package com.example.arepas_don_lucho.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100, nullable = false)
    private String nombres;

    @Column(length = 10, nullable = false, unique = true)
    private String tipoDocumento; // Ej: "PPT", "CC"

    @Column(length = 15, nullable = false)
    private String telefono;

    @Column(length = 100, nullable = false, unique = true)
    private String correoElectronico;

    @OneToOne(mappedBy = "cliente")
    private DireccionEntrega direccionEntrega;
}
