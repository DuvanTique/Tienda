package model;

import java.util.ArrayList;

/**
 *
 * @author Duvan
 */
public class TipoProducto {
    private String tipoProducto;
    private ArrayList<Producto> productos;

    public TipoProducto(String nombreMenu) {
        this.tipoProducto = nombreMenu;
        this.productos = new ArrayList<Producto>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    public boolean addProducto(Producto e) {
        return productos.add(e);
    }

    public Producto getProducto(int index) {
        return productos.get(index);
    }

    public String getNombreMenu() {
        return tipoProducto;
    }
    
    
}
