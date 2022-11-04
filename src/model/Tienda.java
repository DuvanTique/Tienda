package model;

import model.Factura;
import model.Producto;
import model.TipoProducto;
import java.util.ArrayList;

/**
 *
 * @author Duvan
 */
public class Tienda {
    private String nombre;
    private ArrayList<TipoProducto> menuProducto;
    private ArrayList<Factura> facturas;
    private ArrayList<Cliente> clietes;

    public Tienda(String nombre) {
        this.nombre = nombre;
        this.menuProducto = new ArrayList<TipoProducto>();
        this.facturas = new ArrayList<Factura>();
        this.clietes = new ArrayList<Cliente>();
    }
    
    public String listarProductos (int index){
        String productosMenu = "";
        ArrayList<Producto> m1 = menuProducto.get(index).getProductos();
        int i = 0;
        for (Producto item : m1) {
            i += 1;
            productosMenu += i + "."+ item.getNombre() + " " 
                    + item.getPrecio() + "$ Stock: " + item.getStock() + "\n";
        }
        return productosMenu;
    }
    
    public String listarFacturas (){
        String facturaTienda = "Listado de Facturas \n";
        int i = 0;
        for (Factura r : facturas) {
            i += 1;
            facturaTienda +="Factura no: " + i + "\n Calificacion: " + r.getCalificacion()
                    + "\n Nombre del Cliente: "+ r.getNombreCliente()+ "\n " 
                    + r.getPlatos() + "\n PecioTotal:" + r.getValor() +"$\n";
        }
        return facturaTienda;
    }

    public ArrayList<TipoProducto> getMenus() {
        return menuProducto;
    }

    public void setMenus(ArrayList<TipoProducto> menus) {
        this.menuProducto = menus;
    }

    public ArrayList<Factura> getFactura() {
        return facturas;
    }

    public void setReservas(ArrayList<Factura> factura) {
        this.facturas = factura;
    }

    public TipoProducto getmenuProducto(int index) {
        return menuProducto.get(index);
    }

    public boolean addMenu(TipoProducto e) {
        return menuProducto.add(e);
    }

    public Factura getFacturasTienda(int index) {
        return facturas.get(index);
    }

    public boolean addFactura(Factura e) {
        return facturas.add(e);
    }

    public Cliente getCliente(int index) {
        return clietes.get(index);
    }

    public boolean addCliente(Cliente e) {
        return clietes.add(e);
    }

    public ArrayList<Cliente> getClietes() {
        return clietes;
    }
    
    
}
