package com.kaique.Gestao_Despesa.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "despesa")
@Getter // Cria todos os Getters automaticamente
@Setter // Cria todos os Setters automaticamente
@NoArgsConstructor // Cria o construtor vazio
@AllArgsConstructor // Cria o construtor com todos os campos
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(length = 100, nullable = false)
    private String descricao;
    @Column(nullable = false)
    private LocalDate data;
    @Column(nullable = false)
    private double valor;

    @Column(length = 100, nullable = false)
    private String categoria;
    @Column(length = 100, nullable = false)
    private String email;

    @CreationTimestamp
    private LocalDate data_criacao;

    //Expondo as informações da classe
    @Override
    public String toString() {
        return "Despesa{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", valor=" + valor +
                ", categoria='" + categoria + '\'' +
                ", email='" + email + '\'' +
                ", data_criacao=" + data_criacao +
                '}';
    }

}
