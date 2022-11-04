package model;

/**
 *
 * @author Duvan
 */
public class Cliente {
    private String nombreUsuario;
    private String id;
    private String contraseña;

    public Cliente(String nombreUsuario, String id, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.id = id;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }
       
}
