package proy1;

import Interfaz.Ventanaprincipal;
import java.util.ArrayList;

public class PROY1 {
    public static void main(String[] args) {
      DatosGlobales1 datosGlobales2 = DatosGlobales1.getInstance();
      DatosGlobales1 datosDeserializados1 = DatosGlobales1.deserializarDATOS("datos.dat");
      
      if (datosDeserializados1 != null){ 
          datosGlobales2.actualizarConDatos(datosDeserializados1); 
          
      }else{ 
          Administrador1 admin1= new  Administrador1( "admin", "admin"); 
          ArrayList <Profesor> profesores2 = new ArrayList<>(); 
          datosGlobales2.setADMINISTRADOR(admin1);
         datosGlobales2.setPROFESORES1(profesores2);
         
      }
       Ventanaprincipal ventanaprincipal = new  Ventanaprincipal();
        ventanaprincipal.setVisible(true); 
        ventanaprincipal.setLocationRelativeTo(null);
        
        final DatosGlobales1 datosparaGuardar = datosGlobales2; 
        
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            datosparaGuardar.guardarDatos();
 
}));

    }
    
}
