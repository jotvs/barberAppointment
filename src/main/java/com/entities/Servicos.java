package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "servicos")
@Entity(name = "servicos")
@Getter
@Setter
@NoArgsConstructor
public class Servicos {
    // Classe genérica para representar um serviço
    private String id;
    private String descricao;
    private double valor;
    private String duracao;


    // Construtor
    public Servicos(String descricao, double valor, String duracao){
        this.valor = valor;
        this.descricao = descricao;
        this.duracao = duracao;
    }

}
