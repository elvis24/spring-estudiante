package com.papudev.springestudiante.servicio;

import com.papudev.springestudiante.entidad.Estudiante;

import java.util.List;

public interface EstudianteServicio {
    public List<Estudiante> listarEstudiante();

    public Estudiante guardarEstudiante(Estudiante estudiante);
    public Estudiante estudiantebyId(Long id);
    public Estudiante estudianteUpdate(Estudiante estudiante);
    public void eliminarEstudiante(Long id);

}
