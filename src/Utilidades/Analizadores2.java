/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author LightDemon12
 */
public class Analizadores2 {
     public static List<String[]> analizarCursosCSV(File cursosCSVFile) throws IOException {
        List<String[]> valoresCursos = new ArrayList<>();

        try (Scanner scanner = new Scanner(cursosCSVFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                if (values.length >= 4) {
                    valoresCursos.add(values);
                }
            }
        }

        return valoresCursos;
    }
}
