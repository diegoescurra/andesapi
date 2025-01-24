package com.ecamp.andes.repository;

import com.ecamp.andes.model.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriaRepository extends JpaRepository <Materia, Long> {
}
