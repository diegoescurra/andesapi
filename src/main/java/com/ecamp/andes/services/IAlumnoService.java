package com.ecamp.andes.services;

import com.ecamp.andes.model.Alumno;

import java.util.List;

public interface IAlumnoService {

    Alumno saveAlumno(Alumno alumno);
    List<Alumno> listAlumnos();
}
