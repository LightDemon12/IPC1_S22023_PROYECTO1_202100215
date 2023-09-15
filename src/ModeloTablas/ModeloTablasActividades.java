package ModeloTablas;
import javax.swing.table.AbstractTableModel;
import proy1.Actividades;

public class ModeloTablasActividades extends AbstractTableModel {
    private final String[] columnNames = { "Nombre", "Descripción", "Ponderación" };
    public void agregarActividades (String NombreAC, String Descripción, int Ponderacion){
             fireTableDataChanged();
    }
    private Actividades actividades;


    public ModeloTablasActividades(Actividades actividades) {
        this.actividades = actividades;
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

   @Override
public Object getValueAt(int rowIndex, int columnIndex) {
    if (actividades != null) {
        switch (columnIndex) {
            case 0:
                return actividades.getNombreAC();
            case 1:
                return actividades.getDescripción();
            case 2:
                return actividades.getPonderacion();
            default:
                return null;
        }
    } else {
        return null; // O maneja este caso de acuerdo a tu lógica
    }
}


    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
}
