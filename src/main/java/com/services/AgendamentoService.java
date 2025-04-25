package com.services;

import com.dto.RequestAgendamentoDTO;
import com.entities.Agendamento;
import com.entities.Servicos;
import com.repository.AgendamentoRepository;
import com.repository.ServicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    @Autowired
    private ServicosRepository servicoRepository;

    // Método para criar um agendamento
    public ResponseEntity<Agendamento> criarAgendamento(RequestAgendamentoDTO requestAgendamentoDTO) {


        Agendamento agendamento = new Agendamento(
                requestAgendamentoDTO.nomeCliente()
        );

        // Salva o agendamento no banco de dados
        agendamento = agendamentoRepository.save(agendamento);

        // Retorna a resposta com status 201 Created
        return ResponseEntity.status(HttpStatus.CREATED).body(agendamento);
    }


    // Método para obter um agendamento pelo ID
    public ResponseEntity<Agendamento> obterAgendamentoPorId(Long id) {
        // Busca o agendamento no repositório
        Agendamento agendamento = agendamentoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado"));

        // Retorna o agendamento encontrado com status 200 OK
        return ResponseEntity.ok(agendamento);
    }


}

