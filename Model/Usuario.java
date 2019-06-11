package Model;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre_usuario;
    private Password contrasenia;

    public Usuario(String nombre_usuario, Password contrasenia) {
        this.nombre_usuario = nombre_usuario;
        this.contrasenia = contrasenia;
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Usuario ){
            Usuario u = (Usuario)obj;

            if(this.getNombre_usuario().equals(u.getNombre_usuario()) && this.obtener_contrasenia().equals(u.obtener_contrasenia())){
                return true;
            }
        }
        return false;
    }

    public Usuario(){
        setNombre_usuario("admin");
        setContrasenia(new Password( "contrasenia" ));

    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public Password getContrasenia() {
        return contrasenia;
    }

    public String obtener_contrasenia(){
        return getContrasenia().getClave();
    }


    @Override
    public String toString() {
        return "\nDNI: " + nombre_usuario;
    }

    /*
     * Modifica los datos de cualquier usuario
     */
    public void modificarDatosUsuario() {

        boolean requisitosContrasenia;
        String userConfirm = "";
        String id = "";
        String psw = "";

        while (!userConfirm.equals("s")) {
            ControladoraUsuario.mostrar("Ingresar nuevo nombre usuario.");
            id = ControladoraUsuario.ingresarString();


            /*Asigno false para que entre al "while" mas de una vez en caso de que el usuario haya ingresado mal
            su posible contrasenia*/
            requisitosContrasenia = false;
            while (!requisitosContrasenia) {
                ControladoraUsuario.mostrar("Ingrese nueva contrasenia (alfanumerica 8-20 digitos): ");
                psw = ControladoraUsuario.ingresarString();

                if (Password.hasLongitudCorrecta(psw) && Password.isAlfanumerico(psw)) {
                    requisitosContrasenia = true;
                } else {
                    ControladoraUsuario.mostrar("La contrasenia ingresada no cumple todos los requisitos: ");
                }
            }

            ControladoraUsuario.mostrar("Usted ha ingresado los siguientes datos: " +
                    "\nnombre_usuario: " + id +
                    "\ncontrasenia: " + psw +
                    "\nDesea confirmar los datos? s/n");
            userConfirm = ControladoraUsuario.ingresarString();

            if (userConfirm.equals("s")) {
                setNombre_usuario(id);
                setContrasenia(new Password(psw));
            }
        }
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setContrasenia(Password contrasenia) {
        this.contrasenia = contrasenia;
    }



}
