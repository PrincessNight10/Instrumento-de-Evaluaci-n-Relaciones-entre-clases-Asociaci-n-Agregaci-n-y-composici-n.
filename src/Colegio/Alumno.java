package Colegio;

public class Alumno {
    private String dni;
    private String nombre;
    private String direccion;
    private boolean beca;

    // Getters y setters
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public boolean isBeca() { return beca; }
    public void setBeca(boolean beca) { this.beca = beca; }
}
