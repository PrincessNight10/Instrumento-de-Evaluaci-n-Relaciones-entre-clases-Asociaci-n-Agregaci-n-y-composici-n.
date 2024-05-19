package Colegio;

public class Colegio {
    public static void main(String[] args) {
        // Crear instancias de Departamento
        Departamento depInformatica = new Departamento();
        depInformatica.setId(1);
        depInformatica.setNombre("Informática");

        // Crear instancias de Profesor
        Profesor profPerez = new Profesor();
        profPerez.setNrp("12345");
        profPerez.setNombre("Juan jose");
        profPerez.setCategoria("Titular");
        profPerez.setArea("Quimica");
        profPerez.setDepartamento(depInformatica);

        // Crear instancias de Grupo
        Grupo grupo1 = new Grupo();
        grupo1.setId(1);
        grupo1.setTipo("Practica");
        grupo1.setProfesor(profPerez);

        // Crear instancias de Alumno
        Alumno alumnoGomez = new Alumno();
        alumnoGomez.setDni("3147855455");
        alumnoGomez.setNombre("Ana roa");
        alumnoGomez.setDireccion("Calle 13 n12-f57");
        alumnoGomez.setBeca(true);

        // Crear instancias de Asignatura
        Asignatura asigMatematicas = new Asignatura();
        asigMatematicas.setId(1);
        asigMatematicas.setNombre("Matemáticas");
        asigMatematicas.setCreditos(6);
        asigMatematicas.setCaracter("Obligatoria");
        asigMatematicas.setCurso(1);

        // Relacionar Asignatura con Grupo
        grupo1.setAsignatura(asigMatematicas);

        // Crear instancias de Aula
        Aula aula101 = new Aula();
        aula101.setId(101);
        aula101.setCapacidad(30);

        // Crear instancias de Asignada_a
        Asignada_a asignacion1 = new Asignada_a();
        asignacion1.setDia("Martes");
        asignacion1.setHora("08:00");
        asignacion1.setAula(aula101);
        asignacion1.setGrupo(grupo1);

        // Crear instancias de SeMatriculaen
        SeMatriculaen matricula1 = new SeMatriculaen();
        matricula1.setCalificacion(0);  // Asignar calificación inicial
        matricula1.setAlumno(alumnoGomez);
        matricula1.setGrupo(grupo1);

        // Mostrar información
        System.out.println("Profesor: " + profPerez.getNombre() + " del departamento " + profPerez.getDepartamento().getNombre());
        System.out.println("Alumno: " + alumnoGomez.getNombre() + " matriculado en el grupo " + grupo1.getTipo());
        System.out.println("Asignatura: " + asigMatematicas.getNombre() + " se imparte el " + asignacion1.getDia() + " a las " + asignacion1.getHora() + " en el aula " + asignacion1.getAula().getId());
    }
}

