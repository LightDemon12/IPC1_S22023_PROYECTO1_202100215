/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.RefineryUtilities;
import proy1.Alumnos;
import proy1.Cursos;
import proy1.DatosGlobales1;
import proy1.Profesor;
/**
 *
 * @author LightDemon12
 */
public class grafico2 extends JFrame{
   public grafico2(String nombreVentana, String nombreGrafica) {
        super(nombreGrafica);
        PieDataset dataset = crearDataset();
        JFreeChart chart = createPieChart(dataset, nombreGrafica);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(320, 390));
        setContentPane(chartPanel);
        setUndecorated(true);
    }

    private PieDataset crearDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        // Obtener la lista de profesores
        List<Alumnos> AlumnosList = DatosGlobales1.getInstance().getALUMNOS();
        Map<String, Integer> generoCount = new HashMap<>();

        for (Alumnos alumnos : AlumnosList) {
            String genero = alumnos.getGeneroA();
            generoCount.put(genero, generoCount.getOrDefault(genero, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : generoCount.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }

        return dataset;
    }

    private JFreeChart createPieChart(PieDataset dataset, String title) {
        JFreeChart chart = ChartFactory.createPieChart(
                title,
                dataset,
                true,
                true,
                false);

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setExplodePercent("Masculino", 0.15); //

        return chart;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                grafico ventana = new grafico("Ventana de Gráfico", "Gráfico de Géneros");
                ventana.pack();
                ventana.setLocationRelativeTo(null);
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setVisible(true);
            }
        });
    }
}
