package Model;

/**
 * Clase encargada de Administrar otros Vendedores, y tener el completo control del programa
 */
public class Administrador extends Persona {

    Usuario usuario;

    public Administrador(String nombre, String apellido, String dni, String fecha_nacimiento, String email, int edad, String telefono, Domicilio domicilio, Usuario usuario) {
        super(nombre, apellido, dni, fecha_nacimiento, email, edad, telefono, domicilio);
        this.usuario = usuario;
    }

    public void Administrador(){
        usuario = null;
    }

}
