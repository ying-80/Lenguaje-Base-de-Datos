/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cabinas.cabinas.Servicio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Ying
 */
public class fecha {
    
        public LocalDate convertirFecha(String fechaStr) {
        // Define el formato esperado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");

        // Intenta convertir la cadena a LocalDate
        LocalDate fecha = LocalDate.parse(fechaStr, formatter);

        return fecha;
    }
    
}
