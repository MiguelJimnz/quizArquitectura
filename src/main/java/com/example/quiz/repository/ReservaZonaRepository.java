package com.example.quiz.repository;

import com.example.quiz.model.propietario;
import com.example.quiz.model.reserva_zona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface ReservaZonaRepository extends JpaRepository<reserva_zona, Integer> {
    List<reserva_zona> findByFecha(LocalDate fecha);
    @Query("SELECT rz FROM reserva_zona rz JOIN FETCH rz.propietario")
    List<reserva_zona> findReservasConPropietario();
}
