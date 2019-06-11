package Model;

import javax.naming.ldap.Control;
import java.io.Serializable;

/**
 * Clase encargada de mostrar mensajes por pantalla para el usuario.
 * TODO: realizar el menu de vendedores
 */

public class MenuVisual implements Serializable {



    public static void menu_admin_opciones(){
        ControladoraUsuario.mostrar(
                "1_ Administrar Vendedores" +
                        "\n2_ MenuVisual Vehiculos." +
                        "\n3_ MenuVisual Vendedor." +
                        "\n4_ Administrar agencia."+
                        "\n5_ Salir");
    }

    public static void  menu_admin_opcion_1_opciones(){
        ControladoraUsuario.mostrar(
                "1_ Agregar vendedor." +
                        "\n2_ Mostrar vendedores." +
                        "\n3_ Mostrar vendedor especifico." +
                        "\n4_ Modificar info vendedor." +
                        "\n5_ Buscar vendedor" +
                        "\n6_ Ventas de vendedores."+
                        "\n7_ Volver menu.");
    }

    public static void  menu_vehiculo_opciones () {
        ControladoraUsuario.mostrar(
                "1_ Listar Vehculos." +
                        "\n 2_ Mostrar Vehiculo." +
                        "\n 3_ Agregar Vehiculo" +
                        "\n 4_ Dar baja vehiculo." +
                        "\n 5_ Modificar Vehiculo." +
                        "\n 6_ Volver al menu."

        );
    }

    public static void  menu_vendedor_opciones () {
        ControladoraUsuario.mostrar(
                "1_ Vender Vehiculo." +
                        "\n2_ Listar cantidad de ventas totales." +
                        "\n3_ Ver ventas por mes especifico."+
                        "\n4_ Stock disponible."+
                        "\n4_ Volver al menu."
        );

    }

    public static void menu_Administrar_Agencia_opciones (){
        ControladoraUsuario.mostrar(
                "1_ Agregar gastos."+
                        "\n1_ Ganancia total."+
                        "\n2_ Listar gastos mensuales"+
                        "\n3_ Abrir sitema de sugestion."
        );
    }

    public static void menu_Sugerencia_opciones (){
        ControladoraUsuario.mostrar(
                ""
        );
    }





}