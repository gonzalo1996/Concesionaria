package Model;

import Archivo.DireccionArchivo;
import Utils.IOArchivoGenerico;

import java.util.ArrayList;

public class Agencia {
    ArrayList<Vendedor> lista_vendedores;
    ArrayList<Vehiculo> lista_vehiculos;
    ArrayList<Venta> lista_ventas;
    ArrayList<Persona> lista_clientes;
    Administrador admin; //usuario por defecto: admin, password por defecto: password
    private static Agencia laInstancia = new Agencia();


    private Agencia(){

        if ((admin = IOArchivoGenerico.leerObjeto(DireccionArchivo.ADMINISTRADOR)) == null) {
            admin = Administrador.proveerDefaultAdmin();
        }
        if ((lista_vendedores = IOArchivoGenerico.leerObjeto(DireccionArchivo.VENDEDORES)) == null) {
            lista_vendedores = new ArrayList<>();
        }
        if ((lista_vehiculos = IOArchivoGenerico.leerObjeto(DireccionArchivo.VEHICULOS)) == null) {
            lista_vehiculos= new ArrayList<>();
        }

        if ((lista_clientes = IOArchivoGenerico.leerObjeto(DireccionArchivo.CLIENTES)) == null) {
            lista_clientes = new ArrayList<>();
        }

    }

    public ArrayList<Vendedor> getLista_vendedores() {
        return lista_vendedores;
    }

    public ArrayList<Vehiculo> getLista_vehiculos() {
        return lista_vehiculos;
    }

    public ArrayList<Venta> getLista_ventas() {
        return lista_ventas;
    }

    public ArrayList<Persona> getLista_clientes() {
        return lista_clientes;
    }

    public static Agencia getLaInstancia() {
        return laInstancia;
    }

    public static void setLaInstancia(Agencia laInstancia) {
        Agencia.laInstancia = laInstancia;
    }

    public void agregarVendedor(Vendedor vendedor){
        lista_vendedores.add(vendedor);
    }

    public void agregarVehiculo(Vehiculo v){
        lista_vehiculos.add(v);
    }

    public void agregarVentas(Venta v){
        lista_ventas.add(v);
    }

    public void agregarClientes(Persona p){
        lista_clientes.add(p);
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    public String listar_vendedores ()
    {
        String total_vendedores = "";
        for (Vendedor e: lista_vendedores
             ) {

            total_vendedores+= e.toString();

        }
        return total_vendedores;
    }

    public String listar_vehiculos()
    {
        String total_vehiculos ="";
        for (Vehiculo e:lista_vehiculos
             ) {
            total_vehiculos+= e.toString();
        }
        return total_vehiculos;
    }

}
