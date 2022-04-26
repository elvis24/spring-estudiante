package com.papudev.springestudiante.servicio;

import com.papudev.springestudiante.Repository.EstudianteRepository;
import com.papudev.springestudiante.entidad.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicioImpl implements EstudianteServicio{

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> listarEstudiante() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }
}
