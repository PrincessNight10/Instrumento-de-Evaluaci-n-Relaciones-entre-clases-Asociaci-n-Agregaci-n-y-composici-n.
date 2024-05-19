package Colegio;

public class Profesor {
    private String nrp;
    private String nombre;
    private String categoria;
    private String area;
    private Departamento departamento; // Relación con Departamento

    // Getters y setters
    public String getNrp() { return nrp; }
    public void setNrp(String nrp) { this.nrp = nrp; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }
    public Departamento getDepartamento() { return departamento; }
    public void setDepartamento(Departamento departamento) { this.departamento = departamento; }
}
