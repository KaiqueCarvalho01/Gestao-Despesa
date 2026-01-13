package com.kaique.Gestao_Despesa.repository;


import com.kaique.Gestao_Despesa.entity.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DespesaRepository extends JpaRepository<Despesa, UUID> {
    //métodos
}
