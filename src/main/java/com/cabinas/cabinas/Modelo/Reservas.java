package com.cabinas.cabinas.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import jakarta.persistence.Table;
import java.sql.Date;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author Ying
 */
@Entity
@Table(name="reservas")
public class Reservas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_reserva;


    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_cliente;

    
    //FK tours
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id_tours;

    @Column(nullable = false, length = 10)
    private Date fecha;

    @Column(nullable = false, length = 200)
    private String comentarios;

    public Reservas() {
    }

    public Reservas(int id_tours, Date fecha, String comentarios) {
        this.id_tours = id_tours;
        this.fecha = fecha;
        this.comentarios = comentarios;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_tours() {
        return id_tours;
    }

    public void setId_tours(int id_tours) {
        this.id_tours = id_tours;
    }

    public Date getFecha() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    

    
    
}
