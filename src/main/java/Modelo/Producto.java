package Modelo;

public class Producto {

    private String nombre;
    private double precio;
    private String lote;

    public Producto(String nombre, double precio, String lote) {
        this.nombre = nombre;
        this.precio = precio;
        this.lote = lote;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getLote() {
        return lote;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }


}
