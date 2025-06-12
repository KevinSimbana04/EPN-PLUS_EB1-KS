package Modelo;

public class cursoRegular extends curso {
    private boolean evaluacionContinua;

    public cursoRegular(String nombre, int duracionSemanas, double precio, boolean evaluacionContinua, docente Docente) {
        super(nombre, duracionSemanas, precio, Docente);
        this.evaluacionContinua = evaluacionContinua;
    }

    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Tipo: Curso Regular");
        System.out.println("Evaluación Continua: " + (evaluacionContinua ? "Sí" : "No"));
    }
}
