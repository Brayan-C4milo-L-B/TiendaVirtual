package co.edu.uniquindio.poo;

/*
    * Clase padre que hereda a sus hijos un atributo double
 */
public class Producto {

    /*
    *Atributo de la clase
     */
    public double costo;

    /**
     * Constructor con el atributo de la clase
     *
     * @param costo
     */
    public Producto(double costo) {
        this.costo = costo;
    }

    /*
    * Metodo para obtener un dato
     */
    public double getCosto() {
        return costo;
    }

    /*
    * Metodo para modificar un dato
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /*
    * Metodo constructor con el toString
     */
    @Override
    public String toString() {
        return "Producto [costo=" + costo + "]";
    }

}
