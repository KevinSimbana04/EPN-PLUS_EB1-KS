package Modelo;

public class  estudiante {
    private String nombre;
    private int edad;
    private String matricula;

    public estudiante(String nombre, int edad, String matricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
    }
    // Getters y setters
    public String getNombre() {
        return nombre;
    }
    //metodo validar
    public boolean validarEdad() {
        return edad >= 13 && edad <= 60;
    }

    // metodo para mostrar los datos del estudiante
    public void mostrarDatos() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Edad válida: " + (validarEdad() ? "Sí" : "No"));
    }

}
