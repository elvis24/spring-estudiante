package com.papudev.springestudiante.servicio;

import com.papudev.springestudiante.entidad.Estudiante;

import java.util.List;

public interface EstudianteServicio {
    public List<Estudiante> listarEstudiante();

    public Estudiante guardarEstudiante(Estudiante estudiante);

}
