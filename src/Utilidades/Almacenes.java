/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import ModeloTablas.ModeloTablasProfesor;
import java.util.List;
import ModeloTablas.ModeloTablasCurso;
import proy1.Cursos;

/**
 *
 * @author LightDemon12
 */
public class Almacenes {
    
    public static ModeloTablasProfesor modeloTablasProfesor; 
    public static void  AgregarProfesores (List <String[]> ValoresProfesores){ 
        for (String[] values: ValoresProfesores){ 
            if (values.length >=5){ 
                String codigo = values[0]; 
                 String nombre = values[1]; 
                  String apellido = values[2]; 
                   String correo = values[3]; 
                    String genero = values[4]; 
                     String contraseña = "1234"; 
                     modeloTablasProfesor.agregarProfesor(codigo, nombre, genero, correo, contraseña,apellido );
                
            }
        }
    }


}
