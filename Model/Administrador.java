package Model;

import java.io.Serializable;

/**
 * Clase encargada de Administrar otros Vendedores, y tener el completo control del programa
 */
public class Administrador extends Persona implements Serializable {

    Usuario usuario;

    private Administrador (){
        super();
        usuario = new Usuario();
    }

    public Administrador(String nombre, String apellido, String dni, String fecha_nacimiento, String email, int edad, String telefono, Domicilio domicilio, Usuario usuario) {
        super(nombre, apellido, dni, fecha_nacimiento, email, edad, telefono, domicilio);
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public static Administrador proveerDefaultAdmin(){
        return new Administrador();
    }
}
