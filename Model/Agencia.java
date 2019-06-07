package Model;

import java.util.ArrayList;

public class Agencia {
    ArrayList<Usuario> lista_vendedores;
    ArrayList<Vehiculo> lista_vehiculos;
    ArrayList<Venta> lista_ventas;
    ArrayList<Persona> lista_cliente;
    Administrador admin;

    public Agencia() {
        lista_vendedores = new ArrayList<>();
        lista_vehiculos = new ArrayList<>();
        lista_ventas = new ArrayList<>();
        lista_cliente = new ArrayList<>();
    }



}
