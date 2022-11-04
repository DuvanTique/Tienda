package model;

/**
 *
 * @author Duvan
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    public void pedirStock(int cantidad){
        if(cantidad <= stock){
            this.stock -= cantidad;
        }
        else{
            System.out.println("No hay stock suficiente");
        }
    }
        
}
