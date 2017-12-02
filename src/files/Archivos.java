package files;

import java.io.File;

public class Archivos {
    public static void main(String[] args) {
        File archivo = new File("/Users/alfredobravocuero/Desktop/pruebas/archivo.txt");

        if(archivo.exists()){
            if (archivo.canWrite()){
                System.out.println("El Archivo Existe y se puede Escribir");
            }else{
                System.out.println("El Archivo Existe pero no se puede Escribir");
            }
        }else {
            System.out.println("El Archivo No Existe");
        }
    }
}
