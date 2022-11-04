package viewModel;

import model.Cliente;
import model.TipoProducto;
import model.Producto;
import model.Tienda;
import view.Login;

/**
 *
 * @author Duvan
 */
public class Main {

    public static void main(String[] args) {
        /*inicializo la tienda*/
        Tienda deUno = new Tienda("Deuno");
        
        /*Creo los clientes*/
        Cliente c1 = new Cliente("juan", "12", "123");
        Cliente c2 = new Cliente("pedro", "546548", "64");

        /*Añado los clientes a la tienda*/
        deUno.addCliente(c2);
        deUno.addCliente(c1);
        
        /* Creo los menus */
        TipoProducto Carnes = new TipoProducto("Carnes");
        TipoProducto Aseo = new TipoProducto("Aseo");
        TipoProducto bebidas = new TipoProducto("Bebidas");
        
        /*Creo los productos */
        Producto pollo = new Producto("Pollo", 25000, 20);
        Producto pescado = new Producto("Pescado", 26000, 20);
        Producto cerdo = new Producto("Cerdo", 28000, 20);
        
        Producto jabon = new Producto("jabon", 10000, 30);
        Producto Shampoo = new Producto("Shampoo", 12000, 15);
        Producto detergente = new Producto("Detergente", 6000, 10);
        
        Producto limonada = new Producto("Limonada", 2500, 40);
        Producto gaseosa = new Producto("Gaseosa", 5500, 30);
        Producto agua = new Producto("agua", 1200, 40);
        
        /*Lleno los menus*/
        Carnes.addProducto(pollo);
        Carnes.addProducto(pescado);
        Carnes.addProducto(cerdo);
        
        Aseo.addProducto(jabon);
        Aseo.addProducto(Shampoo);
        Aseo.addProducto(detergente);
        
        bebidas.addProducto(limonada);
        bebidas.addProducto(gaseosa);
        bebidas.addProducto(agua);
        
        /*Asigno los menus a la tienda*/
        deUno.addMenu(Carnes);
        deUno.addMenu(Aseo);
        deUno.addMenu(bebidas);
        
        /*inicio el programa por el login asignandole la tienda */
        Login inicio = new Login(deUno);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }
    
}
