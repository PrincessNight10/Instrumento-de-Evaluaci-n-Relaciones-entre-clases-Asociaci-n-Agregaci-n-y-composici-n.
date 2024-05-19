package Colegio;


public class Asignada_a {
    private String dia;
    private String hora;
    private Aula aula;
    private Grupo grupo;  // Relación con Grupo

    // Getters y setters
    public String getDia() { return dia; }
    public void setDia(String dia) { this.dia = dia; }
    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }
    public Aula getAula() { return aula; }
    public void setAula(Aula aula) { this.aula = aula; }
    public Grupo getGrupo() { return grupo; }
    public void setGrupo(Grupo grupo) { this.grupo = grupo; }
}
