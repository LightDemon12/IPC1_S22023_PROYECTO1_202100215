package ModeloTablas;

import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;
import proy1.Alumnos;
import proy1.DatosGlobales1;

public class ModeloTablasAlumnos extends AbstractTableModel {
    private DatosGlobales1 datosGlobales = DatosGlobales1.getInstance();
    private String[] columnNames = {"Código", "Nombre", "Apellido", "Correo", "Género", "Contraseña"};

    public void agregarAlumno(String codigo, String nombre, String apellido, String correo, String genero, String contrasena) {
        Alumnos alumno = new Alumnos(nombre, apellido, correo, genero, codigo, contrasena);
        datosGlobales.agregarAlumno(alumno);
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return datosGlobales.getALUMNOS().size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumnos alumno = datosGlobales.getALUMNOS().get(rowIndex);

        switch (columnIndex) {
            case 0:
                return alumno.getCodigo();
            case 1:
                return alumno.getNombreA();
            case 2:
                return alumno.getApellidoA();
            case 3:
                return alumno.getCorreoA();
            case 4:
                return alumno.getGeneroA();
            case 5:
                return alumno.getContrasena();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex != 0;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Alumnos alumno = datosGlobales.getALUMNOS().get(rowIndex);

        switch (columnIndex) {
            case 0:
                alumno.setCodigo(aValue.toString());
                break;
            case 1:
                alumno.setNombreA(aValue.toString());
                break;
            case 2:
                alumno.setApellidoA(aValue.toString());
                break;
            case 3:
                alumno.setCorreoA(aValue.toString());
                break;
            case 4:
                alumno.setGeneroA(aValue.toString());
                break;
            case 5:
                alumno.setContrasena(aValue.toString());
                break;
            default:
                break;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    public void actualizarTabla() {
    fireTableDataChanged();
}

}
