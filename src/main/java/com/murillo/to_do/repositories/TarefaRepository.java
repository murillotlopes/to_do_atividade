/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murillo.to_do.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murillo.to_do.model.entity.Tarefa;



/**
 *
 * @author murillo
 */
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    
}
