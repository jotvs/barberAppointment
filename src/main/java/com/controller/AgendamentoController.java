package com.controller;

import com.dto.RequestAgendamentoDTO;
import com.dto.ResponseAgendamentoDTO;
import com.entities.Agendamento;
import com.services.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendar")
public class AgendamentoController {

    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping("/{id}")
    public ResponseEntity appointmentById (@PathVariable("id") Long id){
       return agendamentoService.obterAgendamentoPorId(id);

    }


    @PostMapping("/agendar")
    public ResponseEntity <ResponseAgendamentoDTO> createAppointment (@RequestBody RequestAgendamentoDTO requestAgendamentoDto){
        agendamentoService.criarAgendamento(requestAgendamentoDto);

        //return ResponseEntity.created(URI.create("/agendar/" + agendamentoId.toString())).build();
        return ResponseEntity.ok().build();

    }
}
