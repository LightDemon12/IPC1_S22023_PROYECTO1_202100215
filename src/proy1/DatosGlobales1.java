/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proy1;

/**
 *
 * @author LightDemon12
 * 
 */


import java.io.FileInputStream;

import java.util.ArrayList; 
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class DatosGlobales1 implements Serializable {
    private static DatosGlobales1 instance; 
    private  Administrador1 ADMINISTRADOR; 
    private  ArrayList<Profesor> PROFESORES1; 
   private ArrayList<Cursos> CURSOS1; 
     private ArrayList<Alumnos> ALUMNOS;
    
    private DatosGlobales1 (){ 
        ADMINISTRADOR = null; 
        PROFESORES1 = new ArrayList<>(); 
        CURSOS1 = new ArrayList<>(); 
ALUMNOS = new ArrayList<>();
      
        
        
    }

    
    
    public static synchronized  DatosGlobales1 getInstance(){
        if  ( instance == null){ 
            instance = new DatosGlobales1(); 
            
        }
        return instance; 
    }

    public ArrayList<Cursos> getCURSOS1() {
        return CURSOS1;
    }
   public ArrayList<Alumnos> getALUMNOS() {
        return ALUMNOS;
    }
    public static void setInstance(DatosGlobales1 instance) {
        DatosGlobales1.instance = instance;
    }
    public void agregarAlumno(Alumnos alumno) {
    ALUMNOS.add(alumno);
}


    public void setCURSOS1(ArrayList<Cursos> CURSOS1) {
        this.CURSOS1 = CURSOS1;
    }
    
    public void SetInstance(DatosGlobales1 newInstance){ 
                instance = newInstance;                
    }

    public Administrador1 getADMINISTRADOR() {
        return ADMINISTRADOR;
    }

    public void setADMINISTRADOR(Administrador1 ADMINISTRADOR) {
        this.ADMINISTRADOR = ADMINISTRADOR;
    }

    public ArrayList<Profesor> getPROFESORES1() {
        return PROFESORES1;
    }

    public void setPROFESORES1(ArrayList<Profesor> PROFESORES1) {
        this.PROFESORES1 = PROFESORES1;
    }


    public void setALUMNOS(ArrayList<Alumnos> ALUMNOS) {
        this.ALUMNOS = ALUMNOS;
    }
    
    
   public void agregarProfesor(Profesor profesor1) {
    PROFESORES1.add(profesor1);
}

   public void agregarCursos(Cursos cursos ){ 
       CURSOS1.add(cursos); 
       
   }



   public void actualizarConDatos (DatosGlobales1 datos){ 
       this.ADMINISTRADOR = datos.getADMINISTRADOR(); 
       this.PROFESORES1 = datos.getPROFESORES1();
       this.CURSOS1 = datos.getCURSOS1(); 
       this.ALUMNOS =datos.getALUMNOS();
       
   }
   public  void guardarDatos(){
       serializarDatos(this, "datos.dat"); 
       
   }
   public void serializarDatos(DatosGlobales1 datos, String rutaArchivos) {
    try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(rutaArchivos))) {
        salida.writeObject(datos);
        System.out.println("Datos serializados correctamente");

    } catch (IOException e) { 
        e.printStackTrace();
    }
   }
   public static DatosGlobales1 deserializarDATOS (String rutaArchivo){ 
       try (ObjectInputStream entrada= new ObjectInputStream(new FileInputStream(rutaArchivo))){ 
          DatosGlobales1 datos = (DatosGlobales1) entrada.readObject();
            System.out.println("Los datos se deserializaron correctamente");
            return datos;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
       }
   }
   
}


