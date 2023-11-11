
package com.cabinas.cabinas.Servicio;

import com.cabinas.cabinas.Modelo.Reservas;
import com.cabinas.cabinas.Repositorio.ReservasRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ying
 */

@Service
public class ReservasServicio {
    
    @Autowired
    private ReservasRepositorio reservas;
    
    public List<Reservas> listAll(){
    return reservas.findAll();
    }
    
    public void save(Reservas reserva){
    reservas.save(reserva);
    }
    
    public Reservas get(Integer id_cliente){
    return reservas.findById(id_cliente).get();
    }
    
    public void delete(Integer id_reserva){
    reservas.deleteById(id_reserva);
    }
}
