package com.ecamp.andes.repository;

import com.ecamp.andes.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository <Alumno, Long> {
}
