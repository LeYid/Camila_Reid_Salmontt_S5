

package service;

import model.Empleado;
import util.FileUtil;

import java.util.ArrayList;

/**
 * Clase EmpleadoService:
 * Contiene la lógica de negocio asociada a los empleados,
 * como carga desde archivo, manipulación, validaciones
 * y búsqueda dentro de colecciones.
 */
public class EmpleadoService {

    /**
     * Método cargarEmpleados():
     * Lee registros desde un archivo externo .txt o .csv
     * y los convierte en objetos Empleado.
     * 
     * Cada línea del archivo debe tener el formato:
     * nombre, rut, cargo
     */
    public ArrayList<Empleado> cargarEmpleados(String rutaArchivo) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        // Se leen todas las líneas utilizando una clase utilitaria independiente
        ArrayList<String> lineas = FileUtil.leerLineas(rutaArchivo);

        for (String linea : lineas) {
            String[] datos = linea.split(",");

            // Validación simple: línea debe tener exactamente 3 valores
            if (datos.length == 3) {

                String nombre = datos[0].trim();
                String rut = datos[1].trim();
                String cargo = datos[2].trim();

                empleados.add(new Empleado(nombre, rut, cargo));
            }
        }

        return empleados;
    }

    /**
     * Busca un empleado por RUT dentro de la colección.
     * La comparación se realiza usando equalsIgnoreCase
     * para evitar problemas con mayúsculas o minúsculas.
     */
    public Empleado buscarPorRut(ArrayList<Empleado> lista, String rutBuscado) {
        for (Empleado emp : lista) {
            if (emp.getRut().replace(".", "").replace("-", "").equalsIgnoreCase(rutBuscado)) {
                return emp;
            }
        }
        return null;
    }
}
