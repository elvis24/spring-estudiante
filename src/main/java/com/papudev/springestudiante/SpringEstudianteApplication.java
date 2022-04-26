package com.papudev.springestudiante;

import com.papudev.springestudiante.Repository.EstudianteRepository;
import com.papudev.springestudiante.entidad.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEstudianteApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringEstudianteApplication.class, args);
    }
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public void run(String... args) throws Exception {
       /*Estudiante estudiante1 = new Estudiante("Pablo","Levano","plevano@mail.pe");
        estudianteRepository.save(estudiante1);

        Estudiante estudiante2 = new Estudiante("Jorge","Peña","jpena@mail.pe");
        estudianteRepository.save(estudiante2);
        Estudiante estudiante3 = new Estudiante("Karelin","Lopez","klopez@mail.pe");
        estudianteRepository.save(estudiante3);*/
    }
}
