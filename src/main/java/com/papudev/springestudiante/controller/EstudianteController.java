package com.papudev.springestudiante.controller;

import com.papudev.springestudiante.entidad.Estudiante;
import com.papudev.springestudiante.servicio.EstudianteServicio;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteServicio estudianteServicio;

    @GetMapping({"/estudiantes","/"})
    public String listarEstudiantes(Model model){
        model.addAttribute("estudiantes",estudianteServicio.listarEstudiante());
        return "estudiantes";
    }

    @GetMapping("/estudiantes/nuevo")
    public String mostrarFormularioDeRegistroEstudiante(Model model){
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        return "crear_estudiante";
    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
        estudianteServicio.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/editar/{id}")
    public String MostrarFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("estudiante", estudianteServicio.estudiantebyId(id));
        return "editar_estudiante";
    }

    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante,Model model){
        Estudiante estudianteExistente=estudianteServicio.estudiantebyId(id);
        estudianteExistente.setId(id);
        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setApellido((estudiante.getApellido()));
        estudianteExistente.setEmail(estudiante.getEmail());

        estudianteServicio.estudianteUpdate(estudianteExistente);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public String EliminarEstudiante(@PathVariable Long id){
        estudianteServicio.eliminarEstudiante(id);
        return "redirect:/estudiantes";
    }
}
