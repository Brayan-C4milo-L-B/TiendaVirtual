package co.edu.uniquindio.poo;

import java.util.Collection;

/*
    *Clase principal de inventario
 */
public class Inventario {

    /*
    *Atributos de la clase con listas para crear items nuevos
     */
    public Collection<Camisa> camisas;
    public Camisa camisa;
    public Collection<Pantalon> pantalones;
    public Pantalon pantalon;
    public Collection<Zapato> zapatos;
    public Zapato zapato;
    public Collection<Accesorio> accesorios;
    public Accesorio accesorio;

    /**
     * Constructor con los atributos de la clase
     *
     * @param camisas
     * @param camisa
     * @param pantalones
     * @param pantalon
     * @param zapatos
     * @param zapato
     * @param accesorios
     * @param accesorio
     */
    public Inventario(Collection<Camisa> camisas, Camisa camisa, Collection<Pantalon> pantalones, Pantalon pantalon,
            Collection<Zapato> zapatos, Zapato zapato, Collection<Accesorio> accesorios, Accesorio accesorio) {
        this.camisas = camisas;
        this.camisa = camisa;
        this.pantalones = pantalones;
        this.pantalon = pantalon;
        this.zapatos = zapatos;
        this.zapato = zapato;
        this.accesorios = accesorios;
        this.accesorio = accesorio;
    }

    /*get
    * Metodo para obtener un dato
     */
    public Collection<Camisa> getCamisas() {
        return camisas;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setCamisas(Collection<Camisa> camisas) {
        this.camisas = camisas;
    }

    /*get
    * Metodo para obtener un dato
     */
    public Camisa getCamisa() {
        return camisa;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    /*get
    * Metodo para obtener un dato
     */
    public Collection<Pantalon> getPantalones() {
        return pantalones;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setPantalones(Collection<Pantalon> pantalones) {
        this.pantalones = pantalones;
    }

    /*get
    * Metodo para obtener un dato
     */
    public Pantalon getPantalon() {
        return pantalon;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setPantalon(Pantalon pantalon) {
        this.pantalon = pantalon;
    }

    /*get
    * Metodo para obtener un dato
     */
    public Collection<Zapato> getZapatos() {
        return zapatos;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setZapatos(Collection<Zapato> zapatos) {
        this.zapatos = zapatos;
    }

    /*get
    * Metodo para obtener un dato
     */
    public Zapato getZapato() {
        return zapato;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setZapato(Zapato zapato) {
        this.zapato = zapato;
    }

    /*get
    * Metodo para obtener un dato
     */
    public Collection<Accesorio> getAccesorios() {
        return accesorios;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setAccesorios(Collection<Accesorio> accesorios) {
        this.accesorios = accesorios;
    }

    /*get
    * Metodo para obtener un dato
     */
    public Accesorio getAccesorio() {
        return accesorio;
    }

    /*set
    * Metodo para modificar un dato
     */
    public void setAccesorio(Accesorio accesorio) {
        this.accesorio = accesorio;
    }

    /*
    * Metodo constructor con el toString
     */
    @Override
    public String toString() {
        return "Inventario [camisas=" + camisas + ", camisa=" + camisa + ", pantalones=" + pantalones + ", pantalon="
                + pantalon + ", zapatos=" + zapatos + ", zapato=" + zapato + ", accesorios=" + accesorios
                + ", accesorio=" + accesorio + "]";
    }

    /*
    * Metodo para verificar camisas
     */
    public boolean verificarCamisa(Collection<Camisa> camisas, String nombre) {
        boolean centinela = false;
        for (Camisa camisa : camisas) {
            if (camisa.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
    *Metodo para eliminar una camisa
     */
    public void eliminarCamisa(int codigo1) {
        for (Camisa camisa : camisas) {
            if (camisa.getNombre().equals(codigo1)) {
                camisa.remove(camisa);
                break;

            }
        }
    }

    /*
        *Metodo para agregar una camisa nueva
     */
    public void agregarCamisa(Camisa camisa) {
        if (!verificarCamisa(camisa.getCodigo1())) {
            camisa.add(camisa);
        }
    }

    /*
     * Metodo para consultar pantalon por codigo
     */
    public boolean consultarCamisaPorCodigo(Collection<Camisa> camisas, int codigo1) {
        boolean centinela = false;
        for (Camisa camisa : camisas) {
            if (camisa.getCodigo() == codigo1) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
    * Metodo para verificar pantalones
     */
    public boolean verificarPantalon(Collection<Pantalon> pantalones, String nombre) {
        boolean centinela = false;
        for (Pantalon pantalon : pantalones) {
            if (pantalon.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
    *Metodo para eliminar un pantalon
     */
    public void eliminarPantalon(int codigo2) {
        for (Pantalon pantalon : pantalones) {
            if (pantalon.getNombre().equals(codigo2)) {
                pantalon.remove(pantalon);
                break;

            }
        }
    }

    /*
        *Metodo para agregar un pantalon nuevo
     */
    public void agregarPantalon(Pantalon pantalon) {
        if (!verificarPantalon(pantalon.getCodigo2())) {
            pantalon.add(pantalon);
        }
    }

    /*
     * Metodo para consultar pantalon por codigo
     */
    public boolean consultarPantalonPorCodigo(Collection<Pantalon> pantalones, int codigo2) {
        boolean centinela = false;
        for (Pantalon pantalon : pantalones) {
            if (pantalon.getCodigo() == codigo2) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
    * Metodo para verificar zapatos
     */
    public boolean verificarZapato(Collection<Zapato> zapatos, String nombre) {
        boolean centinela = false;
        for (Zapato zapato : zapatos) {
            if (zapato.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
    *Metodo para eliminar un zapatos
     */
    public void eliminarZapato(int codigo3) {
        for (Zapato zapato : zapatos) {
            if (zapato.getNombre().equals(codigo3)) {
                zapato.remove(zapato);
                break;

            }
        }
    }

    /*
        *Metodo para agregar uns zapatos nuevos
     */
    public void agregarZapatos(Zapato zapato) {
        if (!verificarZapato(zapato.getCodigo3())) {
            zapato.add(zapato);
        }
    }

    /*
     * Metodo para consultar zapato por codigo
     */
    public boolean consultarZapatoPorCodigo(Collection<Zapato> zapatos, int codigo3) {
        boolean centinela = false;
        for (Zapato zapato : zapatos) {
            if (zapato.getCodigo() == codigo3) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
    * Metodo para verificar accesorios
     */
    public boolean verificarAccesorios(Collection<Accesorio> accesorios, String nombre) {
        boolean centinela = false;
        for (Accesorio accesorio : accesorios) {
            if (accesorio.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
    *Metodo para eliminar unos accesorios
     */
    public void eliminarAccesorios(int codigo4) {
        for (Accesorio accesorio : accesorios) {
            if (accesorio.getNombre().equals(codigo4)) {
                accesorio.remove(accesorio);
                break;

            }
        }
    }

    /*
    *Metodo para agregar accesorios
     */
    public void agregarAccesorios(Accesorio accesorio) {
        if (!verificarAccesorios(accesorio.getCodigo4())) {
            accesorio.add(accesorio);
        }
    }

    /*
     * Metodo para consultar accesorio por codigo
     */
    public boolean consultarAccesorioPorCodigo(Collection<Accesorio> accesorios, int codigo4) {
        boolean centinela = false;
        for (Accesorio accesorio : accesorios) {
            if (accesorio.getCodigo() == codigo4) {
                centinela = true;
            }
        }
        return centinela;
    }

    /*
     * Metodo para sumar el valor del producto
     */
    public double valorCompra() {
        double acum = 0;
        for (int i = 0; i >= 0; i++) {
            acum++;
        }
        return acum;
    }

    /*
     * Metodo para contar
     */
    public int contadorCamisa() {
        int cont = 0;
        for (int i = 0; i >= 0; i++) {
            for (int j = 0; j <= i; j--) {
                cont++;
            }
        }
        return cont;
    }
}
