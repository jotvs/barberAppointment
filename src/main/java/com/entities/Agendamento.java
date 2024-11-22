package com.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "agendamento")
@Entity(name = "agendamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private  Long id;
    @NotNull @Column
    private LocalDateTime dataAgendamento;
    @NotNull @Column
    private String nomeCliente;
    @ManyToOne
    @JoinColumn(name = "servico_id", nullable = false)
    private Servicos servico;

    public Agendamento(LocalDateTime dataAgendamento, String nomeCliente ,Servicos servico){
        this.dataAgendamento = dataAgendamento;
        this.nomeCliente = nomeCliente;
        this.servico = servico;
    }
}
