package com.example.quiz.repository;

import com.example.quiz.model.propietario;
import com.example.quiz.model.reserva_zona;
import com.example.quiz.model.zona_social;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ZonaSocialRepository extends JpaRepository<zona_social, Integer> {
    @Query("SELECT rz FROM reserva_zona rz WHERE rz.fecha = :fecha")
    List<reserva_zona> findReservasPorFecha(@Param("fecha") LocalDate fecha);
}
