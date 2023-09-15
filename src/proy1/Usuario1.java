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
public class Usuario1  implements Serializable {
       String codigo; 
   String contrasena; 

    public Usuario1(String codigo, String contrasena) {
        this.codigo = codigo;
        this.contrasena = contrasena;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
