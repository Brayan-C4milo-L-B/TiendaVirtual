package co.edu.uniquindio.poo;

/*
    * Clase para crear pantalones
 */
public class Pantalon extends Producto {

    /*
    * Atributos de la clase
     */
    public String nombre, talla, color;
    public int codigo2;

    /**
     * Constructor con los atributos de la clase
     *
     * @param costo
     * @param nombre
     * @param talla
     * @param color
     * @param codigo
     */
    public Pantalon(double costo, String nombre, String talla, String color, int codigo2) {
        super(costo);
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.codigo2 = codigo2;
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
        return codigo2;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setCodigo(int codigo2) {
        this.codigo2 = codigo2;
    }

    /*
    * Metodo constructor con el toString
     */
    @Override
    public String toString() {
        return "Pantalon [nombre=" + nombre + ", talla=" + talla + ", color=" + color + ", codigo=" + codigo2 + "]";
    }

    public void remove(Pantalon pantalon) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void add(Pantalon pantalon) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
