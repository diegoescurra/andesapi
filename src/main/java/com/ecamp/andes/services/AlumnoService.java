package com.ecamp.andes.services;

import com.ecamp.andes.model.Alumno;
import com.ecamp.andes.repository.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService implements IAlumnoService{
    @Autowired
    IAlumnoRepository alumnoRepository;



    @Override
    public Alumno saveAlumno(Alumno alumno) {


        return  alumnoRepository.save(alumno);
    }

    @Override
    public List<Alumno> listAlumnos() {
       return alumnoRepository.findAll();
    }
}
