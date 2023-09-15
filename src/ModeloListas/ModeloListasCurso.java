/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloListas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import javax.swing.AbstractListModel;
import proy1.Cursos;
import proy1.DatosGlobales1;
import java.util.ArrayList;
import proy1.Cursos;



/**
 *
 * @author LightDemon12
 */
public class ModeloListasCurso extends AbstractListModel<String>{
    DatosGlobales1 datosGlobales1 = DatosGlobales1.getInstance();
    ArrayList<Cursos> cursos = datosGlobales1.getCURSOS1(); 

    
    @Override
    public int getSize(){
        return cursos.size();
        
    }
@Override
public String getElementAt(int index){
    Cursos curso = cursos.get(index);
    String nombreCursoCI = curso.getNombreC() + "-" + curso.getAlumnos().size() + " Alumnos"; 
    return nombreCursoCI;
}
public Cursos buscarCursosPorNombre (String nombreCurso){
    for (Cursos cursos : cursos){
        if (cursos.getNombreC().equals(nombreCurso)){
            return cursos; 
        }
    }
    return null;
}
}
