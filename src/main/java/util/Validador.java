

package util;

/**
 * Clase utilitaria encargada de manejar validaciones generales.
 * 
 * Su objetivo es separar la lógica de apoyo del flujo principal,
 * manteniendo el código organizado y reutilizable.
 */
public class Validador {

    /**
     * normalizarRut():
     * Elimina puntos y guiones del RUT, además de espacios innecesarios.
     * Permite comparar valores aunque el usuario los ingrese en distintos formatos.
     */
    public static String normalizarRut(String rut) {
        if (rut == null) return "";
        return rut.replace(".", "")
                  .replace("-", "")
                  .trim()
                  .toUpperCase();
    }
}
