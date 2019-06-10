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
                "\n3_ Menu Vendedor." +
                "\n4_ Administrar agencia."+
                "\n5_ Salir");
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

    public void menu_vehiculo () {
        ControladoraUsuario.mostrar(
                "1_ Listar Vehculos." +
                        "\n 2_ Mostrar Vehiculo." +
                        "\n 3_ Agregar Vehiculo" +
                        "\n 4_ Dar baja vehiculo." +
                        "\n 5_ Modificar Vehiculo." +
                        "\n 6_ Volver al menu."

        );
    }

    public void menu_vendedor () {
        ControladoraUsuario.mostrar(
                "1_ Vender Vehiculo." +
                        "\n2_ Listar cantidad de ventas totales." +
                        "\n3_ Ver ventas por mes especifico."+
                        "\n4_ Stock disponible."+
                        "\n4_ Volver al menu."
        );

    }

    public void menu_Administrar_Agencia (){
            ControladoraUsuario.mostrar(
                    "1_ Agregar gastos."+
                            "\nGanancia total."+
                            "\nListar gastos mensuales"+
                            "\nAbrir sitema de sugestion."
            );
    }

    public void menu_Sugerencia (){
        ControladoraUsuario.mostrar(
                ""
        );
    }


}