/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murillo.to_do.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.murillo.to_do.model.entity.Tarefa;
import com.murillo.to_do.service.TarefaService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author murillo
 */
@RestController
@RequestMapping(value = "/tarefas")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @GetMapping
    public List<Tarefa> findAll() {
        List<Tarefa> resultado = service.findAll();
        return resultado;
    }
    
    @GetMapping(value = "/{id}")
    public Tarefa findById(@PathVariable Long id) {
       Tarefa resultado = service.findById(id);
        return resultado;
    }
    
    @PostMapping
    public Tarefa insert(@RequestBody Tarefa tarefa){
        Tarefa resultado = service.insert(tarefa);
        return resultado;
    }
    
    @PutMapping(value = "/{id}")
    public Tarefa update(@PathVariable Long id, @RequestBody Tarefa tarefa){
        Tarefa resultado = service.update(id, tarefa);
        return resultado;
    }
    
    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        
        return "Tarefa deletada";
    }
    

}
