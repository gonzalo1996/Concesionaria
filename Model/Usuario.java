package Model;

public abstract class Usuario {

    private String nombre_usuario;
    private Password password;

    public Usuario(String nombre_usuario, Password password, String nombre) {
        this.nombre_usuario = nombre_usuario;
        this.password = password;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public Password getPassword() {
        return password;
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

            System.out.println("Ingresar nuevo nombre_usuario: ");
            id = ControladoraUsuario.ingresarString();


            /*Asigno false para que entre al "while" mas de una vez en caso de que el usuario haya ingresado mal
            su posible contrasenia*/
            requisitosContrasenia = false;
            while (!requisitosContrasenia) {
                System.out.println("Ingrese nueva contrasenia (alfanumerica 8-20 digitos): ");
                psw = ControladoraUsuario.ingresarString();

                if (Password.hasLongitudCorrecta(psw) && Password.isAlfanumerico(psw)) {
                    requisitosContrasenia = true;
                } else {
                    System.out.println("La contrasenia ingresada no cumple todos los requisitos: ");
                }
            }

            System.out.println("Usted ha ingresado los siguientes datos: " +
                    "\nnombre_usuario: " + id +
                    "\npassword: " + psw +
                    "\nDesea confirmar los datos? s/n");
            userConfirm = ControladoraUsuario.ingresarString();

            if (userConfirm.equals("s")) {
                setNombre_usuario(id);
                setPassword(new Password(psw));
            }
        }
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public void setPassword(Password password) {
        this.password = password;
    }



}
