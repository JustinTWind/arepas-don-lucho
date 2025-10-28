package com.example.arepas_don_lucho.models;

import jakarta.persistence.*;

import javax.swing.*;

@Entity
@Table(name="DireccionEntrega")
public class DireccionEntrega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 50, nullable = false)
    private String ciudad;
    @Column(length = 50, nullable = false)
    private String barrio;
    @Column(length = 50, nullable = false)
    private String direccionTexto;
    @Column(length = 50, nullable = false)
    private String referencia;

    @OneToOne
    @JoinColumn(name="fk_DireccionEntrega", referencedColumnName = "id")
    private Cliente cliente;

    public DireccionEntrega() {
    }

    public DireccionEntrega(Integer id, String ciudad, String barrio, String direccionTexto, String referencia) {
        this.id = id;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.direccionTexto = direccionTexto;
        this.referencia = referencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccionTexto() {
        return direccionTexto;
    }

    public void setDireccionTexto(String direccionTexto) {
        this.direccionTexto = direccionTexto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
    //reference
}
