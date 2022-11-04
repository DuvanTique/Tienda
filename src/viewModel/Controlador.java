package viewModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Cliente;
import model.Producto;
import model.Factura;
import model.Tienda;
import view.MenuPrincipal;

/**
 *
 * @author Familia
 */
public class Controlador implements ActionListener {
    
    private MenuPrincipal vistaMenu;
    private Cliente persona;
    private Tienda miTienda;

    public Controlador(MenuPrincipal vistaMenu, Tienda restaurante, Cliente nombreCliente) {
        this.vistaMenu = vistaMenu;
        this.miTienda = restaurante;
        this.persona = nombreCliente;
        this.agregarListeners();
    }
    
    private void agregarListeners(){
        this.vistaMenu.ButtonAddProducto.addActionListener(this);
        this.vistaMenu.ButtonBebidas.addActionListener(this);
        this.vistaMenu.ButtonAseo.addActionListener(this);
        this.vistaMenu.ButtonCarnes.addActionListener(this);
        this.vistaMenu.ButtonPedido.addActionListener(this);
        this.vistaMenu.ButtonShowFacturas.addActionListener(this);
        this.vistaMenu.TextFieldAmout.addActionListener(this);
        this.vistaMenu.TextFieldProducto.addActionListener(this);
        this.vistaMenu.TextFieldPrice.addActionListener(this);
    }

    private int actualMenu = -1;
    private String producto = "";
    private double precio;
    
    @Override
    public void actionPerformed(ActionEvent e1) {
        
        /*Se muestra el menu de carnes */
        if(e1.getSource() == vistaMenu.ButtonCarnes){
            actualMenu = 0;
            vistaMenu.TextAreaMenu.setText(miTienda.getmenuProducto(0).getNombreMenu() + 
                    "\n " + miTienda.listarProductos(actualMenu));            
        }
        /*Se muestra el menu de aseo */
        else if(e1.getSource() == vistaMenu.ButtonAseo){
            actualMenu = 1;
            vistaMenu.TextAreaMenu.setText(miTienda.getmenuProducto(1).getNombreMenu()+
                    "\n " + miTienda.listarProductos(actualMenu));
        }
        /*Se muestra el menu de bebidas */
        else if(e1.getSource() == vistaMenu.ButtonBebidas){
            actualMenu = 2;
            vistaMenu.TextAreaMenu.setText(miTienda.getmenuProducto(2).getNombreMenu()+
                    "\n " + miTienda.listarProductos(actualMenu));
        }
        /*añade un producto a la lista de compras */
        else if(e1.getSource() == vistaMenu.ButtonAddProducto){
            try{
                /*Se seleciona un producto*/
                Producto p = miTienda.getmenuProducto(actualMenu)
                        .getProducto(Integer.parseInt(vistaMenu.TextFieldProducto.getText())-1);
                /*Se selecciona su cantidad*/
                int cantidad = Integer.parseInt(vistaMenu.TextFieldAmout.getText());
                /*Se valida la si hay stock */
                if (cantidad >0 && cantidad <= p.getStock()){
                    p.pedirStock(cantidad);
                    /*Se agrega y se muestra en la lista de compras */
                    precio += p.getPrecio()*cantidad;
                    producto += "   -" + p.getNombre() +" Cantidad: "+ vistaMenu.TextFieldAmout.getText() +
                            " Valor: " + p.getPrecio()+ "$\n";
                    vistaMenu.TextAreaFactura.setText(producto);
                    vistaMenu.TextFieldPrice.setText(String.valueOf(precio) +"$");
                    vistaMenu.TextFieldProducto.setText("");
                    vistaMenu.TextFieldAmout.setText("");
                    vistaMenu.TextAreaMenu.setText(miTienda.getmenuProducto(actualMenu).getNombreMenu()+
                    "\n " + miTienda.listarProductos(actualMenu));
                }
                else {
                    vistaMenu.TextAreaFactura.setText("Cantidad invalida");
                }
                }
            catch (Exception ex) {
                vistaMenu.TextAreaFactura.setText("Valores incorrectos");
            }        
        }
        /*Se genera la factura y se guarda*/
        else if(e1.getSource() == vistaMenu.ButtonPedido){
            try {
                /*Se instancia el objeto factura*/
                Factura r = new Factura(persona,producto, precio);
                r.setCalificacion(vistaMenu.buttonGroup1.getSelection().getActionCommand());
                /*Se agrega a la tienda*/
                miTienda.addFactura(r);
                /*Se refresca las vistas*/
                vistaMenu.TextAreaFactura.setText("");
                producto = "";
                precio = 0;
                vistaMenu.TextFieldPrice.setText("");       
            } catch (Exception e) {
                vistaMenu.TextAreaFactura.setText("La valoracion debe ser un numero");
            } 
        }
        /*Mostrar las facturas del usuario*/
        else if(e1.getSource() == vistaMenu.ButtonShowFacturas){
            vistaMenu.TextAreaMenu.setText(miTienda.listarFacturas());
        }
    }

    
}
