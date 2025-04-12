package com.example.quiz.controller;


import com.example.quiz.model.propietario;
import com.example.quiz.model.reserva_parqueadero;
import com.example.quiz.service.PropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PropietarioController {

    @Autowired
    private PropietarioService PropietarioService;

    @GetMapping("/propietarios-con-visitantes")
    public List<propietario> listarPropietariosConVisitantes() {
        return PropietarioService.listarPropietariosConVisitantes();
    }
    @GetMapping("/propietario/{id}/reservas-parqueadero")
    public List<reserva_parqueadero> listarReservasParqueadero(@PathVariable int id) {
        return PropietarioService.listarReservasParqueaderoPorPropietario(id);
    }

}
