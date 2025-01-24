package com.ecamp.andes.controller;


import com.ecamp.andes.model.Materia;
import com.ecamp.andes.services.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/materia")
public class MateriaController {

    @Autowired
    private MateriaService materiaService;


    @GetMapping("")
    public List<Materia> getMateria() {
        return materiaService.getMateria();
    }


    @PostMapping("")
        public ResponseEntity<?> saveMateria(@RequestBody Materia materia) {
            try {
                Materia savedMateria = materiaService.saveMateria(materia);
                return ResponseEntity.ok(savedMateria);
            } catch (Exception e) {
                System.out.println("Error: "+ e.getMessage());
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Error: " + e.getMessage());
            }

        }

}
