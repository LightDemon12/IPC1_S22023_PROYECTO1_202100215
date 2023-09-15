package Utilidades;

import ModeloTablas.ModeloTablasAlumnos;
import proy1.Alumnos;
import java.util.List;
import javax.swing.event.EventListenerList;

public class Almacenes3 {
    private EventListenerList listenerList;
    private ModeloTablasAlumnos modeloTabla;

    public Almacenes3(ModeloTablasAlumnos modeloTabla) {
        this.listenerList = new EventListenerList();
        this.modeloTabla = modeloTabla;
    }

    public void agregarAlumnos(List<String[]> valoresAlumnos) {
        for (String[] values : valoresAlumnos) {
            if (values.length >= 6) {
                String nombre = values[0];
                String apellido = values[1];
                String correo = values[2];
                String genero = values[3];
                String codigo = values[4];
                String contrasena = values[5];
                
                Alumnos alumno = new Alumnos(nombre, apellido, correo, genero, codigo, contrasena);
                modeloTabla.agregarAlumno(codigo, nombre, apellido, correo, genero, contrasena);
            }
        }
    }
}
