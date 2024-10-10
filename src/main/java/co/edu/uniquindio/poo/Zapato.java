package co.edu.uniquindio.poo;

/*
    *Clase para crear zapatos
 */
public class Zapato extends Producto {

    /*
    *Atributos de la clase
     */
    public String nombre, talla, color;
    public int codigo3;

    /**
     * Constructor con los atributos de la clase
     *
     * @param costo
     * @param nombre
     * @param talla
     * @param color
     * @param codigo
     */
    public Zapato(double costo, String nombre, String talla, String color, int codigo3) {
        super(costo);
        this.nombre = nombre;
        this.talla = talla;
        this.color = color;
        this.codigo3 = codigo3;
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
        return codigo3;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setCodigo(int codigo3) {
        this.codigo3 = codigo3;
    }

    /*
    * Metodo constructor con el toString
     */
    @Override
    public String toString() {
        return "Zapato [nombre=" + nombre + ", talla=" + talla + ", color=" + color + ", codigo=" + codigo3 + "]";
    }

    public void remove(Zapato zapato) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void add(Zapato zapato) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
