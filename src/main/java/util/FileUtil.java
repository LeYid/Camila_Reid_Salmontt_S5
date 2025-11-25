

package util;

import java.io.*;
import java.util.ArrayList;

/**
 * Clase FileUtil:
 * Maneja operaciones relacionadas con lectura de archivos.
 * Su propósito es centralizar este tipo de tareas,
 * evitando repetir código en distintas partes del sistema.
 */
public class FileUtil {

    /**
     * leerLineas():
     * Lee todas las líneas de un archivo de texto externo
     * y las retorna como una colección.
     */
    public static ArrayList<String> leerLineas(String ruta) {

        ArrayList<String> lineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }

        } catch (IOException e) {
            System.out.println("Error leyendo archivo: " + e.getMessage());
        }

        return lineas;
    }
}
