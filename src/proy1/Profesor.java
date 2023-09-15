/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proy1;

import java.io.Serializable;

/**
 *
 * @author LightDemon12
 */
public class Profesor  extends Usuario1 implements Serializable{
    private String nombre; 
    private String correo; 
    private String genero; 
    private String apellido; 
    

    public Profesor(String nombre, String correo, String codigo, String contrasena, String genero , String apellido) {
        super(codigo, contrasena);
        this.nombre = nombre;
        this.correo = correo;
        this.genero = genero; 
        this.apellido = apellido; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}
