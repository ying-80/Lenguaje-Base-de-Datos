package com.cabinas.cabinas.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author Ying
 */
@Entity
public class Tours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tour;

    @Column(nullable = false, length = 50)
    private String nombre_tour;
    
    @Column(nullable = false, length = 10)
    private int id_habitacion;

    @Column(nullable = false, length = 100)
    private String descripcion;
    
    @Column(nullable = false, length = 50)
    private int costo;

    public Tours() {
    }

    public Tours(int id_tour, String nombre_tour, int id_habitacion, String descripcion, int costo) {
        this.id_tour = id_tour;
        this.nombre_tour = nombre_tour;
        this.id_habitacion = id_habitacion;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public Tours(String nombre_tour, int id_habitacion, String descripcion, int costo) {
        this.nombre_tour = nombre_tour;
        this.id_habitacion = id_habitacion;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public int getId_tour() {
        return id_tour;
    }

    public void setId_tour(int id_tour) {
        this.id_tour = id_tour;
    }

    public String getNombre_tour() {
        return nombre_tour;
    }

    public void setNombre_tour(String nombre_tour) {
        this.nombre_tour = nombre_tour;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    
    
    
}
