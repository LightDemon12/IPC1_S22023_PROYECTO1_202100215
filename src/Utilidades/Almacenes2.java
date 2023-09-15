/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import ModeloTablas.ModeloTablasCurso;
import java.util.List;
import javax.swing.event.EventListenerList;

/**
 *
 * @author LightDemon12
 */
public class Almacenes2 {

    private EventListenerList listenerList;
    private ModeloTablasCurso modeloTabla;

    public Almacenes2 (ModeloTablasCurso modeloTabla) {
        this.listenerList = new EventListenerList();
        this.modeloTabla = modeloTabla;
    }

    public void agregarCursos(List<String[]> valoresCursos) {
        for (String[] values : valoresCursos) {
            if (values.length >= 4) {
                String codigo = values[0];
                String nombre = values[1];
                int creditos = Integer.parseInt(values[2]);
                String nombreProfesor = values[3];
                modeloTabla.agregarCursos(codigo, nombre, creditos, nombreProfesor);
            }
        }
    }


}




