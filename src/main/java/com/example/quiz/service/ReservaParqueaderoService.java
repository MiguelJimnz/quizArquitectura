package com.example.quiz.service;

import com.example.quiz.model.reserva_parqueadero;
import com.example.quiz.repository.ReservaParqueaderoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaParqueaderoService {

    @Autowired
    private ReservaParqueaderoRepository reservaParqueaderoRepository;

    public List<reserva_parqueadero> listarReservasParqueaderoPorPropietario(int id) {
        return reservaParqueaderoRepository.findByPropietarioId(id);
    }
}
