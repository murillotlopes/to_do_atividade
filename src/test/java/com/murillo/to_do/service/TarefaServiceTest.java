/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.murillo.to_do.service;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.mockito.Mockito;

import com.murillo.to_do.repositories.TarefaRepository;
import com.murillo.to_do.model.entity.Tarefa;

/**
 *
 * @author murillo
 */
@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class TarefaServiceTest {

    @SpyBean
    TarefaService service;

    @MockBean
    TarefaRepository repository;

    @Test
    public void testFindAll() {

    }

    @Test
    public void validaInsercao() {

    }

    @Test
    public void validaDelecao() {

    }

    @Test
    public void validaAtualizacao() {

    }
}
