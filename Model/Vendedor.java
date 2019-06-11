package Model;

import java.io.Serializable;

/**
 * La clase vendedor  vende,compra vehiculos y registra clientes.
 */
public class Vendedor extends Persona implements Serializable {

    Usuario username;

    public Vendedor(String nombre, String apellido, String dni, String fecha_nacimiento, String email, int edad, String telefono, Domicilio domicilio, Usuario username) {
        super(nombre, apellido, dni, fecha_nacimiento, email, edad, telefono, domicilio);
        this.username = username;
    }

    public Usuario getUsername() {
        return username;
    }
}
