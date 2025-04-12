package com.example.quiz.repository;

import com.example.quiz.model.propietario;
import com.example.quiz.model.reserva_parqueadero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ReservaParqueaderoRepository extends JpaRepository<reserva_parqueadero, Integer> {

    @Query("SELECT r FROM reserva_parqueadero r WHERE r.propietario.id_propietario = :idPropietario")
    List<reserva_parqueadero> findByPropietarioId(@Param("idPropietario") int id);
}
