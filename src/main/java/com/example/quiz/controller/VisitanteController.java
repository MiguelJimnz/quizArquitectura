package com.example.quiz.controller;


import com.example.quiz.service.VisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VisitanteController {

    @Autowired
    private VisitanteService VisitanteService;

}
