package com.example.quiz.service;

import com.example.quiz.model.propietario;
import com.example.quiz.model.reserva_parqueadero;
import com.example.quiz.model.visitante;
import com.example.quiz.repository.PropietarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PropietarioService {

    @Autowired
    private PropietarioRepository propietarioRepository;

    public List<reserva_parqueadero> listarReservasParqueaderoPorPropietario(int idPropietario) {
        Optional<propietario> propietario = propietarioRepository.findById(idPropietario);

        return propietario.map(prop -> prop.getReservasParqueadero())
                .orElse(new ArrayList<>());
    }



    public List<propietario> listarPropietariosConVisitantes() {
        return propietarioRepository.findPropietariosConVisitantes();
    }
}
