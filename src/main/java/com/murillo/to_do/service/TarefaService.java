/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murillo.to_do.service;

import com.murillo.to_do.model.entity.Tarefa;
import com.murillo.to_do.repositories.TarefaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author murillo
 */
@Service
public class TarefaService {
    
    @Autowired
    private TarefaRepository repository;


    public List<Tarefa> findAll() {
        List<Tarefa> resultado = repository.findAll();
        return resultado;
    }
    

    public Tarefa findById( Long id) {
       Tarefa resultado = repository.findById(id).get();
        return resultado;
    }
    

    public Tarefa insert( Tarefa tarefa){
        Tarefa resultado = repository.save(tarefa);
        return resultado;
    }
    

    public Tarefa update( Long id, @RequestBody Tarefa tarefa){
        Tarefa resultado = repository.save(tarefa);
        return resultado;
    }
    
    public void delete(Long id){
        Tarefa entity = this.findById(id);
        
        repository.delete(entity);
    }
    
}
