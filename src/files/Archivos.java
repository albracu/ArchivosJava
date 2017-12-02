package files;

import java.io.File;
import java.util.*;

public class Archivos {
    public static void main(String[] args) {
        File archivo = new File("/Users/alfredobravocuero/Desktop/pruebas/archivo.txt");
        final Formatter nuevoarchivo;

        if(archivo.exists()){
            if (archivo.canWrite()){
                System.out.println("El Archivo Existe y se puede Escribir");
            }else{
                System.out.println("El Archivo Existe pero no se puede Escribir");
            }
        }else {

            try{

                nuevoarchivo = new Formatter("/Users/alfredobravocuero/Desktop/pruebas/archivo.txt");
                System.out.println("El archivo se ha creado con Exito");
                nuevoarchivo.format("%s %s %s", "Alfredo", "Bravo", "32");
                nuevoarchivo.close();

            }catch (Exception e){
                System.out.println("Error: " + e);
            }

        }
    }
}
