package Modelo;

public class cursoCertificado extends cursoRegular {
    private boolean entregaCertificado;

    public cursoCertificado(String nombre, int duracionSemanas, double precio, boolean evaluacionContinua, docente Docente) {
        super(nombre, duracionSemanas, precio, evaluacionContinua,Docente);
        this.entregaCertificado = true;
    }

    public double calcularPrecioFinal() {
        return getPrecio() * 1.25; // 25% de recargo
    }
    // Sobre escritura del metodo mostrarResumen para incluir el certificado
    @Override
    public void mostrarResumen() {
        super.mostrarResumen();
        System.out.println("Tipo: Curso Certificado");
        System.out.println("Precio final con recargo: $" + calcularPrecioFinal());
        System.out.println("Incluye certificado: Sí");
    }
}