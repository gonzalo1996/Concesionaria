import Archivo.DireccionArchivo;
import Model.Administrador;
import Model.Agencia;
import Model.ControladoraUsuario;
import Model.Menu;
import Utils.Fecha;
import Utils.IOArchivoGenerico;

import java.io.File;

public class Ejecutable {

    public static void main(String[] args) {

        //crea un contenedor, porque DireccionArchivo.DIR es un String que termina en /
        /*File archivo = new File(DireccionArchivo.DIR);
        archivo.mkdir();*/

        /*Administrador admin = new Administrador();
        System.out.println(admin.getUsuario().getNombre_usuario()+"\nGrabado con exito.");
        IOArchivoGenerico.escribirObjeto( admin, DireccionArchivo.ADMINISTRADOR );*/

        //ControladoraUsuario controlador = new ControladoraUsuario( Agencia.getLaInstancia() );

       // controlador.inicio();


        Menu.Menu_Admin();
        System.out.println("hola");
        
        



        //mi_agencia.setAdmin( adminpassword );


        //Domicilio domicilio = new Domicilio("25 de mayo","5551","9","h","7600","Mar del Plata");
                //String nombre, String apellido, String dni, String fecha_nacimiento, String email, int edad, String telefono, Domicilio domicilio
        //Persona p = new Persona( "gonzalo","rodriguez","39732211","16/07/96","gonzalo-96-09@hotmail.com",22,"2234368995",domicilio);
        
    }

}
