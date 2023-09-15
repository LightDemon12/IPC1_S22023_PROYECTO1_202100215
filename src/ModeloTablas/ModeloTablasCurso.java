/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloTablas;

import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;
import proy1.Administrador1;
import proy1.Alumnos;
import proy1.Cursos;
import proy1.DatosGlobales1;
import proy1.Profesor;

/**
 *
 * @author LightDemon12
 */
public class ModeloTablasCurso extends AbstractTableModel {
    
    
    DatosGlobales1 datosGlobales = DatosGlobales1.getInstance();
    Administrador1 administrador = datosGlobales.getADMINISTRADOR(); 
    
    private String [] columnNames = {"Codigo", "Nombre" , "Creditos", "Alumnos","Profesor"}; 
    
public void agregarCursos(String codigo2, String nombre2, int creditos2, String nombreprofesor2) {
 Profesor profesor = buscarProfesorPorNombre(nombreprofesor2); 
 
 if (profesor !=null ){ 
     Cursos cursos = new Cursos(codigo2, nombre2, creditos2, profesor); 
     datosGlobales.agregarCursos(cursos);
     
     fireTableDataChanged();
    
 }else {
     System.out.println("El profesor no existe");
 }
 
fireTableDataChanged();
    
}
public Profesor buscarProfesorPorNombre (String nombreProfesor){ 
    for (Profesor profesor : datosGlobales.getPROFESORES1()){
        if (profesor.getNombre().equals(nombreProfesor)){ 
            return profesor; 
            
        }
    }
    return null; 
}

@Override 
public int getRowCount(){ 
    return datosGlobales.getCURSOS1().size(); 
    
}

@Override
public int getColumnCount(){ 
    return columnNames.length; 
    
}

@Override
public Object getValueAt(int rowIndex, int columnIndex) {
    Cursos cursos = datosGlobales.getCURSOS1().get(rowIndex);

    switch (columnIndex) {
        case 0:
            return cursos.getCodigoC();
        case 1:
            return cursos.getNombreC();
        case 2:
            return cursos.getCreditoC();
        case 3:

            return cursos.getAlumnos().size();
        case 4:
            return cursos.getProfesor().getNombre();
        default:
            return null;
    }
}


  @Override
  public String getColumnName (int column){ 
      return columnNames [column]; 
  }
  public void actualizarTabla(){
      fireTableDataChanged(); 
      
  }
  @Override
  public boolean  isCellEditable(int rowIndex, int columnIndex){
      return columnIndex !=0;
      
  }
@Override
public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    Cursos cursos = datosGlobales.getCURSOS1().get(rowIndex);

    switch (columnIndex) {
        case 0:
            cursos.setCodigoC(aValue.toString());
            break;
        case 1:
            cursos.setNombreC(aValue.toString());
            break;
        case 2:
            cursos.setCreditoC(Integer.parseInt(aValue.toString()));
            break;
       
        case 4:
            String nombreNuevoProfesor = aValue.toString();
            Profesor nuevoProfesor = buscarProfesorPorNombre(nombreNuevoProfesor);
            if (nuevoProfesor != null) {
                cursos.setProfesor(nuevoProfesor);
            } else {
                System.out.println("El profesor no existe.");
            }
            break;
        default:
            break;
    }

    fireTableCellUpdated(rowIndex, columnIndex);
}
}