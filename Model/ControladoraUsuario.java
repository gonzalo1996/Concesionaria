package Model;

import Archivo.DireccionArchivo;
import Utils.IOArchivoGenerico;

import java.io.Serializable;
import java.util.Scanner;

public class ControladoraUsuario implements Serializable {
    private static Scanner sc = new Scanner(System.in);
    private Agencia agencia;

    public ControladoraUsuario(Agencia agencia){
        setAgencia( agencia );
    }

    public Usuario ingreso_datos_de_usuario_a_verificar(){

        Usuario user_a_loggear = new Usuario();

        ControladoraUsuario.mostrar("" +
                "Bienvenido a Agencia Los Juancitos ." +
                "\nPor favor, ingrese su.. " +
                "\nUsuario: ");
        //le pido el usuario
        String nombre_usuario_ingresado = ControladoraUsuario.ingresarString();
        user_a_loggear.setNombre_usuario( nombre_usuario_ingresado );

        //le pido la contraseña
        ControladoraUsuario.mostrar("\nIngrese contraseña: ");
        String contrasenia_usuario_ingresada = ControladoraUsuario.ingresarString();

        user_a_loggear.setContrasenia( new Password(contrasenia_usuario_ingresada) );

        return user_a_loggear;
    }

    private boolean existeUsuario(Usuario userExiste){

//        userExiste = ingreso_datos_de_usuario_a_verificar();

        if(agencia.getAdmin().getUsuario().equals( userExiste )){
            return true;
        }

        for( Vendedor v : agencia.getLista_vendedores() ){
            if( userExiste.equals( v.getUsername() ) ){
                return true;
            }
        }
        return false;
    }

    private boolean isAdmin(Usuario u){

        if(agencia.getAdmin().getUsuario().equals(u)){
            return true;
        }

        return false;
    }

    /**
     * Inicia el programa, cargando los datos
     */

    public void iniciar_programa(){

        Usuario user_a_loggear = ingreso_datos_de_usuario_a_verificar();

        if(existeUsuario(user_a_loggear)){

            if(isAdmin(user_a_loggear)){

                //acá va el menú de opciones para ADMINISTRADOR

            }else{

                //acá va el menú de opciones para VENDEDORES

            }


        }


        //si se inicia por primera vez.
        //pedir user psw
        //cambiar datos del adm por defecto.

        //si inicia por segunda
        //loggea ,ó vendedor ,ó admin

        //dependiendo quién loggee va a haber 2 menues diferentes.
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public static String ingresarString(){
        return sc.nextLine();
    }

    public static int ingresarInt(){
        return sc.nextInt();
    }

    public static double ingresarDouble(){
        return sc.nextDouble();
    }

    public static void mostrar(Object obj){
        System.out.println( obj.toString() );
    }

    public static void mostrar_error(Object obj){
        System.err.println(obj.toString());
    }

    public static void cerrar_scanner(){
        sc.close();
    }

}