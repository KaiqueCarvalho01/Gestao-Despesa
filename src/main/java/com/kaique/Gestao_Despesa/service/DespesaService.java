package com.kaique.Gestao_Despesa.service;

import com.kaique.Gestao_Despesa.entity.Despesa;
import com.kaique.Gestao_Despesa.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository despesaRepository;

    public Despesa salvar(Despesa despesa) {
        // Não aceitar valor negativo
        if (despesa.getValor() <= 0) {
            throw new RuntimeException("O valor da despesa deve ser maior que zero!");
        }
        return despesaRepository.save(despesa);
    }

    public List<Despesa> listarTodas() {
        return despesaRepository.findAll();
    }

    public Despesa buscarPorId(UUID uuid){
        return despesaRepository.findById(uuid).orElseThrow(() -> new RuntimeException("Despesa não encontrada"));
    }

    public Despesa atualizar(UUID id, Despesa dadosNovos) {
        // Busca a despesa original usando o método já criado
        Despesa despesaExistente = buscarPorId(id);

        // Se o usuário enviou uma nova descrição
        if (dadosNovos.getDescricao() != null) {
            despesaExistente.setDescricao(dadosNovos.getDescricao());
        }

        // Se o valor for maior que zero
        if (dadosNovos.getValor() != null) {
            despesaExistente.setValor(dadosNovos.getValor());
        }

        // Se enviou uma nova categoria
        if (dadosNovos.getCategoria() != null) {
            despesaExistente.setCategoria(dadosNovos.getCategoria());
        }

        return despesaRepository.save(despesaExistente);
    }
}
