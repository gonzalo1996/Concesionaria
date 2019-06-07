package Model;

import java.util.Scanner;

public class ControladoraUsuario {
    private static Scanner sc = new Scanner(System.in);

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