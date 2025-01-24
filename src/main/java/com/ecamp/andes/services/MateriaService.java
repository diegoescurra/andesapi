package com.ecamp.andes.services;

import com.ecamp.andes.model.Materia;
import com.ecamp.andes.repository.IMateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService implements IMateriaService {

    @Autowired
    IMateriaRepository materiaRepository;

    @Override
    public List<Materia> getMateria() {
        return materiaRepository.findAll();
    }

    @Override
    public Materia saveMateria(Materia materia) {
        System.out.println(materia);
        return materiaRepository.save(materia);
    }
}
