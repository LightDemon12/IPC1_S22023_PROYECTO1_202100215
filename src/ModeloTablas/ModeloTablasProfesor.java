/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloTablas;

import java.util.HashSet;
import java.util.Set;
import javax.swing.table.AbstractTableModel;
import proy1.Administrador1;
import proy1.DatosGlobales1;
import proy1.Profesor;

/**
 *
 * @author LightDemon12
 */ 
public class ModeloTablasProfesor extends AbstractTableModel {
     private Set<String> codigosUtilizados = new HashSet<>();
    DatosGlobales1 datosGlobales = DatosGlobales1.getInstance();
    Administrador1 administrador = datosGlobales.getADMINISTRADOR(); 
    
    private String [] columnNames = {"Codigo", "Nombre" , "apellido", "Correo", "Genero" , "contraseña"}; 
 public void agregarProfesor(String codigo1, String nombre1, String apellido1, String correo1, String genero1, String cont1) {
        if (!codigosUtilizados.contains(codigo1)) { 
            administrador.registrarProfesor(codigo1, nombre1, apellido1, correo1, genero1, cont1);
            codigosUtilizados.add(codigo1);
            fireTableDataChanged();
        } else {
          
            System.out.println("El código ya está en uso. No se puede agregar al profesor.");
        }
                
            }

@Override 
public int getRowCount(){ 
    return datosGlobales.getPROFESORES1().size(); 
    
}

@Override
public int getColumnCount(){ 
    return columnNames.length; 
    
}
@Override
public Object getValueAt(int rowIndex, int columnIndex){
    Profesor profesor = datosGlobales.getPROFESORES1().get(rowIndex); 
    
   switch (columnIndex) {
        case 0:
            return profesor.getCodigo();
        case 1:
            return profesor.getNombre();
        case 2:
            return profesor.getApellido(); 
        case 3:
            return profesor.getCorreo();
        case 4:
            return profesor.getGenero();  
        case 5:
           return profesor.getContrasena();
        default:
            return null;
    }
}
  @Override
  public String getColumnName (int column){ 
      return columnNames [column]; 
  }
  @Override
  public boolean  isCellEditable(int rowIndex, int columnIndex){
      return columnIndex !=0;
      
  }
  @Override
  public void setValueAt(Object aValue, int rowIndex, int columnIndex){
      Profesor profesor = datosGlobales.getPROFESORES1().get(rowIndex);
      
        switch (columnIndex) {
        case 0:
          profesor.setCodigo(aValue.toString());
        case 1:
           profesor.setNombre(aValue.toString());
        case 2:
       profesor.setApellido(aValue.toString());
        case 3:
   profesor.setCorreo(aValue.toString());
        case 4:
            profesor.setGenero(aValue.toString());
        case 5:
       profesor.setContrasena(aValue.toString());
        
    }
      fireTableCellUpdated(rowIndex, columnIndex);
      
  }
  public void actualizarTabla(){
      fireTableDataChanged();
  }
}