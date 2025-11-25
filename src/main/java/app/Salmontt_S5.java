
package app;

import model.Empleado;
import service.EmpleadoService;
import util.Validador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal del sistema Salmontt.
 * Desde aquí se coordina toda la ejecución del programa.
 * 
 * Esta clase se comunica con EmpleadoService para:
 *  - Leer el archivo de empleados.
 *  - Mostrar la lista cargada.
 *  - Solicitar un RUT por consola y buscarlo en la colección.
 *
 * Además demuestra el uso de:
 *  - Modularidad por paquetes (app, model, service, util)
 *  - Servicios externos para separar lógica de negocio
 *  - Clases utilitarias para validaciones y normalizaciones
 */
public class Salmontt_S5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmpleadoService servicio = new EmpleadoService();

        System.out.println("=== Sistema de Empleados Salmontt ===");

        // Ruta del archivo que contiene los datos
        String ruta = "src/main/resources/Empleado.txt";

        // Carga de empleados mediante el servicio especializado
        ArrayList<Empleado> empleados = servicio.cargarEmpleados(ruta);

        // Mostrar empleados cargados
        System.out.println("\n--- Empleados cargados desde archivo ---");
        for (Empleado emp : empleados) {
            System.out.println(emp); // utiliza toString() de Empleado
        }

        // Petición al usuario para buscar un rut
        System.out.print("\nIngrese el RUT del empleado (sin puntos, puede incluir o no guion): ");
        String rutIngresado = sc.nextLine();

        // Normalización del rut usando clase utilitaria
        rutIngresado = Validador.normalizarRut(rutIngresado);

        // Búsqueda dentro de la colección
        Empleado encontrado = servicio.buscarPorRut(empleados, rutIngresado);

        // Resultado
        if (encontrado != null) {
            System.out.println("\nEmpleado encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("\nNo existe un empleado con el RUT ingresado.");
        }

        sc.close();
    }
}
