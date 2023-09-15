/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import proy1.Cursos;
import proy1.DatosGlobales1;

public class grafico extends JFrame {
    
    public grafico(String nombreVentana, String nombreGrafica) {
        super(nombreGrafica);
        JFreeChart barras = ChartFactory.createBarChart(nombreGrafica, "Cursos", "Cantidad alumnos", crearDataset(), PlotOrientation.VERTICAL, true, true, false);
        ChartPanel charPanel = new ChartPanel(barras);
        charPanel.setPreferredSize(new Dimension(320, 390));
        setContentPane(charPanel);
        setUndecorated(true);
    }

    private CategoryDataset crearDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        // Obtener la lista de cursos
        List<Cursos> cursosList = DatosGlobales1.getInstance().getCURSOS1();
        
        // Ordenar la lista de cursos por la cantidad de estudiantes (de mayor a menor)
        cursosList.sort((c1, c2) -> Integer.compare(c2.getAlumnos().size(), c1.getAlumnos().size()));
        
        // Mostrar solo los 3 cursos con más estudiantes
        int count = 0;
        for (Cursos cursos : cursosList) {
            dataset.addValue(cursos.getAlumnos().size(), cursos.getNombreC(), "Cursos");
            count++;
            if (count == 3) {
                break; // Mostrar solo los 3 cursos principales
            }
        }
        
        return dataset;
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                grafico ventana = new grafico("Ventana de Gráfico", "Gráfico de Cursos");
                ventana.pack();
                ventana.setLocationRelativeTo(null);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setVisible(true);
            }
        });
    }
}
