package com.cabinas.cabinas.Controlador;

import com.cabinas.cabinas.Modelo.Tours;
import com.cabinas.cabinas.Servicio.ToursServicio;
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
public class ToursControlador {
    
    @Autowired
    private ToursServicio servicio;
    
    @RequestMapping("/tours")
    public String verTours (Model modelo){
    modelo.addAttribute("listaTours", servicio.listAll());
    return "tours";
    }
    
    @RequestMapping("/nuevoTour")
    public String mostrarNuevoFormTour (Model modelo){
    Tours nuevoTour=new Tours();
    modelo.addAttribute(nuevoTour);
    return "nuevoTour";
    }
    
    @RequestMapping(value="/guardarTour", method=RequestMethod.POST)
    public String guardarTour (@ModelAttribute("tours") Tours tours){
    servicio.save(tours);
    return "redirect:/tours";
    }
    @RequestMapping("/editarTour/{id_tour}")
    public ModelAndView mostrarFormEditarTour(@PathVariable (name="id_tour")Integer id_tour){
    ModelAndView modelo=new ModelAndView("editarTour");
    Tours tours=servicio.get(id_tour);
    modelo.addObject("tours", tours);
    return modelo;
    }
    @RequestMapping("/eliminarTour/{id_tour}")
    public String eliminarTour (@PathVariable(name="id_tour")Integer id_tours){
    servicio.delete(id_tours);
    return "redirect:/tours";
    }
}
