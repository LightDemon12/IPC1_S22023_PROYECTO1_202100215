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
public class Actividades implements Serializable{
    private String NombreAC; 
   private String Descripción;
    private int Ponderacion; 

    public Actividades(String NombreAC, String Descripción, int Ponderacion) {
        this.NombreAC = NombreAC;
        this.Descripción = Descripción;
        this.Ponderacion = Ponderacion;
    }

    public String getNombreAC() {
        return NombreAC;
    }

    public void setNombreAC(String NombreAC) {
        this.NombreAC = NombreAC;
    }

    public String getDescripción() {
        return Descripción;
    }

    public void setDescripción(String Descripción) {
        this.Descripción = Descripción;
    }

    public int getPonderacion() {
        return Ponderacion;
    }

    public void setPonderacion(int Ponderacion) {
        this.Ponderacion = Ponderacion;
    }
    
    
}
