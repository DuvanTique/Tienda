package model;

/**
 *
 * @author Duvan
 */
public class Factura {
    private Cliente persona;
    private String calificacion = "";
    private String Productos;
    private double valor;

    public Factura(Cliente nombreCliente, String platos, double valor) {
        this.persona = nombreCliente;
        this.Productos = platos;
        this.valor = valor;
    }

    public String getNombreCliente() {
        return persona.getNombreUsuario();
    }

    public String getPlatos() {
        return Productos;
    }

    public double getValor() {
        return valor;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
    
      
}
