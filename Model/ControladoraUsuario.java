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

    public void inicio(){
        cargar_datos_agencia();

    }

    /**
     * Lee todos los archivos para inicializar o settear los valores de Agencia.
     */
    public void cargar_datos_agencia(){
        //abro los archivos para cargar mi agencia.
        Administrador admin = IOArchivoGenerico.leerObjeto( DireccionArchivo.ADMINISTRADOR );
        //Vehiculo v = IOArchivoGenerico.leerObjeto( DireccionArchivo.VEHICULOS );

        getAgencia().setAdmin( admin );

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