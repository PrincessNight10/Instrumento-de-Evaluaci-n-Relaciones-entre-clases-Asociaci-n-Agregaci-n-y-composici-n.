package Colegio;

public class Asignatura {
    private int id;
    private String nombre;
    private int creditos;
    private String caracter;
    private int curso;

    // Getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }
    public String getCaracter() { return caracter; }
    public void setCaracter(String caracter) { this.caracter = caracter; }
    public int getCurso() { return curso; }
    public void setCurso(int curso) { this.curso = curso; }
}
