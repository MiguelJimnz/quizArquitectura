package com.example.quiz.repository;

import com.example.quiz.model.propietario;
import com.example.quiz.model.visitante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitanteRepository extends JpaRepository<visitante, Integer> {
}
