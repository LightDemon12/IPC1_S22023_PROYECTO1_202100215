package proy1;

import java.io.Serializable;

/**
 * Clase Alumnos
 */
public class Alumnos extends Usuario1 implements Serializable {
    private String nombreA;
    private String apellidoA;
    private String correoA;
    private String generoA;

    public Alumnos(String codigo, String nombreA, String apellidoA, String correoA, String generoA, String contrasena) {
        super(codigo, contrasena);
        this.nombreA = nombreA;
        this.apellidoA = apellidoA;
        this.correoA = correoA;
        this.generoA = generoA;
    }


    // Getters para acceder a los atributos
    public String getNombreA() {
        return nombreA;
    }

    public String getApellidoA() {
        return apellidoA;
    }

    public String getCorreoA() {
        return correoA;
    }

    public String getGeneroA() {
        return generoA;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public void setApellidoA(String apellidoA) {
        this.apellidoA = apellidoA;
    }

    public void setCorreoA(String correoA) {
        this.correoA = correoA;
    }

    public void setGeneroA(String generoA) {
        this.generoA = generoA;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
