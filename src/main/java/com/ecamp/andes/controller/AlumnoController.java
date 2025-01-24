package com.ecamp.andes.controller;


import com.ecamp.andes.model.Alumno;
import com.ecamp.andes.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/alumnos")
public class AlumnoController {


    @Autowired
    private AlumnoService alumnoService;

    @GetMapping("/lista_alumnos")
    public List<Alumno> listarAlumnos() {
        System.out.println("pidiendo alumnos");
        return alumnoService.listAlumnos();
    }

    @PostMapping("/guardar")
    public Alumno guardarAlumno(@RequestBody Alumno alumno) {
        return alumnoService.saveAlumno(alumno);
    }
}
