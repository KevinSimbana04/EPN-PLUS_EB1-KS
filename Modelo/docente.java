package Modelo;

import java.util.*;
public class docente {
    private static String nombre;
    private String especialidad;
    private List<curso> cursosAsignados;

    //Constructor
    public docente(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursosAsignados = new ArrayList<>();
    }

    //Agregar curso
    public void agregarCurso(curso curso) {
        cursosAsignados.add(curso);
        curso.asignarDocente(this);
    }

    //Mostrar curso
    public void mostrarCursos() {
        System.out.println("Cursos asignados a " + nombre + ":");
        for (curso curso : cursosAsignados) {
            curso.mostrarResumen();
        }
    }

    // Getters y setters


    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        docente.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void mostrarPerfil(String especialidad, String nombre) {
        this.especialidad = especialidad;
        this.nombre = nombre;
    }
}
