package es.iesptocruz.francisco.alumnos.modelo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alumno {
    private String nombre;
    private String apellidos;
    private Integer nota;

    public Alumno(String nombre, String apellidos, Integer nota) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
    }

    public Alumno() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }
}
