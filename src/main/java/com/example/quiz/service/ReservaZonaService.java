package com.example.quiz.service;

import com.example.quiz.model.reserva_zona;
import com.example.quiz.repository.ReservaZonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservaZonaService {


    @Autowired
    private ReservaZonaRepository ReservaZonaRepository;


    public List<reserva_zona> listarReservasPorFecha(LocalDate fecha) {
        return ReservaZonaRepository.findByFecha(fecha);
    }
    public List<reserva_zona> obtenerReservasConPropietario() {
        return ReservaZonaRepository.findReservasConPropietario();
    }
}
