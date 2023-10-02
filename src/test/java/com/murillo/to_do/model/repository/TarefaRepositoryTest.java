/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murillo.to_do.model.repository;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
 
import com.murillo.to_do.repositories.TarefaRepository;
import com.murillo.to_do.model.entity.Tarefa;
import org.junit.jupiter.api.Test;

/**
 *
 * @author murillo
 */
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class TarefaRepositoryTest {
    
    @Autowired
    TarefaRepository repository;
    
    @Autowired
    TestEntityManager entityManager;
    
    @Test
    public void salvarTarefa(){
       
        
        
    }
}
