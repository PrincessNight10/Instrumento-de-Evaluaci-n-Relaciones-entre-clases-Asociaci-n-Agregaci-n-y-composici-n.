package Colegio;

public class SeMatriculaen {
    private double calificacion;
    private Alumno alumno; // Relación con Alumno
    private Grupo grupo; // Relación con Grupo

    // Getters y setters
    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) { this.calificacion = calificacion; }
    public Alumno getAlumno() { return alumno; }
    public void setAlumno(Alumno alumno) { this.alumno = alumno; }
    public Grupo getGrupo() { return grupo; }
    public void setGrupo(Grupo grupo) { this.grupo = grupo; }
}

