package Modelo;

public class evaluacion {
    private curso Curso;
    private estudiante Estudiante;
    private double nota;

    public evaluacion(curso Curso, estudiante Estudiante, double nota) {
        this.Curso = Curso;
        this.Estudiante = Estudiante;
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            this.nota = 0;
            System.out.println("Nota inválida, debe estar entre 0 y 10");
        }
    }

    public String getResultado() {
        if (nota >= 7) {
            return "Aprobado";
        } else {
            return "Reprobado";
        }
    }
}
