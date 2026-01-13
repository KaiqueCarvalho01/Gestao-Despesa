package com.kaique.Gestao_Despesa.controller;

import com.kaique.Gestao_Despesa.entity.Despesa;
import com.kaique.Gestao_Despesa.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    @Autowired
    private DespesaRepository despesaRepository;

    //Salvar Despesa
    @PostMapping
    public Despesa criar(@RequestBody Despesa despesa){
        return despesaRepository.save(despesa);
    }

    //Lista de despesas
    @GetMapping
    public List<Despesa> listarTodos(){
        return despesaRepository.findAll();
    }
}
