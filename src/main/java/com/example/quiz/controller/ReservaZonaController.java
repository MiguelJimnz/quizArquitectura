package com.example.quiz.controller;


import com.example.quiz.model.reserva_zona;
import com.example.quiz.service.ReservaParqueaderoService;
import com.example.quiz.service.ReservaZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ReservaZonaController {

    @Autowired
    private ReservaZonaService ReservaZonaService;



    @GetMapping("/reservas-zona-social-con-propietario")
    public List<reserva_zona> obtenerReservasConPropietario() {
        return ReservaZonaService.obtenerReservasConPropietario();
    }

    @GetMapping("/reservas-zona-por-fecha")
    public List<reserva_zona> listarReservasPorFecha(@RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha) {
        return ReservaZonaService.listarReservasPorFecha(fecha);
    }
}
