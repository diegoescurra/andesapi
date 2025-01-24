package com.ecamp.andes.repository;

import com.ecamp.andes.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository <Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}
