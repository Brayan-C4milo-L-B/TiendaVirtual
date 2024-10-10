package co.edu.uniquindio.poo;

/*
    Clase para crear camisas
 */
public class Camisa extends Producto {

    /*
    * Atributos de la clase
     */
    public String nombre, talla, color;
    public int codigo1;

    /**
     * Constructor con los atributos de la clase
     *
     * @param costo
     * @param nombre
     * @param talla
     * @param color
     * @param codigo
     */
    public Camisa(double costo, String nombre, String talla, String color, int codigo1) {
        super(costo);
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.codigo1 = codigo1;
    }

    /*get
    * Metodo para obtener un dato
     */
    public String getNombre() {
        return nombre;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*get
    * Metodo para obtener un dato
     */
    public String getTalla() {
        return talla;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setTalla(String talla) {
        this.talla = talla;
    }

    /*get
    * Metodo para obtener un dato
     */
    public String getColor() {
        return color;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setColor(String color) {
        this.color = color;
    }

    /*get
    * Metodo para obtener un dato
     */
    public int getCodigo() {
        return codigo1;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setCodigo(int codigo1) {
        this.codigo1 = codigo1;
    }

    /*
    * Metodo constructor con el toString
     */
    @Override
    public String toString() {
        return "Camisa [nombre=" + nombre + ", talla=" + talla + ", color=" + color + ", codigo=" + codigo1 + "]";
    }

    public void remove(Camisa camisa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void add(Camisa camisa) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
