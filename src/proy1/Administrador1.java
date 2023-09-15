/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proy1;

import java.io.Serializable;

/**
 *
 * @author LightDemon12
 */public class Administrador1 extends Usuario1 implements Serializable{
        public  Administrador1 (String codigo, String contrasena){
            super (codigo, contrasena);
        }
public void registrarProfesor (String codigo1, String nombre1, String apellido1, String correo1, String cont1, String genero1 ){
        Profesor profesor = new Profesor(nombre1, correo1, codigo1, cont1, apellido1, genero1); 
        DatosGlobales1.getInstance().agregarProfesor(profesor); 
        
        
}

}
    

