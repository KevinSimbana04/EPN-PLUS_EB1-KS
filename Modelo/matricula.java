package Modelo;

public class matricula {
    //Atributos
    private curso Curso;
    private estudiante Estudiante;
    private  String fecha_Matricula;

    //Constructor
    public matricula(curso Curso , estudiante Estudiante , String fecha_Matricula){
        this.Curso=Curso;
        this.Estudiante=Estudiante;
        this.fecha_Matricula=fecha_Matricula;
    }

    //Metodos
    public void registrar_Evaluacion(){
        System.out.println();
    }

    public void mostrar_detalles(){
        System.out.println("Detalles de Matricula");

    }
}
