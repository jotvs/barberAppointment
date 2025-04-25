package com.dto;

import java.util.UUID;

public record ResponseAgendamentoDTO(
        UUID id,
        //@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
        // LocalDateTime dataAgendamento,
        String nomeCliente
        //Servico servico
    ) { }
