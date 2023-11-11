package com.cabinas.cabinas.Controlador;

import com.cabinas.cabinas.Modelo.Reservas;
import com.cabinas.cabinas.Servicio.ReservasServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ying
 */

@Controller
public class ReservasControlador {
    
    @Autowired
    private ReservasServicio servicio;
    
    @RequestMapping("/reservas")
    public String verReservas (Model modelo){
        modelo.addAttribute("listaReservas", servicio.listAll());
        return "reservas";
    }
    
    @RequestMapping("/nuevaReserva")
    public String mostrarNuevoFormularioReserva (Model modelo){
    Reservas nuevaReserva=new Reservas();
    modelo.addAttribute(nuevaReserva);
    return "nuevaReserva";
    }
    
    @RequestMapping(value="/guardarReserva", method=RequestMethod.POST)
    public String guardarReserva(@ModelAttribute("reservas") Reservas reservas){
    servicio.save(reservas);
    return "redirect:/reservas";
    }
    
    @RequestMapping("/editarReserva/{id_cliente}")
    public ModelAndView mostrarFormularioEditarReserva(@PathVariable (name="id_cliente") Integer idCliente){
        ModelAndView modelo =new ModelAndView("editarReserva");
        Reservas reservas= servicio.get(idCliente);
        modelo.addObject("reservas", reservas);
        return modelo;
    }
    
    @RequestMapping("/eliminarReserva/{id_cliente}")
    public String eliminarReserva (@PathVariable(name="id_cliente")Integer idCliente){
    servicio.delete(idCliente);
    return "redirect:/reservas";
    }
    
}
