package Model;

import java.util.ArrayList;

public class Agencia {
    ArrayList<Usuario> lista_vendedores;
    ArrayList<Vehiculo> lista_vehiculos;
    ArrayList<Venta> lista_ventas;
    ArrayList<Persona> lista_clientes;
    Administrador admin;


    public Agencia() {
        lista_vendedores = new ArrayList<>();
        lista_vehiculos = new ArrayList<>();
        lista_ventas = new ArrayList<>();
        lista_clientes = new ArrayList<>();
    }

    public void agregarVendedor(Usuario u){
        lista_vendedores.add(u);
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

}
