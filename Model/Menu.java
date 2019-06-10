package Model;

import javax.naming.ldap.Control;

/**
 * Clase encargada de mostrar mensajes por pantalla para el usuario.
 * TODO: realizar el menu de vendedores
 */

public class Menu {

    public void menu(){
    }

    public void inicio(){
        ControladoraUsuario.mostrar("" +
                "Bienvenido." +
                "\nIngrese usuario: ");

                ControladoraUsuario.ingresarString();
        ControladoraUsuario.mostrar("\nIngrese contraseña: ");
    }

    public void menu_admin(){
        ControladoraUsuario.mostrar(
                "1_ Administrar Vendedores" +
                "\n2_ Menu Vehiculos." +
                "\n3_ Menu Ventas." +
                "\n4_ Administrar agencia."+
                "\n5_ salir");
    }

    public void menu_admin_opcion_1(){
        ControladoraUsuario.mostrar(
                "1_ Agregar vendedor." +
                "\n2_ Mostrar vendedores." +
                "\n3_ Mostrar vendedor especifico." +
                "\n4_ Modificar info vendedor." +
                "\n5_ Buscar vendedor" +
                "\n6_ Ventas de vendedores."+
                "\n7_ Volver menu.");
    }

}