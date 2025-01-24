package com.ecamp.andes.services;

import com.ecamp.andes.model.Materia;

import java.util.List;

public interface IMateriaService {

    List<Materia> getMateria();

    Materia saveMateria (Materia materia);
}
