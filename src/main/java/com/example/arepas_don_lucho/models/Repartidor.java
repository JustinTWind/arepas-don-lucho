package com.example.arepas_don_lucho.models;

import jakarta.persistence.*;

@Entity
@Table (name = "Repartidor")
public class Repartidor {
    @Id
            @GeneratedValue(strategy =
            GenerationType.IDENTITY)
    Integer id;
    String nombres;
    String documento;
    String telefono;
    String placaVehiculo;
    String zonaCobertura;
    boolean activo;


    @ManyToMany
    @JoinColumn(name = "pedido_id", referencedColumnName = "id")
    private Pedido pedido;

    public Repartidor() {
    }

    public Repartidor(Integer id, String nombres, String documento, String telefono, String placaVehiculo, String zonaCobertura, boolean activo) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.telefono = telefono;
        this.placaVehiculo = placaVehiculo;
        this.zonaCobertura = zonaCobertura;
        this.activo = activo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getZonaCobertura() {
        return zonaCobertura;
    }

    public void setZonaCobertura(String zonaCobertura) {
        this.zonaCobertura = zonaCobertura;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
