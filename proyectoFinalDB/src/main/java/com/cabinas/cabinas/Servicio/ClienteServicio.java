
package com.cabinas.cabinas.Servicio;

import com.cabinas.cabinas.Modelo.Cliente;
import com.cabinas.cabinas.Repositorio.ClienteRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServicio {
    
    @Autowired
    private ClienteRepositorio repo;
    
    public List<Cliente> listAll(){

    return repo.findAll();
    }
    
    public void save(Cliente cliente){
    repo.save(cliente);
    }
    
    public Cliente get(Integer id){
    return repo.findById(id).get();
    }
    
    public void delete(Integer id){
    repo.deleteById(id);
    }
}
