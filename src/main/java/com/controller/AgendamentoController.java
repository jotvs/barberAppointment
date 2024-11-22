package com.controller;

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
}
