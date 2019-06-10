package Model;


import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private String apellido;
    private String dni;
    private String fecha_nacimiento;
    private String email; //TODO: comprobar que esta mierda no nos cague ingresando un numero o una simple letra.
    private int edad;
    private String telefono;
    private Domicilio domicilio;

    @Override
    public String toString() {
        return  "\nNombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nDNI: " + getDni() +
                "\nFecha nacimiento: " + getFecha_nacimiento() +
                "\nE-Mail:" + getEmail() +
                "\nEdad: " + getEdad() +
                "\nTelefono: " + getTelefono() +
                "\nDomicilio: " + getDomicilio() +"\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Persona(){
        setNombre("");
        setApellido("");
        setDni("");
        setFecha_nacimiento(null);
        setEmail("");
        setEdad(0);
        setTelefono("");
        setDomicilio(null);
    }

    public Persona(String nombre, String apellido, String dni, String fecha_nacimiento, String email, int edad, String telefono, Domicilio domicilio) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
        this.email = email;
        this.edad = edad;
        this.telefono = telefono;
        this.domicilio = domicilio;
    }
}
