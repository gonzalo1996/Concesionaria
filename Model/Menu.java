package Model;

public class Menu {

    public static void Menu_Vehiculos()
    {
        int opcion;
        do{
            MenuVisual.menu_vehiculo_opciones();
            opcion= ControladoraUsuario.ingresarInt();
            switch(opcion)
            {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    Menu_Admin();
                    break;
            }
        }while(opcion<1 || opcion>6);
    }


    public static void Menu_Admin_Vendedores()
    {
        int opcion;
        do{
            MenuVisual.menu_admin_opcion_1_opciones();
            opcion= ControladoraUsuario.ingresarInt();
            switch(opcion)
            {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                        Menu_Admin();
                    break;
            }
        }while(opcion<1 || opcion>7);
    }


    public static void Menu_Admin()
    {
        int opcion;
        do{
            MenuVisual.menu_admin_opciones();
            opcion= ControladoraUsuario.ingresarInt();
            switch(opcion)
            {
                case 1:
                    Menu_Admin_Vendedores();
                    break;
                case 2:
                    Menu_Vehiculos();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
            }
        }while(opcion<1 || opcion>5);
    }




}
