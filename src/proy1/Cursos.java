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
public class Cursos implements Serializable {
    private String codigoC; 
    private String nombreC; 
    private int creditoC; 
    private ArrayList<Alumnos> alumnos; 
    private Profesor profesor; 
    private String AlumnoC;

    public Cursos(String codigoC, String nombreC, int creditoC, Profesor profesor) {
        this.codigoC = codigoC;
        this.nombreC = nombreC;
        this.creditoC = creditoC;
        this.alumnos = new ArrayList<>();

        this.profesor = profesor;
       
     Alumnos alumno1 = new Alumnos("1", "Angel", "Perez", "@gmail.com", "Masculino", "1234");
      Alumnos alumno2 = new Alumnos("1", "Angel", "Perez", "@gmail.com", "Masculino", "1234");
       Alumnos alumno3 = new Alumnos("1", "Angel", "Perez", "@gmail.com", "Masculino", "1234");
        Alumnos alumno4 = new Alumnos("1", "Angel", "Perez", "@gmail.com", "Masculino", "1234");
    this.alumnos.add(alumno4);
     this.alumnos.add(alumno1);
      this.alumnos.add(alumno2);
       this.alumnos.add(alumno4);
    }

    public String getCodigoC() {
        return codigoC;
    }

    public void setCodigoC(String codigoC) {
        this.codigoC = codigoC;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getCreditoC() {
        return creditoC;
    }

    public void setCreditoC(int creditoC) {
        this.creditoC = creditoC;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getAlumnoC() {
        return AlumnoC;
    }

    public void setAlumnoC(String AlumnoC) {
        this.AlumnoC = AlumnoC;
    }



   
    }
    
    
