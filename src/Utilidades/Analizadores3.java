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

public class Analizadores3 {
    public static List<String[]> analizarAlumnosCSV(File alumnosCSVFile) throws IOException {
        List<String[]> valoresAlumnos = new ArrayList<>();

        try (Scanner scanner = new Scanner(alumnosCSVFile)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");
                if (values.length >= 6) {
                    valoresAlumnos.add(values);
                }
            }
        }

        return valoresAlumnos;
    }
}
