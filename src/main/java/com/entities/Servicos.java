package com.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

@Table(name = "servicos")
@Entity(name = "servicos")
@Getter
@Setter
@NoArgsConstructor
public class Servicos {
    // Classe genérica para representar um serviço
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotNull
    private String descricao;
    @NotNull
    private double valor;
    @NotNull
    private String duracao;


    // Construtor
    public Servicos(String descricao, double valor, String duracao){
        this.valor = valor;
        this.descricao = descricao;
        this.duracao = duracao;
    }

}
