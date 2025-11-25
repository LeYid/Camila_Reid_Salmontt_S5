

package model;

/**
 * Clase Empleado:
 * Representa un empleado de la empresa Salmonera Salmontt.
 * 
 * Esta clase forma parte del paquete "model", encargado de almacenar
 * las entidades o modelos del dominio.
 */
public class Empleado {

    // Atributos privados por encapsulación
    private String nombre;
    private String rut;
    private String cargo;

    /**
     * Constructor vacío:
     * Se incluye por buena práctica, ya que permite crear objetos
     * sin inicializar parámetros de inmediato.
     */
    public Empleado() {}

    /**
     * Constructor con parámetros:
     * Permite crear un objeto Empleado asignando cada uno de sus atributos,
     * favoreciendo la claridad y evitando la mutabilidad innecesaria.
     */
    public Empleado(String nombre, String rut, String cargo) {
        this.nombre = nombre;
        this.rut = rut;
        this.cargo = cargo;
    }

    // ===== GETTERS Y SETTERS =====

    /**
     * Métodos getters y setters:
     * Permiten acceder y modificar los atributos privados manteniendo
     * el principio de encapsulación propio de la POO.
     */

    public String getNombre() { 
        return nombre; 
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getRut() { 
        return rut; 
    }

    public void setRut(String rut) { 
        this.rut = rut; 
    }

    public String getCargo() { 
        return cargo; 
    }

    public void setCargo(String cargo) { 
        this.cargo = cargo; 
    }

    /**
     * Método toString():
     * Permite imprimir el objeto de forma clara
     * cuando se muestra por consola o logs.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}

