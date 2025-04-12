package com.example.quiz.repository;

import com.example.quiz.model.propietario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PropietarioRepository extends JpaRepository<propietario, Integer> {
    @Query("SELECT p FROM propietario p LEFT JOIN FETCH p.visitantes")
    List<propietario> findPropietariosConVisitantes();
}
