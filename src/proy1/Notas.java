/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proy1;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author LightDemon12
 */
public class Notas implements Serializable {
    private int Promedio; 

    public Notas(int Promedio) {
        this.Promedio = Promedio;
    }

    public int getPromedio() {
        return Promedio;
    }

    public void setPromedio(int Promedio) {
        this.Promedio = Promedio;
    }
    
    
    
}
