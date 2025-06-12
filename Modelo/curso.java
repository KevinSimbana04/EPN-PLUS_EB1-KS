package Modelo;

public abstract class curso {
    private String nombre;
    private int duracionSemanas;
    private double precio;
    private docente Docente;

    public curso(String nombre, int duracionSemanas, double precio, docente Docente) {
        this.nombre = nombre;
        this.duracionSemanas = duracionSemanas;
        this.precio = precio;
        this.Docente = Docente;
    }

    // Metodo
    public void asignarDocente(docente Docente) {
        this.Docente = Docente;
    }

    public void mostrarResumen() {
        System.out.println("Curso: " + nombre);
        System.out.println("Duración: " + duracionSemanas + " semanas");
        System.out.println("Precio: $" + precio);
        if (Docente != null) {
            System.out.println("Docente: " + docente.getNombre());
        } else {
            System.out.println("Docente no asignado");
        }
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public docente getDocente() {
        return Docente;
    }
}
