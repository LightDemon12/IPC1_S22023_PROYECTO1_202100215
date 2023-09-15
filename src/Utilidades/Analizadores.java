
package Utilidades;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 *
 * @author LightDemon12
 */
public class Analizadores {
    
   public static List<String[]> analizarprofesoresCSV(File profesoresCSVFile)  { 
        List<String[]> ValoresProfesores = new ArrayList<>();
              try (Scanner scanner = new Scanner(profesoresCSVFile)){ 
                if (scanner.hasNextLine()){ 
                    scanner.nextLine(); 
                }
                 while (scanner.hasNextLine()){ 
                     String line = scanner.nextLine(); 
                     String[] values = line.split(","); 
                     ValoresProfesores.add(values); 
                     
                 }
             } catch (IOException e){ 
                 e.printStackTrace();
             }
              return ValoresProfesores; 
    }
   
    
   
}
