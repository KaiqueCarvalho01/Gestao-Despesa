package com.kaique.Gestao_Despesa.controller;

import com.kaique.Gestao_Despesa.entity.Despesa;
import com.kaique.Gestao_Despesa.repository.DespesaRepository;
import com.kaique.Gestao_Despesa.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    @Autowired
    private DespesaService despesaService;

    //Salvar Despesa
    @PostMapping
    public Despesa criar(@RequestBody Despesa despesa){
        return despesaService.salvar(despesa);
    }

    //Lista de despesas
    @GetMapping
    public List<Despesa> listarTodos(){
        return despesaService.listarTodas();
    }

    //Procurando por ID
    @GetMapping("/{id}")
    public Despesa buscarPorId(@PathVariable UUID id){
        return despesaService.buscarPorId(id);
    }

    @PatchMapping("/{id}")
    public Despesa atualizar(@PathVariable UUID id, @RequestBody Despesa despesa) {
        return despesaService.atualizar(id, despesa);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable UUID id){
        despesaService.deletarPorId(id);
    }
}
